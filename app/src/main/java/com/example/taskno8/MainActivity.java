package com.example.taskno8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    CardView beef, chicken, mutton, rice, desert, chineese;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        beef = findViewById(R.id.idcardbeef);
        chicken = findViewById(R.id.idcardchicken);
        mutton = findViewById(R.id.idcardmutton);
        rice = findViewById(R.id.idcardrice);
        desert = findViewById(R.id.idcarddesert);
        chineese = findViewById(R.id.idcardchineese);

        beef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,BeefActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.zoom_enter,R.anim.zoom_enter);
            }
        });
        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ChickenActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.zoom_enter,R.anim.zoom_enter);
            }
        });
        mutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,MuttonActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.zoom_enter,R.anim.zoom_enter);
            }
        });
        rice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Rice.class);
                startActivity(i);
                overridePendingTransition(R.anim.zoom_enter,R.anim.zoom_enter);
            }
        });
        desert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,DesertActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.zoom_enter,R.anim.zoom_enter);
            }
        });
        chineese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,ChineeseActivity.class);
                startActivity(i);
                overridePendingTransition(R.anim.zoom_enter,R.anim.zoom_enter);
            }
        });
    }
}