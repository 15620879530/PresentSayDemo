package lanou.presentsay.ui.tools;

import com.litesuits.orm.LiteOrm;

/**
 * Created by dllo on 16/7/8.
 */
public class SingleLiteOrm {
    //一个数据库对应一个LiteOrm的实例，如果一个App只有一个数据库，那么LiteOrm应该是全局单例的。
    // 如果多次新建LiteOrm实例，系统会提示你应该关闭之前的数据库
    // ，也可能会引起其他未知错误。
    private static SingleLiteOrm singleLiteOrm;
    //liteOrm 对象 ,增删改查的方法 都操作此对象
    private LiteOrm liteOrm;

    //初始化liteOrm对象
    //使用MyApp里的全局Context
    //第二个参数是 数据库的名字
    private SingleLiteOrm() {
        liteOrm = LiteOrm.newCascadeInstance(MyApp.mContect, "dbName.db");
    }

    public static SingleLiteOrm getSingleLiteOrm() {
        if (singleLiteOrm == null) {
            synchronized (SingleLiteOrm.class) {
                if (singleLiteOrm == null) {
                    singleLiteOrm = new SingleLiteOrm();
                }
            }
        }
        return singleLiteOrm;
    }

    public LiteOrm getLiteOrm() {
        return liteOrm;
    }
}
