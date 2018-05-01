package com.example.y_xl.neihanduanzi.presenter;

import android.support.v4.app.FragmentActivity;

import com.example.y_xl.neihanduanzi.model.MessageModel;
import com.example.y_xl.neihanduanzi.model.bean.Message_bean;
import com.example.y_xl.neihanduanzi.presenter.interF.MessagePresenter_I;
import com.example.y_xl.neihanduanzi.view.interF.MessageMain_I;

/**
 * Created by lenovo on 2018/4/23.
 */

public class MessagePresenter implements MessagePresenter_I {

    private MessageMain_I messageMain_i;
    private MessageModel messageModel;
    public MessagePresenter(MessageMain_I messageMain_i){
        this.messageMain_i=messageMain_i;
        messageModel=new MessageModel(this);
    }
    public void getMessageData(){
        messageModel.getMessageData();
    }
    @Override
    public void success(Message_bean message_bean) {
        messageMain_i.success(message_bean);
    }
}
