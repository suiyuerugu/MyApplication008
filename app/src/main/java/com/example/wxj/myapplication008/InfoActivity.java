package com.example.wxj.myapplication008;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class InfoActivity extends AppCompatActivity {
private ImageView showImage;
private TextView showprice,showContent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        showImage=(ImageView)findViewById(R.id.show_image);
        showprice=(TextView)findViewById(R.id.show_price);
        showContent=(TextView)findViewById(R.id.show_content);
        Intent intent=getIntent();
        int imgid=intent.getIntExtra("img",R.mipmap.ic_launcher);
        String price=intent.getStringExtra("price1");
        String content=intent.getStringExtra("content1");

        showImage.setImageResource(imgid);
        showprice.setText(price);
        showContent.setText(content);
    }
}
