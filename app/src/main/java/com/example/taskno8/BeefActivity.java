package com.example.taskno8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class BeefActivity extends AppCompatActivity {
    RecyclerView beefRV;
    ArrayList<Models> list = new ArrayList<>();
    Adapter adapter;
    int[] imagearray = {R.drawable.beef, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken, R.drawable.chicken};
    String[] nameArray = {"pompom","beef chicken","chicken masala","chicken roast","Rice macro","macihne","chicken massine","beef currey","beef mutton","beef milk","beef mirchi","beef chingri","beef mutton","milkii"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beef);
        beefRV = findViewById(R.id.idRVbeef);


        for (int i = 0; i < imagearray.length; i++) {
            list.add(new Models(nameArray[i], imagearray[i]));
        }


        adapter = new Adapter(list, this);
        beefRV.setAdapter(adapter);
        beefRV.setHasFixedSize(true);
        beefRV.setLayoutManager(new LinearLayoutManager(this));


    }

}