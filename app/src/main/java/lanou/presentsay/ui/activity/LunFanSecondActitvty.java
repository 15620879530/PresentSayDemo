package lanou.presentsay.ui.activity;

import android.widget.ImageView;

import lanou.presentsay.R;
import lanou.presentsay.ui.bean.BannerBean;
import lanou.presentsay.ui.tools.NetTool;
import lanou.presentsay.ui.tools.NetUrls;

/**
 * 轮番图的2级Activity
 * Created by dllo on 16/8/23.
 */
public class LunFanSecondActitvty extends AbsBaseActivity {
    private static final String TAG = "TAG_LunFanSecondActitvty";
    private ImageView back;
    private ImageView fx;

    @Override
    protected int setLayout() {
        return R.layout.actitvty_lunfansecond;
    }

    @Override
    protected void initView() {
        back = bindView(R.id.iv_back);
        fx =  bindView(R.id.iv_fenxiang);
    }

    @Override
    protected void initData() {
        netTool = new NetTool();
        netTool.getData(NetUrls.urlBanner, BannerBean.class, new NetTool.NetInterface<BannerBean>() {
            @Override
            public void onSuccess(BannerBean bannerBean) {

            }

            @Override
            public void onError(String errorMsg) {

            }
        });

    }
}
