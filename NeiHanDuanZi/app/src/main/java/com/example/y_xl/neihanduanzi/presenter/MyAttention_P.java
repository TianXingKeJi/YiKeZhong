package com.example.y_xl.neihanduanzi.presenter;

import com.example.y_xl.neihanduanzi.model.MyAttention_M;
import com.example.y_xl.neihanduanzi.model.bean.MyAttentionBean;
import com.example.y_xl.neihanduanzi.view.interF.MyAttention_V_I;


/**
 * Created by lenovo on 2018/4/17.
 */

public class MyAttention_P implements MyAttention_P_I {

    private MyAttention_V_I woDeGuanZhu_v_i;
    private MyAttention_M woDeGuanZhu_m;
    public MyAttention_P(MyAttention_V_I woDeGuanZhu_v_i){
        this.woDeGuanZhu_v_i=woDeGuanZhu_v_i;
        woDeGuanZhu_m=new MyAttention_M(this);
    }

    public void getData(String wodeguanzhu_utils){
        woDeGuanZhu_m.getData(wodeguanzhu_utils);
    }
    @Override
    public void success(MyAttentionBean woDeGuanZhuBean) {
        woDeGuanZhu_v_i.success(woDeGuanZhuBean);
    }
}
