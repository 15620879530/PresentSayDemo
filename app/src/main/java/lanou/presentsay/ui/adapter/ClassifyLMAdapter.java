package lanou.presentsay.ui.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import lanou.presentsay.R;
import lanou.presentsay.ui.bean.ClassifyLanmuBean;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.tools.NetTool;

/**分类界面  攻略 里面的栏目的 RecycleView的适配器
 * Created by dllo on 16/8/19.
 */
public class ClassifyLMAdapter extends RecyclerView.Adapter<ClassifyLMAdapter.MyViewHodler> {
    private static final String TAG = "TAG_ClassifyLMAdapter";
    private ClassifyLanmuBean bean;
    private MyViewHodler viewHodler;
    //注册接口
    LanMuOnItem lanMuOnItem;

    public void setLanMuOnItem(LanMuOnItem lanMuOnItem) {
        this.lanMuOnItem = lanMuOnItem;
    }

    public void setBean(ClassifyLanmuBean bean) {
        this.bean = bean;
        notifyDataSetChanged();
    }

    @Override
    public ClassifyLMAdapter.MyViewHodler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_rv_lanmu,parent,false);
        viewHodler = new MyViewHodler(view);
        return viewHodler;
    }

    @Override
    public void onBindViewHolder(ClassifyLMAdapter.MyViewHodler holder, final int position) {
        ClassifyLanmuBean.DataBean.ColumnsBean beans = bean.getData().getColumns().get(position);
        viewHodler.titleTv.setText(beans.getTitle());
        viewHodler.authorTv.setText(beans.getAuthor());
        viewHodler.subtitleTv.setText(beans.getSubtitle());
        NetTool netTool = new NetTool();
        netTool.getImg(beans.getCover_image_url(),viewHodler.imageView);

        //给item 布局添加一个点击监听
        viewHodler.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //注册监听
                lanMuOnItem.onClick(position);
            }
        });


    }

    @Override
    public int getItemCount() {
        return bean.getData().getColumns() != null ? bean.getData().getColumns().size() : 0;
    }

    public class MyViewHodler extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView titleTv;
        private TextView subtitleTv;
        private TextView authorTv;
        LinearLayout linearLayout;
        public MyViewHodler(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.iv_classifystrategy_lm_img);
            titleTv = (TextView) itemView.findViewById(R.id.tv_classifystrategy_lm_title);
            subtitleTv = (TextView) itemView.findViewById(R.id.tv_classifystrategy_lm_subtitle);
            authorTv = (TextView) itemView.findViewById(R.id.tv_classifystrategy_lm_author);
            linearLayout = (LinearLayout) itemView.findViewById(R.id.lanmu_item);

        }
    }
}
