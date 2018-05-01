package com.example.y_xl.neihanduanzi.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.model.bean.Satin_bean;

import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by xm7 on 2018/4/18.
 */

public class StainAdapter extends RecyclerView.Adapter<StainAdapter.ViewHolder1>{

    List<Satin_bean.DataBean> list;
    Context context;

    public StainAdapter(Context context, List<Satin_bean.DataBean> list) {
        this.list = list;
        this.context = context;
    }


    @Override
    public ViewHolder1 onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.stain_adapter, parent, false);
        return new ViewHolder1(view);

    }

    @Override
    public void onBindViewHolder(ViewHolder1 holder, int position) {
        final ViewHolder1 holder1 = (ViewHolder1) holder;

        if ((list.get(position).getImgUrls() == null) || list.get(position).getImgUrls().isEmpty() || (list.get(position).getImgUrls() == "")){

            holder1.simpleDraweeView.setImageURI("https://www.zhaoapi.cn/images/quarter/1523860346693ic_launcher.png ");
        }else {

            String[] split = list.get(position).getImgUrls().split("\\|");
            holder1.simpleDraweeView.setImageURI(split[0]);
        }
        holder1.textView1.setText(list.get(position).getContent());
        holder1.textView.setText(list.get(position).getCreateTime());
       /* holder1.textView3.setText(list.get(position).getCommentNum().toString());*/
     /* Bean.DataBean.UserBean user = list.get(position).getUser();*/
      /*  Uri uri=Uri.parse(list.get(position).getUser().getIcon()+"");
        holder1.simpleDraweeView1.setImageURI(uri);
        Log.d("aaa", "onBindViewHolder: ");
       /* holder.simpleDraweeView1.setImageURI(user.getIcon());*/

    }




    @Override
    public int getItemCount() {
        return list.size();
    }
    class ViewHolder1 extends RecyclerView.ViewHolder {
        TextView textView;
        TextView textView1;

        SimpleDraweeView simpleDraweeView;

        public ViewHolder1(View itemView) {
            super(itemView);
            textView= (TextView) itemView.findViewById(R.id.duanzi_time);
            textView1= (TextView) itemView.findViewById(R.id.duanzi_content);
            simpleDraweeView=itemView.findViewById(R.id.duanzi_img);

        }

    }
}
