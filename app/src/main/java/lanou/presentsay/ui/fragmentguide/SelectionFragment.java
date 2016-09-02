package lanou.presentsay.ui.fragmentguide;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;

import com.youth.banner.Banner;

import lanou.presentsay.R;
import lanou.presentsay.ui.ListViewForScrollView;
import lanou.presentsay.ui.SelectionLVActivity;
import lanou.presentsay.ui.activity.LunFanSecondActitvty;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.adapter.SelectionAdapter;
import lanou.presentsay.ui.adapter.SelectionRvAdapter;
import lanou.presentsay.ui.bean.BannerBean;
import lanou.presentsay.ui.bean.SelectionBean;
import lanou.presentsay.ui.bean.SelectionRVBean;
import lanou.presentsay.ui.fragment.AbsBaseFragment;
import lanou.presentsay.ui.tools.NetTool;
import lanou.presentsay.ui.tools.NetUrls;

/**
 * 精选
 * Created by dllo on 16/8/16.
 */
public class SelectionFragment extends AbsBaseFragment implements Banner.OnBannerClickListener, AdapterView.OnItemClickListener {
    private static final String TAG = "TAG_SelectionFragment";
    private ListViewForScrollView lv;
    private String[] imageUris;
    private RecyclerView rv;
    private Banner banner;
    private SelectionBean bean;

    @Override
    protected int setlayout() {
        return R.layout.fragment_selection;//精选的Fragment
    }

    @Override
    protected void initView() {

        banner = bindView(R.id.select_banner);
        lv = bindView(R.id.lvforSv);
        rv = bindView(R.id.recyclerView_selection);
    }

    @Override
    protected void initData() {
        lv.setOnItemClickListener(this);
        netTool = new NetTool();
        /**
         * 精选界面的RecyclerView
         */
        netTool.getData(NetUrls.urlRvSelection, SelectionRVBean.class, new NetTool.NetInterface<SelectionRVBean>() {
            //网络请求成功
            @Override
            public void onSuccess(SelectionRVBean selectionRVBean) {
                SelectionRvAdapter selectionRvAdapter = new SelectionRvAdapter();
                selectionRvAdapter.setRvArrayList(selectionRVBean);
                LinearLayoutManager manager = new LinearLayoutManager(MyApp.getmContect());
                manager.setOrientation(LinearLayoutManager.HORIZONTAL);//横向的recycleView
                rv.setLayoutManager(manager);
                rv.setAdapter(selectionRvAdapter);
            }

            //网络请求失败
            @Override
            public void onError(String errorMsg) {
            }
        });


        /**
         *精选listview
         */
        netTool.getData(NetUrls.urlLvSelection, SelectionBean.class, new NetTool.NetInterface<SelectionBean>() {
            @Override
            public void onSuccess(SelectionBean selectionBean) {
                bean = selectionBean;
                SelectionAdapter selectionAdapter = new SelectionAdapter();
                selectionAdapter.setArrayList(selectionBean);
                lv.setAdapter(selectionAdapter);

            }

            @Override
            public void onError(String errorMsg) {
            }
        });
        /**
         * 精选界面获取的轮播图
         */
        netTool.getData(NetUrls.urlBanner, BannerBean.class, new NetTool.NetInterface<BannerBean>() {
            @Override
            public void onSuccess(BannerBean bannerBean) {
                imageUris = new String[bannerBean.getData().getBanners().size()];
                for (int i = 0; i < bannerBean.getData().getBanners().size(); i++) {
                    imageUris[i] = bannerBean.getData().getBanners().get(i).getImage_url();
                }
                initBanner();
            }

            @Override
            public void onError(String errorMsg) {
            }
        });

    }

    /**
     * 指南界面->精选Fragment的轮播图
     */
    private void initBanner() {
        //设置小圆点
        banner.setBannerStyle(Banner.LAYOUT_MODE_CLIP_BOUNDS);
        //设置位置居中
        banner.setIndicatorGravity(Banner.CENTER);
        //设置轮播时间
        banner.setDelayTime(3000);
        //设置图片
        banner.setImages(imageUris);
        //设置监听
        banner.setOnBannerClickListener(this);
    }

    @Override
    public void OnBannerClick(View view, int position) {
        Bundle bundle = new Bundle();
        Jump(MyApp.mContect, LunFanSecondActitvty.class,bundle);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Jump(MyApp.mContect,SelectionLVActivity.class);
    }
}
