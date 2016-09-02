package lanou.presentsay.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import lanou.presentsay.R;
import lanou.presentsay.ui.bean.SingleJumpBean;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.tools.NetTool;

/**
 * Created by dllo on 16/8/27.
 */
public class SingleJumpAdapter extends BaseAdapter {
    private static final String TAG = "TAG_SingleJumpAdapter";
    private SingleJumpBean bean;


    public void setBean(SingleJumpBean bean) {
        this.bean = bean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return bean.getData().getItems() != null ? bean.getData().getItems().size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return bean.getData().getItems().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHodler viewHodler = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_gv_singlejump, parent, false);
            viewHodler = new ViewHodler(convertView);
            convertView.setTag(viewHodler);
        }else {
            viewHodler = (ViewHodler) convertView.getTag();
        }
        SingleJumpBean.DataBean.ItemsBean beans = bean.getData().getItems().get(position);
        viewHodler.nameTv.setText(beans.getName());
        viewHodler.priceTv.setText(beans.getPrice());
        viewHodler.likesTv.setText(String.valueOf(beans.getFavorites_count()));
        NetTool netTool = new NetTool();
        netTool.getImg(beans.getCover_image_url(),viewHodler.urlImgTv);


        return convertView;
    }

    private class ViewHodler {
        private ImageView urlImgTv;
        private TextView nameTv;
        private TextView priceTv;
        private TextView likesTv;

        public ViewHodler(View view) {
            urlImgTv = (ImageView) view.findViewById(R.id.iv_hot_urlimg);
            nameTv = (TextView) view.findViewById(R.id.tv_hot_name);
            priceTv = (TextView) view.findViewById(R.id.tv_hot_price);
            likesTv = (TextView) view.findViewById(R.id.tv_hot_likescount);
        }
    }
}
