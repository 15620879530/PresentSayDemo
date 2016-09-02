package lanou.presentsay.ui.activity;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;

import java.util.ArrayList;

import lanou.presentsay.R;
import lanou.presentsay.ui.adapter.HotOneJumpAdaoter;
import lanou.presentsay.ui.fragment.hotfragment.DanPinFragment;
import lanou.presentsay.ui.fragment.hotfragment.PingLunFragment;
import lanou.presentsay.ui.fragment.hotfragment.XiangQingFragment;

/**
 * 热门 的2级页面
 * Created by dllo on 16/8/24.
 */
public class HotOneJumpActitvty extends AbsBaseActivity {
    private static final String TAG = "TAG_HotOneJumpActitvty";
    private TabLayout hotTb;
    private ViewPager hotVp;
    private ImageView back;


    @Override
    protected int setLayout() {
        return R.layout.actitvty_hotonejump;
    }

    @Override
    protected void initView() {
        hotTb = bindView(R.id.hot_tablayout);
        hotVp = bindView(R.id.hot_viewpager);
        back = bindView(R.id.iv_hot_back);
    }

    @Override
    protected void initData() {
        HotOneJumpAdaoter adapter = new HotOneJumpAdaoter(getSupportFragmentManager());
        hotTb.setTabMode(TabLayout.MODE_SCROLLABLE);
        hotTb.setSelectedTabIndicatorColor(Color.WHITE);
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new DanPinFragment());
        fragments.add(new XiangQingFragment());
        fragments.add(new PingLunFragment());
        adapter.setArrayList(fragments);

        ArrayList<String> list = new ArrayList<>();
        list.add("单品");
        list.add("详情");
        list.add("评论");
        adapter.setList(list);
        hotVp.setAdapter(adapter);
        hotTb.setupWithViewPager(hotVp);


    }
}
