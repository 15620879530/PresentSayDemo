package lanou.presentsay.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import lanou.presentsay.R;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.bean.SingleBean;

/**
 * 分类 单品 左面的listview的adapter
 * Created by dllo on 16/8/20.
 */
public class SingleLeftAdapter extends BaseAdapter {
    private static final String TAG = "TAG_SingleLeftAdapter";
    private SingleBean beans;




    public void setBeans(SingleBean beans) {
        this.beans = beans;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return beans.getData().getCategories() != null ? beans.getData().getCategories().size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return beans.getData().getCategories().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_leftsingle, parent, false);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        SingleBean.DataBean.CategoriesBean bean = beans.getData().getCategories().get(position);

        holder.nameTv.setText(bean.getName());

        return convertView;
    }

    private class ViewHolder {
        TextView nameTv;

        public ViewHolder(View view) {
            nameTv = (TextView) view.findViewById(R.id.tv_leftsingle_name);
        }

    }
}
