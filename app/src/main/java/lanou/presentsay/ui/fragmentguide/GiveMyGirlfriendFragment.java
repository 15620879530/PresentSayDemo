package lanou.presentsay.ui.fragmentguide;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import lanou.presentsay.R;
import lanou.presentsay.ui.activity.FuYongWebActitvty;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.adapter.GiveMyGirlFriendAdapter;
import lanou.presentsay.ui.bean.GiveMyGirlFriendBean;
import lanou.presentsay.ui.fragment.AbsBaseFragment;
import lanou.presentsay.ui.tools.NetTool;

/**
 * 复用的Fragment
 * Created by dllo on 16/8/16.
 */
public class GiveMyGirlfriendFragment extends AbsBaseFragment implements AdapterView.OnItemClickListener {
    private static final String TAG = "TAG_GiveMyGirlfriendFragment";
    private ListView lv;
    private String url;

    public static GiveMyGirlfriendFragment getinstasce(String url) {
        Bundle bundle = new Bundle();
        bundle.putString("key", url);
        GiveMyGirlfriendFragment giveMyGirlfriendFragment = new GiveMyGirlfriendFragment();
        giveMyGirlfriendFragment.setArguments(bundle);
        return giveMyGirlfriendFragment;
    }


    @Override
    protected int setlayout() {
        return R.layout.fragment_givemygirlfriend;
    }

    @Override
    protected void initView() {
        lv = bindView(R.id.listview_giveMyGirlFragment);

    }

    @Override
    protected void initData() {
        lv.setOnItemClickListener(this);
        Bundle bundle = getArguments();
        url = bundle.getString("key");
         netTool = new NetTool();
        netTool.getData(url, GiveMyGirlFriendBean.class, new NetTool.NetInterface<GiveMyGirlFriendBean>() {
            @Override
            public void onSuccess(GiveMyGirlFriendBean giveMyGirlFriendBean) {
                GiveMyGirlFriendAdapter giveMyGirlFriendAdapter = new GiveMyGirlFriendAdapter();
                giveMyGirlFriendAdapter.setArraylist(giveMyGirlFriendBean);
                lv.setAdapter(giveMyGirlFriendAdapter);

            }

            @Override
            public void onError(String errorMsg) {

            }
        });

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Bundle bundle = new Bundle();
        bundle.putString("key",url);
        Jump(MyApp.mContect, FuYongWebActitvty.class,bundle);
    }
}

