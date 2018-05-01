package com.example.y_xl.neihanduanzi.view.fragment.tvfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.model.bean.Hot_video_bean;
import com.example.y_xl.neihanduanzi.presenter.Hot_video_P;
import com.example.y_xl.neihanduanzi.view.adapter.HotAdapter;
import com.example.y_xl.neihanduanzi.view.interF.Hot_videoV_I;
import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Y_xl on 2018/4/14.
 */

public class Hot_fragment extends Fragment implements Hot_videoV_I {

    private int page;
    private XRecyclerView hot_fragment_xrecycler;
    List<Hot_video_bean.DataBean> list = new ArrayList<>();
    private Hot_video_P hot_video_p;
    private HotAdapter hotAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.hot_fragment_layout, container, false);
        initView(view);

        hot_fragment_xrecycler.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                list.clear();
                //首先获取数据
                hot_video_p.getdata(1);
                hot_fragment_xrecycler.refreshComplete();
            }

            @Override
            public void onLoadMore() {
                // load more data here
                page++;
                hot_video_p.getdata(page);
                hot_fragment_xrecycler.loadMoreComplete();
            }
        });

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();

        //首先获取数据
        list.clear();
        hot_video_p = new Hot_video_P(this);
        hot_video_p.getdata(1);
    }

    @Override
    public void success(String s) {
        //获取到数据   解析展示
        Hot_video_bean hot_video_bean = new Gson().fromJson(s, Hot_video_bean.class);
        List<Hot_video_bean.DataBean> data = hot_video_bean.getData();
        list.addAll(data);

        //布局管理器
        setadapter();

    }

    //设置适配器
    private void setadapter() {
        if (hotAdapter == null) {
            hotAdapter = new HotAdapter(getActivity(), list);
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
            hot_fragment_xrecycler.setLayoutManager(staggeredGridLayoutManager);
            hot_fragment_xrecycler.setAdapter(hotAdapter);
        } else {
            hotAdapter.notifyDataSetChanged();
        }


    }

    private void initView(View view) {
        hot_fragment_xrecycler = (XRecyclerView) view.findViewById(R.id.hot_fragment_xrecycler);

    }
}
