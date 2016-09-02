package lanou.presentsay.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import lanou.presentsay.R;
import lanou.presentsay.ui.adapter.SingleAdapter;
import lanou.presentsay.ui.bean.SearchSingleBean;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.tools.NetTool;

/**
 * 搜索里面的单品Fragment
 * 单品
 * Created by dllo on 16/8/30.
 */
public class SingleFragment extends AbsBaseFragment {
    private static final String TAG = "TAG_SingleFragment";
    private String allurl;
    private RecyclerView recyclerView;
    private SearchSingleBean bean;
    private SingleAdapter singleAdapter;

    @Override
    protected int setlayout() {
        return R.layout.fragment_single;
    }

    @Override
    protected void initView() {
        recyclerView =bindView(R.id.search_single_recycler);
    }

    @Override
    protected void initData() {
        singleAdapter = new SingleAdapter();
        String url = "http://api.liwushuo.com/v2/search/item?sort=&limit=20&offset=0&keyword=";
        Bundle bundle = getArguments();
        String key = bundle.getString("contents");
        String newKey = "";
        for (byte b : key.getBytes()) {
            String temp =Integer.toHexString(b & 0x000000ff);
            temp = "%" + temp;
            temp.toUpperCase();
            newKey += temp;
        }
        allurl = url + newKey;
        netTool = new NetTool();
        netTool.getData(allurl, SearchSingleBean.class, new NetTool.NetInterface<SearchSingleBean>() {
            @Override
            public void onSuccess(SearchSingleBean searchSingleBean) {
                singleAdapter.setBean(searchSingleBean);

            }

            @Override
            public void onError(String errorMsg) {

            }
        });
        recyclerView.setAdapter(singleAdapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(MyApp.mContect,2);
        recyclerView.setLayoutManager(gridLayoutManager);

    }
}
