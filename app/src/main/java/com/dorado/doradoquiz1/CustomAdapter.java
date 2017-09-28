package com.dorado.doradoquiz1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Simon on 9/28/2017.
 */

public class CustomAdapter extends BaseAdapter {
    Context c;
    List<Android> androids;
    ImageView iv_Logo;
    TextView tv_Year;
    TextView tv_Name;

    public CustomAdapter(Context c, List<Android> androids){
        this.c = c;
        this.androids = androids;
    }

    @Override
    public int getCount() {
        return androids.size();
    }

    @Override
    public Object getItem(int i) {
        return androids.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view.inflate(c, R.layout.row_layout, null);
        tv_Name = (TextView) v.findViewById(R.id.tvFavorite);
        tv_Name.setText(androids.get(i).getName());
        return v;
    }

}
