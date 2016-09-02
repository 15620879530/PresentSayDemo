package lanou.presentsay.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import lanou.presentsay.ui.bean.SelectionBean;
import lanou.presentsay.ui.fragmentguide.GiveMyGirlfriendFragment;
import lanou.presentsay.ui.fragmentguide.SelectionFragment;
import lanou.presentsay.ui.tools.NetUrls;

/**
 * 指南
 * Created by dllo on 16/8/16.
 */
public class GuideAdapter extends FragmentPagerAdapter {
    private static final String TAG = "TAG_GuideAdapter";
    private SelectionBean bean;

    public void setBean(SelectionBean bean) {
        this.bean = bean;
        notifyDataSetChanged();
    }

    private String[] strings = {"精选", "送女票", "海淘", "创意生活", "科技苑", "送爸妈",
            "送基友", "送闺蜜", "送同事", "送宝贝", "设计感", "文艺风", "奇葩搞怪", "萌萌哒"};
    private final String[] url = {NetUrls.urlGiveMyGirlFriend, NetUrls.urlHaiTao, NetUrls.urlCreatlife, NetUrls.urlScience,
            NetUrls.urlGiveParents, NetUrls.urlGiveGoodFriend, NetUrls.urlGiveGirlFriend, NetUrls.urlGiveColleague, NetUrls.urlGiveBaby
            , NetUrls.urlDesign, NetUrls.urlArt, NetUrls.urlFunny, NetUrls.urlMengMengDa};

    private Fragment[] fragments;


    public GuideAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        fragments = new Fragment[strings.length];

        if (position == 0) {
            fragments[0] = new SelectionFragment();

        } else {
            fragments[position] = GiveMyGirlfriendFragment.getinstasce(url[position - 1]);

        }
        return fragments[position];

    }

    @Override
    public int getCount() {
        return strings.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return strings[position];
    }
}
