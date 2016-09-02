package lanou.presentsay.ui.adapter;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import lanou.presentsay.R;
import lanou.presentsay.ui.fragmentguide.GiveMyGirlfriendFragment;
import lanou.presentsay.ui.fragmentguide.SelectionFragment;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.tools.NetUrls;

/**
 * 精选界面popWindow 里面
 * Created by dllo on 16/8/29.
 */
public class PopWindowGvAdapter extends BaseAdapter {
    private static final String TAG = "TAG_PopWindowGvAdapter";
    private String[] strings = {"精选", "送女票", "海淘", "创意生活", "科技苑", "送爸妈",
            "送基友", "送闺蜜", "送同事", "送宝贝", "设计感", "文艺风", "奇葩搞怪", "萌萌哒"};
    private final String[] url = {NetUrls.urlGiveMyGirlFriend, NetUrls.urlHaiTao, NetUrls.urlCreatlife, NetUrls.urlScience,
            NetUrls.urlGiveParents, NetUrls.urlGiveGoodFriend, NetUrls.urlGiveGirlFriend, NetUrls.urlGiveColleague, NetUrls.urlGiveBaby
            , NetUrls.urlDesign, NetUrls.urlArt, NetUrls.urlFunny, NetUrls.urlMengMengDa};
    private Fragment[] fragments;


    @Override
    public int getCount() {
        return strings.length;
    }

    @Override
    public Object getItem(int position) {
        fragments = new Fragment[strings.length];

        if (position == 0) {
            fragments[0] = new SelectionFragment();

        } else {
            fragments[position] = GiveMyGirlfriendFragment.getinstasce(url[position - 1]);

        }
        return fragments[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       if (convertView ==null ){
           convertView = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_guide_popwindow_gv,parent,false);
       }
        TextView textView = (TextView) convertView.findViewById(R.id.popwindow_gv_name);
        textView.setText(strings[position]);
        return convertView;
    }


    }

