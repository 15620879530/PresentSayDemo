package lanou.presentsay.ui.tools;

/**
 * EventBus类 第一步 ,定义事件
 * 里面会有需要传的值
 * Created by dllo on 16/8/24.
 */
public class DataEvent {
    private static final String TAG = "TAG_DataEvent";
    String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
