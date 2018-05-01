package com.example.y_xl.neihanduanzi.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.y_xl.neihanduanzi.R;

import cn.sharesdk.onekeyshare.OnekeyShare;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

public class VideoActivity extends AppCompatActivity {

    private JCVideoPlayerStandard jiecao_Player;
    boolean flag = false;
    private Button Primordial;
    private Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        initView();

        String videoUrl = getIntent().getStringExtra("videoUrl");

        jiecao_Player.setUp(videoUrl, jiecao_Player.SCREEN_LAYOUT_NORMAL);
    }

    private void initView() {
        jiecao_Player = (JCVideoPlayerStandard) findViewById(R.id.jiecao_Player);
        Primordial = (Button) findViewById(R.id.Primordial);
        share =(Button)findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(VideoActivity.this,"123",Toast.LENGTH_SHORT).show();
                share();
            }
        });
    }

    private void share() {
        OnekeyShare oks = new OnekeyShare();
//关闭sso授权
        oks.disableSSOWhenAuthorize();

// title标题，印象笔记、邮箱、信息、微信、人人网和QQ空间等使用
        oks.setTitle("标题");
// titleUrl是标题的网络链接，QQ和QQ空间等使用
        oks.setTitleUrl("http://sharesdk.cn");
// text是分享文本，所有平台都需要这个字段
        oks.setText("我是分享文本");
// imagePath是图片的本地路径，Linked-In以外的平台都支持此参数
//oks.setImagePath("/sdcard/test.jpg");//确保SDcard下面存在此张图片
// url仅在微信（包括好友和朋友圈）中使用
        oks.setUrl("http://sharesdk.cn");
// comment是我对这条分享的评论，仅在人人网和QQ空间使用
        oks.setComment("我是测试评论文本");
// site是分享此内容的网站名称，仅在QQ空间使用
        oks.setSite(getString(R.string.app_name));
// siteUrl是分享此内容的网站地址，仅在QQ空间使用
        oks.setSiteUrl("http://sharesdk.cn");

// 启动分享GUI
        oks.show(this);

    }

    //点小心心
    public void Primordial(View view) {
        if (flag) {
            Primordial.setBackgroundDrawable(getResources().getDrawable(R.drawable.raw_1499933216));
            flag = false;
        } else {
            Primordial.setBackgroundDrawable(getResources().getDrawable(R.drawable.raw_1499933215));
            flag = true;
        }

    }

}
