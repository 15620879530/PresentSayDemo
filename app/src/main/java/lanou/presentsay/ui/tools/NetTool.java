package lanou.presentsay.ui.tools;

import android.widget.ImageView;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.StringRequest;
import com.google.gson.Gson;
import lanou.presentsay.R;

/**
 * Created by bailin on 16/8/16.
 */
public class NetTool {

    //获得图片
    public void getImg(String url, ImageView imageView) {

        ImageLoader imageLoader = SinglQueue.getInstance().getmImageLoader();

        //获得网络图片...第一个参数图片网址
        imageLoader.get(url, ImageLoader.getImageListener(imageView,
                R.mipmap.dingdangmao,
                R.mipmap.ic_launcher
        ));
    }



    public <T> void getData(String url, final Class<T> clazz, final NetInterface<T> netInterface) {
        StringRequest stringRequest = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                Gson gson = new Gson();
                netInterface.onSuccess(gson.fromJson(response, clazz));

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                netInterface.onError(error.getMessage());
            }
        });

        SinglQueue.getInstance().addRequest(stringRequest);

    }


    // 网络请求的接口，有成功方法， 有失败方法
    public interface NetInterface<T> {
        void onSuccess(T t); // 网络请求成功 返回的是解析完成的实体类

        void onError(String errorMsg);
    }
}
