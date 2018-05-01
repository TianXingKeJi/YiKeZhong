package com.example.y_xl.neihanduanzi.view.fragment.tvfragment;

import android.Manifest;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.example.y_xl.neihanduanzi.R;

import hei.permission.PermissionActivity;

import static android.support.v4.content.PermissionChecker.checkPermission;


/**
 * Created by Y_xl on 2018/4/14.
 */

public class NearBy_fragment extends Fragment {
    private Button butCity;
    private TextView textAddress;
    //声明AMapLocationClient类对象
    public AMapLocationClient mLocationClient = null;
    //声明AMapLocationClientOption对象
    public AMapLocationClientOption mLocationOption = null;

    //声明定位回调监听器
    public AMapLocationListener mLocationListener = new AMapLocationListener() {
        @Override
        public void onLocationChanged(AMapLocation aMapLocation) {
            if (aMapLocation != null) {
                if (aMapLocation.getErrorCode() == 0) {
//可在其中解析amapLocation获取相应内容。
                    Toast.makeText(getActivity(),"正在获取地址。。。",Toast.LENGTH_SHORT).show();
                    butCity.setText(aMapLocation.getCity());
                    textAddress.setText("纬度"+aMapLocation.getLatitude()+"\n经度:"+aMapLocation.getLongitude()+"\n地址描述:"+aMapLocation.getAddress());
                    mLocationClient.stopLocation();//停止定位后，本地定位服务并不会被销毁
                }else {
//定位失败时，可通过ErrCode（错误码）信息来确定失败的原因，errInfo是错误信息，详见错误码表。
                    Toast.makeText(getActivity(),aMapLocation.getErrorInfo()+"错误代码："
                            +aMapLocation.getErrorCode(),Toast.LENGTH_SHORT).show();
                    Log.d("aaa","sss"+aMapLocation.getErrorInfo()+"错误代码："
                            +aMapLocation.getErrorCode());
                }
            }
        }
    };

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.nearby_fragment_layout, container, false);

        butCity = view.findViewById(R.id.butCity);
        textAddress=view.findViewById(R.id.textAddress);
//        checkPermission(new PermissionActivity.CheckPermListener() {
//            @Override
//            public void superPermission() {
//                GPSLocation();
//            }
//        },R.string.location, Manifest.permission.ACCESS_FINE_LOCATION);
        ((PermissionActivity)getActivity()).checkPermission(
                new PermissionActivity.CheckPermListener() {
                    @Override
                    public void superPermission() {
                        GPSLocation();
                    }
                },R.string.location, Manifest.permission.ACCESS_FINE_LOCATION);



        return view;
    }

    private void GPSLocation() {
//初始化定位
        mLocationClient = new AMapLocationClient(getActivity());
//设置定位回调监听
        mLocationClient.setLocationListener(mLocationListener);
//初始化AMapLocationClientOption对象
        mLocationOption = new AMapLocationClientOption();
/**
 * 设置定位场景，目前支持三种场景（签到、出行、运动，默认无场景）
 */
        mLocationOption.setLocationPurpose(AMapLocationClientOption.AMapLocationPurpose.SignIn);
        if (null != mLocationClient) {
            mLocationClient.setLocationOption(mLocationOption);
//设置场景模式后最好调用一次stop，再调用start以保证场景模式生效
            mLocationClient.stopLocation();
            mLocationClient.startLocation();
//设置定位模式为AMapLocationMode.Hight_Accuracy，高精度模式。
            mLocationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
//获取一次定位结果：
// 该方法默认为false。
            mLocationOption.setOnceLocation(true);
//获取最近3s内精度最高的一次定位结果：
// 设置setOnceLocationLatest(boolean b)接口为true，启动定位时SDK会返回最近3s内精度最高的一次定位结果。如果设置其为true，setOnceLocation(boolean b)接口也会被设置为true，反之不会，默认为false。
            mLocationOption.setOnceLocationLatest(true);
//设置定位间隔,单位毫秒,默认为2000ms，最低1000ms。
            mLocationOption.setInterval(1000);

//设置是否返回地址信息（默认返回地址信息）
            mLocationOption.setNeedAddress(true);
//设置是否允许模拟位置,默认为true，允许模拟位置
            mLocationOption.setMockEnable(true);

//单位是毫秒，默认30000毫秒，建议超时时间不要低于8000毫秒。
            mLocationOption.setHttpTimeOut(20000);
//关闭缓存机制
            mLocationOption.setLocationCacheEnable(false);
//给定位客户端对象设置定位参数
            mLocationClient.setLocationOption(mLocationOption);

//启动定位
            mLocationClient.startLocation();
        }
    }

}
