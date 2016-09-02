package lanou.presentsay.ui.fragment;

import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.List;
import cn.bmob.v3.BmobUser;
import lanou.presentsay.R;
import lanou.presentsay.ui.ListViewForScrollView;
import lanou.presentsay.ui.adapter.MineStrategyAdapter;
import lanou.presentsay.ui.bean.Collect;
import lanou.presentsay.ui.tools.SingleLiteOrm;

/**
 * 个人界面 下面攻略的Fragment
 * Created by dllo on 16/8/31.
 */
public class MineStrategyFragment extends AbsBaseFragment {
    private static final String TAG = "TAG_MineStrategyFragment";
    private ListViewForScrollView lv;
    private RelativeLayout relativeLayout;

    @Override
    protected int setlayout() {
        return R.layout.fragment_minestrategy;
    }

    @Override
    protected void initView() {
        lv = bindView(R.id.mine_strategy_listview);
        relativeLayout = bindView(R.id.mine_strategy_relativelayout);
    }

    @Override
    protected void initData() {
        BmobUser bmobUser = BmobUser.getCurrentUser();
        List<Collect> collects = new ArrayList<>();
        if (bmobUser==null) {
            lv.setVisibility(View.GONE);
            relativeLayout.setVisibility(View.VISIBLE);
        }else {
            lv.setVisibility(View.VISIBLE);
            relativeLayout.setVisibility(View.GONE);
        }
        if (bmobUser!=null){
            for (Collect coll: SingleLiteOrm.getSingleLiteOrm().getLiteOrm().query(Collect.class)){
                collects.add(coll);
            }
            MineStrategyAdapter mineStrategyAdapter = new MineStrategyAdapter();
            mineStrategyAdapter.setCollects(collects);
            lv.setAdapter(mineStrategyAdapter);
        }


    }
}
