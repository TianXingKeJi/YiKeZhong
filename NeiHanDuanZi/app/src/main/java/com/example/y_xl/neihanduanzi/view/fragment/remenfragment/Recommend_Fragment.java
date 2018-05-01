package com.example.y_xl.neihanduanzi.view.fragment.remenfragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.example.y_xl.neihanduanzi.R;

/**
 * Created by lenovo on 2018/4/14.
 */

public class Recommend_Fragment extends Fragment {

//    private TabLayout tabLayout;
//    private ViewPager vp;
    private View view;
//    private List<String> list;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_tuijian_layout, container, false);

//        initViewType();

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
//        //创建集合保存tablayout选项卡的内容
//        list = new ArrayList<>();
//        list.add("热门");
//        list.add("关注");
//
////        vp.setOffscreenPageLimit(list.size());
//
//        //1.设置适配器...fragmnePagerAdapter....getChildFragmentManager...getFragmentManager
//        vp.setAdapter(new FragmentPagerAdapter(getFragmentManager()) {
//
//            //2.重写方法...返回的是viewPager当前页的标题
//            @Override
//            public CharSequence getPageTitle(int position) {
//                return list.get(position);
//            }
//
//            @Override
//            public Fragment getItem(int position) {//0...listView,1...gridView,2..scrollView
//                Fragment fragment = null;
//                switch (position){
//                    case 0:
//                        fragment = new Home_Hot_Fragment();
//                        return fragment;
//                    case 1:
//                        fragment = new Home_Follow_Fragment();
//                       return fragment;
//                }
//                return null;
//            }
//
//            @Override
//            public int getCount() {
//                return list.size();
//            }
//        });
//
//        //3.tablayout与viewPager关联使用
//        tabLayout.setupWithViewPager(vp);
//        //tab的字体选择器,默认黑色,选择时红色
//        tabLayout.setTabTextColors(Color.BLACK, Color.rgb(3,169,244));
//        //tab的下划线颜色,默认是粉红色
//        tabLayout.setSelectedTabIndicatorColor(Color.rgb(3,169,244));
//    }
//    //初始化组件
//    public void initViewType() {
//        tabLayout = view.findViewById(R.id.fragment_tab);
//        vp = view.findViewById(R.id.vp);
//    }
//    //设置tabLayout的下划线
//    public void setIndicator(TabLayout tabs, int leftDip, int rightDip) {
//        Class<?> tabLayout = tabs.getClass();
//        Field tabStrip = null;
//        try {
//            tabStrip = tabLayout.getDeclaredField("mTabStrip");
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        }
//
//        tabStrip.setAccessible(true);
//        LinearLayout llTab = null;
//        try {
//            llTab = (LinearLayout) tabStrip.get(tabs);
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//
//        int left = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, leftDip, Resources.getSystem().getDisplayMetrics());
//        int right = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, rightDip, Resources.getSystem().getDisplayMetrics());
//
//        for (int i = 0; i < llTab.getChildCount(); i++) {
//            View child = llTab.getChildAt(i);
//            child.setPadding(0, 0, 0, 0);
//            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(0, LinearLayout.LayoutParams.MATCH_PARENT, 1);
//            params.leftMargin = left;
//            params.rightMargin = right;
//            child.setLayoutParams(params);
//            child.invalidate();
//        }
//    }
//    @Override
//    public void onStart() {
//        super.onStart();
//        tabLayout.post(new Runnable() {
//            @Override
//            public void run() {
//                //下划线的长度，距离两边的长度，数字大越短，数字小越长
//                setIndicator(tabLayout, 60, 60);
//            }
//        });
    }
}
