package lanou.presentsay.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import lanou.presentsay.R;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.bean.ClassifyLanmuBean;
import lanou.presentsay.ui.tools.NetTool;

/**
 * 分类界面的栏目查看所有的adapter
 * Created by dllo on 16/8/23.
 */
public class LanMuAdapter extends BaseAdapter {
    private static final String TAG = "TAG_LanMuAdapter";
    private ClassifyLanmuBean classifyLanmuBean;

    public void setClassifyLanmuBean(ClassifyLanmuBean classifyLanmuBean) {
        this.classifyLanmuBean = classifyLanmuBean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return classifyLanmuBean.getData().getColumns() != null ? classifyLanmuBean.getData().getColumns().size() : 0;
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
        if (convertView == null){
            convertView = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_lv_lanmu_chakan,parent,false);
            viewHodler = new ViewHodler(convertView);
            convertView.setTag(viewHodler);
        }else {
           viewHodler = (ViewHodler) convertView.getTag();
        }
        ClassifyLanmuBean.DataBean.ColumnsBean bean = classifyLanmuBean.getData().getColumns().get(position);
        viewHodler.titleTv.setText(bean.getTitle());
        viewHodler.authorTv.setText(bean.getAuthor());
        viewHodler.subtitleTv.setText(bean.getSubtitle());
        NetTool netTool = new NetTool();
        netTool.getImg(bean.getCover_image_url(),viewHodler.imageView);

        return convertView;
    }

    private class ViewHodler {
        private ImageView imageView;
        private TextView titleTv;
        private TextView subtitleTv;
        private TextView authorTv;
        public ViewHodler (View view) {
            imageView = (ImageView) view.findViewById(R.id.iv_lm_img);
            titleTv = (TextView) view.findViewById(R.id.tv_lm_title);
            subtitleTv = (TextView) view.findViewById(R.id.tv_lm_subtitle);
            authorTv = (TextView) view.findViewById(R.id.tv_lm_author);

        }

    }
}
