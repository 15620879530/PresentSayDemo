package lanou.presentsay.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import lanou.presentsay.ui.activity.AbsBaseActivity;
import lanou.presentsay.ui.tools.NetTool;

/**
 * Fragment 的基类
 * Created by dllo on 16/8/15.
 */
public abstract class AbsBaseFragment extends Fragment {
    private static final String TAG = "TAG_AbsBaseFragment";
    private Context mContext;
    protected NetTool netTool;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(setlayout(),container,false);
    }

    /**
     * 设置布局
     */
    protected abstract int setlayout();

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

       initView();
    }

    /**
     * 初始化组件, 在该方法里, 做FindViewByid
     */
    protected abstract void initView();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    /**
     * 初始化数据, 例如网络请求, 查询数据库等
     */
    protected abstract void initData();

    protected <T extends View> T bindView(int id){
        return (T) getView().findViewById(id);
    }

    /**
     * 跳转传值
     */
    protected  void Jump(Context from, Class<? extends AbsBaseActivity> to, Bundle values){
        Intent intent = new Intent(from,to);
        intent.putExtras(values);
        startActivity(intent);
    }

    /**
     * 普通的
     * @param from
     * @param to
     */
    protected void Jump(Context from ,Class<? extends AbsBaseActivity> to){
        Intent intent = new Intent(from,to);
        startActivity(intent);
    }



}
