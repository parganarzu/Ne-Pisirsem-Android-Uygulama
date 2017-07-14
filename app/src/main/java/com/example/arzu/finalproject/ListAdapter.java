package com.example.arzu.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by arzu on 23.12.2016.
 */

public class ListAdapter extends BaseAdapter {

    private List list;
    LayoutInflater layoutInflater;
    Context context;

    public ListAdapter(Context context, List list) {
        this.context = context;
        // Layout Inflater tanımlanıyor...
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.list = list;

    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {

        return list.get( position);
    }

    @Override
    public long getItemId(int  position) {

        return  position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View satirView = layoutInflater.inflate(R.layout.listview_row, null);

        ImageView img_yemek = (ImageView) satirView.findViewById(R.id.img_yemek);
        TextView yemek_adi = (TextView) satirView.findViewById(R.id.txt_yemekadi);
        TextView yemek_süre = (TextView) satirView.findViewById(R.id.txt_time);
        TextView yemek_servis = (TextView) satirView.findViewById(R.id.txt_servis);


        // Mevcut pozisyon için kisi nesnesi oluşturuluyor.
        Yemek yemek=(Yemek)list.get(position);



        img_yemek.setImageResource(yemek.getYemek_img());
        yemek_adi.setText(yemek.getYemek_adi());
        yemek_süre.setText(yemek.getYemek_süresi());
        yemek_servis.setText(yemek.getYemek_servis());

//
        // Mevcut satır için işlem tamam ve view return ediliyor.
        return satirView;

    }
}
