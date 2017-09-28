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
        lv_Favorite.setAdapter(adapter);

        lv_Favorite.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String a = androids[i];
                switch(a){
                    case "KitKat":
                    Intent intent = new Intent(getApplicationContext(), page1.class);
                    startActivity(intent);

                        break;

                    case "Lollipop":
                        Intent intent2 = new Intent(getApplicationContext(), page2.class);
                        startActivity(intent2);

                        break;

                    case "Marshmallow":
                        Intent intent3 = new Intent(getApplicationContext(), page3.class);
                        startActivity(intent3);

                        break;
                }
            }
        });
    }
    public void page1(View view){
        Intent intent = new Intent(this, page1.class);
        startActivity(intent);
    }
    public void page2(View view){
        Intent intent = new Intent(this, page2.class);
        startActivity(intent);
    }
    public void page3(View view){
        Intent intent = new Intent(this, page3.class);
        startActivity(intent);
    }
}
