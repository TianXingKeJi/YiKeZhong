package com.example.y_xl.neihanduanzi.presenter;

import com.example.y_xl.neihanduanzi.model.CollectModel;
import com.example.y_xl.neihanduanzi.presenter.interF.Collect_P;
import com.example.y_xl.neihanduanzi.view.interF.Collect_I;

/**
 * Created by 三年 on 2018/4/23.
 */

public class CollectPresenter implements Collect_P{
    private  Collect_I collect_i;
    private  CollectModel collectModel;

    public CollectPresenter(Collect_I collect_i) {
        this.collect_i=collect_i;
        collectModel = new CollectModel(this);
    }

    public void getData(String collect_url) {
        collectModel.getData(collect_url);
    }

    @Override
    public void success(String s) {
        collect_i.success(s);
    }
}
