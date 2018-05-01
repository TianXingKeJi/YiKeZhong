package com.example.y_xl.neihanduanzi.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.y_xl.neihanduanzi.R;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/**
 * Created by Administrator on 2018/4/19 0019.
 */

public class MyHolder extends RecyclerView.ViewHolder {
  public   ImageView headIcon, playIcon,dz;
    public TextView titleTx, contentTv,count;
    public JCVideoPlayerStandard surfaceView;
    public boolean flage;
    public MyHolder(View itemView) {
        super(itemView);
        this.dz=itemView.findViewById(R.id.item_dianzan);
        this.count=itemView.findViewById(R.id.item_count);
        this.headIcon = ((ImageView) itemView.findViewById(R.id.item_view_thumbId));
        this.playIcon = ((ImageView) itemView.findViewById(R.id.item_view_picId));
        this.titleTx = ((TextView) itemView.findViewById(R.id.item_view_loginId));
        this.contentTv = ((TextView) itemView.findViewById(R.id.item_view_contentId));
       // this.surfaceView = ((JCVideoPlayerStandard) itemView.findViewById(R.id.surfaceView));
    }
}
