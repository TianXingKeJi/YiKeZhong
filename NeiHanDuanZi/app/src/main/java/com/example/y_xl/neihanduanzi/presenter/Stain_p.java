package com.example.y_xl.neihanduanzi.presenter;

import android.util.Log;

import com.example.y_xl.neihanduanzi.model.Stain_m;
import com.example.y_xl.neihanduanzi.presenter.interF.stainP_I;
import com.example.y_xl.neihanduanzi.view.interF.Stain_I;

/**
 * Created by xm7 on 2018/4/18.
 */

public class Stain_p implements stainP_I {
    private final Stain_m stain_m;
    private final Stain_I imoder;

    public Stain_p(Stain_I imoder) {

        stain_m = new Stain_m(this);
        this.imoder = imoder;
    }

    public void getdata(int page) {
        stain_m.getdata(page);
        Log.d("ddd", "123: ");
    }
    public void success(String s) {
        imoder.success(s);

    }
}
