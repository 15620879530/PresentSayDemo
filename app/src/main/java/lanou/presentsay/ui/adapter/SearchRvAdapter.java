package lanou.presentsay.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import lanou.presentsay.R;
import lanou.presentsay.ui.activity.SearchNextActivity;
import lanou.presentsay.ui.bean.SearchBean;
import lanou.presentsay.ui.tools.MyApp;

/**
 * 搜索页面的 RecyclerView的适配器
 * Created by dllo on 16/8/30.
 */
public class SearchRvAdapter extends RecyclerView.Adapter<SearchRvAdapter.MyViewHodler> {
    private static final String TAG = "TAG_SearchRvAdapter";
    private SearchBean bean;
    private Context context;

    public SearchRvAdapter(Context context) {
        this.context = context;
    }

    public void setBean(SearchBean bean) {
        this.bean = bean;
        notifyDataSetChanged();
    }

    @Override
    public SearchRvAdapter.MyViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHodler(LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_gridview_search, parent, false));
    }

    @Override
    public void onBindViewHolder(final MyViewHodler holder, final int position) {
        holder.textView.setText(bean.getData().getHot_words().get(position));

        holder.textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击搜索下面的内容的时 将内容传递到跳转的界面的Editext上
                Intent intent = new Intent(context , SearchNextActivity.class);
                intent.putExtra("content", bean.getData().getHot_words().get(position));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return bean.getData().getHot_words() != null ? bean.getData().getHot_words().size() : 0;
    }

    public class MyViewHodler extends RecyclerView.ViewHolder {
        TextView textView;

        public MyViewHodler(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.search_view_textview);
        }
    }
}
