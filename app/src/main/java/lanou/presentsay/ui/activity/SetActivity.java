package lanou.presentsay.ui.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import lanou.presentsay.R;

/**
 * Created by dllo on 16/8/22.
 */
public class SetActivity extends AbsBaseActivity implements View.OnClickListener {
    private static final String TAG = "TAG_SetActivity";
    private LinearLayout pingfen;
    private ImageView back;

    @Override
    protected int setLayout() {
        return R.layout.activity_set;
    }

    @Override
    protected void initView() {
        pingfen = bindView(R.id.setup_grade);
        back = bindView(R.id.setup_back);

    }
    @Override
    protected void initData() {
        pingfen.setOnClickListener(this);
        back.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.setup_grade:
                Jump(this , GradeActivity.class);
                break;
            case R.id.setup_back:
                finish();
                break;
        }
    }
}
