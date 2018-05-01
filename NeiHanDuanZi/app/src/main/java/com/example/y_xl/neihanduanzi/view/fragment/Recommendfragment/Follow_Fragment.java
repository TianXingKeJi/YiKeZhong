package com.example.y_xl.neihanduanzi.view.fragment.Recommendfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.model.bean.VideoBeann;
import com.example.y_xl.neihanduanzi.utils.BaseObserver;
import com.example.y_xl.neihanduanzi.utils.RetrofitAndOkHttpAndRxAndroid;
import com.example.y_xl.neihanduanzi.view.adapter.MyXAdapter;
import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.List;
/**
 * Created by Administrator on 2018/4/17 0017.
 */
public class Follow_Fragment extends Fragment {
    private XRecyclerView listView;
    List<VideoBeann.DataBean> data ;

    int k;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View inflate = inflater.inflate(R.layout.fragment_guanzhu_layout, container, false);
        listView = ((XRecyclerView)inflate. findViewById(R.id.list1));

        loadData();
        return inflate;
    }
    private void loadData() {
        RetrofitAndOkHttpAndRxAndroid.get("https://www.zhaoapi.cn/quarter/getVideos?uid=12436&source=android&appVersion=3&page=2").subscribe(new BaseObserver() {



            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();


                final VideoBeann videoBeann = gson.fromJson(result, VideoBeann.class);
                data = videoBeann.getData();





                listView.setLayoutManager(new LinearLayoutManager(getContext()));
                MyXAdapter adapter=new MyXAdapter(data,getContext());
                listView.setAdapter(adapter);
                listView.setLoadingListener(new XRecyclerView.LoadingListener() {
                    @Override
                    public void onRefresh() {
                        RetrofitAndOkHttpAndRxAndroid.get("https://www.zhaoapi.cn/quarter/getVideos?uid=12436&source=android&appVersion=3&page=2").subscribe(new BaseObserver() {
                            @Override
                            public void onSuccess(String result) {
                                Gson gson = new Gson();
                                final VideoBeann videoBeann = gson.fromJson(result, VideoBeann.class);
                                final List<VideoBeann.DataBean> data = videoBeann.getData();
                                data.clear();
                                fresh();
                                listView.refreshComplete();
                            }
                        });
                    }
                    @Override
                    public void onLoadMore() {
                        listView.loadMoreComplete();
                    }
                });
            }
        });
    }
    public void fresh(){
        RetrofitAndOkHttpAndRxAndroid.get("https://www.zhaoapi.cn/quarter/getVideos?uid=12436&source=android&appVersion=3&page="+k+3+"").subscribe(new BaseObserver() {
            @Override
            public void onSuccess(String result) {
                Gson gson = new Gson();
                final VideoBeann videoBeann = gson.fromJson(result, VideoBeann.class);
                final List<VideoBeann.DataBean> data = videoBeann.getData();

                k+=1;
                listView.setLayoutManager(new LinearLayoutManager(getContext()));
                MyXAdapter adapter=new MyXAdapter(data,getContext());
                listView.setAdapter(adapter);
                listView.refreshComplete();
            }
        });
    }
}
