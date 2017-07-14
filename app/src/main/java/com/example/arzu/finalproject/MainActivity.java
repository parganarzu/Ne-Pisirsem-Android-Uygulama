package com.example.arzu.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

Button btn_tr,btn_hindu,btn_italya,btn_uzakdogu,btn_yemek_ara,btn_fav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_tr=(Button) findViewById(R.id.btn_türkiye);
        btn_hindu=(Button) findViewById(R.id.btn_hindistan);
        btn_italya=(Button) findViewById(R.id.btn_italya);
        btn_uzakdogu=(Button) findViewById(R.id.btn_cin);
        btn_yemek_ara=(Button)findViewById(R.id.btn_yemek_ara);
        btn_fav=(Button)findViewById(R.id.btn_favori);

        btn_tr.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent=new Intent();
            intent.setClass(MainActivity.this, yemek_turkiye.class);
            startActivity(intent);

        }
       });

        btn_hindu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent();
                intent.setClass(MainActivity.this, yemek_hindu.class);
                startActivity(intent);

            }
        });

        btn_italya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent();
                intent.setClass(MainActivity.this, yemek_italya.class);
                startActivity(intent);

            }
        });

        btn_uzakdogu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent();
                intent.setClass(MainActivity.this, yemek_uzakdogu.class);
                startActivity(intent);

            }
        });

        btn_yemek_ara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent();
                intent.setClass(MainActivity.this, yemek_ara.class);
                startActivity(intent);

            }
        });
        btn_fav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent();
                intent.setClass(MainActivity.this, yemek_favori.class);
                startActivity(intent);

            }
        });

    }

}
