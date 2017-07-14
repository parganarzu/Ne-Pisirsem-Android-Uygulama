package com.example.arzu.finalproject;

import android.app.Fragment;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

public class YemekFavoriFragment extends Fragment {
ImageButton btn_img;
    TextView txt;
     String name;
    int img;
    String malzemeler;
     String yapilisi;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_yemek_favori_fragment, container, false);
        btn_img=(ImageButton) view.findViewById(R.id.imgbtn);
        txt=(TextView) view.findViewById(R.id.txt_view);

        btn_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Yemek_Bilgi.class);
                String[] yemek_bilgi=new String[5];
                yemek_bilgi[0]=name;
                yemek_bilgi[1]=yapilisi;
                yemek_bilgi[2]=malzemeler;
                int imge=img;
                intent.putExtra("yemek_bilgi",yemek_bilgi);
                intent.putExtra("yemek_img",imge);
                startActivity(intent);
            }
        });
        return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        txt.setText(name);
        btn_img.setImageResource(img);


    }
    public void degisikler(String gelenbaslik,int gelenresim,String gelenmalz,String gelenyap){
        this.name=gelenbaslik;
        this.img=gelenresim;
        this.malzemeler=gelenmalz;
        this.yapilisi=gelenyap;
        txt.setText(name);
        btn_img.setImageResource(img);
    }

}
