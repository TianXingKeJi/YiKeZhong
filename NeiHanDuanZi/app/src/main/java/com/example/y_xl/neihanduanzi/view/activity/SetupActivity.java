package com.example.y_xl.neihanduanzi.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.example.y_xl.neihanduanzi.R;


public class SetupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //隐藏标题栏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_she_zhi);

    }

    public void activity_bt_bank(View view) {
        SetupActivity.this.finish();
    }
}
