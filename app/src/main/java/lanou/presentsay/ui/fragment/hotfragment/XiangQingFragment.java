package lanou.presentsay.ui.fragment.hotfragment;

import android.webkit.WebSettings;
import android.webkit.WebView;

import lanou.presentsay.R;
import lanou.presentsay.ui.bean.HotBean;
import lanou.presentsay.ui.fragment.AbsBaseFragment;
import lanou.presentsay.ui.tools.NetTool;
import lanou.presentsay.ui.tools.NetUrls;

/**
 * Created by dllo on 16/8/24.
 */
public class XiangQingFragment extends AbsBaseFragment {
    private static final String TAG = "TAG_XiangQingFragment";
    private WebView webView;
    private String urls;
    private HotBean bean;


    @Override
    protected int setlayout() {
        return R.layout.fragment_xiangqing;
    }

    @Override
    protected void initView() {

     webView =  bindView(R.id.wv_hot_xiangqing);

    }

    @Override
    protected void initData() {
        netTool = new NetTool();
        netTool.getData(NetUrls.urlHot, HotBean.class, new NetTool.NetInterface<HotBean>() {
            @Override
            public void onSuccess(HotBean hotBean) {
                for (int i = 0; i < hotBean.getData().getItems().size(); i++) {
                   urls= hotBean.getData().getItems().get(i).getData().getUrl();
                }
                webView.loadUrl(urls);
                    WebSettings settings = webView.getSettings();
                settings.setJavaScriptEnabled(true);

            }

            @Override
            public void onError(String errorMsg) {

            }
        });



    }




}
