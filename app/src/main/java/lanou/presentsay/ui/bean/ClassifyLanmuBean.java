package lanou.presentsay.ui.bean;

import java.util.List;

/**
 * Created by dllo on 16/8/19.
 */
public class ClassifyLanmuBean {
    private static final String TAG = "TAG_ClassifyLanmuBean";

    /**
     * code : 200
     * data : {"columns":[{"author":"邢玛","banner_image_url":"http://img03.liwushuo.com/image/160608/l8ohmryht.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160608/l8ohmryht.jpg?imageView2/2/w/300/q/85/format/webp","category":"家居","cover_image_url":"http://img01.liwushuo.com/image/160713/0jpqb48ir.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160713/0jpqb48ir.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501846,"description":"纵然外面的世界色彩缤纷，装潢好港湾的一方净土，我愿意一辈子宅在家里。","id":20,"order":0,"post_published_at":1471573086,"status":0,"subtitle":"更新至第72期","title":"理想家","updated_at":1471573087},{"author":"美物娘","banner_image_url":"http://img02.liwushuo.com/image/160608/8nluue8yx.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160608/8nluue8yx.jpg?imageView2/2/w/300/q/85/format/webp","category":"美物","cover_image_url":"http://img02.liwushuo.com/image/160713/zlsbvl5it.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160713/zlsbvl5it.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501829,"description":"贪念时间所有美好的东西，唯一不吝啬的，就是与你分享。","id":19,"order":0,"post_published_at":1471564800,"status":0,"subtitle":"更新至第78期","title":"美物收割机","updated_at":1471567716},{"author":"小礼君","banner_image_url":"http://img03.liwushuo.com/image/160815/v2p80ao8y.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160815/v2p80ao8y.jpg?imageView2/2/w/300/q/85/format/webp","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160815/fervz0o5x.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160815/fervz0o5x.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1471225655,"description":"品质、考究、精心遴选；细节、严格、甄添筛减；处女座强迫症的挑选小组，一份有态度的最佳礼物大赏。","id":94,"order":0,"post_published_at":1471575600,"status":0,"subtitle":"","title":"最佳礼物大赏","updated_at":1471563100},{"author":"Miss. talk ","banner_image_url":"http://img02.liwushuo.com/image/160712/3c1fj1dq6.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160712/3c1fj1dq6.jpg?imageView2/2/w/300/q/85/format/webp","category":"涨姿势","cover_image_url":"http://img03.liwushuo.com/image/160713/74m5db26q.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160713/74m5db26q.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462771521,"description":"同一件事，你怎么想，他怎么看，平行生活里的你我他，也许正经历同样的情绪，分享着类似的槽点，不管你是围观的吃瓜群众，还是森森被困扰的当事人甲，在shall we talk里，和Miss. talk一起聚众吐槽吧~  ","id":24,"order":0,"post_published_at":1471521600,"status":0,"subtitle":"更新至第104期","title":"Shall we talk","updated_at":1471517640},{"author":"lazy宝宝","banner_image_url":"http://img03.liwushuo.com/image/160608/vbhuxvg2v.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160608/vbhuxvg2v.jpg?imageView2/2/w/300/q/85/format/webp","category":"穿搭","cover_image_url":"http://img01.liwushuo.com/image/160713/7q5f167fe.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160713/7q5f167fe.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501575,"description":"给我一篇文章的时间，告诉你不再费心搭配的秘密，每天1分钟搞定完美穿搭。","id":9,"order":0,"post_published_at":1471575600,"status":0,"subtitle":"更新至第98期","title":"懒人穿搭术","updated_at":1471517210},{"author":"YUKI酱","banner_image_url":"http://img01.liwushuo.com/image/160628/379bspj5c.jpg-w300","banner_webp_url":"http://img01.liwushuo.com/image/160628/379bspj5c.jpg?imageView2/2/w/300/q/85/format/webp","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160713/ds80jy3ck.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160713/ds80jy3ck.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1465722046,"description":"你买或者不买，它都在那里，不过中间隔着一整个错过的最低折扣，和一个欲哭无泪的钱包君。","id":46,"order":0,"post_published_at":1471575600,"status":0,"subtitle":"","title":"每日值得buy","updated_at":1471508806},{"author":"小C","banner_image_url":"http://img02.liwushuo.com/image/160608/kd1dy4pi3.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160608/kd1dy4pi3.jpg?imageView2/2/w/300/q/85/format/webp","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160713/y2arp77qx.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160713/y2arp77qx.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501381,"description":"如果青春不会散场，时光可以珍藏。如果你的每一个米粒大小念想，都能找到与之匹配的美物安放...这样的店你会不会来？","id":5,"order":0,"post_published_at":1471575600,"status":0,"subtitle":"更新至第132期","title":"不打烊的礼物店","updated_at":1471500828},{"author":"叫我小公举","banner_image_url":"http://img02.liwushuo.com/image/160608/muk9fdsya.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160608/muk9fdsya.jpg?imageView2/2/w/300/q/85/format/webp","category":"美物","cover_image_url":"http://img01.liwushuo.com/image/160713/1p98sh06h.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160713/1p98sh06h.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501717,"description":"僻静的街角有一家杂货铺，或许你带着忧愁走进店中，但不期而遇的小物却让你展露欢颜。","id":14,"order":0,"post_published_at":1471489200,"status":0,"subtitle":"更新至第48期","title":"解忧杂货铺","updated_at":1471486161},{"author":"小礼君","banner_image_url":"http://img03.liwushuo.com/image/160630/npssjj3yc.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160630/npssjj3yc.jpg?imageView2/2/w/300/q/85/format/webp","category":"美食","cover_image_url":"http://img03.liwushuo.com/image/160713/l0nb4kpud.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160713/l0nb4kpud.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1467265951,"description":"无论是山珍海味还是街边小吃，\r\n无论是飞禽走兽还是五谷香料，\r\n美食不分贵贱没有国界\r\n我们都犯着一种罪，叫做\u201c食宗最\u201d","id":83,"order":0,"post_published_at":1471478400,"status":0,"subtitle":"","title":"吃货俱乐部","updated_at":1471428740},{"author":"资优生","banner_image_url":"http://img03.liwushuo.com/image/160608/okz87zmtn.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160608/okz87zmtn.jpg?imageView2/2/w/300/q/85/format/webp","category":"美护","cover_image_url":"http://img02.liwushuo.com/image/160713/d4vtwm69h.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160713/d4vtwm69h.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501863,"description":"完美卸妆的正确步骤，每片面膜的成分功效，这里都知道。","id":21,"order":0,"post_published_at":1471489200,"status":0,"subtitle":"更新至第63期","title":"完美护肤指南","updated_at":1471425816},{"author":"凹凸曼","banner_image_url":"http://img02.liwushuo.com/image/160708/or81k6fea.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160708/or81k6fea.jpg?imageView2/2/w/300/q/85/format/webp","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160720/xdt9kjriy.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160720/xdt9kjriy.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1467970933,"description":"会买不一定\u201c惠\u201d买，每日10款超低价，举双手奉上。\u2014\u2014from亚马逊良心出品","id":90,"order":0,"post_published_at":1471564800,"status":0,"subtitle":"更新至第41期","title":"省钱大总攻","updated_at":1471425812}],"paging":{"next_url":"http://api.liwushuo.com/v2/columns?limit=11&offset=11"}}
     * message : OK
     */

