package com.example.y_xl.neihanduanzi.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.example.y_xl.neihanduanzi.R;

import java.util.Timer;
import java.util.TimerTask;


public class LogoActivity extends AppCompatActivity {

    private Timer timer;
    private int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //隐藏标题栏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        // 隐藏状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i = 3;

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (i == 0) {
                    //停止
                    timer.cancel();
                    Intent intent = new Intent(LogoActivity.this, HomeActivity.class);
                    finish();
                    startActivity(intent);

                } else {
                    i--;
                }
            }
        }, 0, 1000);
    }
}
