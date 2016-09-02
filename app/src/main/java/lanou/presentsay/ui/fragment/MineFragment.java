package lanou.presentsay.ui.fragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import cn.bmob.v3.BmobUser;
import de.hdodenhof.circleimageview.CircleImageView;
import lanou.presentsay.R;
import lanou.presentsay.ui.activity.LoginActivity;
import lanou.presentsay.ui.activity.MyInformationActivity;
import lanou.presentsay.ui.activity.SetActivity;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.tools.MyUser;

/**
 * 个人界面的Fragment
 * Created by dllo on 16/8/15.
 */
public class MineFragment extends AbsBaseFragment implements View.OnClickListener, RadioGroup.OnCheckedChangeListener {
    private static final String TAG = "TAG_MineFragment";
    private ImageButton set;
    private RadioGroup radioGroup;
    private RadioButton singleBtn;
    private RadioButton strategyBtn;
    private CircleImageView touxiang;
   private   MyUser users;
    private TextView login ,nologin;

    @Override
    public void onResume() {
        super.onResume();
        MyUser myUser = BmobUser.getCurrentUser(MyUser.class);
        if (myUser == null){
            touxiang.setVisibility(View.VISIBLE);
            nologin.setVisibility(View.GONE);
        }else {
            nologin.setVisibility(View.GONE);
            login.setVisibility(View.VISIBLE);
            users = BmobUser.getCurrentUser(MyUser.class);
            Bitmap bitmap = myUser.getIcon();
            touxiang.setImageBitmap(bitmap);
            login.setText(users.getUsername());
        }


    }

    @Override
    protected int setlayout() {
        return R.layout.fragment_mine;
    }

    @Override
    protected void initView() {
        touxiang = bindView(R.id.home_imageview);
        set = bindView(R.id.imageButton_setting);
        radioGroup = bindView(R.id.mine_radiogroup);
        singleBtn = bindView(R.id.mine_danpin_btn);
        strategyBtn = bindView(R.id.mine_gonglue_btn);
        login = bindView(R.id.login);
        nologin = bindView(R.id.no_login);

    }

    @Override
    protected void initData() {
        set.setOnClickListener(this);
        radioGroup.setOnCheckedChangeListener(this);
        radioGroup.check(R.id.mine_danpin_btn);
        touxiang.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButton_setting:
                Intent intent = new Intent(getActivity() , SetActivity.class);
                startActivity(intent);
                break;
            case R.id.home_imageview:
               BmobUser bmobUser = BmobUser.getCurrentUser();
                if (bmobUser == null){//bmob  没有数据的话跳转到登陆
                    Intent intent1 = new Intent(MyApp.mContect, LoginActivity.class);
                    startActivity(intent1);
                }else {
                        Intent intents = new Intent(MyApp.mContect, MyInformationActivity.class);
                        startActivity(intents);
                }

                break;
        }


    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (checkedId){
            case R.id.mine_danpin_btn:
                fragmentTransaction.replace(R.id.mine_framelayout,new MineSingleFragment());
                break;
            case R.id.mine_gonglue_btn:
                fragmentTransaction.replace(R.id.mine_framelayout,new MineStrategyFragment());
                break;
        }
        fragmentTransaction.commit();

    }
}
