package lanou.presentsay.ui.bean;

import java.util.List;

/**
 * 攻略
 * Created by dllo on 16/8/30.
 */
public class SearchStrategyBean {
    private static final String TAG = "TAG_SearchStrategyBean";

    /**
     * code : 200
     * data : {"paging":{"next_url":"http://api.liwushuo.com/v2/search/post?sort=&limit=20&keyword=%E9%9B%B6%E9%A3%9F&offset=20"},"posts":[{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img01.liwushuo.com/image/141201/rwabjrwbv.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/141201/rwabjrwbv.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1000057,"liked":false,"likes_count":75280,"title":"抛开减肥，送Ta吃不完的美好","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img03.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img03.liwushuo.com/image/141212/vhqdpq5an.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/141212/vhqdpq5an.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1000181,"liked":false,"likes_count":70667,"title":"世界零食大巡游：舌尖上的英国","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img03.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img02.liwushuo.com/image/150715/uujusxpx2.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/150715/uujusxpx2.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1003437,"liked":false,"likes_count":64914,"title":"吃货，也是一枚颜值控","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img01.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img01.liwushuo.com/image/150722/8kbloav3j.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/150722/8kbloav3j.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1003987,"liked":false,"likes_count":66061,"title":"饿货，吃我一记大安利！这些零食绝对管饱！","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img03.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img03.liwushuo.com/image/150824/wep5f3sc8.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/150824/wep5f3sc8.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1009791,"liked":false,"likes_count":47814,"title":"追剧零食大搜罗，不用饿着看欧巴","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img03.liwushuo.com/image/150826/rlylfq6yg.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/150826/rlylfq6yg.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1010271,"liked":false,"likes_count":46580,"title":"聚会零⾷：庆祝我们的新学期","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img03.liwushuo.com/image/150924/8a7pjafkg.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/150924/8a7pjafkg.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1014571,"liked":false,"likes_count":62010,"title":"慎吃！那些让你停不了嘴的⼩零食","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img01.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img02.liwushuo.com/image/151223/jxr04kyka.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/151223/jxr04kyka.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1028251,"liked":false,"likes_count":9857,"title":"天猫超市进口零食·华北篇","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img03.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img02.liwushuo.com/image/160112/d9qbcl608.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160112/d9qbcl608.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1031221,"liked":false,"likes_count":37968,"title":"新年来到，家里要常备点美味小零食","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160615/z4wubgarw.jpg","avatar_webp_url":null,"created_at":1465975797,"id":14,"nickname":"鹿欧尼"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160608/lkhsgavyq.jpg-w300","category":"美食","cover_image_url":"http://img01.liwushuo.com/image/160628/d05kol07y.jpg-w720","created_at":1462501752,"description":"美食是一场原地旅行，你去不了的地方，我给你把故事带回来。","id":17,"order":0,"status":0,"subtitle":"","title":"馋游记","updated_at":1466470432},"cover_image_url":"http://img01.liwushuo.com/image/160505/955em7q1v.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160505/955em7q1v.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1043071,"liked":false,"likes_count":27585,"title":"第1期 | 小时候与同桌一起分享过的这些零食","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160615/yp2rm3n35.jpg","avatar_webp_url":null,"created_at":1465974365,"id":11,"nickname":"大大卷"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160608/16dn4cryj.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/csy9zrran.jpg-w720","created_at":1462501893,"description":"想环游世界有点难，吃遍世界却容易多了。","id":22,"order":0,"status":0,"subtitle":"已完结","title":"世界零食大巡游","updated_at":1467100446},"cover_image_url":"http://img02.liwushuo.com/image/160603/s3mnk54c4.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160603/s3mnk54c4.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1043771,"liked":false,"likes_count":22703,"title":"第28期 | 消暑max零食大作战！","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img02.liwushuo.com/image/150116/btfp7ofl8.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/150116/btfp7ofl8.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1000535,"liked":false,"likes_count":35078,"title":"过年的时候，你家里一定会有这些零食","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img03.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img02.liwushuo.com/image/150512/obm3h5ol5.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/150512/obm3h5ol5.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1001482,"liked":false,"likes_count":106930,"title":"最受女生喜欢的热门零食TOP10","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img02.liwushuo.com/image/150626/orx8nq7i4.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/150626/orx8nq7i4.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1002038,"liked":false,"likes_count":110053,"title":"10款高人气MUJI零食","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img01.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img02.liwushuo.com/image/150722/i3uw93o4s.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/150722/i3uw93o4s.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1004002,"liked":false,"likes_count":52615,"title":"送这些美食俘获文艺派吃货的心","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img01.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img01.liwushuo.com/image/150908/mrx42caf8.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/150908/mrx42caf8.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1007308,"liked":false,"likes_count":33017,"title":"世界零食盘点：专业吃货必备清单","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img03.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img02.liwushuo.com/image/150813/yjh39jpjs.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/150813/yjh39jpjs.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1007355,"liked":false,"likes_count":48136,"title":"没什么特别的理由，就是嘴巴寂寞了","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img03.liwushuo.com/image/150817/frdgfw1go.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/150817/frdgfw1go.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1008095,"liked":false,"likes_count":52464,"title":"这些花，看起来好好吃哦","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img03.liwushuo.com/image/150908/lpotah0nf.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/150908/lpotah0nf.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1008805,"liked":false,"likes_count":65503,"title":"专业吃货必备零食：不出门吃遍全世界","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img03.liwushuo.com/image/150824/14lzgzy4c.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/150824/14lzgzy4c.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1009808,"liked":false,"likes_count":35887,"title":"不出家门，吃遍世界各地零食","type":"post"}]}
     * message : OK
     */

