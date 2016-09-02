package lanou.presentsay.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import lanou.presentsay.R;
import lanou.presentsay.ui.adapter.PLDXAdapter;
import lanou.presentsay.ui.bean.ClassifyPlFgDxBean;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.tools.NetTool;
import lanou.presentsay.ui.tools.NetUrls;

/**
 * 攻略里面 -> 品类 对象 点击查看全部跳转的actitvty
 * <p>
 * Created by dllo on 16/8/23.
 */
public class PLDXActitvty extends AbsBaseActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    private static final String TAG = "TAG_PLDXActitvty";
    private GridView gv;
    private ArrayList<ClassifyPlFgDxBean.DataBean.ChannelGroupsBean.ChannelsBean> date;
    private TextView title;
    private String name;
    private ArrayList<ClassifyPlFgDxBean.DataBean.ChannelGroupsBean.ChannelsBean> classifypinlebean;
    private ImageView back;

    @Override
    protected int setLayout() {
        return R.layout.actitvty_pldx;
    }

    @Override
    protected void initView() {
        back = bindView(R.id.back);
        gv = bindView(R.id.gv_pldx);
        title = bindView(R.id.title);
    }

    @Override
    protected void initData() {
        back.setOnClickListener(this);
        gv.setOnItemClickListener(this);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        name = bundle.getString("title");
        title.setText(name);
        netTool = new NetTool();
        netTool.getData(NetUrls.urlClassifyPLFGDX, ClassifyPlFgDxBean.class, new NetTool.NetInterface<ClassifyPlFgDxBean>() {

            private PLDXAdapter adapter;

            @Override
            public void onSuccess(ClassifyPlFgDxBean classifyPlFgDxBean) {
                for (int i = 0; i <classifyPlFgDxBean.getData().getChannel_groups().size() ; i++) {

                    date = (ArrayList<ClassifyPlFgDxBean.DataBean.ChannelGroupsBean.ChannelsBean>) classifyPlFgDxBean.getData().getChannel_groups().get(i).getChannels();
                    switch (i){
                        case 0:
                            classifypinlebean = date;
                            adapter = new PLDXAdapter();
                            adapter.setBeen(date);
                            gv.setAdapter(adapter);
                            break;
                    }
                }
            }

            @Override
            public void onError(String errorMsg) {

            }
        });

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Bundle bundle = new Bundle();
        bundle.putString("id", String.valueOf(classifypinlebean.get(position).getId()));
        bundle.putString("title", classifypinlebean.get(position).getName());
        Jump(MyApp.mContect,PlFGDXJumpActivity.class,bundle);
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
