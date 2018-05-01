package com.example.y_xl.neihanduanzi.view.activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.model.bean.DetailsBean;
import com.example.y_xl.neihanduanzi.model.bean.IFAttentionBean;
import com.example.y_xl.neihanduanzi.utils.Ani;
import com.example.y_xl.neihanduanzi.utils.BaseObserver;
import com.example.y_xl.neihanduanzi.utils.RetrofitAndOkHttpAndRxAndroid;
import com.example.y_xl.neihanduanzi.view.adapter.DetailsAdapter;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.gson.Gson;
import java.util.List;
public class DetailsActivity extends AppCompatActivity {
    private RecyclerView list;
    private boolean flage;
    private ImageView dz;
    int q;
    private TextView details_count;
    private TextView details_name;
    private Button btn;
    private SimpleDraweeView image_icon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        details_name = findViewById(R.id.details_name);
        details_count = findViewById(R.id.details_count);
        dz = findViewById(R.id.details_dz);
        btn = findViewById(R.id.details_btn);
        image_icon = findViewById(R.id.details_icon);
        findViewById(R.id.list);
        flage = true;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flage){
                    btn.setText(" √ 关注");
                    RetrofitAndOkHttpAndRxAndroid.get("https://www.zhaoapi.cn/quarter/follow?token=7D4B6C6EBD5EF65B370817E8F8675B62&source=android&appVersion=3&uid=12436").subscribe(new BaseObserver() {
                        @Override
                        public void onSuccess(String result) {
                            final IFAttentionBean ifAttentionBean = new Gson().fromJson(result, IFAttentionBean.class);
                            if (ifAttentionBean.getCode().equals("1")||ifAttentionBean.getCode().equals("0"))
                            {
                                btn.setText(" √ 关注");
                            }
                            else{
                                btn.setText(" + 关注");
                            }

                        }
                    });
                    flage =false;
                    Toast.makeText(DetailsActivity.this,"已关注",Toast.LENGTH_LONG).show();
                }
                else{
                    btn.setText(" + 关注");
                    flage =true;
                    Toast.makeText(DetailsActivity.this,"已取消",Toast.LENGTH_LONG).show();
                }
            }
        });
        dz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (q<10){
                    Ani.scale(dz);
                    q+=1;
                    details_count.setText(""+q);
                }
                else{
                    Toast.makeText(DetailsActivity.this,"只能点十次哦^_^",Toast.LENGTH_LONG).show();
                }
            }
        });
        Intent intent=getIntent();
        final String uid = intent.getStringExtra("uid");
        final String name = intent.getStringExtra("name");
        final String icon = intent.getStringExtra("icon");
        RetrofitAndOkHttpAndRxAndroid.get("https://www.zhaoapi.cn/quarter/follow?token=7D4B6C6EBD5EF65B370817E8F8675B62&source=android&appVersion=3&uid=12436").subscribe(new BaseObserver() {
            @Override
            public void onSuccess(String result) {
                final IFAttentionBean ifAttentionBean = new Gson().fromJson(result, IFAttentionBean.class);
                if (ifAttentionBean.getCode().equals("1"))
                {
                    btn.setText(" √ 关注");
                }
                else{
                    btn.setText(" + 关注");
                }

            }
        });
        if(name!=""){
            details_name.setText(name);
        }
        else{
            details_name.setText("游客");
        }

            Uri uri=Uri.parse(icon);
            image_icon.setImageURI(uri);
        Toast.makeText(DetailsActivity.this,""+icon,Toast.LENGTH_LONG).show();



        Toast.makeText(DetailsActivity.this,""+uid,Toast.LENGTH_LONG).show();
        RetrofitAndOkHttpAndRxAndroid.get("https://www.zhaoapi.cn/quarter/getUserVideos?uid="+uid+"&source=android&appVersion=3").subscribe(new BaseObserver() {
            @Override
            public void onSuccess(String result) {
                final DetailsBean detailsBean = new Gson().fromJson(result, DetailsBean.class);
                final List<DetailsBean.DataBean> data = detailsBean.getData();
                list = findViewById(R.id.details_xrecycle);
                list.setLayoutManager(new LinearLayoutManager(DetailsActivity.this));
                DetailsAdapter adapter=new DetailsAdapter(data,DetailsActivity.this,name,icon);
                list.setAdapter(adapter);
            }
        });
    }
}
