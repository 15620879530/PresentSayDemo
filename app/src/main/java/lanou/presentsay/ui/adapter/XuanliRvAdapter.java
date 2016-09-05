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
 * 选礼神器 跳转到的 挑选礼物 界面
 *          的 对象 场合  个性 价格的 recyclerView 的adapter
 *          点击它弹出popupwindow
 * Created by dllo on 16/9/3.
 */
public class XuanliRvAdapter extends RecyclerView.Adapter<XuanliRvAdapter.MyViewHodler> {
    private static final String TAG = "TAG_XuanliRvAdapter";
    private TiaoXuanPopRvBean bean;
    private OnTagClickListener onTagClickListener;

    public void setOnTagClickListener(OnTagClickListener onTagClickListener) {
        this.onTagClickListener = onTagClickListener;
        notifyDataSetChanged();
    }

    public void setBean(TiaoXuanPopRvBean bean) {
        this.bean = bean;
        notifyDataSetChanged();
    }

    @Override
    public XuanliRvAdapter.MyViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_tag_recycler,parent,false);
        MyViewHodler hodler = new MyViewHodler(view);
        return hodler;
    }

    @Override
    public void onBindViewHolder(XuanliRvAdapter.MyViewHodler holder, int position) {

    holder.textView.setText(bean.getData().getFilters().get(position).getName());

    }

    @Override
    public int getItemCount() {


        return bean!=null?bean.getData().getFilters().size():0;
    }

    public class MyViewHodler extends RecyclerView.ViewHolder {
        LinearLayout linearLayout;
        TextView textView;

        public MyViewHodler(View itemView) {
            super(itemView);

            linearLayout = (LinearLayout) itemView.findViewById(R.id.item_activity_gift_god_tag_layout);
            textView = (TextView) itemView.findViewById(R.id.activity_git_god_tag_text);

            //接口回调
            linearLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int pos = getLayoutPosition();
                    onTagClickListener.onClick(pos);
                }
            });
        }
    }

    public interface OnTagClickListener {
        void onClick(int position);
    }


}
