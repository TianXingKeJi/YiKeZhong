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
import com.example.y_xl.neihanduanzi.model.bean.Satin_bean;
import com.example.y_xl.neihanduanzi.presenter.Stain_p;
import com.example.y_xl.neihanduanzi.view.adapter.StainAdapter;
import com.example.y_xl.neihanduanzi.view.interF.Stain_I;
import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Y_xl on 2018/4/13.
 */


    public class SatinFragment extends Fragment implements Stain_I {
        private Stain_p stain_p;
        private XRecyclerView recy_x;
        private int page;
        private StainAdapter adapter;
        @Nullable
        List<Satin_bean.DataBean> list = new ArrayList<>();
        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.satin_fragment_layout, container, false);
            recy_x = (XRecyclerView) view.findViewById(R.id.recy_x);
            initView(view);
            list.clear();

            recy_x.setLoadingListener(new XRecyclerView.LoadingListener() {
                @Override
                public void onRefresh() {
                    list.clear();
                    //首先获取数据
                    stain_p.getdata(1);
                    recy_x.refreshComplete();
                }

                @Override
                public void onLoadMore() {
                    // load more data here
                    page++;
                    stain_p.getdata(page);
                    recy_x.loadMoreComplete();
                }
            });


            return view;
        }


        public void onResume() {
            super.onResume();

            //首先获取数据
            list.clear();
            stain_p=new Stain_p(this);
            stain_p.getdata(1);
        }
        public void success(String s) {
            //获取到数据   解析展示
            Log.d("zzzzz", "1234: ");
            Satin_bean bean = new Gson().fromJson(s, Satin_bean.class);

            List<Satin_bean.DataBean> data = bean.getData();
            list.addAll(data);

            //布局管理器
            setadapter();

        }

        private void setadapter() {
            if (adapter == null){
                recy_x.setLayoutManager(new LinearLayoutManager(getActivity()));
                adapter=new StainAdapter(getActivity(),list);
                recy_x.setAdapter(adapter);
            }
            else
            {
                adapter.notifyDataSetChanged();
            }
            Log.d("aaaa", "123: ");
        }
        private void initView(View view) {
            recy_x = (XRecyclerView) view.findViewById(R.id.recy_x);
        }
}
