package lanou.presentsay.ui.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import lanou.presentsay.R;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.activity.SearchActitvty;
import lanou.presentsay.ui.activity.XuanliActivity;
import lanou.presentsay.ui.adapter.ClassifyAdapter;

/**
 * 分类界面
 * Created by dllo on 16/8/15.
 */
public class ClassifyFragment extends AbsBaseFragment implements View.OnClickListener {
    private static final String TAG = "TAG_ClassifyFragment";
    private TabLayout tl;
    private ViewPager vp;
    private TextView xuanliTv;
    private Button btn;

    @Override
    protected int setlayout() {
        return R.layout.fragment_classif;
    }

    @Override
    protected void initView() {
        tl = bindView(R.id.classif_tablayout);
        vp = bindView(R.id.classif_viewpager);
        xuanliTv = bindView(R.id.classif_tv);
        btn = bindView(R.id.classif_btn);


    }

    @Override
    protected void initData() {
        //View.VISIBLE 可见
        // View.INVISIBLE View不可以见，但仍然占据可见时的大小和位置。
        //View.GONE View不可见，且不占据空间。
        // 开始让我的tv不可见, 而且不占据空间
        xuanliTv.setVisibility(View.GONE);

        ClassifyAdapter classifyAdapter = new ClassifyAdapter(getChildFragmentManager());
        ArrayList<Fragment> arrayList = new ArrayList<>();
        arrayList.add(new ClassifyStrategyFragment()); //攻略Fragment
        arrayList.add(new ClassifySingleFragment());  //单品Fragment
        classifyAdapter.setArrayList(arrayList);

        ArrayList<String> list = new ArrayList<>();
        list.add("攻略");
        list.add("单品");
        classifyAdapter.setList(list);

        vp.setAdapter(classifyAdapter);
        tl.setupWithViewPager(vp);
        //viewpager 监听..如果是在第0个位置就不可见...
        //如果是1的位置就可见, 显示出选礼神器..
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {
                if (tl.getSelectedTabPosition() == 0) {
                    //不显示
                    xuanliTv.setVisibility(View.GONE);
                } else {
                    //显示
                    xuanliTv.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        xuanliTv.setOnClickListener(this);
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //选一份礼物送给他的~~点击跳转
            case R.id.classif_btn:
                Jump(MyApp.mContect, SearchActitvty.class);
                break;
            //选礼神器的~~点击跳转
            case R.id.classif_tv:
                Jump(MyApp.mContect, XuanliActivity.class);
                break;
        }

    }
}
