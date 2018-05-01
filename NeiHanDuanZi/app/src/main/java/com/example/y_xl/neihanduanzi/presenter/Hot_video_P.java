package com.example.y_xl.neihanduanzi.presenter;

import com.example.y_xl.neihanduanzi.model.Hot_video_M;
import com.example.y_xl.neihanduanzi.presenter.interF.Hot_videoP_I;
import com.example.y_xl.neihanduanzi.view.interF.Hot_videoV_I;

/**
 * Created by Y_xl on 2018/4/15.
 */

public class Hot_video_P implements Hot_videoP_I {

    private final Hot_video_M hot_video_m;
    private final Hot_videoV_I hot_videoV_i;

    public Hot_video_P(Hot_videoV_I hot_videoV_i) {
        hot_video_m = new Hot_video_M(this);
        this.hot_videoV_i = hot_videoV_i;
    }

    public void getdata(int page) {
        hot_video_m.getdata(page);
    }

    @Override
    public void success(String s) {
        hot_videoV_i.success(s);
    }
}
