package lanou.presentsay.ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;
import lanou.presentsay.R;
import lanou.presentsay.ui.tools.MyUser;

/**
 * 登录...界面
 * Created by dllo on 16/8/31.
 */
public class LoginActivity extends AbsBaseActivity implements View.OnClickListener {
    private static final String TAG = "TAG_LoginActivity";
    private LinearLayout mima;
    private ImageView back;
    private EditText tel;
    private EditText pass;
    private Button denglu;
    private Button zhuce;
    private TextView yanzheng;
    private LinearLayout yan;
     private  ImageView mimageView;
    @Override
    protected int setLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        //密码的航布局
        mima = bindView(R.id.login_two);
        //验证码的
        yan = bindView(R.id.verificationLogin);

        back = bindView(R.id.returnBtn);//返回键
        tel = bindView(R.id.login_tel);//电话号码
        pass = bindView(R.id.login_password);//密码
        //登录
        denglu = bindView(R.id.login_btn);
        //注册
        zhuce = bindView(R.id.register_btn);
        //使用验证码登录
        yanzheng = bindView(R.id.verificationTv);



    }

    @Override
    protected void initData() {
        denglu.setOnClickListener(this);
        yanzheng.setOnClickListener(this);
        back.setOnClickListener(this);
        zhuce.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.returnBtn:
                finish();
                break;
            case R.id.login_btn:
                if(tel.getText().toString().isEmpty()||pass.getText().toString().isEmpty()){
                    Toast.makeText(this, "请输入账号密码", Toast.LENGTH_SHORT).show();
                }else {
                    login();
//                    finish();
                }
                break;
            case R.id.register_btn:
                register();
                break;

        }

    }
    //注册
    private void register() {
        BmobUser bmobUser = new BmobUser();
        bmobUser.setUsername(tel.getText().toString());
        bmobUser.setPassword(pass.getText().toString());
        bmobUser.signUp(new SaveListener<MyUser>() {
            @Override
            public void done(MyUser myUser, BmobException e) {
                if(e==null){
                    Toast.makeText(LoginActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LoginActivity.this, "注册失败", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
    //登录
    private void login() {
        BmobUser bmobUser = new BmobUser();
        bmobUser.setUsername(tel.getText().toString());
        bmobUser.setPassword(pass.getText().toString());
        bmobUser.login(new SaveListener<MyUser>() {
            @Override
            public void done(MyUser myUser, BmobException e) {
                if (e==null){
                    Toast.makeText(LoginActivity.this, "登录成功", Toast.LENGTH_SHORT).show();


                }else {
                    Toast.makeText(LoginActivity.this, "登录失败", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