    private int code;
    /**
     * paging : {"next_url":"http://api.liwushuo.com/v2/search/post?sort=&limit=20&keyword=%E9%9B%B6%E9%A3%9F&offset=20"}
     * posts : [{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img01.liwushuo.com/image/141201/rwabjrwbv.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/141201/rwabjrwbv.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1000057,"liked":false,"likes_count":75280,"title":"抛开减肥，送Ta吃不完的美好","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img03.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img03.liwushuo.com/image/141212/vhqdpq5an.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/141212/vhqdpq5an.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1000181,"liked":false,"likes_count":70667,"title":"世界零食大巡游：舌尖上的英国","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img03.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img02.liwushuo.com/image/150715/uujusxpx2.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/150715/uujusxpx2.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1003437,"liked":false,"likes_count":64914,"title":"吃货，也是一枚颜值控","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img01.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img01.liwushuo.com/image/150722/8kbloav3j.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/150722/8kbloav3j.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1003987,"liked":false,"likes_count":66061,"title":"饿货，吃我一记大安利！这些零食绝对管饱！","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img03.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img03.liwushuo.com/image/150824/wep5f3sc8.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/150824/wep5f3sc8.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1009791,"liked":false,"likes_count":47814,"title":"追剧零食大搜罗，不用饿着看欧巴","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img03.liwushuo.com/image/150826/rlylfq6yg.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/150826/rlylfq6yg.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1010271,"liked":false,"likes_count":46580,"title":"聚会零⾷：庆祝我们的新学期","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img03.liwushuo.com/image/150924/8a7pjafkg.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/150924/8a7pjafkg.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1014571,"liked":false,"likes_count":62010,"title":"慎吃！那些让你停不了嘴的⼩零食","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img01.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img02.liwushuo.com/image/151223/jxr04kyka.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/151223/jxr04kyka.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1028251,"liked":false,"likes_count":9857,"title":"天猫超市进口零食·华北篇","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img03.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img02.liwushuo.com/image/160112/d9qbcl608.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160112/d9qbcl608.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1031221,"liked":false,"likes_count":37968,"title":"新年来到，家里要常备点美味小零食","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160615/z4wubgarw.jpg","avatar_webp_url":null,"created_at":1465975797,"id":14,"nickname":"鹿欧尼"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160608/lkhsgavyq.jpg-w300","category":"美食","cover_image_url":"http://img01.liwushuo.com/image/160628/d05kol07y.jpg-w720","created_at":1462501752,"description":"美食是一场原地旅行，你去不了的地方，我给你把故事带回来。","id":17,"order":0,"status":0,"subtitle":"","title":"馋游记","updated_at":1466470432},"cover_image_url":"http://img01.liwushuo.com/image/160505/955em7q1v.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160505/955em7q1v.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1043071,"liked":false,"likes_count":27585,"title":"第1期 | 小时候与同桌一起分享过的这些零食","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160615/yp2rm3n35.jpg","avatar_webp_url":null,"created_at":1465974365,"id":11,"nickname":"大大卷"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160608/16dn4cryj.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/csy9zrran.jpg-w720","created_at":1462501893,"description":"想环游世界有点难，吃遍世界却容易多了。","id":22,"order":0,"status":0,"subtitle":"已完结","title":"世界零食大巡游","updated_at":1467100446},"cover_image_url":"http://img02.liwushuo.com/image/160603/s3mnk54c4.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160603/s3mnk54c4.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1043771,"liked":false,"likes_count":22703,"title":"第28期 | 消暑max零食大作战！","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img02.liwushuo.com/image/150116/btfp7ofl8.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/150116/btfp7ofl8.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1000535,"liked":false,"likes_count":35078,"title":"过年的时候，你家里一定会有这些零食","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img03.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img02.liwushuo.com/image/150512/obm3h5ol5.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/150512/obm3h5ol5.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1001482,"liked":false,"likes_count":106930,"title":"最受女生喜欢的热门零食TOP10","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img02.liwushuo.com/image/150626/orx8nq7i4.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/150626/orx8nq7i4.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1002038,"liked":false,"likes_count":110053,"title":"10款高人气MUJI零食","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img01.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img02.liwushuo.com/image/150722/i3uw93o4s.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/150722/i3uw93o4s.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1004002,"liked":false,"likes_count":52615,"title":"送这些美食俘获文艺派吃货的心","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img03.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img01.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img01.liwushuo.com/image/150908/mrx42caf8.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/150908/mrx42caf8.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1007308,"liked":false,"likes_count":33017,"title":"世界零食盘点：专业吃货必备清单","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img03.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img02.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img03.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img02.liwushuo.com/image/150813/yjh39jpjs.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/150813/yjh39jpjs.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1007355,"liked":false,"likes_count":48136,"title":"没什么特别的理由，就是嘴巴寂寞了","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img03.liwushuo.com/image/150817/frdgfw1go.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/150817/frdgfw1go.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1008095,"liked":false,"likes_count":52464,"title":"这些花，看起来好好吃哦","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img03.liwushuo.com/image/150908/lpotah0nf.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/150908/lpotah0nf.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1008805,"liked":false,"likes_count":65503,"title":"专业吃货必备零食：不出门吃遍全世界","type":"post"},{"ad_monitors":[],"author":{"avatar_url":"http://img02.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"},"column":{"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817},"cover_image_url":"http://img03.liwushuo.com/image/150824/14lzgzy4c.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/150824/14lzgzy4c.jpg?imageView2/2/w/720/q/85/format/webp","hidden_cover_image":false,"id":1009808,"liked":false,"likes_count":35887,"title":"不出家门，吃遍世界各地零食","type":"post"}]
     */

