package com.example.y_xl.neihanduanzi.model;


import com.example.y_xl.neihanduanzi.model.bean.MyAttentionBean;
import com.example.y_xl.neihanduanzi.presenter.MyAttention_P_I;
import com.example.y_xl.neihanduanzi.utils.OkHttp3Util;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;


/**
 * Created by lenovo on 2018/4/17.
 */

public class MyAttention_M {

    private MyAttention_P_I woDeGuanZhu_p_i;

    public MyAttention_M(MyAttention_P_I woDeGuanZhu_p_i){
        this.woDeGuanZhu_p_i=woDeGuanZhu_p_i;
    }
    public void getData(String wodeguanzhu_utils){
//        Map map=new HashMap();
//        map.put("uid","13315");
//        map.put("source","android");
//        map.put("appVersion","3");
//        map.put("token","CA0472E4E3D63DCE47F388F778CA6C17");
//        Retrofit retrofit=new Retrofit.Builder()
//                .baseUrl("https://www.zhaoapi.cn")
//                .build();
//        MyServerInterface myServerInterface = retrofit.create(MyServerInterface.class);
//        myServerInterface.getcall(13315,"android","CA0472E4E3D63DCE47F388F778CA6C17",3).subscribeOn(Schedulers.io())
//        .observeOn(AndroidSchedulers.mainThread())
//        .subscribe(new Subscriber<MyAttentionBean>() {
//            @Override
//            public void onCompleted() {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onNext(MyAttentionBean woDeGuanZhuBean) {
//
//                if(woDeGuanZhuBean!=null){
//                    woDeGuanZhu_p_i.success(woDeGuanZhuBean);
//                }
//            }
//        });
//        Map<String,String> map=new HashMap<>();
//        map.put("uid","13315");
//        map.put("source","android");
//        map.put("token","CA0472E4E3D63DCE47F388F778CA6C17");
//        map.put("appVersion","3");
//        OkHttp3Util.doPost(wodeguanzhu_utils, map, new Callback() {
//            @Override
//            public void onFailure(Call call, IOException e) {
//                Log.d("TAG","++++++"+e);
//            }
//
//            @Override
//            public void onResponse(Call call, Response response) throws IOException {
//
//                if(response.isSuccessful()){
//                    String json = response.body().string();
//                    MyAttentionBean woDeGuanZhuBean = new Gson().fromJson(json, MyAttentionBean.class);
//                    List<MyAttentionBean.DataBean> data = woDeGuanZhuBean.getData();
//                    Log.d("TAG",""+data.get(0).getCreatetime());
//
//                    for(int i=0;i<data.size();i++){
//                        createtime = data.get(i).getCreatetime();
//                    }
//
//                    woDeGuanZhu_p_i.success(woDeGuanZhuBean);
//                    Log.d("TAG","++++++"+createtime);
//                }
//
//            }
//        });
        Map<String,String> map=new HashMap<>();
        map.put("pageSize",10+"");
        map.put("page",1+"");
        OkHttp3Util.doPost(wodeguanzhu_utils, map, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if(response.isSuccessful()){
                    String json = response.body().string();
                    MyAttentionBean woDeGuanZhuBean = new Gson().fromJson(json, MyAttentionBean.class);
                    woDeGuanZhu_p_i.success(woDeGuanZhuBean);
                }
            }
        });

    }
}
