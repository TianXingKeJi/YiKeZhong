package com.example.y_xl.neihanduanzi.view.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.y_xl.neihanduanzi.view.fragment.Recommendfragment.Follow_Fragment;
import com.example.y_xl.neihanduanzi.view.fragment.Recommendfragment.Hot_Fragment;

import java.util.List;

/**
 * Created by Administrator on 2018/4/18 0018.
 */

public class ConsultationAdapter extends FragmentPagerAdapter {
    List<String> list;

    public ConsultationAdapter(FragmentManager fm, List<String> list) {
        super(fm);
        this.list = list;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0)
        {
            return new Hot_Fragment();
        }
        else
        {
            return new Follow_Fragment();
        }

    }

    @Override
    public int getCount() {
        return list.size();
    }
}
