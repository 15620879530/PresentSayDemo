package lanou.presentsay.ui.tools;

/**
 * Created by dllo on 16/8/17.
 * 网址静态常量类
 */
public class NetUrls {
    private static final String TAG = "TAG_NetUrls";

    /**
     * 精选界面 listview的 Url
     */
    public  final static String urlLvSelection = "http://api.liwushuo.com/v2/channels/100/items_v2?ad=2&gender=1&generation=1&limit=20&offset=0";
    /**
     * 精选界面 popwindow 的url
     */
    public final static  String urlGuidePopWidow ="http://api.liwushuo.com/v2/channels/preset?gender=1&generation=4";
    /**
     * 精选界面 轮播图的Url
     */
    public final static String urlBanner = "http://api.liwushuo.com/v2/banners";

    /**
     * 精选界面横向RecycleView 的Url
     */
    public final static String urlRvSelection = "http://api.liwushuo.com/v2/secondary_banners?gender=2&generation=1";

    /**
     * 送女票第一界面的 Url
     */
    public final static String urlGiveMyGirlFriend="http://api.liwushuo.com/v2/channels/10/items_v2?gender=1&generation=2&limit=20&offset=0";

    /**
     * 海淘的第一界面的 Url
     */
    public final static String urlHaiTao="http://api.liwushuo.com/v2/channels/129/items_v2?gender=1&generation=2&limit=20&offset=";

    /**
     * 创意生活界面的 Url
     */
    public final static String urlCreatlife ="http://api.liwushuo.com/v2/channels/125/items_v2?gender=1&generation=1&limit=20&offset=0";

    /**
     * 科技范界面的  Url
     */
    public final static String urlScience = "http://api.liwushuo.com/v2/channels/28/items_v2?gender=1&generation=1&limit=20&offset=0";

    /**
     * 送爸妈
     */
    public final static String urlGiveParents = "http://api.liwushuo.com/v2/channels/6/items_v2?gender=1&generation=1&limit=20&offset=0";

    /**
     * 送基友
     */
    public final static String urlGiveGoodFriend = "http://api.liwushuo.com/v2/channels/26/items_v2?gender=1&generation=1&limit=20&offset=0";

    /**
     * 送闺蜜
     */
    public final static String urlGiveGirlFriend = "http://api.liwushuo.com/v2/channels/5/items_v2?gender=1&generation=1&limit=20&offset=0";
    /**
     * 送同事
     */
    public final static String urlGiveColleague ="http://api.liwushuo.com/v2/channels/17/items_v2?gender=1&generation=1&limit=20&offset=0";

    /**
     * 送宝贝
     */
    public final static String urlGiveBaby = "http://api.liwushuo.com/v2/channels/24/items_v2?gender=1&generation=1&limit=20&offset=0";

    /**
     * 设计感
     */
    public final static String urlDesign = "http://api.liwushuo.com/v2/channels/127/items_v2?gender=1&generation=1&limit=20&offset=0";

    /**
     * 文艺风
     */
    public final static String urlArt = "http://api.liwushuo.com/v2/channels/14/items_v2?gender=1&generation=1&limit=20&offset=0";

    /**
     * 奇葩搞怪
     */
    public final static String urlFunny ="http://api.liwushuo.com/v2/channels/126/items_v2?gender=1&generation=1&limit=20&offset=0";

    /**
     * 萌萌哒
     */
    public final static String urlMengMengDa = "http://api.liwushuo.com/v2/channels/11/items_v2?gender=1&generation=1&limit=20&offset=0";

    /**
     * 热门
     */
    public final static String urlHot = "http://api.liwushuo.com/v2/items?gender=1&generation=1&limit=50&offset=0";

    /**
     * 栏目接口
     */
    public static final String urlClassifylanmu = "http://api.liwushuo.com/v2/columns";

    /**
     * 品类 风格 对象
     */
    public static final String urlClassifyPLFGDX = "http://api.liwushuo.com/v2/channel_groups/all";

    /**
     * 单品接口
     */
    public static final String getUrlClassifySingle = "http://api.liwushuo.com/v2/item_categories/tree";

    /**
     * 挑选礼物
     */
    public static final String urlTiaoXuan = "http://api.liwushuo.com/v2/search/item_by_type?limit=20&offset=0";

    /**
     * 搜索界面的url
     */
    public static final String urlSearch = "http://api.liwushuo.com/v2/search/hot_words";
}
