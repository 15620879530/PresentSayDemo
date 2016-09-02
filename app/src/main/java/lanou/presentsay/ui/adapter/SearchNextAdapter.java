package lanou.presentsay.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/8/30.
 */
public class SearchNextAdapter extends FragmentPagerAdapter {
    private static final String TAG = "TAG_SearchNextAdapter";
    private ArrayList<Fragment> fragments;
    private String[] a = {"单品" ,"攻略"};


    public void setFragments(ArrayList<Fragment> fragments) {
        this.fragments = fragments;
    }

    public SearchNextAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.size()>0&&fragments!=null?fragments.get(position):null;
    }

    @Override
    public int getCount() {
        return fragments.size()>0&&fragments!=null?fragments.size():0;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return a[position] ;
    }
}
