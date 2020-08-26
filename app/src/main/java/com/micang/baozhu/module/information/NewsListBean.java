package com.micang.baozhu.module.information;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.micang.baozhu.util.EmptyUtils;

import java.util.List;


public class NewsListBean implements MultiItemEntity {

    /**
     * data : [{"date":1553331891000,"operateLable":1,"log_id":"316fd0832f5b41cea8e391f5370750e1","channelType":"redian","total_comment":0,"source":"中国新闻网图集","release_state":"release","title":"图集泰国大选前夕工作人员提前准备投票材料","articlePublishTime":1553331891000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11781646&channelType=redian&contentType=0&userId=1553068135946&showPosition=1&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=316fd0832f5b41cea8e391f5370750e1&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":4,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11781646","sourceName":"中国新闻网图集","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/0185320485768d0f8bee70657702833a_0.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/0185320485768d0f8bee70657702833a_1.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/0185320485768d0f8bee70657702833a_2.jpg","imgheight":240}],"release_time":1553331891000},{"date":1553333036000,"operateLable":1,"log_id":"84bf07a2dcaf4628a792bdc7d26410c7","channelType":"redian","total_comment":0,"source":"人民网","release_state":"release","title":"巴南春季茶文化周开幕外国友人现场学制茶","articlePublishTime":1553333036000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11783133&channelType=redian&contentType=0&userId=1553068135946&showPosition=2&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=84bf07a2dcaf4628a792bdc7d26410c7&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":4,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11783133","sourceName":"人民网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/968100bb11e748916cf4ce74ca2698cd_0.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/968100bb11e748916cf4ce74ca2698cd_1.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/968100bb11e748916cf4ce74ca2698cd_2.jpg","imgheight":240}],"release_time":1553333036000},{"date":1553333065000,"operateLable":1,"log_id":"5882b913b01c470397dca375e58599c3","channelType":"redian","total_comment":0,"source":"中国新闻网","release_state":"release","title":"中央财办副主任：中国的对外开放不开空头支票","articlePublishTime":1553333065000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11783163&channelType=redian&contentType=0&userId=1553068135946&showPosition=3&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=5882b913b01c470397dca375e58599c3&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":2,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11783163","sourceName":"中国新闻网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/bee3bea02d2282c66cb8f07ef0250545_0.jpg","imgheight":240}],"release_time":1553333065000},{"date":1553331823000,"operateLable":1,"log_id":"890a9daca2a24ee0a3761c413bd1da36","channelType":"redian","total_comment":0,"source":"中国经济网","release_state":"release","title":"盐城响水\u201c3·21\u201d爆炸事故续：环境监测指标恢复正常范围","articlePublishTime":1553331823000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11781092&channelType=redian&contentType=0&userId=1553068135946&showPosition=4&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=890a9daca2a24ee0a3761c413bd1da36&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":2,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11781092","sourceName":"中国经济网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/1070d5e62c8a66395c0f2dd415df0872_0.jpg","imgheight":240}],"release_time":1553331823000},{"date":1553328711000,"operateLable":1,"log_id":"367f4b8d19524974aaf041fc0658de8b","channelType":"redian","total_comment":0,"source":"中国新闻网","release_state":"release","title":"哈萨克斯坦总统签署修正案将首都更名为努尔苏丹","articlePublishTime":1553328711000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11778861&channelType=redian&contentType=0&userId=1553068135946&showPosition=5&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=367f4b8d19524974aaf041fc0658de8b&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":2,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11778861","sourceName":"中国新闻网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/50d6b5bc35cc13ac63d37b1498fb21da_0.jpg","imgheight":240}],"release_time":1553328711000},{"date":1553341014000,"operateLable":1,"log_id":"d85b1816d07a42bfab22d11e48f64095","channelType":"redian","total_comment":0,"source":"中国青年网","release_state":"release","title":"40元1公斤！环卫工捡烟头换奖金最多一人一个月捡了6公斤","articlePublishTime":1553341014000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11787271&channelType=redian&contentType=0&userId=1553068135946&showPosition=6&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=d85b1816d07a42bfab22d11e48f64095&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":4,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11787271","sourceName":"中国青年网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/e95704b4df6476b2b0db8e5749a2f21f_0.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/e95704b4df6476b2b0db8e5749a2f21f_1.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/e95704b4df6476b2b0db8e5749a2f21f_2.jpg","imgheight":240}],"release_time":1553341014000},{"date":1553327437000,"operateLable":1,"log_id":"34e2dd0902ce4eccbc8ed91d6146143d","channelType":"redian","total_comment":0,"source":"人民网","release_state":"release","title":"悠悠澜沧源：一幅浴雪的英雄群像（下篇）","articlePublishTime":1553327437000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11777219&channelType=redian&contentType=0&userId=1553068135946&showPosition=7&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=34e2dd0902ce4eccbc8ed91d6146143d&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":2,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11777219","sourceName":"人民网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/034707e34e7d37aa88123a3dc36655a2_0.jpg","imgheight":240}],"release_time":1553327437000},{"date":1553331875000,"operateLable":1,"log_id":"2c15c8b0082a4522a9d4dc5c6cab1057","channelType":"redian","total_comment":0,"source":"环球网","release_state":"release","title":"访中联办遭陆委会质疑韩国瑜怒呛：停止酸言酸语","articlePublishTime":1553331875000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11781800&channelType=redian&contentType=0&userId=1553068135946&showPosition=8&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=2c15c8b0082a4522a9d4dc5c6cab1057&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":2,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11781800","sourceName":"环球网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/621110d8fe276b1e59e5299d0e42dbe2_0.jpg","imgheight":240}],"release_time":1553331875000},{"date":1553336192000,"operateLable":1,"log_id":"4d531a11746a41d78857a9fcf1eee02b","channelType":"redian","total_comment":0,"source":"看看新闻","release_state":"release","title":"104岁老人的愿望是被逮捕警察：让你梦想成真","articlePublishTime":1553336192000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11785128&channelType=redian&contentType=0&userId=1553068135946&showPosition=9&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=4d531a11746a41d78857a9fcf1eee02b&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":4,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11785128","sourceName":"看看新闻","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/d4477a00d4f0bc0206d4d725c2266ec0_0.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/d4477a00d4f0bc0206d4d725c2266ec0_1.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/d4477a00d4f0bc0206d4d725c2266ec0_2.jpg","imgheight":240}],"release_time":1553336192000},{"date":1553332915000,"operateLable":1,"log_id":"c1c5f104e41b4cb689792c65267cfe68","channelType":"redian","total_comment":0,"source":"中国新闻网","release_state":"release","title":"两岸融合发展福州马祖\u201c快一点\u201d","articlePublishTime":1553332915000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11783164&channelType=redian&contentType=0&userId=1553068135946&showPosition=10&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=c1c5f104e41b4cb689792c65267cfe68&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":2,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11783164","sourceName":"中国新闻网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/f82881bb486b5ca53c4ba0e23602db9f_0.jpg","imgheight":240}],"release_time":1553332915000},{"date":1553332992000,"operateLable":1,"log_id":"35b60ec910ac41aa856244989c9d6759","channelType":"redian","total_comment":0,"source":"中国青年网","release_state":"release","title":"响水爆炸现场2公里外民房受损严重一片狼藉","articlePublishTime":1553332992000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11782681&channelType=redian&contentType=0&userId=1553068135946&showPosition=11&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=35b60ec910ac41aa856244989c9d6759&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":4,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11782681","sourceName":"中国青年网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/595b1b3308f0d419099408a2b3093e9d_0.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/595b1b3308f0d419099408a2b3093e9d_1.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/595b1b3308f0d419099408a2b3093e9d_2.jpg","imgheight":240}],"release_time":1553332992000},{"date":1553328669000,"operateLable":1,"log_id":"3c9222d74d00475baa6af555283459bf","channelType":"redian","total_comment":0,"source":"中国新闻网","release_state":"release","title":"郑州旅游大巴在湘起火致26死河南副省长赶赴现场处置","articlePublishTime":1553328669000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11778863&channelType=redian&contentType=0&userId=1553068135946&showPosition=12&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=3c9222d74d00475baa6af555283459bf&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":2,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11778863","sourceName":"中国新闻网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/84f733ece0e1e3259a066d9d47062954_0.jpg","imgheight":240}],"release_time":1553328669000},{"date":1553331762000,"operateLable":1,"log_id":"d3e30719a7754b769c08d9e349f2eda2","channelType":"redian","total_comment":0,"source":"新京报","release_state":"release","title":"拒绝买卖！北京森林公安突查花鸟市场","articlePublishTime":1553331762000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11782339&channelType=redian&contentType=0&userId=1553068135946&showPosition=13&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=d3e30719a7754b769c08d9e349f2eda2&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":4,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11782339","sourceName":"新京报","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/0a971b81d38f5c9725df2bf8529ff5a5_0.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/0a971b81d38f5c9725df2bf8529ff5a5_1.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/0a971b81d38f5c9725df2bf8529ff5a5_2.jpg","imgheight":240}],"release_time":1553331762000},{"date":1553327692000,"operateLable":1,"log_id":"0d13de4185b7471c918d01b1be5fd9f5","channelType":"redian","total_comment":0,"source":"中国青年网","release_state":"release","title":"女儿去世一年她的手机突然冒出一条消息","articlePublishTime":1553327692000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11777036&channelType=redian&contentType=0&userId=1553068135946&showPosition=14&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=0d13de4185b7471c918d01b1be5fd9f5&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":2,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11777036","sourceName":"中国青年网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/32e6ff71cfca494b5281af4981bbba02_0.jpg","imgheight":240}],"release_time":1553327692000},{"date":1553331935000,"operateLable":1,"log_id":"ae78479e535c44eabc70b8d1829b1351","channelType":"redian","total_comment":0,"source":"中国新闻网","release_state":"release","title":"响水\u201c3·21\u201d爆炸事故地周边丙酮、甲苯、二甲苯未超限值","articlePublishTime":1553331935000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11782328&channelType=redian&contentType=0&userId=1553068135946&showPosition=15&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=ae78479e535c44eabc70b8d1829b1351&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":2,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11782328","sourceName":"中国新闻网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/430cc0bcaf49e23e67a369d453735a7c_0.jpg","imgheight":240}],"release_time":1553331935000},{"date":1553330547000,"operateLable":1,"log_id":"2a4a6fe6fff64c55ae36a065e33743ad","channelType":"redian","total_comment":0,"source":"中国青年网","release_state":"release","title":"江苏响水天嘉宜公司\u201c3·21\u201d爆炸事故死亡人数上升至64人DNA排查工作开始","articlePublishTime":1553330547000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11781105&channelType=redian&contentType=0&userId=1553068135946&showPosition=16&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=2a4a6fe6fff64c55ae36a065e33743ad&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":4,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11781105","sourceName":"中国青年网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/51440ca56aaa9be0e72f9b16407d45d1_0.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/51440ca56aaa9be0e72f9b16407d45d1_1.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/51440ca56aaa9be0e72f9b16407d45d1_2.jpg","imgheight":240}],"release_time":1553330547000},{"date":1553333142000,"operateLable":1,"log_id":"6d1e5fee3bcb4e92b7bc6685632b8e84","channelType":"redian","total_comment":0,"source":"人民网","release_state":"release","title":"潍坊福彩开展2019年义务植树活动","articlePublishTime":1553333142000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11783477&channelType=redian&contentType=0&userId=1553068135946&showPosition=17&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=6d1e5fee3bcb4e92b7bc6685632b8e84&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":4,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11783477","sourceName":"人民网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/710e41e661dc6eb43c3a4964e14bcd5f_0.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/710e41e661dc6eb43c3a4964e14bcd5f_1.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/710e41e661dc6eb43c3a4964e14bcd5f_2.jpg","imgheight":240}],"release_time":1553333142000},{"date":1553334081000,"operateLable":1,"log_id":"28353585a1ea473a92ef134da3a591d0","channelType":"redian","total_comment":0,"source":"中国经济网","release_state":"release","title":"京津冀等地空气重污染\u201c病根\u201d查清了！发现四大污染源","articlePublishTime":1553334081000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11784372&channelType=redian&contentType=0&userId=1553068135946&showPosition=18&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=28353585a1ea473a92ef134da3a591d0&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":2,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11784372","sourceName":"中国经济网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/532a169f82852bc14ea14220cef3f1bf_0.jpg","imgheight":240}],"release_time":1553334081000},{"date":1553335066000,"operateLable":1,"log_id":"efc31bd521a04463ab95379b6db0798e","channelType":"redian","total_comment":0,"source":"中国新闻网","release_state":"release","title":"杨伟民：消费减速的原因之一是高房价的挤压","articlePublishTime":1553335066000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11784900&channelType=redian&contentType=0&userId=1553068135946&showPosition=19&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=efc31bd521a04463ab95379b6db0798e&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":2,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11784900","sourceName":"中国新闻网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/8026199817d74cc6f77fc7dc7ced48d7_0.jpg","imgheight":240}],"release_time":1553335066000},{"date":1553331885000,"operateLable":1,"log_id":"4ccdd2adf97247aab25bc305f391fd9b","channelType":"redian","total_comment":0,"source":"中国新闻网","release_state":"release","title":"石家庄一残疾小伙出诗集只是想留下生命痕迹","articlePublishTime":1553331885000,"url":"https://wap.huaqianapp.com/m/news/task/detail?id=11782329&channelType=redian&contentType=0&userId=1553068135946&showPosition=20&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=4ccdd2adf97247aab25bc305f391fd9b&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946","tags":"热点","cover":"","coverType":2,"retrieve_id":"retrieve","exp_id":"myselfRecommend","strategy_id":"strategy","id":"11782329","sourceName":"中国新闻网","covers":[{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/0ade85c41905e10fa4e5380773c7d5d2_0.jpg","imgheight":240}],"release_time":1553331885000}]
     * message : 操作成功
     * statusCode : 2000
     */


