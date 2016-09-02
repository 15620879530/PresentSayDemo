package lanou.presentsay.ui.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.litesuits.orm.db.assit.WhereBuilder;

import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.BmobUser;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import cn.bmob.v3.listener.SaveListener;
import de.hdodenhof.circleimageview.CircleImageView;
import lanou.presentsay.R;
import lanou.presentsay.ui.activity.LoginActivity;
import lanou.presentsay.ui.bean.Collect;
import lanou.presentsay.ui.tools.MyApp;
import lanou.presentsay.ui.bean.SelectionBean;
import lanou.presentsay.ui.tools.NetTool;
import lanou.presentsay.ui.tools.SingleLiteOrm;

/**
 * 精选界面的适配器
 * Created by dllo on 16/8/16.
 */
public class SelectionAdapter extends BaseAdapter {
    private static final String TAG = "TAG_SelectionAdapter";
    private SelectionBean arrayList;
    private BmobUser bmobUser;
    private SelectionHoder hodler;

    public void setArrayList(SelectionBean arrayList) {
        this.arrayList = arrayList;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return arrayList.getData().getItems() != null ? arrayList.getData().getItems().size() : 0;
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        hodler = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(MyApp.getmContect()).inflate(R.layout.item_lv_selection, parent, false);
            hodler = new SelectionHoder(convertView);
            convertView.setTag(hodler);
        } else {
            hodler = (SelectionHoder) convertView.getTag();
        }
        SelectionBean.DataBean.ItemsBean beans = arrayList.getData().getItems().get(position);
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
        //checkBox 的点击事件
        hodler.checkBox.setChecked(arrayList.getData().getItems().get(position).isCheckBox());
        hodler.checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox checkBox = (CheckBox) v;
                arrayList.getData().getItems().get(position).setCheckBox(checkBox.isChecked());
               BmobUser bmobUser = BmobUser.getCurrentUser();
                arrayList.getData().getItems().get(position).setCheckBox(checkBox.isChecked());
                if(bmobUser !=null){
                    if (checkBox.isChecked()){
                        Collect collect = new Collect();
                        //存入网络数据库
                        collect.setUserName(bmobUser.getUsername());
                        collect.setTitle(arrayList.getData().getItems().get(position).getTitle());
                        collect.setImage(arrayList.getData().getItems().get(position).getCover_image_url());
                        collect.setName(arrayList.getData().getItems().get(position).getAuthor().getNickname());
                        collect.setUrl(arrayList.getData().getItems().get(position).getUrl());
                        //存入本地数据库
                        SingleLiteOrm.getSingleLiteOrm().getLiteOrm().insert(collect);

                        collect.save(new SaveListener<String>() {
                            @Override
                            public void done(String s, BmobException e) {
                                if (e==null){
                                    Toast.makeText(MyApp.mContect, "关注成功了哦", Toast.LENGTH_SHORT).show();
                                }else {
                                    Toast.makeText(MyApp.mContect, "存储没成功", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }else {
                        //删除本地数据
                        SingleLiteOrm.getSingleLiteOrm().getLiteOrm().delete(new WhereBuilder(Collect.class).where("url" + " = ?",new Object[]{
                            arrayList.getData().getItems().get(position).getUrl()
                        }));
                        //删除网络的
                        BmobQuery<Collect> bmob = new BmobQuery<Collect>();
                        bmob.addWhereEqualTo("userName", bmobUser.getUsername());
                        bmob.addWhereEqualTo("url",arrayList.getData().getItems().get(position).getUrl());
                        bmob.findObjects(new FindListener<Collect>() {
                            @Override
                            public void done(List<Collect> list, BmobException e) {
                                if (e==null){

                                    Toast.makeText(MyApp.mContect, "取消关注了", Toast.LENGTH_SHORT).show();
                                    for (int i = 0; i <list.size() ; i++) {
                                        Collect collect = list.get(i);
                                        collect.delete();
                                    }
                                }else {
                                    Toast.makeText(MyApp.mContect, "取消失败", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                }else {
                    Intent intent =new Intent(MyApp.mContect, LoginActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    MyApp.mContect.startActivity(intent);
                }
            }
        });
        BmobUser bmobUser = BmobUser.getCurrentUser();
        if (bmobUser!=null){
        BmobQuery<Collect> bmobquery = new BmobQuery<Collect>();
        bmobquery.addWhereEqualTo("userName",bmobUser.getUsername());
        bmobquery.addWhereEqualTo("url",arrayList.getData().getItems().get(position).getUrl());
        bmobquery.findObjects(new FindListener<Collect>() {
            @Override
            public void done(List<Collect> list, BmobException e) {
                 if (e==null){
                     if (list.size()>0){
                         hodler.checkBox.setChecked(true);
                     }
                 }
            }
        });
        }
        return convertView;
    }


    private class SelectionHoder {
       private TextView topTvone;
        private TextView topTitle;
        private ImageView imageTouXiang;
        private TextView tvName;
        private TextView titleTv;
        private ImageView imgUrlIv;
        private TextView likeTv;
        private CheckBox checkBox;

        public SelectionHoder(View convertView) {
            topTvone = (TextView) convertView.findViewById(R.id.selection_listview_toptvone);
            topTitle = (TextView) convertView.findViewById(R.id.selection_listview_toptitle);
            imageTouXiang = (CircleImageView) convertView.findViewById(R.id.selection_listview_touxiang);
            tvName = (TextView) convertView.findViewById(R.id.selection_listview_tvname);
            titleTv = (TextView) convertView.findViewById(R.id.selection_listview_content);
            imgUrlIv = (ImageView) convertView.findViewById(R.id.selection_listview_contentimageview);
            likeTv = (TextView) convertView.findViewById(R.id.selection_listview_likescount);
            checkBox = (CheckBox) convertView.findViewById(R.id.checkbox_imageView);
        }
    }
}
