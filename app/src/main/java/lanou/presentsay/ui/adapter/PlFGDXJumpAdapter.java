package lanou.presentsay.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import lanou.presentsay.R;
import lanou.presentsay.ui.bean.PlFGDXJumpBean;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.tools.NetTool;

/**
 * Created by dllo on 16/8/29.
 */
public class PlFGDXJumpAdapter extends BaseAdapter {
    private static final String TAG = "TAG_PlFGDXJumpAdapter";
    private PlFGDXJumpBean bean;

    public void setBean(PlFGDXJumpBean bean) {
        this.bean = bean;
        notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return bean.getData().getItems() != null?bean.getData().getItems().size():0;
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
        ViewHodler viewHodler = null;
        if (convertView==null) {
            convertView = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_plfgdxjump,parent,false);
            viewHodler = new ViewHodler(convertView);
            convertView.setTag(viewHodler);
        }else {
            viewHodler = (ViewHodler) convertView.getTag();
        }
        viewHodler.title.setText(bean.getData().getItems().get(position).getTitle());
        viewHodler.like.setText(String.valueOf(bean.getData().getItems().get(position).getLikes_count()));
        NetTool netTool = new NetTool();
        netTool.getImg(bean.getData().getItems().get(position).getCover_image_url(),viewHodler.img);

        return convertView;
    }

    private class ViewHodler {
        private ImageView img;
        private TextView title;
        private TextView like;
        public ViewHodler(View view){
            img = (ImageView) view.findViewById(R.id.classify_jump_image);
            title = (TextView) view.findViewById(R.id.classify_jump_title);
            like = (TextView) view.findViewById(R.id.classify_jump_likesCount);

        }

    }
}