    private int code;
    /**
     * columns : [{"author":"邢玛","banner_image_url":"http://img03.liwushuo.com/image/160608/l8ohmryht.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160608/l8ohmryht.jpg?imageView2/2/w/300/q/85/format/webp","category":"家居","cover_image_url":"http://img01.liwushuo.com/image/160713/0jpqb48ir.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160713/0jpqb48ir.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501846,"description":"纵然外面的世界色彩缤纷，装潢好港湾的一方净土，我愿意一辈子宅在家里。","id":20,"order":0,"post_published_at":1471573086,"status":0,"subtitle":"更新至第72期","title":"理想家","updated_at":1471573087},{"author":"美物娘","banner_image_url":"http://img02.liwushuo.com/image/160608/8nluue8yx.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160608/8nluue8yx.jpg?imageView2/2/w/300/q/85/format/webp","category":"美物","cover_image_url":"http://img02.liwushuo.com/image/160713/zlsbvl5it.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160713/zlsbvl5it.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501829,"description":"贪念时间所有美好的东西，唯一不吝啬的，就是与你分享。","id":19,"order":0,"post_published_at":1471564800,"status":0,"subtitle":"更新至第78期","title":"美物收割机","updated_at":1471567716},{"author":"小礼君","banner_image_url":"http://img03.liwushuo.com/image/160815/v2p80ao8y.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160815/v2p80ao8y.jpg?imageView2/2/w/300/q/85/format/webp","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160815/fervz0o5x.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160815/fervz0o5x.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1471225655,"description":"品质、考究、精心遴选；细节、严格、甄添筛减；处女座强迫症的挑选小组，一份有态度的最佳礼物大赏。","id":94,"order":0,"post_published_at":1471575600,"status":0,"subtitle":"","title":"最佳礼物大赏","updated_at":1471563100},{"author":"Miss. talk ","banner_image_url":"http://img02.liwushuo.com/image/160712/3c1fj1dq6.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160712/3c1fj1dq6.jpg?imageView2/2/w/300/q/85/format/webp","category":"涨姿势","cover_image_url":"http://img03.liwushuo.com/image/160713/74m5db26q.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160713/74m5db26q.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462771521,"description":"同一件事，你怎么想，他怎么看，平行生活里的你我他，也许正经历同样的情绪，分享着类似的槽点，不管你是围观的吃瓜群众，还是森森被困扰的当事人甲，在shall we talk里，和Miss. talk一起聚众吐槽吧~  ","id":24,"order":0,"post_published_at":1471521600,"status":0,"subtitle":"更新至第104期","title":"Shall we talk","updated_at":1471517640},{"author":"lazy宝宝","banner_image_url":"http://img03.liwushuo.com/image/160608/vbhuxvg2v.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160608/vbhuxvg2v.jpg?imageView2/2/w/300/q/85/format/webp","category":"穿搭","cover_image_url":"http://img01.liwushuo.com/image/160713/7q5f167fe.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160713/7q5f167fe.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501575,"description":"给我一篇文章的时间，告诉你不再费心搭配的秘密，每天1分钟搞定完美穿搭。","id":9,"order":0,"post_published_at":1471575600,"status":0,"subtitle":"更新至第98期","title":"懒人穿搭术","updated_at":1471517210},{"author":"YUKI酱","banner_image_url":"http://img01.liwushuo.com/image/160628/379bspj5c.jpg-w300","banner_webp_url":"http://img01.liwushuo.com/image/160628/379bspj5c.jpg?imageView2/2/w/300/q/85/format/webp","category":"礼物","cover_image_url":"http://img03.liwushuo.com/image/160713/ds80jy3ck.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160713/ds80jy3ck.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1465722046,"description":"你买或者不买，它都在那里，不过中间隔着一整个错过的最低折扣，和一个欲哭无泪的钱包君。","id":46,"order":0,"post_published_at":1471575600,"status":0,"subtitle":"","title":"每日值得buy","updated_at":1471508806},{"author":"小C","banner_image_url":"http://img02.liwushuo.com/image/160608/kd1dy4pi3.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160608/kd1dy4pi3.jpg?imageView2/2/w/300/q/85/format/webp","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160713/y2arp77qx.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160713/y2arp77qx.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501381,"description":"如果青春不会散场，时光可以珍藏。如果你的每一个米粒大小念想，都能找到与之匹配的美物安放...这样的店你会不会来？","id":5,"order":0,"post_published_at":1471575600,"status":0,"subtitle":"更新至第132期","title":"不打烊的礼物店","updated_at":1471500828},{"author":"叫我小公举","banner_image_url":"http://img02.liwushuo.com/image/160608/muk9fdsya.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160608/muk9fdsya.jpg?imageView2/2/w/300/q/85/format/webp","category":"美物","cover_image_url":"http://img01.liwushuo.com/image/160713/1p98sh06h.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160713/1p98sh06h.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501717,"description":"僻静的街角有一家杂货铺，或许你带着忧愁走进店中，但不期而遇的小物却让你展露欢颜。","id":14,"order":0,"post_published_at":1471489200,"status":0,"subtitle":"更新至第48期","title":"解忧杂货铺","updated_at":1471486161},{"author":"小礼君","banner_image_url":"http://img03.liwushuo.com/image/160630/npssjj3yc.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160630/npssjj3yc.jpg?imageView2/2/w/300/q/85/format/webp","category":"美食","cover_image_url":"http://img03.liwushuo.com/image/160713/l0nb4kpud.jpg-w720","cover_webp_url":"http://img03.liwushuo.com/image/160713/l0nb4kpud.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1467265951,"description":"无论是山珍海味还是街边小吃，\r\n无论是飞禽走兽还是五谷香料，\r\n美食不分贵贱没有国界\r\n我们都犯着一种罪，叫做\u201c食宗最\u201d","id":83,"order":0,"post_published_at":1471478400,"status":0,"subtitle":"","title":"吃货俱乐部","updated_at":1471428740},{"author":"资优生","banner_image_url":"http://img03.liwushuo.com/image/160608/okz87zmtn.jpg-w300","banner_webp_url":"http://img03.liwushuo.com/image/160608/okz87zmtn.jpg?imageView2/2/w/300/q/85/format/webp","category":"美护","cover_image_url":"http://img02.liwushuo.com/image/160713/d4vtwm69h.jpg-w720","cover_webp_url":"http://img02.liwushuo.com/image/160713/d4vtwm69h.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1462501863,"description":"完美卸妆的正确步骤，每片面膜的成分功效，这里都知道。","id":21,"order":0,"post_published_at":1471489200,"status":0,"subtitle":"更新至第63期","title":"完美护肤指南","updated_at":1471425816},{"author":"凹凸曼","banner_image_url":"http://img02.liwushuo.com/image/160708/or81k6fea.jpg-w300","banner_webp_url":"http://img02.liwushuo.com/image/160708/or81k6fea.jpg?imageView2/2/w/300/q/85/format/webp","category":"礼物","cover_image_url":"http://img01.liwushuo.com/image/160720/xdt9kjriy.jpg-w720","cover_webp_url":"http://img01.liwushuo.com/image/160720/xdt9kjriy.jpg?imageView2/2/w/720/q/85/format/webp","created_at":1467970933,"description":"会买不一定\u201c惠\u201d买，每日10款超低价，举双手奉上。\u2014\u2014from亚马逊良心出品","id":90,"order":0,"post_published_at":1471564800,"status":0,"subtitle":"更新至第41期","title":"省钱大总攻","updated_at":1471425812}]
     * paging : {"next_url":"http://api.liwushuo.com/v2/columns?limit=11&offset=11"}
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
         * next_url : http://api.liwushuo.com/v2/columns?limit=11&offset=11
         */

