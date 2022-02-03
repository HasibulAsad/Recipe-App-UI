package com.example.taskno8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
ImageView detailsImage;
TextView detailstext,detailsname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        detailsImage = findViewById(R.id.idIVdetails);
        detailsname = findViewById(R.id.idTVdetails);
        detailstext = findViewById(R.id.idTVmaindetails);


    }
}