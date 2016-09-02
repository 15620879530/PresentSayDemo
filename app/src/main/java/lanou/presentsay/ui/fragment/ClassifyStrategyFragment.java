package lanou.presentsay.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import lanou.presentsay.R;
import lanou.presentsay.ui.activity.LMActitvty;
import lanou.presentsay.ui.activity.LanMuJumpActivity;
import lanou.presentsay.ui.activity.PLDXActitvty;
import lanou.presentsay.ui.activity.PlFGDXJumpActivity;
import lanou.presentsay.ui.adapter.ClassifyLMAdapter;
import lanou.presentsay.ui.adapter.ClassifyPlFgDxAdapter;
import lanou.presentsay.ui.adapter.LanMuOnItem;
import lanou.presentsay.ui.bean.ClassifyLanmuBean;
import lanou.presentsay.ui.bean.ClassifyPlFgDxBean;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.tools.NetTool;
import lanou.presentsay.ui.tools.NetUrls;


/**
 * 分类界面的 攻略 ---> 界面
 * Created by dllo on 16/8/19.
 */
public class ClassifyStrategyFragment extends AbsBaseFragment implements View.OnClickListener, AdapterView.OnItemClickListener {
    private static final String TAG = "TAG_ClassifyStrategyFragment";
    private RecyclerView rv;
    private GridView pinleiGV;//品类
    private GridView fenggeGV;//风格
    private GridView duixiangGV;//对象
    private ClassifyPlFgDxAdapter classifyPlFgDxAdapter;
    private ClassifyPlFgDxBean been;
    //数据类
    private ArrayList<ClassifyPlFgDxBean.DataBean.ChannelGroupsBean.ChannelsBean> date;
    private ArrayList<ClassifyPlFgDxBean.DataBean.ChannelGroupsBean.ChannelsBean> classifypinlebean;
    private ArrayList<ClassifyPlFgDxBean.DataBean.ChannelGroupsBean.ChannelsBean> classifyfenggebean;
    private ArrayList<ClassifyPlFgDxBean.DataBean.ChannelGroupsBean.ChannelsBean> classifyduixiangbean;
    private TextView lanmuTv;
    private TextView pinleTv;
    private TextView duixiangTv;
    private Intent intent;
    private LinearLayout ll;
    private Bundle bundle;


    @Override
    protected int setlayout() {
        return R.layout.fragment_classifystrategy;
    }

    @Override
    protected void initView() {
        ll = bindView(R.id._item_pl_fengge_duixiang);
        rv = bindView(R.id.rv_classify_strategy);
        pinleiGV = bindView(R.id.gv_pinlei);
        fenggeGV = bindView(R.id.gv_fengge);
        duixiangGV = bindView(R.id.gv_duixiang);
        lanmuTv = bindView(R.id.tv_lanmu_seeall);
        pinleTv = bindView(R.id.tv_pinlei_seeall);
        duixiangTv = bindView(R.id.tv_duixiang_seeall);
    }

