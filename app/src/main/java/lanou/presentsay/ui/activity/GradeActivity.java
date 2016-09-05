package lanou.presentsay.ui.activity;

import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import lanou.presentsay.R;

/**
 * Created by dllo on 16/9/5.
 */
public class GradeActivity extends AbsBaseActivity implements RatingBar.OnRatingBarChangeListener, View.OnClickListener {
    private static final String TAG = "TAG_GradeActivity";
    private RatingBar ratingBar;
    private Button grade_Btn;
    @Override
    protected int setLayout() {
        return R.layout.activity_grade;
    }

    @Override
    protected void initView() {
        ratingBar = bindView(R.id.grade_rB);
        grade_Btn = bindView(R.id.grade_Btn);

    }

    @Override
    protected void initData() {
        ratingBar.setOnRatingBarChangeListener(this);
        grade_Btn.setOnClickListener(this);

    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        Toast.makeText(this, "您的评分是" + String.valueOf(rating) + "分,合作愉快哦!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "谢谢您的平分~欢迎下次光临", Toast.LENGTH_SHORT).show();
    }
}
