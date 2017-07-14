package com.example.arzu.finalproject;

import android.app.FragmentManager;
import android.app.FragmentTransaction;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Yemek_Bilgi extends AppCompatActivity {

    TextView yemekadi;

    ImageView img_yemek;
    Button btn_malzeme,btn_yapilis;
    String yapilisi,malzeme;
    String[] yemek_bilgi;
    ImageButton imgbtn_like;
    SharedPreferences preferences;//preferences referansı
    SharedPreferences.Editor editor;
    String favoriler_adi="Favorilerim";
    String favoriler_yapilisi="1";
    String favoriler_malzemeler="1";
    String favoriler_img="1";
    String img_num="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_yemek__bilgi);

        yemekadi=(TextView)findViewById(R.id.txt_yemekadi);
        img_yemek=(ImageView)findViewById(R.id.img_yemek);
        btn_malzeme=(Button)findViewById(R.id.btn_malzeme);
        btn_yapilis=(Button)findViewById(R.id.btn_yapilis);
        imgbtn_like=(ImageButton)findViewById(R.id.imgbtn_like);

        preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());//preferences objesi
        editor = preferences.edit();
        img_num=""+getIntent().getExtras().getInt("yemek_img");
        img_yemek.setImageResource(getIntent().getExtras().getInt("yemek_img"));
        yemek_bilgi=getIntent().getExtras().getStringArray("yemek_bilgi");
        yemekadi.setText(yemek_bilgi[0]);
        yapilisi=yemek_bilgi[1];
        malzeme=yemek_bilgi[2];

        favoriler_adi=preferences.getString("favoriler_adi",favoriler_adi);
        favoriler_yapilisi=preferences.getString("favoriler_yapilisi",favoriler_yapilisi);
        favoriler_malzemeler=preferences.getString("favoriler_malzemeler",favoriler_malzemeler);
        favoriler_img=preferences.getString("favoriler_img",favoriler_img);

        btn_yapilis.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AlertDialog.Builder builder = new AlertDialog.Builder(Yemek_Bilgi.this);
            builder.setTitle("Yapılışı");
            builder.setMessage(yapilisi);

            builder.setPositiveButton("TAMAM", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {
                    //Tamam butonuna basılınca yapılacaklar

                }
            });
            builder.show();
        }
        });

      btn_malzeme.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
//
              AlertDialog.Builder builder = new AlertDialog.Builder(Yemek_Bilgi.this);
              builder.setTitle("Malzemeler");
              builder.setMessage(malzeme);

              builder.setPositiveButton("TAMAM", new DialogInterface.OnClickListener() {
                  public void onClick(DialogInterface dialog, int id) {

                  }
              });
              builder.show();
          }
      });


        imgbtn_like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                editor.clear();
//                editor.commit();
                if(favoriler_adi.contains(yemekadi.getText().toString())) {
                    Toast.makeText(getApplicationContext(),"Bu yemek zaten favorilere eklendi.",Toast.LENGTH_LONG).show();

                }
                else{

                    Toast.makeText(getApplicationContext(),"Bu yemek favorilere eklendi.",Toast.LENGTH_LONG).show();
                    favoriler_adi += "#" + yemekadi.getText().toString();
                    favoriler_yapilisi += "#" + yapilisi;
                    favoriler_malzemeler += "#" + malzeme;
                    favoriler_img += "#" + img_num;

                    editor.putString("favoriler_adi", favoriler_adi);
                    editor.putString("favoriler_yapilisi", favoriler_yapilisi);
                    editor.putString("favoriler_malzemeler", favoriler_malzemeler);
                    editor.putString("favoriler_img", favoriler_img);
                    editor.commit();
                }
            }
        });
    }
}
