package com.example.y_xl.neihanduanzi.model;

import android.util.Log;

import com.example.y_xl.neihanduanzi.presenter.Stain_p;
import com.example.y_xl.neihanduanzi.utils.BaseObserver;
import com.example.y_xl.neihanduanzi.utils.RetrofitAndOkHttpAndRxAndroid;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xm7 on 2018/4/18.
 */

public class Stain_m {
    private final Stain_p stain_p;

    public Stain_m(Stain_p stain_p) {
        this.stain_p = stain_p;
        Log.d("xxxx", "123: ");
    }

    public void getdata(int page) {
        Map<String,String> map=new HashMap<>();
        map.put("page", "1");/*String.valueOf(1)*/
        map.put("source","android");
        map.put("appVersion","1");
        RetrofitAndOkHttpAndRxAndroid.get("https://www.zhaoapi.cn/quarter/getJokes",map).subscribe(new BaseObserver() {
            @Override
            public void onSuccess(String result) {
                Log.d("zzzzz", "1234: "+result);
                stain_p.success(result);




            }

            @Override
            public void onError(Throwable e) {
                super.onError(e);
                Log.d("zzzzz", "12: "+e);
            }
        });
    }


}
