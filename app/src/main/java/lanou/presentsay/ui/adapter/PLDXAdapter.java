package lanou.presentsay.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

import lanou.presentsay.R;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.bean.ClassifyPlFgDxBean;
import lanou.presentsay.ui.tools.NetTool;

/**
 * 攻略里面 -> 品类 对象 点击查看全部de下一级界面 gridview的适配器
 * Created by dllo on 16/8/23.
 */
public class PLDXAdapter extends BaseAdapter {
    private static final String TAG = "TAG_PLDXAdapter";
    private ArrayList<ClassifyPlFgDxBean.DataBean.ChannelGroupsBean.ChannelsBean> been;

    public void setBeen(ArrayList<ClassifyPlFgDxBean.DataBean.ChannelGroupsBean.ChannelsBean> been) {
        this.been = been;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return been.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {
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
