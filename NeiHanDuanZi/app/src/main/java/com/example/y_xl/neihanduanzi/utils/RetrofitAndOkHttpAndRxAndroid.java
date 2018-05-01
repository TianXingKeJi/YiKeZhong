package com.example.y_xl.neihanduanzi.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;



/**
 * Created by Administrator on 2018/3/30.
 * 设置一个变量 判断这个变量  然后决定每次走那个方法  flag = false;
 */

public class RetrofitAndOkHttpAndRxAndroid {


    private Context context;
    private static String userId;

    //构造方法
    public RetrofitAndOkHttpAndRxAndroid(Context context) {
        this.context = context;
        //这里的上下文用的是全局的
        userId = SharePreferenceUtils.getString(BaseApplication.getContext(), "userId", "");

    }

    //Ok 获取数据 静态全局调用
    public static OkHttpClient okHttpClient = new OkHttpClient.Builder()
            //连接超时
            .connectTimeout(20, TimeUnit.SECONDS)//TimeUnit.SECONDS  秒
            .readTimeout(20, TimeUnit.SECONDS)
            .writeTimeout(20, TimeUnit.SECONDS)
            // APP层面的拦截器（Application Interception）、网络请求层面的拦截器(Network Interception)
//            .addInterceptor(login()) //应用拦截器
            .addNetworkInterceptor(login())//网络拦截器
            .build();
    private static Object result;


    //返回应用拦截器
    private static Interceptor login() {
        //变量  因为只走了一下
        Interceptor interceptor = new Interceptor() {

            @Override
            public Response intercept(Chain chain) throws IOException {

                //第一次是false  登陆时候用   之后把登陆的返回参数加入
                Request request;  //请求
                if (TextUtils.isEmpty(userId)) {
                    Log.d("deng", "我登陆的时候调用这个。。。。。。。");
                    request = chain.request().newBuilder()
                            .addHeader("ak", "11010101")
                            .build();
                    return chain.proceed(request);

                } else {
                    Log.d("deng", "我登陆成功之后获取别的数据之后调用这个。。。。。。。。。");
                    request = chain.request().newBuilder()
                            //下面的这些参数都是登陆成功之后获取的参数
                            .addHeader("ak", "11010101")
                            .addHeader("sessionId", "2018030821070947")
                            .addHeader("userId", userId)
                            .build();
                    return chain.proceed(request);
                }

            }
        };
        return interceptor;
    }

    //使全局就一个Retrofit对象,设置基础Url   静态 方便别人调用
    public static ApiService apiService = new Retrofit.Builder()
            .baseUrl("http://www.bwstudent.com")  //里面的路径是我所有路径的前半部分
            .addConverterFactory(ScalarsConverterFactory.create()) //添加 String类型[ Scalars (primitives, boxed, and String)] 转换器
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//添加 RxJava 适配器
            .client(okHttpClient)  //添加上边的Ok拦截器  获取数据?
            .build().create(ApiService.class);//创建接口  转化


    //当我请求get方法的时候（无参），  Observable<String>这是一个返回类型
    public static Observable<String> get(String url) {
        return apiService.get(url)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());//我理解是直接到主线程
    }

    //登陆的时候用到的   get(有参)
    public static Observable<String> get(String url, Map<String, String> map) {
        return apiService.get(url, map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public static Observable<String> post(String url, Map<String, String> map) {
        return apiService.post(url, map)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());

    }
}