    /**
     * date : 1553331891000
     * operateLable : 1
     * log_id : 316fd0832f5b41cea8e391f5370750e1
     * channelType : redian
     * total_comment : 0
     * source : 中国新闻网图集
     * release_state : release
     * title : 图集泰国大选前夕工作人员提前准备投票材料
     * articlePublishTime : 1553331891000
     * url : https://wap.huaqianapp.com/m/news/task/detail?id=11781646&channelType=redian&contentType=0&userId=1553068135946&showPosition=1&showSource=feed&isShow=0&contentType=article&loadType=0&log_id=316fd0832f5b41cea8e391f5370750e1&exp_id=myselfRecommend&strategy_id=strategy&retrieve_id=retrieve&appKey=1553068135946
     * tags : 热点
     * cover :
     * coverType : 4
     * retrieve_id : retrieve
     * exp_id : myselfRecommend
     * strategy_id : strategy
     * id : 11781646
     * sourceName : 中国新闻网图集
     * covers : [{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/0185320485768d0f8bee70657702833a_0.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/0185320485768d0f8bee70657702833a_1.jpg","imgheight":240},{"imgwidth":360,"src":"https://img.cp.cashtoutiao.com/plat/cover/image/20190323/0185320485768d0f8bee70657702833a_2.jpg","imgheight":240}]
     * release_time : 1553331891000
     */

    public long date;
    public int operateLable;
    public String log_id;
    public String channelType;
    public int total_comment;
    public String source;
    public String release_state;
    public String title;
    public long articlePublishTime;
    public String url;
    public String tags;
    public String cover;
    public int coverType;
    public String retrieve_id;
    public String exp_id;
    public String strategy_id;
    public String id;
    public String sourceName;
    public long release_time;
    public List<CoversBean> covers;

    @Override
    public int getItemType() {
        if (EmptyUtils.isNotEmpty(covers) && covers.size() >= 2) {
            return 2;
        } else if (EmptyUtils.isNotEmpty(covers)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static class CoversBean {
        /**
         * imgwidth : 360
         * src : https://img.cp.cashtoutiao.com/plat/cover/image/20190323/0185320485768d0f8bee70657702833a_0.jpg
         * imgheight : 240
         */

        public int imgwidth;

        public String getImgsrc() {
            return src;
        }

        public String src;
        public int imgheight;
    }
}