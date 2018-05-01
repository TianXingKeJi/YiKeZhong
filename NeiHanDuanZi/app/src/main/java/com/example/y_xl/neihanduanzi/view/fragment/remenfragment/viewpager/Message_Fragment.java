package com.example.y_xl.neihanduanzi.view.fragment.remenfragment.viewpager;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.model.bean.Message_bean;
import com.example.y_xl.neihanduanzi.presenter.MessagePresenter;
import com.example.y_xl.neihanduanzi.view.adapter.MessageAdapter;
import com.example.y_xl.neihanduanzi.view.interF.MessageMain_I;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;


/**
 * Created by lenovo on 2018/4/14.
 */

public class Message_Fragment extends Fragment implements MessageMain_I{

    private View view;
    private RecyclerView fragment_message_recycler;
    private MessageAdapter messageAdapter;
    private MessagePresenter messagePresenter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_message_layout, container, false);
        initView();
        messagePresenter=new MessagePresenter(this);
        messagePresenter.getMessageData();
        return view;
    }

    private void initView() {
        fragment_message_recycler=view.findViewById(R.id.fragment_message_recycler);
    }

    @Override
    public void success(final Message_bean message_bean) {

        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Message_bean.DataBean data = message_bean.getData();
                List<Message_bean.DataBean.EssayBean> essay = data.getEssay();
                fragment_message_recycler.setLayoutManager(new LinearLayoutManager(getActivity(), OrientationHelper.VERTICAL,false));

                messageAdapter=new MessageAdapter(getActivity(),essay);
                fragment_message_recycler.setAdapter(messageAdapter);
            }
        });
    }
}
