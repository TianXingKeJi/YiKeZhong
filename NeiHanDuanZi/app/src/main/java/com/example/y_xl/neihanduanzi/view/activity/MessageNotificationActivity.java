package com.example.y_xl.neihanduanzi.view.activity;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;


import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.view.fragment.remenfragment.viewpager.Message_Fragment;
import com.example.y_xl.neihanduanzi.view.fragment.remenfragment.viewpager.Private_Letter_Fragment;

import java.util.ArrayList;
import java.util.List;

public class MessageNotificationActivity extends AppCompatActivity {

    private TabLayout activity_xiaoxi_tab;
    private ViewPager activity_xiaoxi_vp;
    private List<String> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_xiao_xi_tong_zhi);

        initView();
        //创建集合保存tablayout选项卡的内容
        list = new ArrayList<>();
        list.add("消息");
        list.add("私信");

//        vp.setOffscreenPageLimit(list.size());

        //1.设置适配器...fragmnePagerAdapter....getChildFragmentManager...getFragmentManager
        activity_xiaoxi_vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {

            //2.重写方法...返回的是viewPager当前页的标题
            @Override
            public CharSequence getPageTitle(int position) {
                return list.get(position);
            }

            @Override
            public Fragment getItem(int position) {//0...listView,1...gridView,2..scrollView
                Fragment fragment = null;
                switch (position){
                    case 0:
                        fragment = new Message_Fragment();
                        return fragment;
                    case 1:
                        fragment = new Private_Letter_Fragment();
                        return fragment;
                }
                return null;
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });

        //3.tablayout与viewPager关联使用
        activity_xiaoxi_tab.setupWithViewPager(activity_xiaoxi_vp);
        //tab的字体选择器,默认黑色,选择时红色
        activity_xiaoxi_tab.setTabTextColors(Color.BLACK, Color.rgb(3,169,244));
        //tab的下划线颜色,默认是粉红色
        activity_xiaoxi_tab.setSelectedTabIndicatorColor(Color.rgb(3,169,244));
    }

    private void initView() {
        activity_xiaoxi_tab=findViewById(R.id.activity_xiaoxi_tab);
        activity_xiaoxi_vp=findViewById(R.id.activity_xiaoxi_vp);
    }

    public void activity_bt_bank(View view) {
        MessageNotificationActivity.this.finish();
    }
}
