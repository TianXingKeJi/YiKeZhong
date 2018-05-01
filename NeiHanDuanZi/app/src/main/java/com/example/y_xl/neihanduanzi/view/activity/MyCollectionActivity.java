package com.example.y_xl.neihanduanzi.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.example.y_xl.neihanduanzi.R;


public class MyCollectionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_wo_de_shou_cang);
    }

    public void activity_bt_bank(View view) {
        MyCollectionActivity.this.finish();
    }
}
