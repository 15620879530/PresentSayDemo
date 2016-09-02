package lanou.presentsay.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import lanou.presentsay.R;
import lanou.presentsay.ui.bean.LanMuJumpBean;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.tools.NetTool;

/**
 * 分类攻略界面 点击栏目里面的item 跳转的下一个界面的listview
 * 它里面有一个头布局在LanMuJumpActivity 里面实现
 * Created by dllo on 16/8/27.
 */
public class LanMujumpAdapter extends BaseAdapter {
    private static final String TAG = "TAG_LanMujumpAdapter";
    private LanMuJumpBean bean;

    public void setBean(LanMuJumpBean bean) {
        this.bean = bean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return bean.getData().getPosts() != null ? bean.getData().getPosts().size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return bean.getData().getPosts().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHodler viewHodler = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_lanmujump_listview, parent, false);
            viewHodler = new ViewHodler(convertView);
            convertView.setTag(viewHodler);
        } else {
            viewHodler = (ViewHodler) convertView.getTag();
        }
        LanMuJumpBean.DataBean.PostsBean beans = bean.getData().getPosts().get(position);
        viewHodler.title.setText(beans.getTitle());
        viewHodler.like.setText(String.valueOf(beans.getLikes_count()));
        viewHodler.name.setText(beans.getAuthor().getNickname());
        NetTool netTool  = new NetTool();
        netTool.getImg(beans.getCover_image_url(),viewHodler.imageView);

        return convertView;
    }

    private class ViewHodler {
        private ImageView imageView;
        private TextView title;
        private TextView name;
        private TextView like;
        public ViewHodler(View view){
            imageView = (ImageView) view.findViewById(R.id.lanmujump_listview_img);
            title = (TextView) view.findViewById(R.id.lanmujump_listview_title);
            name = (TextView) view.findViewById(R.id.lanmujump_listview_authorname);
            like = (TextView) view.findViewById(R.id.lanmujump_listview_likecount);

        }
    }
}
