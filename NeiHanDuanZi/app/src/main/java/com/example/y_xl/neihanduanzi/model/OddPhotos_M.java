package com.example.y_xl.neihanduanzi.model;

import com.example.y_xl.neihanduanzi.presenter.interF.OddphotosP_I;
import com.example.y_xl.neihanduanzi.utils.BaseObserver;
import com.example.y_xl.neihanduanzi.utils.My_api;
import com.example.y_xl.neihanduanzi.utils.RetrofitAndOkHttpAndRxAndroid;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 三年 on 2018/4/16.
 */

public class OddPhotos_M {
    private OddphotosP_I odd_photos_p;

    public OddPhotos_M(OddphotosP_I odd_photos_p) {
        this.odd_photos_p=odd_photos_p;
    }

    public void getdata(int page) {
        Map<String, String> map=new HashMap<>();
        map.put("page", String.valueOf(page));
        map.put("source","android");
        map.put("appVersion","1");
        RetrofitAndOkHttpAndRxAndroid.get(My_api.Odd_photos_api,map).subscribe(new BaseObserver() {
            @Override
            public void onSuccess(String result) {
                odd_photos_p.success(result);

            }
        });

    }
}
