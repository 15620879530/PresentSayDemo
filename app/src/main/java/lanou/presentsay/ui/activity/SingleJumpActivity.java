package lanou.presentsay.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import lanou.presentsay.R;
import lanou.presentsay.ui.adapter.SingleJumpAdapter;
import lanou.presentsay.ui.bean.SingleJumpBean;
import lanou.presentsay.ui.tools.NetTool;

/**
 * 单品 和 攻略 里面的item 跳转的2级界面
 * Created by dllo on 16/8/26.
 */
public class SingleJumpActivity extends AbsBaseActivity implements View.OnClickListener {
    private static final String TAG = "TAG_SingleJumpActivity";
    private TextView title;
    private GridView gv;
    private ImageView back;
    private String url;

    @Override
    protected int setLayout() {
        return R.layout.activity_singlejump;
    }

    @Override
    protected void initView() {
        title = bindView(R.id.title);
        gv = bindView(R.id.danpi_next_gridview);
        back = bindView(R.id.back);


    }

    @Override
    protected void initData() {
        back.setOnClickListener(this);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        this.url = bundle.getString("url");
        title.setText(bundle.getString("title"));
        netTool = new NetTool();
        netTool.getData(url, SingleJumpBean.class, new NetTool.NetInterface<SingleJumpBean>() {
            @Override
            public void onSuccess(SingleJumpBean singleJumpBean) {
                SingleJumpAdapter singleJumpAdapter = new SingleJumpAdapter();

                singleJumpAdapter.setBean(singleJumpBean);
                gv.setAdapter(singleJumpAdapter);

            }

            @Override
            public void onError(String errorMsg) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.back:
                finish();
                break;
        }
    }
}
