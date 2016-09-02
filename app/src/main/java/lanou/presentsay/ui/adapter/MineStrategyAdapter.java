package lanou.presentsay.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.List;
import lanou.presentsay.R;
import lanou.presentsay.ui.bean.Collect;
import lanou.presentsay.ui.tools.MyApp;

/**
 * 个人下面攻略界面的listview的适配器
 * Created by dllo on 16/9/1.
 */
public class MineStrategyAdapter extends BaseAdapter {
    private static final String TAG = "TAG_MineStrategyAdapter";
    private List<Collect> collects;

    public void setCollects(List<Collect> collects) {
        this.collects = collects;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        //显示条目数量
        return collects.size() > 0 && collects != null ? collects.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return collects.size()>0&&collects!=null?collects.get(position):null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder =null;
            if (convertView==null) {
                convertView = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_mine_strategy_listview,parent,false);
                viewHolder = new ViewHolder(convertView);
                convertView.setTag(viewHolder);
            }else {
                viewHolder = (ViewHolder) convertView.getTag();
            }
        viewHolder.title.setText(collects.get(position).getTitle());
        viewHolder.name.setText(collects.get(position).getName());
        Picasso.with(MyApp.mContect).load(collects.get(position).getImage()).into(viewHolder.imageView);
        return convertView;
    }

    private class ViewHolder {
       private TextView title ;
        private TextView name;
        private ImageView imageView;

        public ViewHolder(View view){
            title = (TextView) view.findViewById(R.id.item_mine_strategy_title);
            name = (TextView) view.findViewById(R.id.item_mine_strategy_name);
            imageView = (ImageView) view.findViewById(R.id.item_mine_strategy_image);
        }
    }
}
