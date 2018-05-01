package com.example.y_xl.neihanduanzi.view.fragment.remenfragment.viewpager;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.y_xl.neihanduanzi.R;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;


/**
 * Created by lenovo on 2018/4/14.
 */

public class Private_Letter_Fragment extends Fragment {

    private SimpleDraweeView fragment_private_letter_img;
    private String uri="http://img5.duitang.com/uploads/item/201411/29/20141129013744_UJEuu.gif";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_private_letter_layout, container, false);
        fragment_private_letter_img=view.findViewById(R.id.fragment_private_letter_img);
        getGifImage();
        return view;
    }

    private void getGifImage() {

        DraweeController mDraweeController = Fresco.newDraweeControllerBuilder()
                .setAutoPlayAnimations(true)
//加载drawable里的一张gif图
                .setUri(Uri.parse(uri))//设置uri
                .build();
//设置Controller
        fragment_private_letter_img.setController(mDraweeController);
    }
}
