package com.example.y_xl.neihanduanzi.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.example.y_xl.neihanduanzi.R;

public class PersonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);

        //获取当前用户的作品集  需要传过来的值
        Toast.makeText(PersonActivity.this, "正在开发！！", Toast.LENGTH_SHORT).show();
    }
}
