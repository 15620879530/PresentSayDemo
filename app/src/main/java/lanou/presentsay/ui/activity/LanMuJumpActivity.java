package lanou.presentsay.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import lanou.presentsay.R;
import lanou.presentsay.ui.adapter.LanMujumpAdapter;
import lanou.presentsay.ui.bean.LanMuJumpBean;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.tools.NetTool;

/**
 * 分类  攻略  点击栏目里面的item 跳转的2级页面
 * Created by dllo on 16/8/27.
 */
public class LanMuJumpActivity extends AbsBaseActivity implements View.OnClickListener {
    private static final String TAG = "TAG_LanMuJumpActivity";
    private ImageView back;
    private TextView title;
    private ListView lv;
    private String url;
    private RelativeLayout relativeLayout;
    private ImageView imageView;
    private TextView content;


    @Override
    protected int setLayout() {
        return R.layout.activity_lanmujump;
    }

    @Override
    protected void initView() {
        back = bindView(R.id.lanmujump_image_back);
        title = bindView(R.id.lanmujump_title);
        lv = bindView(R.id.lanmujump_listview);
        relativeLayout = bindView(R.id.lanmujump_rl);
    }

    @Override
    protected void initData() {
        back.setOnClickListener(this);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        url = bundle.getString("id");
        String url1 = "http://api.liwushuo.com/v2/columns/";
        String url2 = "?limit=20&offset=0";
        final String allurl = url1 + url + url2;

        netTool = new NetTool();
        netTool.getData(allurl, LanMuJumpBean.class, new NetTool.NetInterface<LanMuJumpBean>() {
            @Override
            public void onSuccess(LanMuJumpBean lanMuJumpBean) {
                title.setText(lanMuJumpBean.getData().getTitle());
                LanMujumpAdapter lanMujumpAdapter = new LanMujumpAdapter();
                lanMujumpAdapter.setBean(lanMuJumpBean);
                lv.setAdapter(lanMujumpAdapter);
            }

            @Override
            public void onError(String errorMsg) {
            }
        });
        //给布局里面的listview  添加一个头布局
        View view = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_head_lanmujump, null);
        imageView = (ImageView) view.findViewById(R.id.lanmujump_head_img);
        content = (TextView) view.findViewById(R.id.lamnujump_head_content);
        netTool = new NetTool();
        netTool.getData(allurl, LanMuJumpBean.class, new NetTool.NetInterface<LanMuJumpBean>() {
            @Override
            public void onSuccess(LanMuJumpBean lanMuJumpBean) {
                content.setText(lanMuJumpBean.getData().getDescription());
                Picasso.with(MyApp.mContect).load(lanMuJumpBean.getData().getCover_image_url()).into(imageView);
            }

            @Override
            public void onError(String errorMsg) {
            }
        });
        lv.addHeaderView(view);


        //title根据滑动变化的方法
//   第一个参数AbsListView有getScrollY方法，以为这个getScrollY的值就是ListView的滑动高度了，但是经过测试getScrollY得到的值一直是0。
//   后来看了网上的一些资料，才知道ListView没有提供得到滚动高度的任何方法，必须自己根据getChildAt(0).top和getFirstVisiblePosition()来综合计算获得。
//   其原理是假设每个item的高度是一定的（多数情况下的确如此）
//   那么只要知道当前在第几个item，就可以计算出总的高度，因为第一个可见item的一部分可能已经移出了边界，
//   所以再通过mListView.getChildAt(0)获得第一个子view，使用getTop()方法计算出这个偏差。综合起来就可以计算出当前ListView的滚动高度。
//   虽然上面的方法只是适用于listView 的每个子项高度一定的情况，不过已经解决了大多数问题了。
        lv.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {
            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
                if (view.getChildAt(0) != null) {
                    getScrolly();
                    if (getScrolly() <= 0) {
                        relativeLayout.setBackgroundColor(Color.argb((int) 0, 227, 29, 26));//AGB由相关工具获得，或者美工提供
                    } else if (getScrolly() > 0 && getScrolly() <= 200) {
                        float scale = (float) getScrolly() / 200;
                        float alpha = (225 * scale);
                        // 只是layout背景透明(仿知乎滑动效果)
                        relativeLayout.setBackgroundColor(Color.argb((int) alpha, 227, 29, 26));
                    } else {
                        relativeLayout.setBackgroundColor(Color.argb((int) 225, 227, 29, 26));
                    }

                }
            }
        });

    }

    //获取listview 当前滚动的距离的方法
    public int getScrolly() {
        View view = lv.getChildAt(0);
        if (view == null) {
            return 0;
        }
        int firstVisiblePosition = lv.getFirstVisiblePosition();
        int top = view.getTop();
        return -top + firstVisiblePosition * view.getHeight();
    }

    //
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lanmujump_image_back:
                finish();
                break;
        }
    }


}
