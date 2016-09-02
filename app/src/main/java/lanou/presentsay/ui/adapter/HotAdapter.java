package lanou.presentsay.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import lanou.presentsay.R;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.bean.HotBean;
import lanou.presentsay.ui.tools.NetTool;

/**
 * Created by dllo on 16/8/18.
 */
public class HotAdapter extends BaseAdapter {
    private static final String TAG = "TAG_HotAdapter";
    private HotBean arraylist;

    public void setArraylist(HotBean arraylist) {
        this.arraylist = arraylist;
        notifyDataSetChanged();
    }


    @Override
    public int getCount() {
        return arraylist.getData().getItems() != null ? arraylist.getData().getItems().size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return arraylist.getData().getItems().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        HotHodler hotHodler = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_rv_hot, parent, false);
            hotHodler = new HotHodler(convertView);
            convertView.setTag(hotHodler);
        } else {
            hotHodler = (HotHodler) convertView.getTag();
        }
        HotBean.DataBean.ItemsBean beans = arraylist.getData().getItems().get(position);
        hotHodler.nameTv.setText(beans.getData().getName());

//        if ("shop_item".equals(beans.getType())) {
//            hotHodler.priceTv.setText(beans.getData().getSkus().get(position).getPrice());
//        }else {
            hotHodler.priceTv.setText(beans.getData().getPrice());
//        }

        hotHodler.likesTv.setText(String.valueOf(beans.getData().getFavorites_count()));
        NetTool netTool = new NetTool();
        netTool.getImg(beans.getData().getCover_image_url() ,hotHodler.urlImgTv);
        return convertView;

    }


    private class HotHodler {
        private ImageView urlImgTv;
        private TextView nameTv;
        private TextView priceTv;
        private TextView likesTv;
        private CheckBox checkBox;

        public HotHodler(View view) {
            urlImgTv = (ImageView) view.findViewById(R.id.iv_hot_urlimg);
            nameTv = (TextView) view.findViewById(R.id.tv_hot_name);
            priceTv = (TextView) view.findViewById(R.id.tv_hot_price);
            likesTv = (TextView) view.findViewById(R.id.tv_hot_likescount);
            checkBox = (CheckBox) view.findViewById(R.id.my_hot_checkbox);
        }
    }
}

