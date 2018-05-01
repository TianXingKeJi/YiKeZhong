package com.example.y_xl.neihanduanzi.view.activity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.utils.ThemeManager;
import com.example.y_xl.neihanduanzi.view.fragment.OddPhotosFragment;
import com.example.y_xl.neihanduanzi.view.fragment.RecommendFragment;
import com.example.y_xl.neihanduanzi.view.fragment.SatinFragment;
import com.example.y_xl.neihanduanzi.view.fragment.VideoFragment;
import com.hjm.bottomtabbar.BottomTabBar;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;

import hei.permission.PermissionActivity;


public class HomeActivity extends PermissionActivity implements ThemeManager.OnThemeChangeListener{

    private Toolbar home_toolbar;
    private BottomTabBar bottom_tab_bar;
    private NavigationView nv_menu_left;
    private ImageView activity_image_head;
    private TextView tv;
    private ImageView icon_button;
    private LinearLayout home_ll,title_ll;
    private ActionBar supportActionBar;
    private SlidingMenu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //隐藏标题栏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ThemeManager.registerThemeChangeListener(this);
        supportActionBar = getSupportActionBar();

        initView();//初始化组件
        getSlidingMenu();//侧滑菜单
        getCreate();
        bottom_tab_bar.init(getSupportFragmentManager())
                .setImgSize(60, 60)
                .setFontSize(11)
                .setTabPadding(4, 10, 10)
                .setChangeColor(Color.parseColor("#03A9F4"), Color.parseColor("#c4c4c4"))
                .addTabItem("推荐", R.drawable.raw_1500085367, R.drawable.raw_1500083878, RecommendFragment.class)
                .addTabItem("段子", R.drawable.raw_1500085899, R.drawable.raw_1500085327, SatinFragment.class)
                .addTabItem("视频", R.drawable.raw_1500086067, R.drawable.raw_1500083686, VideoFragment.class)
                .addTabItem("趣图", R.drawable.qutu_lan, R.drawable.qutu_hui, OddPhotosFragment.class)
                .isShowDivider(false)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name) {
                        if (name.equals("推荐")) {
                            tv.setText("推荐");
                        }
                        if (name.equals("段子")) {
                            tv.setText("段子");
                        }
                        if (name.equals("视频")) {
                            tv.setText("视频");
                        }
                        if (name.equals("趣图")) {
                            tv.setText("趣图");
                        }
                    }
                });
    }

    //跳转创作页面
    private void getCreate() {
        icon_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, CreateActivity.class);
                startActivity(intent);
            }
        });
    }
    //跳转到我的关注页面
    public void wodeguanzhu(View view){
        Toast.makeText(HomeActivity.this, "+我的关注+", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(HomeActivity.this, MyAttentionActivity.class);
        startActivity(intent);
    }
    //跳转到我的收藏页面
    public void wodeshoucang(View view) {
        Intent intent = new Intent(HomeActivity.this, MyCollectionActivity.class);
        startActivity(intent);
    }
    //跳转到搜索好友页面
    public void sousuohaoyou(View view) {
        Intent intent = new Intent(HomeActivity.this, SearchfriendsActivity.class);
        startActivity(intent);
    }
    //跳转到消息通知页面
    public void xiaoxitongzhi(View view) {
        Intent intent = new Intent(HomeActivity.this, MessageNotificationActivity.class);
        startActivity(intent);
    }
    //夜间模式
    public void yejian(View view){
        Toast.makeText(HomeActivity.this,"说变就变！！！ ",Toast.LENGTH_SHORT).show();
        //动态判断自动关闭或开启SlidingMenu侧滑菜单
        menu.toggle();

        ThemeManager.setThemeMode(ThemeManager.getThemeMode() == ThemeManager.ThemeMode.DAY
                ? ThemeManager.ThemeMode.NIGHT : ThemeManager.ThemeMode.DAY);
    }
    //跳转到我的作品页面
    public void wodezuopin(View view) {
        Intent intent = new Intent(HomeActivity.this, MyWorkActivity.class);
        startActivity(intent);
    }
    //跳转到设置页面
    public void shezhi(View view){
        Intent intent=new Intent(HomeActivity.this, SetupActivity.class);
        startActivity(intent);
    }

    //初始化组件
    private void initView() {
        bottom_tab_bar = (BottomTabBar) findViewById(R.id.bottom_tab_bar);
        activity_image_head = findViewById(R.id.activity_image_head);
        tv = findViewById(R.id.activity_title);
        icon_button = findViewById(R.id.icon_button);
        home_ll = findViewById(R.id.home_ll);
    }

    //获取SlidingMenu侧滑菜单
    private void getSlidingMenu() {

        activity_image_head.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // configure the SlidingMenu
                menu = new SlidingMenu(HomeActivity.this);
                menu.setMode(SlidingMenu.LEFT);
                // 设置触摸屏幕的模式
                menu.setTouchModeAbove(SlidingMenu.LEFT);
                menu.setShadowWidthRes(R.dimen.shadow_width);
//        menu.setShadowDrawable(R.drawable.shadow);

                // 设置滑动菜单视图的宽度
                menu.setBehindOffsetRes(R.dimen.slidingmenu_offset);//剩余空间大小
                // 设置渐入渐出效果的值
                menu.setFadeDegree(0.35f);
                /**
                 * SLIDING_WINDOW will include the Title/ActionBar in the content
                 * section of the SlidingMenu, while SLIDING_CONTENT does not.
                 */
                menu.attachToActivity(HomeActivity.this, SlidingMenu.SLIDING_CONTENT);
                // 为侧滑菜单设置布局
                menu.setMenu(R.layout.activity_slidingmenu_item_layout);
                //动态判断自动关闭或开启SlidingMenu侧滑菜单
                menu.toggle();
                ImageView drawer_image_head = menu.findViewById(R.id.drawer_image_head);


                drawer_image_head.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(HomeActivity.this, LandActivity.class);
                        startActivity(intent);

                    }
                });
            }
        });
    }
    /**
     * 夜间模式
     */
    public void initTheme() {
//        tv.setTextColor(getResources().getColor(ThemeManager.getCurrentThemeRes(HomeActivity.this, R.color.textColor)));
        bottom_tab_bar.setBackgroundColor(getResources().getColor(ThemeManager.getCurrentThemeRes(HomeActivity.this, R.color.backgroundColor)));
        home_ll.setBackgroundColor(getResources().getColor(ThemeManager.getCurrentThemeRes(HomeActivity.this, R.color.backgroundColor)));
        // 设置标题栏颜色
        if(supportActionBar != null){
            supportActionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(ThemeManager.getCurrentThemeRes(HomeActivity.this, R.color.colorPrimary))));
        }
        // 设置状态栏颜色
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.setStatusBarColor(getResources().getColor(ThemeManager.getCurrentThemeRes(HomeActivity.this, R.color.colorPrimary)));
        }
    }

    @Override
    public void onThemeChanged() {
        initTheme();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ThemeManager.unregisterThemeChangeListener(this);
    }
}
