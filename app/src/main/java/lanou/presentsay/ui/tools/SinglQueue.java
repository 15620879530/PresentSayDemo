package lanou.presentsay.ui.tools;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;

/**单例模式
 * Created by bailin on 16/8/16.
 */
public class SinglQueue {
    private static SinglQueue singlQueue;
    private RequestQueue requestQueue;
    private ImageLoader imageLoader;

    private SinglQueue() {
        requestQueue = Volley.newRequestQueue(MyApp.getmContect());
        imageLoader = new ImageLoader(requestQueue, new MemoryCache());
    }

    public ImageLoader getmImageLoader() {
        return imageLoader;
    }


    public static SinglQueue getInstance() {
        if (singlQueue == null) {
            synchronized (SinglQueue.class) {
                if (singlQueue == null) {
                    singlQueue = new SinglQueue();
                }
            }
        }
        return singlQueue;
    }

    public void addRequest(Request request) {
        requestQueue.add(request);
    }
}























