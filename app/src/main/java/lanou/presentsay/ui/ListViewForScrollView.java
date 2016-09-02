package lanou.presentsay.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * 这个是首页的精选界面的自定义listview
 * 因为我写的ScrollView 与listview 冲突 ,所以解决他们之间的功能问题 需要自己写一个自定义的listview
 * Created by dllo on 16/8/17.
 */
public class ListViewForScrollView extends ListView {
    private static final String TAG = "TAG_ListViewForScrollView";


    public ListViewForScrollView(Context context) {
        super(context);
    }

    public ListViewForScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ListViewForScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
                MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, expandSpec);
    }
}
