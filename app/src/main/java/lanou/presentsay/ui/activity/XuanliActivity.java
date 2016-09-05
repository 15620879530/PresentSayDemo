package lanou.presentsay.ui.activity;

import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupWindow;

import lanou.presentsay.R;
import lanou.presentsay.ui.adapter.TiaoXuanAdapter;
import lanou.presentsay.ui.adapter.XuanliPopAdapter;
import lanou.presentsay.ui.adapter.XuanliRvAdapter;
import lanou.presentsay.ui.bean.TiaoXuanPopRvBean;
import lanou.presentsay.ui.bean.XuanliBean;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.tools.NetTool;


/**
 * 分类 -> 单品 -> 选礼神器 跳转的 "挑选礼物" Activity....
 * 搜索 -> 使用选礼神器快速挑选礼物跳转的 界面
 * Created by dllo on 16/8/26.
 */
public class XuanliActivity extends AbsBaseActivity implements View.OnClickListener {
    private static final String TAG = "TAG_XuanliActivity";
    private GridView gv;
    private ImageView back;
    private ImageView shaixuan;
    private RecyclerView recyclerView;
    private String tagUrl = "http://api.liwushuo.com/v2/search/item_filter";
    private String urlTarget = "";
    private String urlScene = "";
    private String urlPersonality = "";
    private String urlPrice = "";
    private String url = "http://api.liwushuo.com/v2/search/item_by_type?limit=20&offset=0";
    private PopupWindow popupWindow;
    private int positions = 0;
    private TiaoXuanPopRvBean bean;
    private String getId;
    private View returnBtn;
    private String getKey;
    private TiaoXuanAdapter tiaoXuanAdapter;

    @Override
    protected int setLayout() {
        return R.layout.activity_xuanli;
    }

    public String changeUrl(String target, String scene, String personality, String price) {
        if (target != null) {
            urlTarget = "&target=" + target;
            if ("".equals(target)) {
                urlTarget = "";
            }
        }
        else if (scene != null) {
            urlScene = "&scene=" + scene;
            if ("".equals(scene)) {
                urlScene = "";
            }
        }
        else if (personality != null) {
            urlPersonality = "&personality=" + personality;
            if ("".equals(personality)) {
                urlPersonality = "";
            }
        }
        else if (price != null) {
            urlPrice = "&price=" + price;
            if ("".equals(price)) {
                urlPrice = "";
            }
        }

        return url = "http://api.liwushuo.com/v2/search/item_by_type?limit=20&offset=0"+ urlTarget + urlScene + urlPersonality + urlPrice;
    }

    @Override
    protected void initView() {
        recyclerView = bindView(R.id.xuanli_tag_rv);
        shaixuan = bindView(R.id.xuanli_iv_shaixuan);
        gv = bindView(R.id.tiaoxuan_gridview);
        back = bindView(R.id.tiaoxian_back);

    }

    @Override
    protected void initData() {
        back.setOnClickListener(this);
        //这个是所获取到的 对象  场景...这个rv的数据
        netTool = new NetTool();

        netTool.getData(tagUrl, TiaoXuanPopRvBean.class , new NetTool.NetInterface<TiaoXuanPopRvBean>() {
            @Override
            public void onSuccess(final TiaoXuanPopRvBean tiaoXuanPopRvBean) {
                bean = tiaoXuanPopRvBean;
                Log.d(TAG, bean.getData().getFilters().get(positions).getChannels().get(positions).getName());
                XuanliRvAdapter xuanliRvAdapter = new XuanliRvAdapter();
                GridLayoutManager manager = new GridLayoutManager(MyApp.mContect,1);
                manager.setOrientation(LinearLayoutManager.HORIZONTAL);
                xuanliRvAdapter.setBean(tiaoXuanPopRvBean);
                recyclerView.setLayoutManager(manager);
                recyclerView.setAdapter(xuanliRvAdapter);


                //回调
                xuanliRvAdapter.setOnTagClickListener(new XuanliRvAdapter.OnTagClickListener() {
                    @Override
                    public void onClick(int position) {
                        positions = position;
                        if (popupWindow == null||!popupWindow.isShowing()){
                            popupWindow = new PopupWindow(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
                            View view = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_poptag_recycler,null);
                            RecyclerView recyclerView1 = (RecyclerView) view.findViewById(R.id.gift_god_popup_recycler);
                            XuanliPopAdapter adapter =new XuanliPopAdapter();
                            adapter.setBean(bean.getData().getFilters().get(position));
                            GridLayoutManager gridLayoutManager = new GridLayoutManager(MyApp.mContect,3);
                            gridLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
                            recyclerView1.setLayoutManager(gridLayoutManager);
                            recyclerView1.setAdapter(adapter);
                            popupWindow.setContentView(view);
                            popupWindow.setBackgroundDrawable(new BitmapDrawable());
                            popupWindow.setOutsideTouchable(true);
                            popupWindow.showAsDropDown(recyclerView);

                            adapter.setOnPopupClickListener(new XuanliPopAdapter.onPopupClickListener() {
                                @Override
                                public void onClick(int position, String id, String key) {
                                    switch (positions){
                                        case 0:
                                            initShowData(changeUrl(id,null,null,null));
                                            Log.d("XuanliActivity", url);
                                            break;
                                        case 1:
                                            initShowData(changeUrl(null,id,null,null));
                                            break;
                                        case 2:
                                            initShowData(changeUrl(null,null,id,null));
                                            break;
                                        case 3:
                                            initShowData(changeUrl(null,null,null,key));
                                            break;
                                    }
                                    popupWindow.dismiss();
                                }
                            });

                        }
                    }
                });
            }
            @Override
            public void onError(String errorMsg) {
            }
        });
    }

    private void initShowData (String url){
        netTool = new NetTool();
        netTool.getData(url, XuanliBean.class, new NetTool.NetInterface<XuanliBean>() {
            @Override
            public void onSuccess(XuanliBean xuanliBean) {

                tiaoXuanAdapter = new TiaoXuanAdapter();
                tiaoXuanAdapter.setBean(xuanliBean);
                gv.setAdapter(tiaoXuanAdapter);
           }

            @Override
            public void onError(String errorMsg) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tiaoxian_back:
                finish();
                break;
        }

    }
}
