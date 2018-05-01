package com.example.y_xl.neihanduanzi.view.activity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.y_xl.neihanduanzi.R;
import com.example.y_xl.neihanduanzi.presenter.Paragraph_P;
import com.example.y_xl.neihanduanzi.view.interF.paragraphV_I;

public class ParagraphActivity extends AppCompatActivity implements paragraphV_I {

    private EditText name;
    private Paragraph_P paragraph_p;
    private static int RESULT_LOAD_IMAGE = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paragraph);
        initView();

        paragraph_p = new Paragraph_P(this);

    }

    //发表
    public void play(View view) {
        String s = name.getText().toString();
        paragraph_p.getdata(s);
        finish();

    }
        public void fb(View view){
            Intent intent = new Intent(
                    Intent.ACTION_PICK,
                    android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            //这里要传一个整形的常量RESULT_LOAD_IMAGE到startActivityForResult()方法。
            startActivityForResult(intent, RESULT_LOAD_IMAGE);


        }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
//我们需要判断requestCode是否是我们之前传给startActivityForResult()方法的RESULT_LOAD_IMAGE，并且返回的数据不能为空
        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
            Uri selectedImage = data.getData();
            String[] filePathColumn = { MediaStore.Images.Media.DATA };
            //查询我们需要的数据
            Cursor cursor = getContentResolver().query(selectedImage,
                    filePathColumn, null, null, null);
            cursor.moveToFirst();

            int columnIndex = cursor.getColumnIndex(filePathColumn[0]);
            String picturePath = cursor.getString(columnIndex);
            cursor.close();

            ImageView imageView = (ImageView) findViewById(R.id.zp);
            imageView.setImageBitmap(BitmapFactory.decodeFile(picturePath));

        }

    }
    public void cancel(View view){
        finish();
    }

    private void initView() {
        name = (EditText) findViewById(R.id.name);
    }

    @Override
    public void success(String s) {

        Toast.makeText(ParagraphActivity.this, "" + s, Toast.LENGTH_SHORT).show();
        s = name.getText().toString();
        s = "";
    }
}
