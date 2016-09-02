package lanou.presentsay.ui.activity;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import lanou.presentsay.R;
import lanou.presentsay.ui.adapter.TiaoXuanAdapter;
import lanou.presentsay.ui.bean.TiaoXuanBean;
import lanou.presentsay.ui.tools.NetTool;
import lanou.presentsay.ui.tools.NetUrls;


/**
 * 分类 -> 单品 -> 选礼神器 跳转的 "挑选礼物" Activity....
 * 搜索 -> 使用选礼神器快速挑选礼物跳转的 界面
 * Created by dllo on 16/8/26.
 */
public class XuanliActivity extends AbsBaseActivity implements View.OnClickListener {
    private static final String TAG = "TAG_XuanliActivity";
    private GridView gv;
    private ImageView back;
    private ImageView shaixuan;
    private RecyclerView recyclerView;


    @Override
    protected int setLayout() {
        return R.layout.activity_xuanli;
    }

    @Override
    protected void initView() {
        recyclerView = bindView(R.id.xuanli_tag_rv);
        shaixuan = bindView(R.id.xuanli_iv_shaixuan);
        gv = bindView(R.id.tiaoxuan_gridview);
        back = bindView(R.id.tiaoxian_back);

    }

    @Override
    protected void initData() {
        back.setOnClickListener(this);
        /**
         * 选礼
         */
        netTool = new NetTool();
        netTool.getData(NetUrls.urlTiaoXuan, TiaoXuanBean.class, new NetTool.NetInterface<TiaoXuanBean>() {
            @Override
            public void onSuccess(TiaoXuanBean tiaoXuanBean) {
                TiaoXuanAdapter adapter = new TiaoXuanAdapter();
                adapter.setBean(tiaoXuanBean);
                gv.setAdapter(adapter);
            }

            @Override
            public void onError(String errorMsg) {

            }
        });

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tiaoxian_back:
                finish();
                break;
        }

    }
}
