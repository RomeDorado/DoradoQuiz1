package com.dorado.doradoquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class page3 extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    Button btn_Home;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        btn_Home = (Button) findViewById(R.id.btnHome);
        btn_1 = (Button) findViewById(R.id.btn1);
        btn_2 = (Button) findViewById(R.id.btn2);
        btn_3 = (Button) findViewById(R.id.btn3);
        imageView = (ImageView) findViewById(R.id.imageView);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView4 = (TextView) findViewById(R.id.textView4);
    }
    public void pageHome3(View view){
        Intent intent10 = new Intent(this, MainActivity.class);
        startActivity(intent10);
    }
    public void pageOne3(View view){
        Intent intent11 = new Intent(this, page1.class);
        startActivity(intent11);
    }
    public void pageTwo3(View view){
        Intent intent12 = new Intent(this, page2.class);
        startActivity(intent12);
    }
}
