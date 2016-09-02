package lanou.presentsay.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import lanou.presentsay.R;
import lanou.presentsay.ui.bean.SearchStrategyBean;
import lanou.presentsay.ui.tools.MyApp;

/**
 * 搜索后的攻略Adapter
 * Created by dllo on 16/8/30.
 */
public class StrategyAdapter extends BaseAdapter{
    private static final String TAG = "TAG_StrategyAdapter";
    private SearchStrategyBean bean;


    public void setBean(SearchStrategyBean bean) {
        this.bean = bean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return bean!=null?bean.getData().getPosts().size():0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
      Viewhodler holder = null;
        if (convertView ==null ){
            convertView = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_searchnext_strategy,parent,false);
            holder = new Viewhodler(convertView);
            convertView.setTag(holder);
        }else {
            holder = (Viewhodler) convertView.getTag();
        }
        holder.title.setText(bean.getData().getPosts().get(position).getTitle());
        holder.category.setText(bean.getData().getPosts().get(position).getColumn().getCategory());
        holder.columnTitle.setText(bean.getData().getPosts().get(position).getColumn().getTitle());
        holder.name.setText(bean.getData().getPosts().get(position).getAuthor().getNickname());
        holder.like.setText(String.valueOf(bean.getData().getPosts().get(position).getLikes_count()));
        Picasso.with(MyApp.mContect).load(bean.getData().getPosts().get(position).getAuthor().getAvatar_url()).into(holder.authorImage);
        holder.checkBox.setChecked(bean.getData().getPosts().get(position).getColumn().isCheckBox());
        Picasso.with(MyApp.mContect).load(bean.getData().getPosts().get(position).getCover_image_url()).into(holder.contentImage);

        return convertView;
    }

    private class Viewhodler {
        TextView category;
        TextView columnTitle;
        TextView name;
        ImageView authorImage;
        ImageView contentImage;
        TextView title;
        TextView like;
        CheckBox checkBox;
        public Viewhodler (View view){
            category = (TextView) view.findViewById(R.id.searchstrategy_listview_toptvone);
            columnTitle = (TextView) view.findViewById(R.id.searchstrategy_listview_toptitle);
            name = (TextView) view.findViewById(R.id.searchstrategy_listview_tvname);
            authorImage = (ImageView) view.findViewById(R.id.searchstrategy_listview_touxiang);
            contentImage = (ImageView) view.findViewById(R.id.searchstrategy_listview_contentimageview);
            title = (TextView) view.findViewById(R.id.searchstrategy_listview_content);
            like = (TextView) view.findViewById(R.id.searchstrategy_listview_likescount);
            checkBox= (CheckBox) view.findViewById(R.id.searchstrategy_listview_checkbok);
        }



    }
}
