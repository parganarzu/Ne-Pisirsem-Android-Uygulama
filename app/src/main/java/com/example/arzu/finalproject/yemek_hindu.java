package com.example.arzu.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class yemek_hindu extends AppCompatActivity {

    ImageButton ymk1,ymk2,ymk3,ymk4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek_hindu);

        ymk1=(ImageButton)findViewById(R.id.imgbtn1);
        ymk2=(ImageButton)findViewById(R.id.imgbtn2);
        ymk3=(ImageButton)findViewById(R.id.imgbtn3);
        ymk4=(ImageButton)findViewById(R.id.imgbtn4);


       ymk1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent();
               intent.setClass(yemek_hindu.this, Yemek_Bilgi.class);

               String[] yemek_bilgi=new String[5];
               yemek_bilgi[0]="Chicken Tikla";
               yemek_bilgi[1]="Tavuğu bir tavaya alıp tuz, toz kırmızı biber, toz kakule ve limon suyu ile marine edin. Ocaktan alıp soğutun ve buzdolabında 6 saat bekletin. \n" + "\n" + "Süzme yoğurt, gıda boyası ve garam masalayı bir kaseye alıp karıştırın. Marine edilmiş tavukları ekleyip bu karışımla ovun. Tavukları önceden 250 dereceye ayarlanmış fırında 10 dakika ya da şişlere geçirip ızgarada iyice pişirin. Servis tabağına alın.  \n" + "\n" + "Yağı bir tavada ısıtın. Tane kimyon ve soğanı ekleyip pembeleşinceye kadar kavurun. Zencefil ve sarımsağı ekleyip 5 dakika daha soteleyin. Tavukların üzerine ekleyip servis yapın. ";
               yemek_bilgi[2]="500 gr kemiksiz tavuk eti\n" + "10 gr kırmızı toz biber\n" + "5 gr garam masala\n" + "5 gr toz yeşil kakule\n" + "5 gr toz kimyon\n" + "2 limonun suyu\n" + "200 gr süzme yoğurt\n" + "1 gr portakal rengi gıda boyası\n" + "Tuz\n" +"\n" + "Masala sosu için\n" + "250 gr soğan\n" + "100 gr domates\n" + "50 gr domates püresi\n" + "50 gr süzme yoğurt\n" + "5 gr toz kırmızı biber\n" + "50 gr toz kişniş\n" + "5 gr kimyon tohumu\n" + "20 gr zencefil\n" + "20 gr sarımsak ezmesi\n" + "100 ml sıvıyağ\n" + "Tuz";
               int img=R.drawable.chickentikla;
               intent.putExtra("yemek_bilgi",yemek_bilgi);
               intent.putExtra("yemek_img",img);
               startActivity(intent);
           }
       });
        ymk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(yemek_hindu.this, Yemek_Bilgi.class);

                String[] yemek_bilgi=new String[5];
                yemek_bilgi[0]="Dal Makhani";
                yemek_bilgi[1]="Sarımsakları temizleyip kıyın. Yeşil mercimek ve barbunyayı sekiz saat suda bekletin. Suyunu değiştirip mercimeği haşlayın. Pişince ocaktan alıp sudan geçirin. Zencefil ve kıyılmış sarımsağı ekleyip yeniden kaynatın. Kısık ateşte mercimeği iyice pişirin. \n" + "\n" + "Kıyılmış sarımsağı bir tavada soteleyin. Kırmızı toz biber ve domates püresini ekleyin. Birkaç dakika daha soteleyip ocaktan alın. Karışımı ve tereyağını  mercimeğe ilave edip 15 dakika daha pişirin. Son olarak krema ve garam masalayı  ekleyin. Kıyılmış taze kişniş ile süsleyerek servis yapın.  \n";
                yemek_bilgi[2]="500 gr yeşil mercimek\n" + "100 gr barbunya\n" + "100 gr tereyağı\n" + "75 ml krema\n" + "125 gr domates püresi\n" + "25 gr zencefil\n" + "3 diş sarımsak\n" + "10 gr garam masala\n" + "20 gr kırmızı toz biber\n" + "Tuz     ";
                int img=R.drawable.dal;
                intent.putExtra("yemek_bilgi",yemek_bilgi);
                intent.putExtra("yemek_img",img);
                startActivity(intent);
            }
        });
        ymk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(yemek_hindu.this, Yemek_Bilgi.class);

                String[] yemek_bilgi=new String[5];
                yemek_bilgi[0]="Murg Chatpata";
                yemek_bilgi[1]="Tavuk etlerini jülyen doğrayıp haşlayın. Soğan ve dolmalık biberi temizleyip jülyen doğrayın. Domatesin çekirdeklerini ayıklayıp jülyen doğrayın. Tüm malzemeleri bir kaseye alıp karıştırın. Kıyılmış taze kişniş ile süsleyip lavaş ekmeğine sararak servis yapın. ";
                yemek_bilgi[2]="100 gr tavuk göğüs eti\n" + "3 soğan\n" + "2 domates\n" + "2 renkli dolmalık biber\n" + "10 gr kıyılmış taze kişniş\n" + "50 gr tatlı biber sosu\n" + "5 gr toz kırmızı biber\n" + "5 gr garam masala\n" + "Tuz  ";
                int img=R.drawable.murg;
                intent.putExtra("yemek_bilgi",yemek_bilgi);
                intent.putExtra("yemek_img",img);
                startActivity(intent);
            }
        });
        ymk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setClass(yemek_hindu.this, Yemek_Bilgi.class);

                String[] yemek_bilgi=new String[5];
                yemek_bilgi[0]="Punjabi Samosa";
                yemek_bilgi[1]="Patatesleri küp şeklinde doğrayıp bol suda haşlayın. Bezelyeyi haşlayın. \n" + "\n" + "Sıvıyağın 1 çay bardağı kadarını bir tavada ısıtın. Kimyon, kişniş tohumu ve bezelyeyi ekleyip 5 dakika soteleyin. Toz kırmızıbiber, toz kişniş tuzu ekleyip sotelemeye devam edin. Patatesi ilave edip karıştırın. Limon suyu, garam masala ve taze kişnişi de ekleyip karıştırarak soğumaya bırakın. \n" + "\n" + "Hamur için, unu bir kaba eleyin. Tuz, yağ ve suyu ekleyip yoğurun. Hamuru 10 eşit yuvarlak parçaya ayırın. Her bir topu ortadan ikiye bölün. Açarak koni biçiminde parçalar elde edin. Parçalara iç malzemeyi bölüştürün. Hamurların uçlarını ıslatarak birleştirin.  \n" + "\n" + "Kalan yağı bir tavada ısıtıp iç malzemeyle dolu konileri kahverengileşinceye kadar kızartın. Sıcak ya da ılık servis yapın. \n" + "\n" + "Video yemek tarifleri bölümümüzü de ziyaret etmeyi unutmayın.";
                yemek_bilgi[2]="Malzemeler:\n" + "200 gr un\n" + "250 ml sıvıyağ\n" + "Tuz\n" + "\n" + "İç malzeme için:\n" + "100 gr  patates\n" + "50 gr bezelye\n" + "5 gr kimyon\n" + "5 gr gram masala\n" + "5 gr toz kırmızı biber\n" + "5 gr kişniş tohumu\n" + "10 gr toz kişniş\n" + "Yarım çay bardağı limon suyu\n" + "5 gr kıyılmış zencefil\n" + "1 su bardağı su";
                int img=R.drawable.punjabi;
                intent.putExtra("yemek_bilgi",yemek_bilgi);
                intent.putExtra("yemek_img",img);
                startActivity(intent);
            }
        });

    }
}
