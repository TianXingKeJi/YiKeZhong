package com.example.y_xl.neihanduanzi.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.model.bean.Hot_video_bean;
import com.example.y_xl.neihanduanzi.view.activity.VideoActivity;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;

/**
 * Created by Y_xl on 2018/4/15.
 */

public class HotAdapter extends XRecyclerView.Adapter<HotVH> {


    private final Context context;
    private final List<Hot_video_bean.DataBean> list;
    public HotAdapter(Context context, List<Hot_video_bean.DataBean> list) {
        this.context = context;
        this.list = list;
    }


    @Override
    public HotVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.hot_video_child_layout, parent, false);
        HotVH hotVH = new HotVH(view);
        return hotVH;
    }

    @Override
    public void onBindViewHolder(HotVH holder, final int position) {
        //绑定数据
        if (list.get(position).getCover() != null) {
            Glide.with(context).load(list.get(position).getCover()).into(holder.hot_child_image);
            holder.hot_child_image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("TAG", "" + position);
                    Intent intent = new Intent(context, VideoActivity.class);
                    intent.putExtra("videoUrl", list.get(position).getVideoUrl());
                    context.startActivity(intent);
                }
            });
        }
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
}
