package com.example.y_xl.neihanduanzi.view.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;


import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.model.bean.MyAttentionBean;
import com.example.y_xl.neihanduanzi.view.interF.MyAttention_OnClick;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.controller.AbstractDraweeController;

import java.util.List;



/**
 *
 * @leovo 2018/4/17
 *
 */
public class MyAttention_Recycler_Adapter extends RecyclerView.Adapter<MyAttention_Recycler_Holder>{
    private Context context;
    private List<MyAttentionBean.DataBean> data;
    private MyAttention_OnClick woDeGuanZhu_onClick;
    public MyAttention_Recycler_Adapter(Context context, List<MyAttentionBean.DataBean> data) {
        this.context=context;
        this.data=data;
    }

    @Override
    public MyAttention_Recycler_Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=View.inflate(context, R.layout.activity_wodeguanzhu_recycler_item_layout,null);
        MyAttention_Recycler_Holder holder=new MyAttention_Recycler_Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyAttention_Recycler_Holder holder, final int position) {
//        Uri uri = Uri.parse(data.get(position).getImg());
//        holder.wodeguanzhu_img.setImageURI(uri);
        holder.wodeguanzhu_tv1.setText(data.get(position).getOccupation());
        holder.wodeguanzhu_tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                woDeGuanZhu_onClick.setPosition(position);
            }
        });

        holder.wodeguanzhu_tv2.setText(data.get(position).getTitle());
        holder.wodeguanzhu_tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                woDeGuanZhu_onClick.setPosition(position);
            }
        });

        holder.wodeguanzhu_tv3.setText(data.get(position).getCreateTime()+"");
        holder.wodeguanzhu_tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                woDeGuanZhu_onClick.setPosition(position);
            }
        });

        Uri uri = Uri.parse(data.get(position).getImg());
        AbstractDraweeController controller = Fresco.newDraweeControllerBuilder()
                .setUri(uri)
                .setAutoPlayAnimations(true)
                .build();
        holder.wodeguanzhu_img.setController(controller);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public void setWoDeGuanZhu_onClick(MyAttention_OnClick woDeGuanZhu_onClick){
        this.woDeGuanZhu_onClick=woDeGuanZhu_onClick;
    }
}