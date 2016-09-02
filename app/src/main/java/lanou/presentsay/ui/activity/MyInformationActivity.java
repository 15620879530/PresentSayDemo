package lanou.presentsay.ui.activity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.UpdateListener;
import lanou.presentsay.R;
import lanou.presentsay.ui.tools.MyUser;

/**
 * 设置界面->登录后点击头像 进入的个人资料
 * Created by dllo on 16/8/31.
 */
public class MyInformationActivity extends AbsBaseActivity implements View.OnClickListener {
    private static final String TAG = "TAG_MyInformationActivity";
    private Button logout;
    private BmobUser bmobUser;
    private ImageView headPhoto;
    private MyUser bmobUser1;

    @Override
    protected int setLayout() {
        return R.layout.activity_myinformation;
    }

    @Override
    protected void initView() {
        logout = bindView(R.id.out_button);
        headPhoto = bindView(R.id.head_portraits);

    }

    @Override
    protected void initData() {
        logout.setOnClickListener(this);
        headPhoto.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.out_button:
                bmobUser = BmobUser.getCurrentUser();
                bmobUser.logOut();
                finish();
            break;
            case R.id.head_portraits:
                   MyUser myUser = BmobUser.getCurrentUser(MyUser.class);
                if (myUser!= null){
                    Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
                    myUser.setIcon(bitmap);
                    //保存
                    myUser.update(new UpdateListener() {
                        @Override
                        public void done(BmobException e) {
                            if(e!= null){
                                Log.d("MainActivity", "更新失败");
                            }else {
                                Log.d("MainActivity", "更新成功");
                            }
                        }
                    });
                }








                break;

        }

    }
}