    private DataBean data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        /**
         * next_url : http://api.liwushuo.com/v2/search/post?sort=&limit=20&keyword=%E9%9B%B6%E9%A3%9F&offset=20
         */

        private PagingBean paging;
        /**
         * ad_monitors : []
         * author : {"avatar_url":"http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg","avatar_webp_url":null,"created_at":1465802857,"id":1,"nickname":"小礼君"}
         * column : {"banner_image_url":"http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300","category":"美食","cover_image_url":"http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720","created_at":1466495336,"description":"点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。","id":64,"order":-1,"status":0,"subtitle":"已完结","title":"美食の情书","updated_at":1466678817}
         * cover_image_url : http://img01.liwushuo.com/image/141201/rwabjrwbv.jpg-w720
         * cover_webp_url : http://img01.liwushuo.com/image/141201/rwabjrwbv.jpg?imageView2/2/w/720/q/85/format/webp
         * hidden_cover_image : false
         * id : 1000057
         * liked : false
         * likes_count : 75280
         * title : 抛开减肥，送Ta吃不完的美好
         * type : post
         */

        private List<PostsBean> posts;

        public PagingBean getPaging() {
            return paging;
        }

        public void setPaging(PagingBean paging) {
            this.paging = paging;
        }

        public List<PostsBean> getPosts() {
            return posts;
        }

        public void setPosts(List<PostsBean> posts) {
            this.posts = posts;
        }

        public static class PagingBean {
            private String next_url;

            public String getNext_url() {
                return next_url;
            }

            public void setNext_url(String next_url) {
                this.next_url = next_url;
            }
        }