    @Override
    protected void initData() {
        pinleiGV.setOnItemClickListener(this);
        fenggeGV.setOnItemClickListener(this);
        duixiangGV.setOnItemClickListener(this);

        /**
         * 攻略->栏目 recyclerView
         */

        netTool = new NetTool();
        netTool.getData(NetUrls.urlClassifylanmu, ClassifyLanmuBean.class, new NetTool.NetInterface<ClassifyLanmuBean>() {
            @Override
            public void onSuccess(final ClassifyLanmuBean classifyLanmuBean) {
                ClassifyLMAdapter classifyLMAdapter = new ClassifyLMAdapter();
                classifyLMAdapter.setBean(classifyLanmuBean);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(MyApp.mContect, 3);
                gridLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
                rv.setLayoutManager(gridLayoutManager);
                rv.setAdapter(classifyLMAdapter);

                //点击栏目的item接口回调
                classifyLMAdapter.setLanMuOnItem(new LanMuOnItem() {
                    @Override
                    public void onClick(int itemposition) {
                        Bundle bundle = new Bundle();
                        bundle.putString("id", String.valueOf(classifyLanmuBean.getData().getColumns().get(itemposition).getId()));
                        Jump(MyApp.mContect, LanMuJumpActivity.class, bundle);
                    }
                });


            }

            @Override
            public void onError(String errorMsg) {

            }
        });

        netTool = new NetTool();
        netTool.getData(NetUrls.urlClassifyPLFGDX, ClassifyPlFgDxBean.class, new NetTool.NetInterface<ClassifyPlFgDxBean>() {

            /**
             * 攻略界面 gosn 解析的数据都在classifyPlFgDxBean
             * @param classifyPlFgDxBean
             */
            @Override
            public void onSuccess(final ClassifyPlFgDxBean classifyPlFgDxBean) {
                for (int i = 0; i < classifyPlFgDxBean.getData().getChannel_groups().size(); i++) {
                    date = (ArrayList<ClassifyPlFgDxBean.DataBean.ChannelGroupsBean.ChannelsBean>) classifyPlFgDxBean.getData().getChannel_groups().get(i).getChannels();
                    switch (i) {
                        case 0:
                            //第0位置的时候 将0位置的数据给品类的adapter
                            classifypinlebean = date;
                            classifyPlFgDxAdapter = new ClassifyPlFgDxAdapter();
                            classifyPlFgDxAdapter.setBeen(date);
                            pinleiGV.setAdapter(classifyPlFgDxAdapter);
                            break;
                        case 1:
                            //第1位置的时候 将1位置的数据给风格的adapter
                            classifyfenggebean = date;
                            classifyPlFgDxAdapter = new ClassifyPlFgDxAdapter();
                            classifyPlFgDxAdapter.setBeen(date);
                            fenggeGV.setAdapter(classifyPlFgDxAdapter);
                            break;
                        case 2:
                            //第2位置的时候 将2位置的数据给对象的adapter
                            classifyduixiangbean = date;
                            classifyPlFgDxAdapter = new ClassifyPlFgDxAdapter();
                            classifyPlFgDxAdapter.setBeen(date);
                            duixiangGV.setAdapter(classifyPlFgDxAdapter);
                            break;
                    }
                }


            }

            @Override
            public void onError(String errorMsg) {

            }
        });

        /**
         * 界面里面的 查看全部 de监听
         */
        lanmuTv.setOnClickListener(this);
        duixiangTv.setOnClickListener(this);
        pinleTv.setOnClickListener(this);
    }

    /**
     * 点击查看全部的跳转
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_lanmu_seeall:
                //栏目 点击查看全部 跳转 LMActitvty
                intent = new Intent(getActivity(), LMActitvty.class);
                startActivity(intent);
                break;

            case R.id.tv_pinlei_seeall:
                bundle = new Bundle();
                bundle.putString("title","品类");
                Jump(MyApp.mContect,PLDXActitvty.class,bundle);

                break;

            case R.id.tv_duixiang_seeall:
                bundle.putString("title","对象");
                Jump(MyApp.mContect,PLDXActitvty.class,bundle);
                break;
        }

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        bundle = new Bundle();

        switch (parent.getId()) {
            case R.id.gv_pinlei:
                bundle.putString("id", String.valueOf(classifypinlebean.get(position).getId()));
                bundle.putString("title", classifypinlebean.get(position).getName());
                Jump(MyApp.mContect, PlFGDXJumpActivity.class, bundle);
                break;
            case R.id.gv_fengge:
                bundle.putString("id",String.valueOf(classifyfenggebean.get(position).getId()));
                bundle.putString("title",classifyfenggebean.get(position).getName());
                Jump(MyApp.mContect, PlFGDXJumpActivity.class, bundle);
                break;
            case R.id.gv_duixiang:
                bundle.putString("id",String.valueOf(classifyduixiangbean.get(position).getId()));
                bundle.putString("title",classifyduixiangbean.get(position).getName());
                Jump(MyApp.mContect,PlFGDXJumpActivity.class, bundle);
                break;
        }
    }
}
