package com.example.y_xl.neihanduanzi.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.y_xl.neihanduanzi.R;

public class CreateActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView;
    private ImageView videoView;
    private ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        initView();

        imageView.setOnClickListener(this);
        videoView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
    }

    private void initView() {
        imageView = (ImageView) findViewById(R.id.imageView);
        videoView = (ImageView) findViewById(R.id.videoView);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageView:
                Intent intent=new Intent(this,CameraActivity.class);
                startActivity(intent);
                break;
            case R.id.videoView:
                Intent intenta=new Intent(this,RecordingActivity.class);
                startActivity(intenta);
                break;
             case R.id.imageView2:
                 Intent intentb=new Intent(this,ParagraphActivity.class);
                 startActivity(intentb);
                 finish();
                 break;
        }
    }
}
