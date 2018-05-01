package com.example.y_xl.neihanduanzi.model;

import com.example.y_xl.neihanduanzi.presenter.interF.ParagraphP_I;
import com.example.y_xl.neihanduanzi.utils.BaseObserver;
import com.example.y_xl.neihanduanzi.utils.My_api;
import com.example.y_xl.neihanduanzi.utils.RetrofitAndOkHttpAndRxAndroid;

import java.util.HashMap;

/**
 * Created by Y_xl on 2018/4/20.
 */

public class Paragraph_M {

    private final ParagraphP_I paragraph_p;

    public Paragraph_M(ParagraphP_I paragraph_p) {
      this.paragraph_p =paragraph_p;
    }

    public void getdata(String s) {
        HashMap<String, String> map = new HashMap<>();
        map.put("uid","13315");
        map.put("content",s);
        map.put("token","CA0472E4E3D63DCE47F388F778CA6C17");
        map.put("source","android");
        map.put("appVersion","3");
        RetrofitAndOkHttpAndRxAndroid.post(My_api.add_content,map).subscribe(new BaseObserver() {
            @Override
            public void onSuccess(String result) {
                paragraph_p.success(result);
            }
        });
    }
}
