package com.dorado.doradoquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Button btn_Home;
    Button btn_1;
    Button btn_2;
    Button btn_3;
    String [] androids;
    CustomAdapter adapter;
    ListView lv_Favorite;
    List<Android> listAndroid;
    String a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_Favorite = (ListView) findViewById(R.id.lvFavorite);
        btn_Home = (Button) findViewById(R.id.btnHome);
        btn_1 = (Button) findViewById(R.id.btn1);
        btn_2 = (Button) findViewById(R.id.btn2);
        btn_3 = (Button) findViewById(R.id.btn3);

        listAndroid = new ArrayList<Android>();
        androids = getResources().getStringArray(R.array.codename);
        for (int i=0; i < androids.length; i++){
            listAndroid.add(new Android(androids[i]));
        }
        adapter = new CustomAdapter(this, listAndroid);
        lv_Favorite .setAdapter(adapter);

        lv_Favorite.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                a = androids[i];
                if(a == "KitKat"){
                    Intent intent = new Intent(getApplicationContext(), page1.class);
                    startActivity(intent);
                }else if(a == "Lollipop"){
                    Intent intent = new Intent(getApplicationContext(), page2.class);
                    startActivity(intent);
                }else if(a == "Marshmallow"){
                    Intent intent = new Intent(getApplicationContext(), page3.class);
                    startActivity(intent);
                }

            }
        });


        btn_1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, page1.class);
                startActivity(intent);
                finish();
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent intent2 = new Intent(MainActivity.this, page2.class);
                startActivity(intent2);
                finish();
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                Intent intent3 = new Intent(MainActivity.this, page3.class);
                startActivity(intent3);
                finish();
            }
        });

    }
}
