package lanou.presentsay.ui.fragment;

import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Spinner;

import lanou.presentsay.R;
import lanou.presentsay.ui.activity.SearchActitvty;
import lanou.presentsay.ui.adapter.GuideAdapter;
import lanou.presentsay.ui.adapter.PopWindowGvAdapter;
import lanou.presentsay.ui.bean.GuidePopWindowBean;
import lanou.presentsay.ui.tools.MyApp;

/**
 * 指南
 * Created by dllo on 16/8/15.
 */
public class GuideFragment extends AbsBaseFragment implements View.OnClickListener {
    private static final String TAG = "TAG_GuideFragment";
    private ViewPager vp;
    private TabLayout tl;
    private GuideAdapter guideAdapter;
    private ImageView iv;
    private Spinner sp;
    private ImageView window;
    private PopupWindow popupWindow;
    private GuidePopWindowBean bean;
    private RelativeLayout relativeLayout;
    private PopWindowGvAdapter popWindowGvAdapter;


    @Override
    protected int setlayout() {
        return R.layout.fragment_guide;
    }

    @Override
    protected void initView() {
        iv = bindView(R.id.guide_search);
        vp = bindView(R.id.guide_viewpager);
        tl = bindView(R.id.guide_tabLayout);
        window = bindView(R.id.guide_popwindow);
        relativeLayout = bindView(R.id.guide_title);

    }

    @Override
    protected void initData() {
        //new 一个popupWindow
        popupWindow = new PopupWindow(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);

        //搜索的监听
        iv.setOnClickListener(this);

        window.setOnClickListener(this);

        guideAdapter = new GuideAdapter(getChildFragmentManager());

        vp.setAdapter(guideAdapter);
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                popupWindow.dismiss();
            }

            @Override
            public void onPageSelected(int position) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
        //设置滑动的tablelayout
        tl.setTabMode(TabLayout.MODE_SCROLLABLE);
        //设置引导条颜色
        tl.setSelectedTabIndicatorColor(Color.RED);
        tl.setupWithViewPager(vp);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.guide_search:
                Jump(MyApp.mContect, SearchActitvty.class);
                break;
            case R.id.guide_popwindow:
                if (popupWindow == null || !popupWindow.isShowing()) {
                    popupWindow = new PopupWindow(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                    //如果popwindow 为空 给他加载一个布局
                    View view = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_guide_popwindow, null);
                    GridView gridView = (GridView) view.findViewById(R.id.item_gridview_popwindow);

                    popWindowGvAdapter = new PopWindowGvAdapter();
                    gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            vp.setCurrentItem(position);
                            popupWindow.dismiss();
                        }
                    });
                    //视图 在这里被加载
                    //加载器
                    view.findViewById(R.id.item_gridview_returnbtn).setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            popupWindow.dismiss();
                        }
                    });

//                    popWindowGvAdapter.setBean(bean);
                    gridView.setAdapter(popWindowGvAdapter);
                    popupWindow.setContentView(view);
                    popupWindow.setFocusable(false);
                    popupWindow.setBackgroundDrawable(new BitmapDrawable());
                    popupWindow.setOutsideTouchable(true);
                    popupWindow.showAsDropDown(relativeLayout);


                }
                break;
        }
    }

}