        public static class PostsBean {
            /**
             * avatar_url : http://img01.liwushuo.com/image/160617/hzkkl1ohn.jpg
             * avatar_webp_url : null
             * created_at : 1465802857
             * id : 1
             * nickname : 小礼君
             */

            private AuthorBean author;
            /**
             * banner_image_url : http://img01.liwushuo.com/image/160623/4e241fwj7.jpg-w300
             * category : 美食
             * cover_image_url : http://img02.liwushuo.com/image/160628/zlou6xduv.jpg-w720
             * created_at : 1466495336
             * description : 点缀生活美学，装扮温暖港湾，宅着也要爱家宅，有爱和你们才是家。
             * id : 64
             * order : -1
             * status : 0
             * subtitle : 已完结
             * title : 美食の情书
             * updated_at : 1466678817
             */

            private ColumnBean column;
            private String cover_image_url;
            private String cover_webp_url;
            private boolean hidden_cover_image;
            private int id;
            private boolean liked;
            private int likes_count;
            private String title;
            private String type;
            private List<?> ad_monitors;

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public ColumnBean getColumn() {
                return column;
            }

            public void setColumn(ColumnBean column) {
                this.column = column;
            }

            public String getCover_image_url() {
                return cover_image_url;
            }

            public void setCover_image_url(String cover_image_url) {
                this.cover_image_url = cover_image_url;
            }

            public String getCover_webp_url() {
                return cover_webp_url;
            }

            public void setCover_webp_url(String cover_webp_url) {
                this.cover_webp_url = cover_webp_url;
            }

            public boolean isHidden_cover_image() {
                return hidden_cover_image;
            }

            public void setHidden_cover_image(boolean hidden_cover_image) {
                this.hidden_cover_image = hidden_cover_image;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public boolean isLiked() {
                return liked;
            }

            public void setLiked(boolean liked) {
                this.liked = liked;
            }

            public int getLikes_count() {
                return likes_count;
            }

            public void setLikes_count(int likes_count) {
                this.likes_count = likes_count;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<?> getAd_monitors() {
                return ad_monitors;
            }

            public void setAd_monitors(List<?> ad_monitors) {
                this.ad_monitors = ad_monitors;
            }

            public static class AuthorBean {
                private String avatar_url;
                private Object avatar_webp_url;
                private int created_at;
                private int id;
                private String nickname;

                public String getAvatar_url() {
                    return avatar_url;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public Object getAvatar_webp_url() {
                    return avatar_webp_url;
                }

                public void setAvatar_webp_url(Object avatar_webp_url) {
                    this.avatar_webp_url = avatar_webp_url;
                }

                public int getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(int created_at) {
                    this.created_at = created_at;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getNickname() {
                    return nickname;
                }

                public void setNickname(String nickname) {
                    this.nickname = nickname;
                }
            }

            public static class ColumnBean {
                private String banner_image_url;
                private String category;
                private String cover_image_url;
                private int created_at;
                private String description;
                private int id;
                private int order;
                private int status;
                private String subtitle;
                private String title;
                private int updated_at;
                private boolean isCheckBox = false;
                public boolean isCheckBox() {
                    return isCheckBox;
                }

                public void setCheckBox(boolean checkBox) {
                    isCheckBox = checkBox;
                }

                public String getBanner_image_url() {
                    return banner_image_url;
                }

                public void setBanner_image_url(String banner_image_url) {
                    this.banner_image_url = banner_image_url;
                }

                public String getCategory() {
                    return category;
                }

                public void setCategory(String category) {
                    this.category = category;
                }

                public String getCover_image_url() {
                    return cover_image_url;
                }

                public void setCover_image_url(String cover_image_url) {
                    this.cover_image_url = cover_image_url;
                }

                public int getCreated_at() {
                    return created_at;
                }

                public void setCreated_at(int created_at) {
                    this.created_at = created_at;
                }

                public String getDescription() {
                    return description;
                }

                public void setDescription(String description) {
                    this.description = description;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public int getOrder() {
                    return order;
                }

                public void setOrder(int order) {
                    this.order = order;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public String getSubtitle() {
                    return subtitle;
                }

                public void setSubtitle(String subtitle) {
                    this.subtitle = subtitle;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public int getUpdated_at() {
                    return updated_at;
                }

                public void setUpdated_at(int updated_at) {
                    this.updated_at = updated_at;
                }
            }
        }
    }
}

