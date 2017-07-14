package com.example.arzu.finalproject;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListActivity;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class yemek_favori extends AppCompatActivity implements Communicator {
    String favoriler_adi="";
    String favoriler_yapilisi="";
    String favoriler_malzemeler="";
    String favoriler_img="";
    String img_num="";
    String[] favorileradi;
    String[] favorileryapilisi;
    String[] favorilermalzemeler;
    String[] favorilerimg;
    String[] imgnum;
    ListView lst_view;
    ArrayAdapter<String> adapter;
    SharedPreferences preferences;//preferences referansı
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek_favori);
          lst_view=(ListView) findViewById(R.id.list);

        YemekFavoriFragment ilkFragment=new YemekFavoriFragment();

        FragmentManager manager=getFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.activity_yemek_favori,ilkFragment,"yemekfragmentim").addToBackStack(null);
        transaction.commit();

        preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());//preferences objesi
        editor = preferences.edit();
        favoriler_adi=preferences.getString("favoriler_adi",favoriler_adi);
        favoriler_yapilisi=preferences.getString("favoriler_yapilisi",favoriler_yapilisi);
        favoriler_malzemeler=preferences.getString("favoriler_malzemeler",favoriler_malzemeler);
        favoriler_img=preferences.getString("favoriler_img",favoriler_img);
        favorileradi= favoriler_adi.split("#");
        favorilermalzemeler= favoriler_malzemeler.split("#");
        favorileryapilisi= favoriler_yapilisi.split("#");
        favorilerimg= favoriler_img.split("#");
//

        adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,favorileradi);
        lst_view.setAdapter(adapter);
//        setListAdapter(new ArrayAdapter<String>());


        lst_view.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                if(position>0){

                    respond(favorileradi[position],Integer.parseInt(favorilerimg[position]),favorilermalzemeler[position],favorileryapilisi[position]);

                }

    }


});

    }
    @Override
    public void respond(String name,int resim,String malzemeler,String yapilisi) {
        FragmentManager fmanager=getFragmentManager();
        YemekFavoriFragment fragmentyemek= (YemekFavoriFragment)fmanager.findFragmentById(R.id.yemekfragment);
        fragmentyemek.degisikler(name,resim,malzemeler,yapilisi);
    }
}