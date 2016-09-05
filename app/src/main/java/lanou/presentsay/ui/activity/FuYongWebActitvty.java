package lanou.presentsay.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

import lanou.presentsay.R;
import lanou.presentsay.ui.bean.GiveMyGirlFriendBean;
import lanou.presentsay.ui.tools.NetTool;

/**
 * 指南 界面 里面的复用跳转WebView
 * Created by dllo on 16/8/25.
 */
public class FuYongWebActitvty extends AbsBaseActivity implements View.OnClickListener {
    private static final String TAG = "TAG_FuYongWebActitvty";
    private WebView webView;
    private String urls;
    private ImageView back;
    private ImageView fenxiang;


    @Override
    protected int setLayout() {
        return R.layout.activity_selectionlv;
    }

    @Override
    protected void initView() {
        webView = bindView(R.id.selection_listview_webview);
        back = bindView(R.id.setup_back);
        fenxiang = bindView(R.id.fenxiang);
    }

    @Override
    protected void initData() {
        back.setOnClickListener(this);
        fenxiang.setOnClickListener(this);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        urls = bundle.getString("key");

        netTool = new NetTool();
        netTool.getData(urls, GiveMyGirlFriendBean.class, new NetTool.NetInterface<GiveMyGirlFriendBean>() {
            @Override
            public void onSuccess(GiveMyGirlFriendBean giveMyGirlFriendBean) {
                for (int i = 0; i < giveMyGirlFriendBean.getData().getItems().size(); i++) {
                   String url=giveMyGirlFriendBean.getData().getItems().get(i).getUrl();
                    webView.loadUrl(url);
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
            case R.id.fenxiang:

        }

    }
}
