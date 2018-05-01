package com.example.y_xl.neihanduanzi.model;

import com.example.y_xl.neihanduanzi.presenter.interF.Hot_videoP_I;
import com.example.y_xl.neihanduanzi.utils.BaseObserver;
import com.example.y_xl.neihanduanzi.utils.My_api;
import com.example.y_xl.neihanduanzi.utils.RetrofitAndOkHttpAndRxAndroid;

import java.util.HashMap;

/**
 * Created by Y_xl on 2018/4/15.
 */

public class Hot_video_M {

    private final Hot_videoP_I hot_videoP_i;

    public Hot_video_M(Hot_videoP_I hot_videoP_i) {
        this.hot_videoP_i = hot_videoP_i;
    }

    public void getdata(int page) {
        HashMap<String, String> map = new HashMap<>();
        map.put("page", page + "");
        map.put("token", "CA0472E4E3D63DCE47F388F778CA6C17");
        map.put("source", "android");
        map.put("appVersion", "101");
                                           //接口
        RetrofitAndOkHttpAndRxAndroid.post(My_api.Hot_video_api, map).subscribe(new BaseObserver() {
            @Override
            public void onSuccess(String result) {
//                Log.d("TAG", result + "");
                hot_videoP_i.success(result);
            }
        });

    }
}
