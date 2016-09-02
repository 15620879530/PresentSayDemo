package lanou.presentsay.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import lanou.presentsay.R;
import lanou.presentsay.ui.adapter.PlFGDXJumpAdapter;
import lanou.presentsay.ui.bean.PlFGDXJumpBean;
import lanou.presentsay.ui.tools.NetTool;

/**
 * 品类风格对象的2级界面
 * Created by dllo on 16/8/29.
 */
public class PlFGDXJumpActivity extends AbsBaseActivity implements View.OnClickListener {
    private static final String TAG = "TAG_PlFGDXJumpActivity";
    private ListView lv;
    private TextView title;
    private ImageView back;
    private String url;
    private String name;
    @Override
    protected int setLayout() {
        return R.layout.activity_plfgdxjump;
    }

    @Override
    protected void initView() {
        lv = bindView(R.id.plfgdxjump_listview);
        title = bindView(R.id.plfgdxjump_tvtitle);
        back = bindView(R.id.plfgdxjump_back);

    }

    @Override
    protected void initData() {
        back.setOnClickListener(this);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        url = bundle.getString("id");
        name = bundle.getString("title");
        title.setText(name);
        String url1 = "http://api.liwushuo.com/v2/channels/";
        String url2 ="/items?limit=20&offset=0";
        String allurl = url1 + url + url2;
        netTool = new NetTool();
        netTool.getData(allurl, PlFGDXJumpBean.class, new NetTool.NetInterface<PlFGDXJumpBean>() {
            @Override
            public void onSuccess(PlFGDXJumpBean plFGDXJumpBean) {
                PlFGDXJumpAdapter plFGDXJumpAdapter = new PlFGDXJumpAdapter();
                plFGDXJumpAdapter.setBean(plFGDXJumpBean);
                lv.setAdapter(plFGDXJumpAdapter);
            }

            @Override
            public void onError(String errorMsg) {

            }
        });



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.plfgdxjump_back:
                finish();
                break;
        }
    }
}
