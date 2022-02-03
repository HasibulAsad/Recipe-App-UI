package com.example.taskno8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class DesertActivity extends AppCompatActivity {
RecyclerView desertRV;
Adapter adapter;
ArrayList<Models> list = new ArrayList<>();
    int[] imagearray = {R.drawable.beef, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken};
    String[] nameArray = {"pompom","beef chicken","chicken masala","chicken roast","Rice macro","macihne","chicken massine","beef currey","beef mutton","beef milk","beef mirchi","beef chingri","beef mutton","milkii"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desert);
        desertRV = findViewById(R.id.idRVdesert);


        for (int i = 0; i < imagearray.length; i++) {
            list.add(new Models(nameArray[i], imagearray[i]));
        }


        adapter = new Adapter(list, this);
        desertRV.setAdapter(adapter);
        desertRV.setHasFixedSize(true);
        desertRV.setLayoutManager(new LinearLayoutManager(this));
    }
}