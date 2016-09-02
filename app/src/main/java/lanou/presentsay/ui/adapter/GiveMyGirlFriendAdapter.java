package lanou.presentsay.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;
import lanou.presentsay.R;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.bean.GiveMyGirlFriendBean;
import lanou.presentsay.ui.tools.NetTool;

/**
 * 送女票的Adapter
 * Created by dllo on 16/8/17.
 */
public class GiveMyGirlFriendAdapter extends BaseAdapter {
    private static final String TAG = "TAG_GiveMyGirlFriendAdapter";
    private GiveMyGirlFriendBean arraylist;

    public void setArraylist(GiveMyGirlFriendBean arraylist) {
        this.arraylist = arraylist;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return arraylist.getData().getItems() != null ? arraylist.getData().getItems().size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        GiveMyGirlFriendHodler hodler = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(MyApp.getmContect()).inflate(R.layout.item_lv_givemygirlfriend, parent, false);
            hodler = new GiveMyGirlFriendHodler(convertView);
            convertView.setTag(hodler);
        } else {
            hodler = (GiveMyGirlFriendHodler) convertView.getTag();
        }
        GiveMyGirlFriendBean.DataBean.ItemsBean beans = arraylist.getData().getItems().get(position);


        hodler.titleTv.setText(beans.getTitle());
        hodler.tvName.setText(beans.getAuthor().getNickname());
        if (beans.getColumn() != null) {
            hodler.topTitle.setText(beans.getColumn().getTitle());
            hodler.topTvone.setText(beans.getColumn().getCategory());
        }
        hodler.likeTv.setText(String.valueOf(beans.getLikes_count()));
        NetTool netTool = new NetTool();
        netTool.getImg(beans.getAuthor().getAvatar_url(), hodler.imageTouXiang);
        netTool.getImg(beans.getCover_image_url(), hodler.imgUrlIv);


        return convertView;
    }

    private class GiveMyGirlFriendHodler {
        TextView topTvone;
        TextView topTitle;
        ImageView imageTouXiang;
        TextView tvName;
        TextView titleTv;
        ImageView imgUrlIv;
        ImageView imageView;
        TextView likeTv;

        public GiveMyGirlFriendHodler(View convertView) {
            topTvone = (TextView) convertView.findViewById(R.id.selection_listview_toptvone);
            topTitle = (TextView) convertView.findViewById(R.id.selection_listview_toptitle);
            imageTouXiang = (CircleImageView) convertView.findViewById(R.id.selection_listview_touxiang);
            tvName = (TextView) convertView.findViewById(R.id.selection_listview_tvname);
            titleTv = (TextView) convertView.findViewById(R.id.selection_listview_content);
            imgUrlIv = (ImageView) convertView.findViewById(R.id.selection_listview_contentimageview);
            imageView = (ImageView) convertView.findViewById(R.id.imageView);
            likeTv = (TextView) convertView.findViewById(R.id.selection_listview_likescount);
        }

    }
}
