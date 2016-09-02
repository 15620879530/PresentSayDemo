package lanou.presentsay.ui.fragment;

import android.graphics.Color;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import lanou.presentsay.R;
import lanou.presentsay.ui.adapter.SingleLeftAdapter;
import lanou.presentsay.ui.adapter.SingleRightAdapter;
import lanou.presentsay.ui.bean.SingleBean;
import lanou.presentsay.ui.tools.NetTool;
import lanou.presentsay.ui.tools.NetUrls;

/**
 * 分类界面的 单品界面
 * Created by dllo on 16/8/19.
 */
public class ClassifySingleFragment extends AbsBaseFragment {
    private static final String TAG = "TAG_ClassifySingleFragment";
    private ListView leftlv;
    private ListView rightlv;
    //是否滑动

    private SingleLeftAdapter adapter;
    private int   lastPosition;

    @Override
    protected int setlayout() {
        return R.layout.fragment_classifysingle;
    }

    @Override
    protected void initView() {
        leftlv = bindView(R.id.lift_listview);
        rightlv = bindView(R.id.right_listview);


    }

    @Override
    protected void initData() {
        netTool = new NetTool();
        netTool.getData(NetUrls.getUrlClassifySingle, SingleBean.class, new NetTool.NetInterface<SingleBean>() {
            @Override
            public void onSuccess(SingleBean singleBean) {
                //这个是单品左面的listview
                adapter = new SingleLeftAdapter();
                adapter.setBeans(singleBean);
                leftlv.setAdapter(adapter);

                //这个是单品右面的listview
                SingleRightAdapter rightAdapter = new SingleRightAdapter(getContext());
                rightAdapter.setBean(singleBean);
                rightlv.setAdapter(rightAdapter);
            }

            @Override
            public void onError(String errorMsg) {

            }
        });


        //两个listview 的联动方法都在这个方法里面了
        Linkage();
    }


    //单品界面的 两个listview 的联动
    private void Linkage() {
        //先是左面listview的点击事件
        leftlv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                updateLeftListview(position);

                //左侧listview点击右侧显示对应位置
                rightlv.setSelection(Integer.parseInt(""+position));

            }
        });

        //右面的滑动事件
        rightlv.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
            //调用下方的方法
                updateLeftListview(firstVisibleItem);
                //右侧listview滑动左侧也会滑动
                leftlv.setSelection(firstVisibleItem);

            }
        });


    }

    private void updateLeftListview(int firstVisibleItem) {
        // 失去焦点

        TextView lasTextView = (TextView) leftlv.findViewWithTag(lastPosition);
        if (lasTextView != null) {
            lasTextView.setTextColor(Color.BLACK);
            lasTextView.setBackgroundColor(0XFFF5F2F2);
        }

        // 获取焦点
        TextView currenTextView = (TextView) leftlv.findViewWithTag(firstVisibleItem);
        if (currenTextView != null) {
            currenTextView.setTextColor(Color.RED);
            currenTextView.setBackgroundColor(0XFFFFFFFF);
        }
        lastPosition =firstVisibleItem;
    }
}
