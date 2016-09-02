package lanou.presentsay.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by dllo on 16/8/24.
 */
public class HotOneJumpAdaoter extends FragmentPagerAdapter {
    private static final String TAG = "TAG_HotOneJumpAdaoter";
    private ArrayList<Fragment> arrayList ;
    private ArrayList<String> list;



    public void setArrayList(ArrayList<Fragment> arrayList) {
        this.arrayList = arrayList;
        notifyDataSetChanged();
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public HotOneJumpAdaoter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }
}
