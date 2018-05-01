package com.example.y_xl.neihanduanzi.view.adapter;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.model.bean.VideoBeann;
import com.example.y_xl.neihanduanzi.view.activity.DetailsActivity;
import com.squareup.picasso.Picasso;
import java.util.List;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;
/**
 * Created by Administrator on 2018/4/19 0019.
 */
public class MyXAdapter extends RecyclerView.Adapter<MyHolder> /* implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener*/ {
    private MediaPlayer mediaPlayer;
    private  int curPosition=-1;
    int num=0;
    List<VideoBeann.DataBean> data;
   Context context;
    private boolean flage;
    private ImageView dz;
    private TextView count;
    private JCVideoPlayerStandard surfaceView;
    public MyXAdapter(List<VideoBeann.DataBean> data, Context context) {
        this.data = data;
        this.context = context;
    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View inflate = View.inflate(context, R.layout.item_view, null);
        MyHolder holder=new MyHolder(inflate);
        return holder;
    }
    @Override
    public void onBindViewHolder(final MyHolder holder, final int position) {
        if (data.get(position).getUser().getNickname()==null||data.get(position).getUser().getNickname()=="")
        {
            holder.titleTx.setText("游客");
        }
        else{
            holder.titleTx.setText(data.get(position).getUser().getNickname());
        }
        holder.contentTv.setText(data.get(position).getWorkDesc()+"");
//        holder.surfaceView.setUp(data.get(position).getVideoUrl(),surfaceView.SCREEN_LAYOUT_NORMAL, "你好，现在开始你的表演");
        Uri uri=Uri.parse(data.get(position).getCover());
//        holder.surfaceView.thumbImageView.setImageURI(uri);
        Picasso.with(context).load(data.get(position).getCover()).config(Bitmap.Config.RGB_565).into(holder.headIcon);
        holder.headIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(context, DetailsActivity.class);
                intent.putExtra("uid",data.get(position).getUid()+"");
                intent.putExtra("name",data.get(position).getUser().getNickname());
                intent.putExtra("icon",data.get(position).getCover());
                context.startActivity(intent);
            }
        });
        flage = true;
    }
    @Override
    public int getItemCount() {
        return data.size();
    }
}
