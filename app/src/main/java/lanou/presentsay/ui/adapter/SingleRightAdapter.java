package lanou.presentsay.ui.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.TextView;

import lanou.presentsay.R;
import lanou.presentsay.ui.MyGridView;
import lanou.presentsay.ui.activity.SingleJumpActivity;
import lanou.presentsay.ui.bean.SingleBean;
import lanou.presentsay.ui.tools.MyApp;

/**
 *单品右面的adapter
 * 它里面嵌套了一个GridView...
 * Created by dllo on 16/8/20.
 */
public class SingleRightAdapter extends BaseAdapter {
    private static final String TAG = "TAG_SingleRightAdapter";
    private SingleBean bean;
    private Context context;

    public SingleRightAdapter(Context context) {
        this.context = context;
    }

    public void setBean(SingleBean bean) {
        this.bean = bean;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return bean != null ?bean.getData().getCategories().size():0;
    }

    @Override
    public Object getItem(int position) {
        return bean.getData().getCategories().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int i, View convertView, ViewGroup parent) {
        ViewHodler viewHodler = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(MyApp.mContect).inflate(R.layout.item_rightsingle, parent, false);
            viewHodler = new ViewHodler(convertView);
            convertView.setTag(viewHodler);
        } else {
            viewHodler = (ViewHodler) convertView.getTag();
        }

//        右面listview里面嵌套gridview 在这里给他 初始化 和绑定布局
        SingleRGVAdapter singleRGVAdapter = new SingleRGVAdapter();
        singleRGVAdapter.setBeans(bean.getData().getCategories().get(i).getSubcategories());
        viewHodler.gridView.setAdapter(singleRGVAdapter);
        //单品 view 的监听 点击
        viewHodler.gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
                //
                Bundle bundle = new Bundle();
                bundle.putString("url","http://api.liwushuo.com/v2/item_subcategories/" +
                        String.valueOf(bean.getData().getCategories().get(i).getSubcategories().get(pos).getId())+
                "/items?limit=20&offset=0");

                bundle.putString("title",bean.getData().getCategories().get(i).getSubcategories().get(pos).getName());

                Intent intent = new Intent(context, SingleJumpActivity.class);
                //将bundle 里面的值放入intent 传递到下一个activity
                intent.putExtras(bundle);
                context.startActivity(intent);
            }
        });


        viewHodler.nameTv.setText("————— "+bean.getData().getCategories().get(i).getName()+" —————");

        return convertView;
    }

    private class ViewHodler {
        private TextView nameTv;
        private GridView gridView;

        public ViewHodler(View view) {
            nameTv = (TextView) view.findViewById(R.id.right_lvname);
            gridView = (MyGridView) view.findViewById(R.id.right_gridview);
        }
    }
}
