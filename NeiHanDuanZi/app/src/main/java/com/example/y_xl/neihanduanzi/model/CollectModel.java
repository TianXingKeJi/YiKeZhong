package com.example.y_xl.neihanduanzi.model;

import com.example.y_xl.neihanduanzi.presenter.CollectPresenter;
import com.example.y_xl.neihanduanzi.presenter.interF.Collect_P;
import com.example.y_xl.neihanduanzi.utils.BaseObserver;
import com.example.y_xl.neihanduanzi.utils.RetrofitAndOkHttpAndRxAndroid;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 三年 on 2018/4/23.
 */

public class CollectModel {
    private  Collect_P collect_p;

    public CollectModel(Collect_P collect_p) {
        this.collect_p=collect_p;
    }

    public void getData(String collect_url) {
        Map<String, String> map=new HashMap<>();
        map.put("uid", String.valueOf(13315));
        map.put("token","CA0472E4E3D63DCE47F388F778CA6C17");
        map.put("source","android");
        map.put("appVersion","1");
        RetrofitAndOkHttpAndRxAndroid.get(collect_url,map).subscribe(new BaseObserver() {
            @Override
            public void onSuccess(String result) {
                collect_p.success(result);
            }
        });
    }
}
