package com.example.y_xl.neihanduanzi.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


import com.example.y_xl.neihanduanzi.R;
import com.facebook.drawee.view.SimpleDraweeView;

/**
 * Created by lenovo on 2018/4/17.
 */

public class MyAttention_Recycler_Holder extends RecyclerView.ViewHolder  {

    public SimpleDraweeView wodeguanzhu_img;
    public TextView wodeguanzhu_tv1,wodeguanzhu_tv2,wodeguanzhu_tv3;
    public MyAttention_Recycler_Holder(View itemView) {
        super(itemView);

        wodeguanzhu_img=itemView.findViewById(R.id.wodeguanzhu_img);
        wodeguanzhu_tv1=itemView.findViewById(R.id.wodeguanzhu_tv1);
        wodeguanzhu_tv2=itemView.findViewById(R.id.wodeguanzhu_tv2);
        wodeguanzhu_tv3=itemView.findViewById(R.id.wodeguanzhu_tv3);
    }
}
