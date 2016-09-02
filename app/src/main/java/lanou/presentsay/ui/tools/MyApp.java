package lanou.presentsay.ui.tools;

import android.app.Application;
import android.content.Context;

import cn.bmob.v3.Bmob;

/**
 *
 * Created by dllo on 16/8/15.
 */
public class MyApp extends Application{
    private static final String TAG = "TAG_MyApp";
    public static Context mContect;
    @Override
    public void onCreate() {
        super.onCreate();
        mContect = getApplicationContext();
        Bmob.initialize(this,"622b13fd04453769fe073dd562098415");
    }
    public static Context getmContect(){
        return mContect;
    }
}
