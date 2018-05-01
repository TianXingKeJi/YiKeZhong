package com.example.y_xl.neihanduanzi.view.adapter;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.model.bean.Odd_photos_bean;

import java.net.URI;
import java.util.List;

/**
 * Created by 三年 on 2018/4/16.
 */

public class OddPhotosAdapter extends RecyclerView.Adapter<HotVH> {
    private  List<Odd_photos_bean.DataBean> list;
    private  Context context;
    private Uri uri;

    public OddPhotosAdapter(Context context, List<Odd_photos_bean.DataBean> list) {
        this.context=context;
        this.list=list;
    }

    @Override
    public HotVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=View.inflate(context, R.layout.odd_photos_item,null);
        HotVH hotVH=new HotVH(view);
        return hotVH;
    }

    @Override
    public void onBindViewHolder(HotVH holder, int position) {
        /*String[] split = data.get(position).getImgUrls().split("\\|");
        final Uri uri= Uri.parse(split[0]);*/
       // Log.d("aaa", "onBindViewHolder: "+split[0]);
        if (list.get(position).getImgUrls()==null||list.get(position).getImgUrls().isEmpty()||list.get(position).getImgUrls()==""){

            holder.odd_photos_simp.setImageURI("https://www.zhaoapi.cn/images/quarter/1523860346693ic_launcher.png");
        }else {
            String[] split = list.get(position).getImgUrls().split("\\|");
            holder.odd_photos_simp.setImageURI(split[0]);
         }
        holder.odd_photos_text.setText(list.get(position).getContent());
        holder.odd_photos_time.setText(list.get(position).getCreateTime());
        Odd_photos_bean.DataBean.UserBean user = list.get(position).getUser();
        holder.odd_photos_simp1.setImageURI(user.getIcon());
        holder.floating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(context,).show();
            }
        });

    }
    @Override
    public int getItemCount() {
        return list.size();
    }
}
