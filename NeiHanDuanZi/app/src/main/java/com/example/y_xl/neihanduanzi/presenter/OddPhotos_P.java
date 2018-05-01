package com.example.y_xl.neihanduanzi.presenter;

import com.example.y_xl.neihanduanzi.model.OddPhotos_M;
import com.example.y_xl.neihanduanzi.presenter.interF.OddphotosP_I;
import com.example.y_xl.neihanduanzi.view.interF.Odd_photos_I;

/**
 * Created by 三年 on 2018/4/16.
 */

public class OddPhotos_P implements OddphotosP_I {


    private  Odd_photos_I odd_photos_i;
    private OddPhotos_M oddPhotosModel;

    public OddPhotos_P(Odd_photos_I odd_photos_i) {
        this.odd_photos_i=odd_photos_i;
        oddPhotosModel = new OddPhotos_M(this);
    }

    public void getdata(int page) {
        oddPhotosModel.getdata(page);
    }

    @Override
    public void success(String s) {
        odd_photos_i.success(s);
    }
}
