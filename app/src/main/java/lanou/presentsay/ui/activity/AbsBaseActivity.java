package lanou.presentsay.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import lanou.presentsay.ui.tools.NetTool;

/**
 * Activity的基类
 * Created by dllo on 16/8/15.
 */
public abstract class AbsBaseActivity extends AppCompatActivity{
    private static final String TAG = "TAG_AbsBaseActivity";
    protected NetTool netTool;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());

        initView();

        initData();
    }

    protected abstract int setLayout();

    protected abstract void initView();
    protected abstract void initData();
    /**
     * 简化findViewById
     *  T 泛型 泛指一系列类型,这里指的是View的子类,如button,textView等
     * @param id
     * @param <T>
     * @return
     */
    protected <T extends View> T bindView (int id){

        return (T) findViewById(id);

    }
    /**
     * 简化intent跳转
     * @param from
     * @param to
     */
    protected void Jump(Context from, Class<? extends AbsBaseActivity> to){
        Intent intent = new Intent(from,to);
        startActivity(intent);
    }

    /**
     * 跳转传值
     */
    protected  void Jump(Context from, Class<? extends AbsBaseActivity> to, Bundle values){
        Intent intent = new Intent(from,to);
        intent.putExtras(values);
        startActivity(intent);
    }



}

