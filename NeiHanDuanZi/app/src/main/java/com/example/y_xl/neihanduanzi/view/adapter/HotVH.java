package com.example.y_xl.neihanduanzi.view.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.y_xl.neihanduanzi.R;
import com.facebook.drawee.view.SimpleDraweeView;
import com.getbase.floatingactionbutton.FloatingActionsMenu;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

/**
 * Created by Y_xl on 2018/4/15.
 */

public class HotVH extends XRecyclerView.ViewHolder {

    public  ImageView hot_child_image;
    public   SimpleDraweeView odd_photos_simp;
    public  TextView odd_photos_text;
    public   TextView odd_photos_time;
    public   SimpleDraweeView odd_photos_simp1;
    public FloatingActionsMenu floating;
    public HotVH(View itemView) {
        super(itemView);

        hot_child_image = itemView.findViewById(R.id.hot_child_image);
         odd_photos_simp = itemView.findViewById(R.id.odd_photos_simpleDraweeView);
         odd_photos_text = itemView.findViewById(R.id.odd_photos_text);
         odd_photos_time = itemView.findViewById(R.id.odd_photos_time);
        odd_photos_simp1 = itemView.findViewById(R.id.odd_photos_simpleDraweeView1);
         floating = itemView.findViewById(R.id.floating);

    }
}
