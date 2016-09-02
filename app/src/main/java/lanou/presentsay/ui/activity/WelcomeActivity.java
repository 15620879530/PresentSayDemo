package lanou.presentsay.ui.activity;

import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;

import lanou.presentsay.R;

/**
 * 欢迎界面  5秒之后跳转到MainActitvty
 * 这个是一个倒计时器---CountDownTimer
 * Created by dllo on 16/8/15.
 * 第一个参数表示总时间，第二个参数表示间隔时间。意思就是每隔一秒会回调一次方法onTick，然后10秒之后会回调onFinish方法
 */
public class WelcomeActivity extends AbsBaseActivity implements View.OnClickListener {
    private static final String TAG = "TAG_WelcomeActivity";
    private ImageView iv;
    private CountDownTimer timer;

    @Override
    protected int setLayout() {
        return R.layout.actitvty_welcome;
    }

    @Override
    protected void initView() {
        iv = bindView(R.id.my_welcome_image);

    }

    @Override
    protected void initData() {
//        iv.setOnClickListener(this);
        timer = new CountDownTimer(6000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                Jump(WelcomeActivity.this, MainActivity.class);

            }


        }.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        timer.cancel();
    }

    @Override
    public void onClick(View v) {
        Jump(WelcomeActivity.this, MainActivity.class);
        finish();
    }
}
