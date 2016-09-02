package lanou.presentsay.ui.activity;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import lanou.presentsay.R;
import lanou.presentsay.ui.adapter.SearchRvAdapter;
import lanou.presentsay.ui.bean.SearchBean;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.tools.NetTool;
import lanou.presentsay.ui.tools.NetUrls;

/**
 * 点击搜索跳转的activity
 * 首页的搜索 、热门页面的搜索、 还有分类界面的选一份礼物的btn 都是跳到这个搜索页
 * Created by dllo on 16/8/24.
 */
public class SearchActitvty extends AbsBaseActivity implements View.OnClickListener {
    private static final String TAG = "TAG_SearchActitvty";
    private ImageView searchBack;
    private TextView searchTv;
    private EditText content;
    private RecyclerView recyclerView;
    private TextView jumpTiaoxian;
    private ImageView searchIv;
    private EditText editText;

    @Override
    protected int setLayout() {
        return R.layout.actitvty_search;
    }

    @Override
    protected void initView() {
        searchBack = bindView(R.id.search_back);
        //两个搜索按钮 和Editext
        searchTv = bindView(R.id.search_text);
        searchIv = bindView(R.id.iv_search);
        editText = bindView(R.id.edit_search);

        recyclerView = bindView(R.id.search_recyclerview);
        //跳转挑选神器id
        jumpTiaoxian = bindView(R.id.search_tv_tiaoxuan);
        //上面的监听
        searchBack.setOnClickListener(this);
        searchIv.setOnClickListener(this);
        searchTv.setOnClickListener(this);
        jumpTiaoxian.setOnClickListener(this);
    }

    @Override
    protected void initData() {
        searchBack.setOnClickListener(this);
        netTool = new NetTool();
        netTool.getData(NetUrls.urlSearch, SearchBean.class, new NetTool.NetInterface<SearchBean>() {
            @Override
            public void onSuccess(SearchBean searchBean) {
               SearchRvAdapter searchRvAdapter = new SearchRvAdapter(MyApp.mContect);
                searchRvAdapter.setBean(searchBean);
                recyclerView.setAdapter(searchRvAdapter);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(MyApp.mContect,4);
                gridLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

                recyclerView.setLayoutManager(gridLayoutManager);

            }

            @Override
            public void onError(String errorMsg) {

            }
        });


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //点击返回
            case R.id.search_back:
                finish();
                break;
            //点击跳转送礼神器的
            case R.id.search_tv_tiaoxuan:
                Jump(MyApp.mContect, XuanliActivity.class);
                break;
            //点击后面的搜索跳转搜索
            case R.id.search_text:
                if (editText.getText().toString().length() == 0) {
                    Toast.makeText(this, "告诉你哦!不写东西别瞎点!!", Toast.LENGTH_SHORT).show();
                } else {
                    String name = editText.getText().toString();
                    Bundle bundle = new Bundle();
                    bundle.putString("name", name);
                    Jump(MyApp.mContect, SearchNextActivity.class, bundle);

                }
                break;
            //点击前面的放大镜搜索的
            case R.id.iv_search:
                if (editText.getText().length() == 0) {
                    Toast.makeText(this, "告诉你哦!不写东西别瞎点!听话", Toast.LENGTH_SHORT).show();
                } else {
                    String name = editText.getText().toString();
                    Bundle bundle = new Bundle();
                    bundle.putString("name", name);
                    Jump(MyApp.mContect, SearchNextActivity.class, bundle);
                }
                break;

        }
    }
}



