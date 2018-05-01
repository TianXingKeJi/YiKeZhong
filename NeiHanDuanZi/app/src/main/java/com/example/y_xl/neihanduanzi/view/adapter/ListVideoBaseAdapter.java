package com.example.y_xl.neihanduanzi.view.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.model.bean.VideoEntity;
import com.squareup.picasso.Picasso;

import java.io.IOException;

/**
 * Created by Administrator on 2018/4/14 0014.
 */
public class ListVideoBaseAdapter extends MBaseAdapter<VideoEntity.ItemsBean> implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener {
    private Context context;
    private MediaPlayer mediaPlayer;
    private int curPosition = -1;
    int num = 0;

    public ListVideoBaseAdapter(Context context) {
        super(context);
        this.context = context;
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setOnPreparedListener(this);
        mediaPlayer.setOnCompletionListener(this);
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = getInflater().inflate(R.layout.item_view, viewGroup, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = ((ViewHolder) convertView.getTag());
        }
//        viewHolder.titleTx.setText(getItem(i).getUser().getLogin());
        viewHolder.contentTv.setText(getItem(i).getContent());
        viewHolder.headIcon.setImageResource(R.mipmap.ic_launcher);
        Picasso.with(context).load(getItem(i).getPic_url()).config(Bitmap.Config.RGB_565).into(viewHolder.playIcon);

        if (viewHolder.playIcon.getTag() != null) {
            int pos = (int) viewHolder.playIcon.getTag();
            if (pos == curPosition && pos != i)//pos==curPosition表示：如果复用item出现了，则停止被复用的item的播放，这种其实不太好，如果离复用还有好几个item，就不会在第一时间停止播放
            {
                if (mediaPlayer.isPlaying()) {
                    mediaPlayer.stop();
                    curPosition = -1;
                }
            }
        }
        //视频和mediaplayer配置
        viewHolder.playIcon.setTag(i);
        if (curPosition == i) {
            viewHolder.playIcon.setVisibility(View.INVISIBLE);
            viewHolder.surfaceView.setVisibility(View.VISIBLE);
            mediaPlayer.reset();
            try {
//                mediaPlayer.setDisplay(viewHolder.surfaceView.getHolder());
                mediaPlayer.setDataSource(getItem(i).getHigh_url());
                mediaPlayer.prepareAsync();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            viewHolder.playIcon.setVisibility(View.VISIBLE);
            viewHolder.surfaceView.setVisibility(View.INVISIBLE);
        }
        return convertView;
    }

    @Override
    public void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
    }

    @Override
    public void onCompletion(MediaPlayer mediaPlayer) {
        curPosition = -1;
    }

    class ViewHolder implements View.OnClickListener {
        ImageView headIcon, playIcon, dz;
        TextView titleTx, contentTv, count;
        SurfaceView surfaceView;
        private boolean flage;

        public ViewHolder(View convertView) {
            this.dz = convertView.findViewById(R.id.item_dianzan);
            this.count = convertView.findViewById(R.id.item_count);
            this.headIcon = ((ImageView) convertView.findViewById(R.id.item_view_thumbId));
            this.playIcon = ((ImageView) convertView.findViewById(R.id.item_view_picId));
            this.titleTx = ((TextView) convertView.findViewById(R.id.item_view_loginId));
            this.contentTv = ((TextView) convertView.findViewById(R.id.item_view_contentId));
            this.surfaceView = ((SurfaceView) convertView.findViewById(R.id.item_view_surfaceViewId));
            playIcon.setOnClickListener(this);
            surfaceView.setOnClickListener(this);
            flage = true;
            dz.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(context, "我来啦！！", Toast.LENGTH_LONG).show();
                }
            });
        }

        @Override
        public void onClick(View view) {
            switch (view.getId()) {

                case R.id.item_view_picId:
                    view.setVisibility(View.INVISIBLE);
                    curPosition = (int) view.getTag();
                    break;
                case R.id.item_view_surfaceViewId:
                    if (mediaPlayer.isPlaying()) {
                        mediaPlayer.stop();
                        curPosition = -1;
                    }
                    break;
            }
            notifyDataSetChanged();
        }
    }
}
