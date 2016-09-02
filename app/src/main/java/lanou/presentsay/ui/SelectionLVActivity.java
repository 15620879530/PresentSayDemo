package lanou.presentsay.ui;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

import lanou.presentsay.R;
import lanou.presentsay.ui.activity.AbsBaseActivity;
import lanou.presentsay.ui.bean.SelectionBean;
import lanou.presentsay.ui.tools.NetTool;
import lanou.presentsay.ui.tools.NetUrls;

/**
 * 指南里面的精选  界面下面的listview点击跳转下一界面的activity
 * Created by dllo on 16/8/24.
 */
public class SelectionLVActivity extends AbsBaseActivity implements View.OnClickListener {
    private static final String TAG = "TAG_SelectionLVActivity";
    private WebView webView;
    private String urls;
    private ImageView back;

    @Override
    protected int setLayout() {
        return R.layout.activity_selectionlv;
    }

    @Override
    protected void initView() {

         webView =  bindView(R.id.selection_listview_webview);
        back = bindView(R.id.setup_back);
    }

    @Override
    protected void initData() {
        back.setOnClickListener(this);

        netTool = new NetTool();
        netTool.getData(NetUrls.urlLvSelection, SelectionBean.class, new NetTool.NetInterface<SelectionBean>() {
            @Override
            public void onSuccess(SelectionBean selectionBean) {
                for (int i = 0; i < selectionBean.getData().getItems().size(); i++) {
                    urls = selectionBean.getData().getItems().get(i).getUrl();
                    webView.loadUrl(urls);
                    WebSettings settings = webView.getSettings();
                    settings.setJavaScriptEnabled(true);
                }
            }

            @Override
            public void onError(String errorMsg) {

            }
        });


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.setup_back:
                finish();
                break;
        }
    }
}
