package lanou.presentsay.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import lanou.presentsay.R;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.bean.SelectionRVBean;
import lanou.presentsay.ui.tools.NetTool;

/**
 * Created by dllo on 16/8/17.
 */
public class SelectionRvAdapter extends RecyclerView.Adapter<SelectionRvAdapter.MyViewHoder> {
    private static final String TAG = "TAG_SelectionRvAdapter";
    private MyViewHoder viewHoder;
    private SelectionRVBean rvArrayList;

    public void setRvArrayList(SelectionRVBean rvArrayList) {
        this.rvArrayList = rvArrayList;
        notifyDataSetChanged();
    }

    @Override
    public SelectionRvAdapter.MyViewHoder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(MyApp.getmContect()).inflate(R.layout.item_rv_selection, parent, false);
        viewHoder = new MyViewHoder(view);
        return viewHoder;
    }

    @Override
    public void onBindViewHolder(SelectionRvAdapter.MyViewHoder holder, int position) {
        SelectionRVBean.DataBean.SecondaryBannersBean beans = rvArrayList.getData().getSecondary_banners().get(position);
        NetTool netTool = new NetTool();
        netTool.getImg(beans.getImage_url() ,viewHoder.imageView);


    }

    @Override
    public int getItemCount() {
        return rvArrayList.getData().getSecondary_banners() != null ? rvArrayList.getData().getSecondary_banners().size() : 0;
    }

    public class MyViewHoder extends RecyclerView.ViewHolder {
        private ImageView imageView;

        public MyViewHoder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.iv_selection_rv);

        }
    }
}
