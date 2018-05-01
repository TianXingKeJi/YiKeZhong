package com.example.y_xl.neihanduanzi.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.y_xl.neihanduanzi.R;

/**
 * Created by lenovo on 2018/4/23.
 */

public class MessageHolder extends RecyclerView.ViewHolder {


    public TextView fragment_message_tv1,fragment_message_tv2;
    public MessageHolder(View itemView) {
        super(itemView);

        fragment_message_tv1=itemView.findViewById(R.id.fragment_message_tv1);
        fragment_message_tv2=itemView.findViewById(R.id.fragment_message_tv2);
    }
}
