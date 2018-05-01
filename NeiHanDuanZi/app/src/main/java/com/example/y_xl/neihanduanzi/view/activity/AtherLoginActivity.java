package com.example.y_xl.neihanduanzi.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.utils.BaseObserver;
import com.example.y_xl.neihanduanzi.utils.My_api;
import com.example.y_xl.neihanduanzi.utils.RetrofitAndOkHttpAndRxAndroid;

import java.util.HashMap;

public class AtherLoginActivity extends AppCompatActivity {

    private EditText name;
    private EditText password;
    private ImageView activity_other_img_bank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //?????
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ather_login);
        initView();//?????
        setBankActivity();//??????
    }
    //??????
    private void setBankActivity() {
        activity_other_img_bank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AtherLoginActivity.this.finish();
            }
        });
    }

    //????
    public void login(View view) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mobile", name.getText().toString());
        map.put("password", password.getText().toString());

        RetrofitAndOkHttpAndRxAndroid.post(My_api.Login_zpi, map).subscribe(new BaseObserver() {
            @Override
            public void onSuccess(String result) {
                Toast.makeText(AtherLoginActivity.this, "????", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(AtherLoginActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
    //?????
    private void initView() {
        name = (EditText) findViewById(R.id.name);
        password = (EditText) findViewById(R.id.password);
        activity_other_img_bank=findViewById(R.id.activity_other_img_bank);
    }

    private void submit() {
        // validate
        String nameString = name.getText().toString().trim();
        if (TextUtils.isEmpty(nameString)) {
            Toast.makeText(this, "??", Toast.LENGTH_SHORT).show();
            return;
        }

        String passwordString = password.getText().toString().trim();
        if (TextUtils.isEmpty(passwordString)) {
            Toast.makeText(this, "??", Toast.LENGTH_SHORT).show();
            return;
        }

        // TODO validate success, do something


    }

    public void zhuce(View view) {
        Toast.makeText(AtherLoginActivity.this,"??????",Toast.LENGTH_SHORT).show();
    }
}
