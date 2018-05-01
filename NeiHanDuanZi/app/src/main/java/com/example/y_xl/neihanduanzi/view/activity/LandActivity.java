package com.example.y_xl.neihanduanzi.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.y_xl.neihanduanzi.R;
import com.tencent.connect.UserInfo;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.Constants;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import com.tencent.tauth.UiError;

import org.json.JSONException;
import org.json.JSONObject;

public class LandActivity extends AppCompatActivity {
    private static final String TAG = "LandActivity";
    private static final String APP_ID = "1105602574";//官方获取的APPID
    private Tencent mTencent;
    private BaseUiListener mIUiListener;
    private UserInfo mUserInfo;
    private ImageView activity_lan_img_bank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //隐藏标题栏
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land);

        initView();//初始化组件
        setBankActivity();//返回上一页面
        mTencent = Tencent.createInstance(APP_ID, LandActivity.this.getApplicationContext());
    }
    //返回上一页面
    private void setBankActivity() {
        activity_lan_img_bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LandActivity.this.finish();
            }
        });
    }

    //初始化组件
    private void initView() {
        activity_lan_img_bank=findViewById(R.id.activity_lan_img_bank);
    }

    //点击登陆
    public void play(View view) {
        mIUiListener = new BaseUiListener();
        //all表示获取所有权限
        mTencent.login(LandActivity.this, "all", mIUiListener);
    }

    //其他登陆方式登陆
    public void atherLogin(View view) {
        Intent intent = new Intent(LandActivity.this, AtherLoginActivity.class);
        startActivity(intent);
    }

    public void weixin(View view) {
        Toast.makeText(LandActivity.this,"微信功能完善中，敬请期待！",Toast.LENGTH_SHORT).show();
    }

   /* public void buttonLogin(View v) {
        *//**通过这句代码，SDK实现了QQ的登录，这个方法有三个参数，第一个参数是context上下文，第二个参数SCOPO 是一个String类型的字符串，表示一些权限
     官方文档中的说明：应用需要获得哪些API的权限，由“，”分隔。例如：SCOPE = “get_user_info,add_t”；所有权限用“all”
     第三个参数，是一个事件监听器，IUiListener接口的实例，这里用的是该接口的实现类 *//*
        mIUiListener = new BaseUiListener();
        //all表示获取所有权限
        mTencent.login(LandActivity.this, "all", mIUiListener);
    }*/

    /**
     * 自定义监听器实现IUiListener接口后，需要实现的3个方法
     * onComplete完成 onError错误 onCancel取消
     */
    private class BaseUiListener implements IUiListener {

        @Override
        public void onComplete(Object response) {
            Toast.makeText(LandActivity.this, "授权成功", Toast.LENGTH_SHORT).show();
            Log.e(TAG, "response:" + response);
            JSONObject obj = (JSONObject) response;
            try {
                String openID = obj.getString("openid");
                String accessToken = obj.getString("access_token");
                String expires = obj.getString("expires_in");
                mTencent.setOpenId(openID);
                mTencent.setAccessToken(accessToken, expires);
                QQToken qqToken = mTencent.getQQToken();
                mUserInfo = new UserInfo(getApplicationContext(), qqToken);
                mUserInfo.getUserInfo(new IUiListener() {
                    @Override
                    public void onComplete(Object response) {
                        Log.e(TAG, "登录成功" + response.toString());
                        Intent intent = new Intent(LandActivity.this, HomeActivity.class);
                        startActivity(intent);
                    }

                    @Override
                    public void onError(UiError uiError) {
                        Log.e(TAG, "登录失败" + uiError.toString());
                    }

                    @Override
                    public void onCancel() {
                        Log.e(TAG, "登录取消");

                    }
                });
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onError(UiError uiError) {
            Toast.makeText(LandActivity.this, "授权失败", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onCancel() {
            Toast.makeText(LandActivity.this, "授权取消", Toast.LENGTH_SHORT).show();

        }

    }

    /**
     * 在调用Login的Activity或者Fragment中重写onActivityResult方法
     *
     * @param requestCode
     * @param resultCode
     * @param data
     */
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == Constants.REQUEST_LOGIN) {
            Tencent.onActivityResultData(requestCode, resultCode, data, mIUiListener);
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}
