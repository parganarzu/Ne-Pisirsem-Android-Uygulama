package com.example.arzu.finalproject;

/**
 * Created by arzu on 23.12.2016.
 */

public class Yemek {

    private String yemek_adi;
    private String yemek_süresi;
    private String yemek_servis;
    private int yemek_img;
    private String yapilisi;
    private String malzemeler;





    public Yemek(String ad,String süre,String servis,int img,String yapilisi,String malzemeler){
        this.setYemek_adi(ad);
        this.setYemek_süresi(süre);
        this.setYemek_servis(servis);
        this.setYemek_img(img);
        this.setYapilisi(yapilisi);
        this.setMalzemeler(malzemeler);



    }
    public String getMalzemeler() {
        return malzemeler;
    }

    public void setMalzemeler(String malzemeler) {
        this.malzemeler = malzemeler;
    }






    public String getYapilisi() {
        return yapilisi;
    }

    public void setYapilisi(String yapilisi) {
        this.yapilisi = yapilisi;
    }



    public String getYemek_adi() {
        return yemek_adi;
    }

    public void setYemek_adi(String yemek_adi) {
        this.yemek_adi = yemek_adi;
    }

    public String getYemek_süresi() {
        return yemek_süresi;
    }

    public void setYemek_süresi(String yemek_süresi) {
        this.yemek_süresi = yemek_süresi;
    }

    public String getYemek_servis() {
        return yemek_servis;
    }

    public void setYemek_servis(String yemek_servis) {
        this.yemek_servis = yemek_servis;
    }

    public int getYemek_img() {
        return yemek_img;
    }

    public void setYemek_img(int yemek_img) {
        this.yemek_img = yemek_img;
    }
}
