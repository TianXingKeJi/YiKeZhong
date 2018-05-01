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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.view.fragment.remenfragment.Paragraph_Fragment;
import com.example.y_xl.neihanduanzi.view.fragment.remenfragment.OddPhotos_Fragment;
import com.example.y_xl.neihanduanzi.view.fragment.remenfragment.Video_Fragment;
import com.example.y_xl.neihanduanzi.view.fragment.remenfragment.viewpager.Home_Follow_Fragment;
import com.example.y_xl.neihanduanzi.view.fragment.remenfragment.viewpager.Home_Hot_Fragment;
import com.example.y_xl.neihanduanzi.view.fragment.remenfragment.viewpager.News_Fragment;

import java.util.ArrayList;
import java.util.List;

public class HotAttentionActivity extends AppCompatActivity {

    private TextView activity_remen_tv;
    private ImageView activity_sousuo_img;
    private EditText activity_sousuo_et;
    private TabLayout activity_remen_tab;
    private ViewPager activity_remen_vp;
    private List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //隐藏标题栏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re_men_guan_zhu);

        initView();//初始化组件
        setBank();//返回上一页面
        getSouSuo();
        //创建集合保存tablayout选项卡的内容
        list = new ArrayList<>();
        list.add("新闻");
        list.add("爆笑");
        list.add("励志");
        list.add("美食");
        list.add("网红");
        list.add("颜值");

        //1.设置适配器...fragmnePagerAdapter....getChildFragmentManager...getFragmentManager
        activity_remen_vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {

            //2.重写方法...返回的是viewPager当前页的标题
            @Override
            public CharSequence getPageTitle(int position) {
                return list.get(position);
            }

            @Override
            public Fragment getItem(int position) {//0...listView,1...gridView,2..scrollView
                Fragment fragment = null;
                switch (position) {
                    case 0:
                        fragment = new News_Fragment();
                        return fragment;
                    case 1:
                        fragment = new Paragraph_Fragment();
                        return fragment;
                    case 2:
                        fragment = new Video_Fragment();
                        return fragment;
                    case 3:
                        fragment = new OddPhotos_Fragment();
                        return fragment;
                    case 4:
                        fragment = new Home_Hot_Fragment();
                        return fragment;
                    case 5:
                        fragment = new Home_Follow_Fragment();
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
        activity_remen_tab.setupWithViewPager(activity_remen_vp);
        //tab的字体选择器,默认黑色,选择时红色
        activity_remen_tab.setTabTextColors(Color.BLACK, Color.rgb(3, 169, 244));
        //tab的下划线颜色,默认是粉红色
        activity_remen_tab.setSelectedTabIndicatorColor(Color.rgb(3, 169, 244));
    }

    private void getSouSuo() {
        activity_sousuo_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HotAttentionActivity.this,"正在搜索，请稍后。。。",Toast.LENGTH_SHORT).show();

            }
        });

    }

    //返回上一页面
    private void setBank() {
        activity_remen_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HotAttentionActivity.this.finish();
            }
        });
    }

    //初始化组件
    private void initView() {
        activity_remen_tv = findViewById(R.id.activity_remen_tv);
        activity_sousuo_img = findViewById(R.id.activity_sousuo_img);
        activity_remen_tab = findViewById(R.id.activity_remen_tab);
        activity_remen_vp = findViewById(R.id.activity_remen_vp);
        activity_sousuo_et=findViewById(R.id.activity_sousuo_et);
    }
}