        private PagingBean paging;
        /**
         * author : 邢玛
         * banner_image_url : http://img03.liwushuo.com/image/160608/l8ohmryht.jpg-w300
         * banner_webp_url : http://img03.liwushuo.com/image/160608/l8ohmryht.jpg?imageView2/2/w/300/q/85/format/webp
         * category : 家居
         * cover_image_url : http://img01.liwushuo.com/image/160713/0jpqb48ir.jpg-w720
         * cover_webp_url : http://img01.liwushuo.com/image/160713/0jpqb48ir.jpg?imageView2/2/w/720/q/85/format/webp
         * created_at : 1462501846
         * description : 纵然外面的世界色彩缤纷，装潢好港湾的一方净土，我愿意一辈子宅在家里。
         * id : 20
         * order : 0
         * post_published_at : 1471573086
         * status : 0
         * subtitle : 更新至第72期
         * title : 理想家
         * updated_at : 1471573087
         */

        private List<ColumnsBean> columns;

        public PagingBean getPaging() {
            return paging;
        }

        public void setPaging(PagingBean paging) {
            this.paging = paging;
        }

        public List<ColumnsBean> getColumns() {
            return columns;
        }

        public void setColumns(List<ColumnsBean> columns) {
            this.columns = columns;
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

        public static class ColumnsBean {
            private String author;
            private String banner_image_url;
            private String banner_webp_url;
            private String category;
            private String cover_image_url;
            private String cover_webp_url;
            private int created_at;
            private String description;
            private int id;
            private int order;
            private int post_published_at;
            private int status;
            private String subtitle;
            private String title;
            private int updated_at;

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getBanner_image_url() {
                return banner_image_url;
            }

            public void setBanner_image_url(String banner_image_url) {
                this.banner_image_url = banner_image_url;
            }

            public String getBanner_webp_url() {
                return banner_webp_url;
            }

            public void setBanner_webp_url(String banner_webp_url) {
                this.banner_webp_url = banner_webp_url;
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

            public String getCover_webp_url() {
                return cover_webp_url;
            }

            public void setCover_webp_url(String cover_webp_url) {
                this.cover_webp_url = cover_webp_url;
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

            public int getPost_published_at() {
                return post_published_at;
            }

            public void setPost_published_at(int post_published_at) {
                this.post_published_at = post_published_at;
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
