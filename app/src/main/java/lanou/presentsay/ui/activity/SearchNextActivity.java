package lanou.presentsay.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.ArrayList;

import lanou.presentsay.R;
import lanou.presentsay.ui.adapter.SearchNextAdapter;
import lanou.presentsay.ui.fragment.SingleFragment;
import lanou.presentsay.ui.fragment.StrategyFragment;

/**
 * 点击搜索跳转的Activity
 * Created by dllo on 16/8/30.
 */
public class SearchNextActivity extends AbsBaseActivity implements View.OnClickListener {
    private static final String TAG = "TAG_SearchNextActivity";
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ImageView back;
    private ImageView paixu;
    private EditText editext;

    @Override
    protected int setLayout() {
        return R.layout.activity_searchnext;
    }

    @Override
    protected void initView() {
        editext = bindView(R.id.search_next_editext);
        tabLayout = bindView(R.id.search_next_tablayout);
        viewPager = bindView(R.id.search_next_viewpager);
        back = bindView(R.id.search_next_back);
        paixu = bindView(R.id.search_next_paixu);
    }

    @Override
    protected void initData() {
        back.setOnClickListener(this);
        paixu.setOnClickListener(this);
        SearchNextAdapter adapter = new SearchNextAdapter(getSupportFragmentManager());
        ArrayList<Fragment> fragment = new ArrayList<>();
        StrategyFragment strategyFragment = new StrategyFragment();
        SingleFragment singleFragment = new SingleFragment();



        //intent  接收搜索页面传来的给editText的内容
        //在将内容通过 setArgument 传给下面两个frangment 做网址拼接用
        Intent intent = getIntent();
        String content = intent.getStringExtra("content");
        Bundle bundle = new Bundle();
        bundle.putString("contents",content);
        singleFragment.setArguments(bundle);
        strategyFragment.setArguments(bundle);

        editext.setText(content);
        fragment.add(singleFragment);
        fragment.add(strategyFragment);
        adapter.setFragments(fragment);
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.search_next_back:
                finish();
                break;
            case R.id.search_next_paixu:
                break;
        }
    }
}
