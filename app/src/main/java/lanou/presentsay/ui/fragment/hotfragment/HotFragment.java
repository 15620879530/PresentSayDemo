package lanou.presentsay.ui.fragment.hotfragment;

import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import lanou.presentsay.R;
import lanou.presentsay.ui.activity.HotOneJumpActitvty;
import lanou.presentsay.ui.fragment.AbsBaseFragment;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.activity.SearchActitvty;
import lanou.presentsay.ui.adapter.HotAdapter;
import lanou.presentsay.ui.bean.HotBean;
import lanou.presentsay.ui.tools.NetTool;
import lanou.presentsay.ui.tools.NetUrls;

/**
 * 热门页面
 * Created by dllo on 16/8/15.
 */
public class HotFragment extends AbsBaseFragment implements SwipeRefreshLayout.OnRefreshListener, View.OnClickListener, AdapterView.OnItemClickListener {
    private static final String TAG = "TAG_HotFragment";
    private GridView gv;
    private ImageView searchIv;
    //谷歌提供的下拉刷新组件
    private SwipeRefreshLayout swipeRefreshLayout;
    private HotBean bean;
    private HotAdapter hotAdapter;


    @Override
    protected int setlayout() {
        return R.layout.fragment_hot;
    }

    @Override
    protected void initView() {
        searchIv = bindView(R.id.my_hot_search);
        gv = bindView(R.id.my_hot_gridview);
        swipeRefreshLayout = bindView(R.id.hot_refresh);

    }

    @Override
    protected void initData() {
        //热门页面搜索的监听
        searchIv.setOnClickListener(this);

        gv.setOnItemClickListener(this);

//        设置手指在屏幕下拉多少距离产生刷新效果
        swipeRefreshLayout.setDistanceToTriggerSync(300);
////        设置下拉刷新圆圈 的大小
        swipeRefreshLayout.setSize(SwipeRefreshLayout.LARGE);
        swipeRefreshLayout.setColorSchemeResources(android.R.color.holo_blue_light, android.R.color.holo_red_light, android.R.color.holo_orange_light, android.R.color.holo_green_light);
        swipeRefreshLayout.setOnRefreshListener(this);

        netTool = new NetTool();
        netTool.getData(NetUrls.urlHot, HotBean.class, new NetTool.NetInterface<HotBean>() {
            @Override
            public void onSuccess(HotBean hotBean) {

                hotAdapter = new HotAdapter();
                hotAdapter.setArraylist(hotBean);
                gv.setAdapter(hotAdapter);
            }

            @Override
            public void onError(String errorMsg) {

            }
        });


    }

    /****************************************************************************************/
    /**
     * 下拉刷新的方法
     */
    @Override
    public void onRefresh() {


        netTool = new NetTool();
        netTool.getData(NetUrls.urlHot, HotBean.class, new NetTool.NetInterface<HotBean>() {
            @Override
            public void onSuccess(HotBean hotBean) {
                bean = hotBean;
                hotAdapter = new HotAdapter();
                hotAdapter.setArraylist(hotBean);
                gv.setAdapter(hotAdapter);
            }

            @Override
            public void onError(String errorMsg) {

            }
        });

        swipeRefreshLayout.setRefreshing(false);
        Toast.makeText(MyApp.mContect, "别刷了已经是最新的了", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Jump(MyApp.mContect, SearchActitvty.class);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Jump(MyApp.mContect, HotOneJumpActitvty.class);
//        String data = bean.getData().getItems().get(position).getData().getUrl();
//        DataEvent dataEvent = new DataEvent();
//        dataEvent.setData(data);
//        //发布....
//        //EventBus 发布的事件 只能是一个
//        //需要把所要发送的所有值,都放到这个对象里去
//        //EventBus 发送和接收的纽带 就是参数
//        //只要参数类型对应上了,就能接收到
//        EventBus.getDefault().post(dataEvent);

    }
}




