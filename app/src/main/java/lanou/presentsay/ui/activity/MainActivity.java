package lanou.presentsay.ui.activity;

import android.graphics.drawable.Drawable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import lanou.presentsay.R;
import lanou.presentsay.ui.fragment.ClassifyFragment;
import lanou.presentsay.ui.fragment.GuideFragment;
import lanou.presentsay.ui.fragment.MineFragment;
import lanou.presentsay.ui.fragment.hotfragment.HotFragment;

public class MainActivity extends AbsBaseActivity implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup radioGroup;
    private RadioButton rbGuide;
    private RadioButton rbHot;
    private RadioButton rbClassify;
    private RadioButton rbMine;
    private FragmentManager fragmentManager;


    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

        radioGroup = bindView(R.id.radiogroup_main);
        rbGuide = bindView(R.id.radio_btnGuide);//指南界面的radiobtn
        Drawable dbGuide = getResources().getDrawable(R.drawable.radio_guide);
        dbGuide.setBounds(0, 0, 110, 110);
        rbGuide.setCompoundDrawables(null, dbGuide, null, null);

        rbHot = bindView(R.id.radio_btnHot);
        Drawable dbHot = getResources().getDrawable(R.drawable.radio_hot);
        dbHot.setBounds(0, 0, 110, 110);
        rbHot.setCompoundDrawables(null, dbHot, null, null);

        rbClassify = bindView(R.id.radio_btnClassify);
        Drawable dbClassify = getResources().getDrawable(R.drawable.radio_classify);
        dbClassify.setBounds(0, 0, 110, 110);
        rbClassify.setCompoundDrawables(null, dbClassify, null, null);

        rbMine = bindView(R.id.radio_btnMine);
        Drawable dbMine = getResources().getDrawable(R.drawable.radio_mine);
        dbMine.setBounds(0, 0, 110, 110);
        rbMine.setCompoundDrawables(null, dbMine, null, null);


    }

    @Override
    protected void initData() {
        radioGroup.setOnCheckedChangeListener(this);
        radioGroup.check(R.id.radio_btnGuide);


    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        switch (checkedId) {
            case R.id.radio_btnGuide:
                fragmentTransaction.replace(R.id.framlayout_main, new GuideFragment());
                break;
            case R.id.radio_btnHot:
                fragmentTransaction.replace(R.id.framlayout_main, new HotFragment());
                break;
            case R.id.radio_btnClassify:
                fragmentTransaction.replace(R.id.framlayout_main, new ClassifyFragment());
                break;
            case R.id.radio_btnMine:
                fragmentTransaction.replace(R.id.framlayout_main, new MineFragment());
                break;
            default:
                break;
        }
        fragmentTransaction.commit();
    }

}
