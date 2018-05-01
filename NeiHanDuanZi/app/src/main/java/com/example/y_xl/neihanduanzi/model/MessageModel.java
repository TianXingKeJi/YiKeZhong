package com.example.y_xl.neihanduanzi.model;

import android.util.Log;

import com.example.y_xl.neihanduanzi.model.bean.Message_bean;
import com.example.y_xl.neihanduanzi.presenter.interF.MessagePresenter_I;
import com.example.y_xl.neihanduanzi.utils.ApiService;
import com.google.gson.Gson;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;


import java.io.IOException;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.Subject;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


/**
 * Created by lenovo on 2018/4/23.
 */

public class MessageModel {

    private MessagePresenter_I messagePresenter_i;

    public MessageModel(MessagePresenter_I messagePresenter_i) {
        this.messagePresenter_i = messagePresenter_i;
    }

    public void getMessageData() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://v3.wufazhuce.com:8000/api/reading/index/?version=3.5.0&platform=android")
                .build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                if(response.isSuccessful()){
                    String json = response.body().string();
                    Message_bean message_bean = new Gson().fromJson(json, Message_bean.class);
                    messagePresenter_i.success(message_bean);
                }
            }
        });
    }
}
