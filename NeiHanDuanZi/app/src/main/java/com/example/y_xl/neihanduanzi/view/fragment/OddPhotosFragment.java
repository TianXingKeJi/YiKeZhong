package com.example.y_xl.neihanduanzi.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.model.bean.Odd_photos_bean;
import com.example.y_xl.neihanduanzi.presenter.OddPhotos_P;
import com.example.y_xl.neihanduanzi.view.adapter.OddPhotosAdapter;
import com.example.y_xl.neihanduanzi.view.interF.Odd_photos_I;
import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Y_xl on 2018/4/16.
 */

public class OddPhotosFragment extends Fragment implements Odd_photos_I {


    private XRecyclerView xrecyclerView;
    private OddPhotos_P oddPhotosPresenter;
    private int page = 1;
    private OddPhotosAdapter adapter;
    private List<Odd_photos_bean.DataBean> list=new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.oddphotos_fragment_layout, container, false);
        initView(view);
        xrecyclerView.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                list.clear();
                //首先获取数据
                oddPhotosPresenter.getdata(1);
                xrecyclerView.refreshComplete();
            }

            @Override
            public void onLoadMore() {
                // load more data here
                page++;
                oddPhotosPresenter.getdata(page);
                xrecyclerView.loadMoreComplete();
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onResume() {
        super.onResume();
        list.clear();
        oddPhotosPresenter = new OddPhotos_P(this);
        oddPhotosPresenter.getdata(page);
    }

    private void initView(View view) {
        xrecyclerView = (XRecyclerView) view.findViewById(R.id.xrecyclerView);
    }

    @Override
    public void success(String s) {
        Odd_photos_bean bean = new Gson().fromJson(s, Odd_photos_bean.class);
        Log.d("aaa", "success: "+bean.getCode());
        list.addAll(bean.getData());
        setadapter();
    }

    private void setadapter() {
        if (adapter == null) {
            xrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
            adapter = new OddPhotosAdapter(getActivity(), list);
            xrecyclerView.setAdapter(adapter);
        } else {
            adapter.notifyDataSetChanged();
        }
    }
}
