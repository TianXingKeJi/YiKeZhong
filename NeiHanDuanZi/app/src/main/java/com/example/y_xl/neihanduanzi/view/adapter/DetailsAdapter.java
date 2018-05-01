package com.example.y_xl.neihanduanzi.view.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.model.bean.DetailsBean;
import com.squareup.picasso.Picasso;

import java.util.List;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Created by Administrator on 2018/4/23 0023.
 */

public class DetailsAdapter extends RecyclerView.Adapter<MyHolder> {
    List<DetailsBean.DataBean> data;
    Context context;
    private JCVideoPlayerStandard surfaceView;
    String name;
    String icon;

    public DetailsAdapter(List<DetailsBean.DataBean> data, Context context, String name, String icon) {
        this.data = data;
        this.context = context;
        this.name = name;
        this.icon = icon;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View inflate = View.inflate(context, R.layout.item_view, null);
        MyHolder holder=new MyHolder(inflate);
        return holder;

    }



    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        if (name==null||name=="")
        {
            holder.titleTx.setText("游客");
        }
        else{
            holder.titleTx.setText(name);
        }
        holder.contentTv.setText(data.get(position).getWorkDesc()+"");
        holder.surfaceView.setUp(data.get(position).getVideoUrl(),surfaceView.SCREEN_LAYOUT_NORMAL, "你好，现在开始你的表演");
        Uri uri=Uri.parse(data.get(position).getCover());
        holder.surfaceView.thumbImageView.setImageURI(uri);
        Picasso.with(context).load(icon).config(Bitmap.Config.RGB_565).into(holder.headIcon);



    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
