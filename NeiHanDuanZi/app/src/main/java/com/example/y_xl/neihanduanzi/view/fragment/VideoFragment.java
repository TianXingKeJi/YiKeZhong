package com.example.y_xl.neihanduanzi.view.fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.view.fragment.tvfragment.Hot_fragment;
import com.example.y_xl.neihanduanzi.view.fragment.tvfragment.NearBy_fragment;
/**
 * Created by Y_xl on 2018/4/13.
 */
public class VideoFragment extends Fragment {
    private TabLayout video_fragment_tablayout;
    private ViewPager video_fragment_viewPager;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.video_fragment_layout, container, false);
        initView(view);
        return view;
    }
    private void initView(View view) {
        video_fragment_tablayout = (TabLayout) view.findViewById(R.id.video_fragment_tablayout);
        video_fragment_viewPager = (ViewPager) view.findViewById(R.id.video_fragment_viewPager);
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //tablayout中的内容
        final String[] titles = new String[]{"热门", "附近"};
        video_fragment_viewPager.setAdapter(new FragmentPagerAdapter(getFragmentManager()) {
            @Override
            public CharSequence getPageTitle(int position) {
                return titles[position];
            }
            @Override
            public int getCount() {
                return titles.length;
            }
            @Override
            public Fragment getItem(int position) {
                if (titles[position] == "热门") {
//得到子条目 因为子条目是Fragment,所以要new一个Fragment
                    Hot_fragment hot_fragment = new Hot_fragment();
                    return hot_fragment;
                } else if (titles[position] == "附近") {
                    NearBy_fragment nearBy_fragment = new NearBy_fragment();
                    return nearBy_fragment;
                }
                return null;
            }
        });
        //关联
        video_fragment_tablayout.setupWithViewPager(video_fragment_viewPager);
    }
}
