package lanou.presentsay.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.GridView;

/**
 * 分类界面的单品界面里面的右面的listview嵌套的 自定义GridVie
 * Created by dllo on 16/8/20.
 */
public class MyGridView extends GridView {
    private static final String TAG = "TAG_MyGridView";

    public MyGridView(Context context) {
        super(context);
    }

    public MyGridView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyGridView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    /**
     * 展开listview
     * onMeasure 这个方法是决定view的大小
     * 重新测量 - 规定他的高度是展开的.
     */

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //对于详细测量值（ measureSpec ）需要两样东西来确定它，参数是大小（size）和模式（mode）。
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE>>2,MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }

    /**
     * 触摸监听函数
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() == MotionEvent.ACTION_MOVE){
            // 禁止listView滑动
            return true;

        }
        return super.dispatchTouchEvent(ev);
    }


}
