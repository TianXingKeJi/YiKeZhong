package com.example.y_xl.neihanduanzi.view.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;


import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.model.bean.MyAttentionBean;
import com.example.y_xl.neihanduanzi.presenter.MyAttention_P;
import com.example.y_xl.neihanduanzi.utils.My_api;
import com.example.y_xl.neihanduanzi.view.adapter.MyAttention_Recycler_Adapter;
import com.example.y_xl.neihanduanzi.view.interF.MyAttention_OnClick;
import com.example.y_xl.neihanduanzi.view.interF.MyAttention_V_I;

import java.util.List;

public class MyAttentionActivity extends AppCompatActivity implements MyAttention_V_I, MyAttention_OnClick {

        private TextView activity_tv_wodeguanzhu;
    private RecyclerView activity_recycler_wodeguanzhu;
    private MyAttention_Recycler_Adapter woDeGuanZhu_recycler_adapter;
    private MyAttention_P woDeGuanZhu_p;
    private List<MyAttentionBean.DataBean> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //隐藏标题栏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wo_de_guan_zhu);

        initView();
        getReMenGuanZhu();
        woDeGuanZhu_p = new MyAttention_P(this);
        woDeGuanZhu_p.getData(My_api.wodeguanzhu_utils);
    }

    //跳转到热门关注页面
    public void getReMenGuanZhu() {
        activity_tv_wodeguanzhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyAttentionActivity.this, HotAttentionActivity.class);
                startActivity(intent);
            }
        });
    }

    //初始化组件
    private void initView() {
        activity_tv_wodeguanzhu = findViewById(R.id.activity_tv_wodeguanzhu);
        activity_recycler_wodeguanzhu = findViewById(R.id.activity_recycler_wodeguanzhu);
    }

    //返回上一个页面
    public void activity_bt_bank(View view) {
        MyAttentionActivity.this.finish();
    }

    @Override
    public void success(final MyAttentionBean woDeGuanZhuBean) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                data = woDeGuanZhuBean.getData();
                activity_recycler_wodeguanzhu.setLayoutManager(new LinearLayoutManager(MyAttentionActivity.this, LinearLayoutManager.VERTICAL, false));
                woDeGuanZhu_recycler_adapter = new MyAttention_Recycler_Adapter(MyAttentionActivity.this, data);
                activity_recycler_wodeguanzhu.setAdapter(woDeGuanZhu_recycler_adapter);
                woDeGuanZhu_recycler_adapter.setWoDeGuanZhu_onClick(MyAttentionActivity.this);
            }
        });
    }

    @Override
    public void setPosition(int position) {
        Toast.makeText(MyAttentionActivity.this, "~点击~", Toast.LENGTH_SHORT).show();
    }
}
