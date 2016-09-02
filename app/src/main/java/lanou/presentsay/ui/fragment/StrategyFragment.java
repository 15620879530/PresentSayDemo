package lanou.presentsay.ui.fragment;

import android.os.Bundle;
import android.widget.ListView;

import lanou.presentsay.R;
import lanou.presentsay.ui.adapter.StrategyAdapter;
import lanou.presentsay.ui.bean.SearchStrategyBean;
import lanou.presentsay.ui.tools.NetTool;

/**
 * 搜索的攻略Fragment
 * Created by dllo on 16/8/30.
 */
public class StrategyFragment extends AbsBaseFragment {
    private static final String TAG = "TAG_StrategyFragment";
    private ListView listView;
    private SearchStrategyBean searchStrategyBean;
    private String allUrl;
    private String url = "http://api.liwushuo.com/v2/search/post?sort=&limit=20&offset=0&keyword=";
    private StrategyAdapter adapter;

    @Override
    protected int setlayout() {
        return R.layout.fragment_strategy;
    }

    @Override
    protected void initView() {
        listView = bindView(R.id.searchnext_strategy_listview);
        searchStrategyBean = new SearchStrategyBean();
        adapter = new StrategyAdapter();
        Bundle bundle = getArguments();
        String key = bundle.getString("contents");
        String newKye = "";
        for (byte b : key.getBytes()) {
            String temp = Integer.toHexString(b & 0x000000ff);
            temp = "%" + temp;
            temp.toUpperCase();
            newKye += temp;
        }
        allUrl = url + newKye;
        netTool = new NetTool();
        netTool.getData(allUrl, SearchStrategyBean.class, new NetTool.NetInterface<SearchStrategyBean>() {
            @Override
            public void onSuccess(SearchStrategyBean searchStrategyBean) {
                adapter.setBean(searchStrategyBean);
            }

            @Override
            public void onError(String errorMsg) {

            }
        });

        listView.setAdapter(adapter);
    }

    @Override
    protected void initData() {

    }
}
