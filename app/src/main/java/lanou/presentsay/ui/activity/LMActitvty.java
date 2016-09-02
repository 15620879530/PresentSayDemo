package lanou.presentsay.ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import lanou.presentsay.R;
import lanou.presentsay.ui.adapter.LanMuAdapter;
import lanou.presentsay.ui.bean.ClassifyLanmuBean;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.tools.NetTool;
import lanou.presentsay.ui.tools.NetUrls;

/**
 * 分类界面攻略 的栏目de查看全部的界面
 * Created by dllo on 16/8/23.
 */
public class LMActitvty extends AbsBaseActivity implements View.OnClickListener {
    private static final String TAG = "TAG_LMActitvty";
    private ListView lv;
    private ImageView back;

    @Override
    protected int setLayout() {
        return R.layout.actitvty_lm;
    }

    @Override
    protected void initView() {
        lv = bindView(R.id.lv_lanmu);
        back = bindView(R.id.lanmu_back);
    }

    @Override
    protected void initData() {
        back.setOnClickListener(this);
        netTool = new NetTool();
        netTool.getData(NetUrls.urlClassifylanmu, ClassifyLanmuBean.class, new NetTool.NetInterface<ClassifyLanmuBean>() {
            @Override
            public void onSuccess(final ClassifyLanmuBean classifyLanmuBean) {
                LanMuAdapter lanMuAdapter = new LanMuAdapter();
                lanMuAdapter.setClassifyLanmuBean(classifyLanmuBean);
                lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Bundle bundle = new Bundle();
                        bundle.putString("id",String.valueOf(classifyLanmuBean.getData().getColumns().get(position).getId()));
                        Jump(MyApp.mContect,LanMuJumpActivity.class,bundle);
                    }
                });
                lv.setAdapter(lanMuAdapter);

            }

            @Override
            public void onError(String errorMsg) {
            }
        });



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.lanmu_back:
                finish();
                break;
        }
    }
}
