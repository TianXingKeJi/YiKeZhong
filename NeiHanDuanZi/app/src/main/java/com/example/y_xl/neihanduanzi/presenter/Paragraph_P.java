package com.example.y_xl.neihanduanzi.presenter;

import com.example.y_xl.neihanduanzi.model.Paragraph_M;
import com.example.y_xl.neihanduanzi.presenter.interF.ParagraphP_I;
import com.example.y_xl.neihanduanzi.view.activity.ParagraphActivity;
import com.example.y_xl.neihanduanzi.view.interF.paragraphV_I;

/**
 * Created by Y_xl on 2018/4/20.
 */

public class Paragraph_P implements ParagraphP_I{

    private final Paragraph_M paragraph_m;
    private final paragraphV_I paragraphV_i;

    public Paragraph_P(paragraphV_I paragraphV_i) {
        this.paragraphV_i = paragraphV_i;
        paragraph_m = new Paragraph_M(this);
    }

    public void getdata(String s) {
        paragraph_m.getdata(s);
    }

    @Override
    public void success(String s) {
        paragraphV_i.success(s);
    }
}
