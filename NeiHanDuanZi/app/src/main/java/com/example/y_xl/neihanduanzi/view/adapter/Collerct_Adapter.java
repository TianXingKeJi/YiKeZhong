package com.example.y_xl.neihanduanzi.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.model.bean.Cellect_bean;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Created by 三年 on 2018/4/23.
 */

public class Collerct_Adapter extends RecyclerView.Adapter<Collerct_Adapter.CollectViewHolder> {

    private  Context context;
    private  List<Cellect_bean.DataBean> data;

    public Collerct_Adapter(Context context, List<Cellect_bean.DataBean> data) {
        this.context=context;
        this.data=data;
    }

    @Override
    public CollectViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=View.inflate(context,R.layout.collect_ietm,null);
        CollectViewHolder viewHolder=new CollectViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CollectViewHolder holder, int position) {
        String cover = data.get(position).getCover();
        holder.collect_img.setImageURI(cover);
        holder.collect_name.setText(data.get(position).getWorkDesc());
        holder.collect_time.setText(data.get(position).getCreateTime());
        String icon = data.get(position).getUser().getIcon();
        holder.collect_vodie.setUp(icon, holder.collect_vodie.SCREEN_LAYOUT_NORMAL);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class CollectViewHolder extends RecyclerView.ViewHolder{

        public SimpleDraweeView collect_img;
        public TextView collect_name;
        public TextView collect_time;
        public JCVideoPlayerStandard collect_vodie;

        public CollectViewHolder(View itemView) {
            super(itemView);
            collect_img = itemView.findViewById(R.id.collect_img);
            collect_name = itemView.findViewById(R.id.collect_name);
            collect_time = itemView.findViewById(R.id.collect_time);
            collect_vodie = itemView.findViewById(R.id.collect_vodie);
        }
    }
}
