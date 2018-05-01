package com.example.y_xl.neihanduanzi.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/4/14 0014.
 */

public abstract  class MBaseAdapter<T> extends android.widget.BaseAdapter {
    private List<T> entities;
    private LayoutInflater inflater;

    public MBaseAdapter(Context context) {
        this.entities = new ArrayList<>();
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return entities.size();
    }

    @Override
    public T getItem(int i) {
        return entities.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    public void addAll(List<T> dd){
        entities.addAll(dd);
        notifyDataSetChanged();
    }

    public LayoutInflater getInflater() {
        return inflater;
    }
}
