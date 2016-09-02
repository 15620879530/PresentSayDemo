package lanou.presentsay.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import lanou.presentsay.R;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.bean.SingleBean;
import lanou.presentsay.ui.tools.NetTool;

/**
 * Created by dllo on 16/8/22.
 */
public class SingleRGVAdapter extends BaseAdapter {
    private static final String TAG = "TAG_SingleRGVAdapter";
    private List<SingleBean.DataBean.CategoriesBean.SubcategoriesBean> beans;

    public void setBeans(List<SingleBean.DataBean.CategoriesBean.SubcategoriesBean> beans) {
        this.beans = beans;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return beans != null ? beans.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return beans.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GvHodler gvHodler = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_single_right_gv, parent, false);
            gvHodler = new GvHodler(convertView);
            convertView.setTag(gvHodler);
        } else {
            gvHodler = (GvHodler) convertView.getTag();
        }
        NetTool netTool = new NetTool();
        netTool.getImg(beans.get(position).getIcon_url(), gvHodler.imageView);
        gvHodler.titleTv.setText(beans.get(position).getName());

        return convertView;
    }

    private class GvHodler {
        private ImageView imageView;
        private TextView titleTv;

        public GvHodler(View view) {
            imageView = (ImageView) view.findViewById(R.id.iv_single_rightgv_image);
            titleTv = (TextView) view.findViewById(R.id.tv_single_rightgv_title);

        }
    }
}
