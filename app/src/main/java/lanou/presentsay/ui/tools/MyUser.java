package lanou.presentsay.ui.tools;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import cn.bmob.v3.BmobUser;

/**
 * Created by dllo on 16/8/26.
 */
public class MyUser extends BmobUser {
    private byte[] icon;//用户头像

    //处理成头像
    public void setIcon(Bitmap bitmap){
        //一个数组的输出流 , 我们之后会把图片输出到该输出流里
        //并从该输出流里取出byte[]
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //格式 ,品质 (100代表 , 精细程度百分百, 不丢失精度), 输出流
        bitmap.compress(Bitmap.CompressFormat.PNG , 100 , byteArrayOutputStream);
        //从输出流里拿到输出的数组 , 为icon赋值
        icon = byteArrayOutputStream.toByteArray();
        //关闭输出流
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Bitmap getIcon(){
        if(icon != null){
            Bitmap bitmap = BitmapFactory.decodeByteArray(icon , 0 , icon.length);
            return bitmap;
        }
        return null;
    }

}
