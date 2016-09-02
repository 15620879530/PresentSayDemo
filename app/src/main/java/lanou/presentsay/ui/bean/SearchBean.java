package lanou.presentsay.ui.bean;

import java.util.List;

/**
 * 搜索的
 * Created by dllo on 16/8/30.
 */
public class SearchBean {


    /**
     * code : 200
     * data : {"hot_words":["月饼","钢笔","情侣","双肩包","宿舍","手机壳","文具","手表","钱包","水杯","杯子","手链"],"placeholder":"快选一份礼物，送给Ta吧"}
     * message : OK
     */

    private int code;
    /**
     * hot_words : ["月饼","钢笔","情侣","双肩包","宿舍","手机壳","文具","手表","钱包","水杯","杯子","手链"]
     * placeholder : 快选一份礼物，送给Ta吧
     */

    private DataBean data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static class DataBean {
        private String placeholder;
        private List<String> hot_words;

        public String getPlaceholder() {
            return placeholder;
        }

        public void setPlaceholder(String placeholder) {
            this.placeholder = placeholder;
        }

        public List<String> getHot_words() {
            return hot_words;
        }

        public void setHot_words(List<String> hot_words) {
            this.hot_words = hot_words;
        }
    }
}
