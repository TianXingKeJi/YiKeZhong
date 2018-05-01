package com.example.y_xl.neihanduanzi.view.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.model.bean.Message_bean;

import java.util.List;

/**
 * Created by lenovo on 2018/4/23.
 */

public class MessageAdapter extends RecyclerView.Adapter<MessageHolder> {
    Context context;
    List<Message_bean.DataBean.EssayBean> essay;
    public MessageAdapter(Context context, List<Message_bean.DataBean.EssayBean> essay) {
        this.context=context;
        this.essay=essay;
    }

    @Override
    public MessageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=View.inflate(context, R.layout.fragment_message_item_layout,null);
        MessageHolder holder=new MessageHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MessageHolder holder, int position) {

        holder.fragment_message_tv1.setText(essay.get(position).getHp_title());
        holder.fragment_message_tv2.setText(essay.get(position).getGuide_word());
    }

    @Override
    public int getItemCount() {
        return essay.size();
    }
}
