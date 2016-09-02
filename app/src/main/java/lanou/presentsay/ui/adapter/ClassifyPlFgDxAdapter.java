package lanou.presentsay.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

import lanou.presentsay.R;
import lanou.presentsay.ui.bean.ClassifyPlFgDxBean;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.tools.NetTool;

/**
 * 品类 , 风格 , 对象 的适配器
 * Created by dllo on 16/8/19.
 */
public class ClassifyPlFgDxAdapter extends BaseAdapter {
    private static final String TAG = "TAG_ClassifyPlFgDxAdapter";
    private ArrayList<ClassifyPlFgDxBean.DataBean.ChannelGroupsBean.ChannelsBean> been;

    public void setBeen(ArrayList<ClassifyPlFgDxBean.DataBean.ChannelGroupsBean.ChannelsBean> been) {
        this.been = been;
        notifyDataSetChanged();
    }
    //每一个GridView里面只显示6个
    @Override
    public int getCount() {
        return 6;
    }

    @Override
    public Object getItem(int position) {
        return been.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_gv_classplfgdx, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        NetTool netTool = new NetTool();
        netTool.getImg(been.get(position).getCover_image_url(), viewHolder.imageView);


        return convertView;
    }


    private class ViewHolder {
        private ImageView imageView;
        public ViewHolder(View view) {
            imageView = (ImageView) view.findViewById(R.id.iv_gv_classifyplfgdx);
        }
    }
}
