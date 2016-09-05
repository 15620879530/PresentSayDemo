package lanou.presentsay.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import lanou.presentsay.R;
import lanou.presentsay.ui.bean.TiaoXuanPopRvBean;
import lanou.presentsay.ui.tools.MyApp;

/**
 * 挑选礼物 popupWindow 的adapter
 * Created by dllo on 16/9/3.
 */
public class XuanliPopAdapter extends RecyclerView.Adapter<XuanliPopAdapter.MyViewHolder> {
    private static final String TAG = "TAG_XuanliPopAdapter";
    private TiaoXuanPopRvBean.DataBean.FiltersBean bean;

    private onPopupClickListener onPopupClickListener;

    public void setOnPopupClickListener(XuanliPopAdapter.onPopupClickListener onPopupClickListener) {
        this.onPopupClickListener = onPopupClickListener;
    }

    public void setBean(TiaoXuanPopRvBean.DataBean.FiltersBean bean) {
        this.bean = bean;
        notifyDataSetChanged();
    }

    @Override
    public XuanliPopAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_popwindow,parent,false));
    }

    @Override
    public void onBindViewHolder(XuanliPopAdapter.MyViewHolder holder, int position) {
        holder.textView.setText(bean.getChannels().get(position).getName());
    }

    @Override
    public int getItemCount() {
        return bean != null? bean.getChannels().size():0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        LinearLayout linearLayout;
        TextView textView;
        public MyViewHolder(View itemView) {
            super(itemView);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.linearlayout_popwindow);
            textView = (TextView) itemView.findViewById(R.id.item_popwindow_textview);
            //点击pop里面的 item...
            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getLayoutPosition();
                    String id = String.valueOf(bean.getChannels().get(pos).getId());
                    String key = bean.getChannels().get(pos).getKey2();
//                    Log.d("MyViewHolder", bean.getChannels().get(pos).getKey2());
                    onPopupClickListener.onClick(pos, id, key);
                }
            });

        }
    }
    public interface onPopupClickListener {
        void onClick(int position, String id, String key);
    }

}
