package lanou.presentsay.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import lanou.presentsay.R;
import lanou.presentsay.ui.bean.SearchSingleBean;
import lanou.presentsay.ui.tools.MyApp;

/**
 * 搜索后的单品的Adapter
 * Created by dllo on 16/8/30.
 */
public class SingleAdapter extends RecyclerView.Adapter<SingleAdapter.MyViewHodler> {
    private static final String TAG = "TAG_SingleAdapter";
    private SearchSingleBean bean;

    public void setBean(SearchSingleBean bean) {
        this.bean = bean;
        notifyDataSetChanged();
    }

    @Override
    public SingleAdapter.MyViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHodler(LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_searchnext_single,parent,false));

    }

    @Override
    public void onBindViewHolder(SingleAdapter.MyViewHodler holder, int position) {
        Picasso.with(MyApp.mContect).load(bean.getData().getItems().get(position).getCover_image_url()).into(holder.imageView);
        holder.like.setText(String.valueOf(bean.getData().getItems().get(position).getLikes_count()));
        holder.price.setText(String.valueOf(bean.getData().getItems().get(position).getPrice()));
        holder.content.setText(bean.getData().getItems().get(position).getName());

    }

    @Override
    public int getItemCount() {
        return bean!= null ? bean.getData().getItems().size():0 ;
    }

    public class MyViewHodler extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView content;
        TextView price;
        TextView like;
        public MyViewHodler(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.item_searchnext_simple_imgae);
            content = (TextView) itemView.findViewById(R.id.item_searchnext_simple_content);
            price = (TextView) itemView.findViewById(R.id.item_searchnext_simple_price);
            like = (TextView) itemView.findViewById(R.id.item_searchnext_simple_like);
        }
    }
}
