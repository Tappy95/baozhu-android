package com.micang.baozhu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.support.annotation.MainThread;
import android.view.View;
import android.widget.FrameLayout;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdNative;
import com.bytedance.sdk.openadsdk.TTAppDownloadListener;
import com.bytedance.sdk.openadsdk.TTSplashAd;
import com.micang.baozhu.config.TTAdManagerHolder;
import com.micang.baozhu.http.BaseResult;
import com.micang.baozhu.http.bean.DisposeBean;
import com.micang.baozhu.http.net.HttpUtils;
import com.micang.baozhu.http.net.Observer;
import com.micang.baozhu.http.net.RetrofitUtils;
import com.micang.baozhu.module.home.MainActivity;
import com.micang.baozhu.util.AppUtils;
import com.micang.baozhu.util.WeakHandler;
import com.micang.baselibrary.base.BaseActivity;
import com.micang.baselibrary.util.TLog;
import com.micang.baselibrary.util.WindowUtils;

public class StartActivity extends BaseActivity implements WeakHandler.IHandler {
    private static final String TAG = "SplashActivity";
    private TTAdNative mTTAdNative;
    private FrameLayout mSplashContainer;
    //是否强制跳转到主页面
    private boolean mForceGoMain;

    //开屏广告加载发生超时但是SDK没有及时回调结果的时候，做的一层保护。
    private final WeakHandler mHandler = new WeakHandler(this);
    //开屏广告加载超时时间,建议大于3000,这里为了冷启动第一次加载到广告并且展示,示例设置了3000ms
    private static final int AD_TIME_OUT = 3000;
    private static final int MSG_GO_MAIN = 1;
    //开屏广告是否已经加载
    private boolean mHasLoaded;

    @Override
    public int layoutId() {
        return R.layout.activity_start;
    }

    @Override
    public void init(Bundle savedInstanceState) {
        WindowUtils.setPicTranslucentToStatus(this);
        getHomePageDispose();
        mSplashContainer = findViewById(R.id.splash_container);
        //step2:创建TTAdNative对象
        mTTAdNative = TTAdManagerHolder.get().createAdNative(this);
        //在合适的时机申请权限，如read_phone_state,防止获取不了imei时候，下载类广告没有填充的问题
        //在开屏时候申请不太合适，因为该页面倒计时结束或者请求超时会跳转，在该页面申请权限，体验不好
        // TTAdManagerHolder.getInstance(this).requestPermissionIfNecessary(this);
        //定时，AD_TIME_OUT时间到时执行，如果开屏广告没有加载则跳转到主页面
        mHandler.sendEmptyMessageDelayed(MSG_GO_MAIN, AD_TIME_OUT);
        //加载开屏广告
        loadSplashAd();
    }

    @Override
    protected void onResume() {
        //判断是否该跳转到主页面
        if (mForceGoMain) {
            mHandler.removeCallbacksAndMessages(null);
            enterHome();
        }
        super.onResume();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mForceGoMain = true;
    }


    private void getHomePageDispose() {
        String appVersionName = AppUtils.getAppVersionName("com.micang.baozhu");
        String umeng_channel = AppUtils.getAppMetaData(this, "UMENG_CHANNEL");
        HttpUtils.homePageDispose(umeng_channel, appVersionName).enqueue(new Observer<BaseResult<DisposeBean>>() {
            @Override
            public void onSuccess(BaseResult response) {

                DisposeBean data = (DisposeBean) response.data;
                AppContext.fuLiHui = data.fuLiHui;      //福利荟
                AppContext.recommendGame = data.recommendGame;//推荐游戏id
                String h5_location_new = data.h5_location_new;
                RetrofitUtils.setBaseH5Url(h5_location_new);
                DisposeBean.PVersionBean pVersion = data.pVersion;
                AppContext.bean = pVersion;
            }
        });
    }


    private void enterHome() {
        startActivity(new Intent(StartActivity.this, MainActivity.class));
//        mSplashContainer.removeAllViews();
        finish();

    }

    @Override
    public void handleMsg(Message msg) {
        if (msg.what == MSG_GO_MAIN) {
            if (!mHasLoaded) {
                enterHome();
            }
        }
    }

    /**
     * 加载开屏广告
     */
    private void loadSplashAd() {
        //step3:创建开屏广告请求参数AdSlot,具体参数含义参考文档
        AdSlot adSlot = new AdSlot.Builder()
                .setCodeId("830729248")
                .setSupportDeepLink(true)
                .setImageAcceptedSize(1080, 1920)
                .build();
        //step4:请求广告，调用开屏广告异步请求接口，对请求回调的广告作渲染处理
        mTTAdNative.loadSplashAd(adSlot, new TTAdNative.SplashAdListener() {
            @Override
            @MainThread
            public void onError(int code, String message) {
                TLog.d(TAG, message);
                mHasLoaded = true;
                enterHome();
            }

            @Override
            @MainThread
            public void onTimeout() {
                mHasLoaded = true;
                enterHome();
            }

            @Override
            @MainThread
            public void onSplashAdLoad(TTSplashAd ad) {
                TLog.d(TAG, "开屏广告请求成功");
                mHasLoaded = true;
                mHandler.removeCallbacksAndMessages(null);
                if (ad == null) {
                    return;
                }
                //获取SplashView
                View view = ad.getSplashView();
                if (view != null) {
                    mSplashContainer.removeAllViews();
                    //把SplashView 添加到ViewGroup中,注意开屏广告view：width >=70%屏幕宽；height >=50%屏幕宽
                    mSplashContainer.addView(view);
                    //设置不开启开屏广告倒计时功能以及不显示跳过按钮,如果这么设置，您需要自定义倒计时逻辑
                    //ad.setNotAllowSdkCountdown();
                } else {
                    enterHome();
                }

                //设置SplashView的交互监听器
                ad.setSplashInteractionListener(new TTSplashAd.AdInteractionListener() {
                    @Override
                    public void onAdClicked(View view, int type) {
                        TLog.d(TAG, "onAdClicked");
                    }

                    @Override
                    public void onAdShow(View view, int type) {
                        TLog.d(TAG, "onAdShow");
                    }

                    @Override
                    public void onAdSkip() {
                        TLog.d(TAG, "onAdSkip");
                        enterHome();

                    }

                    @Override
                    public void onAdTimeOver() {
                        TLog.d(TAG, "onAdTimeOver");
                        enterHome();
                    }
                });
                if (ad.getInteractionType() == TTAdConstant.INTERACTION_TYPE_DOWNLOAD) {
                    ad.setDownloadListener(new TTAppDownloadListener() {
                        boolean hasShow = false;

                        @Override
                        public void onIdle() {

                        }

                        @Override
                        public void onDownloadActive(long totalBytes, long currBytes, String fileName, String appName) {
                            if (!hasShow) {
                                hasShow = true;
                            }
                        }

                        @Override
                        public void onDownloadPaused(long totalBytes, long currBytes, String fileName, String appName) {
                            TLog.d("下载暂停...");

                        }

                        @Override
                        public void onDownloadFailed(long totalBytes, long currBytes, String fileName, String appName) {
                            TLog.d("下载失败...");

                        }

                        @Override
                        public void onDownloadFinished(long totalBytes, String fileName, String appName) {

                        }

                        @Override
                        public void onInstalled(String fileName, String appName) {

                        }
                    });
                }
            }
        }, AD_TIME_OUT);

    }
}
