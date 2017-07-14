package com.example.arzu.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class yemek_uzakdogu extends AppCompatActivity {
 TextView name,caption;
    ViewGroup scroll;
    ImageButton img,img2,img3,img4,img5,img6;
    ImageView img_view;

    String[] names={"Siyah Pirinç Pilavı","Tempura","Sushi","Gyu Hire Teri","Nabeyaki Udon"};
    Integer[] images={R.drawable.siyahpirinc,R.drawable.tempura,R.drawable.sushi,R.drawable.bonfile,R.drawable.udon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek_uzakdogu);


        name=(TextView) findViewById(R.id.textView5);
        scroll=(ViewGroup) findViewById(R.id.scrollview);
        img=(ImageButton) findViewById(R.id.imageButton);
        img2=(ImageButton) findViewById(R.id.imageButton2);
        img3=(ImageButton) findViewById(R.id.imageButton3);
        img4=(ImageButton) findViewById(R.id.imageButton4);
        img5=(ImageButton) findViewById(R.id.imageButton5);
        img6=(ImageButton) findViewById(R.id.imageButton6);

        caption=(TextView) findViewById(R.id.textView9);
        img_view=(ImageView) findViewById(R.id.imageView);

        img2.setImageResource(images[0]);
        img3.setImageResource(images[1]);
        img4.setImageResource(images[2]);
        img5.setImageResource(images[3]);
        img6.setImageResource(images[4]);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText(names[0]);
                img.setImageResource(images[0]);
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText(names[1]);
                img.setImageResource(images[1]);
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText(names[2]);
                img.setImageResource(images[2]);
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText(names[3]);
                img.setImageResource(images[3]);
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText(names[4]);
                img.setImageResource(images[4]);
            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(yemek_uzakdogu.this, Yemek_Bilgi.class);

                String[] yemek_bilgi=new String[5];
                int imagess=0;
                if(name.getText().equals("Siyah Pirinç Pilavı")){
                    yemek_bilgi[0]="Siyah pirinç Pilavı";
                    yemek_bilgi[1]="Pirinci ılık suda 15-20 dakika beklettikten sonra yıkayıp süzün. Tereyağını tencerede eritin. Pirinç ve tuzu ekleyip hafif kavurduktan sonra sıcak suyu ilave edin. Tencerenin kapağını kapatın. Kaynamaya başlayınca ocağın altını kısıp suyunu çekene kadar pişirin. Üzerine kağıt havlu kapatıp demlenmeye bırakın. Limon kabuğu rendesiyle süsleyip sıcak servis yapın.";
                    yemek_bilgi[2]="2 su bardağı siyah pirinç\n" + "6 su bardağı sıcak su\n" + "45 g tereyağı\n" + "Tuz";
                    imagess=R.drawable.siyahpirinc;

                }
                else if(name.getText().equals("Tempura")){
                    yemek_bilgi[0]="Tempura";
                    yemek_bilgi[1]= "Yumurta, un ve buzlu suyu bir kapta iyice çırpın. Karides, havuç, mantar, kabak ve taze soğanı unlu karışıma bulayın. Sıvıyağı derin bir tavada kızdırın. Önce havuç, mantar, kabak ve taze soğanı ardından karidesleri kızgın yağda kızartın. \n" + "\n" + "Kâğıt havlu üzerine alıp yağını süzdürün. Yanında soya sosuyla birlikte servis yapın.";
                    yemek_bilgi[2]="1 yumurta\n"+"1 su bardağı un\n"+"1 su bardağı buzlu su\n"+"3 temizlenmiş karides\n"+"1 uzun dilim havuç\n" + "3 dilim mantar\n" + "3 dilim kabak\n"+"1 temizlenmiş taze soğan\n"+"Soya sosu\n"+"Sıvıyağ";
                    imagess=R.drawable.tempura;
                }
                else if(name.getText().equals("Sushi")){
                    yemek_bilgi[0]="Sushi";
                    yemek_bilgi[1]="Japon pirincini bol suyla yıkayıp süzün. Özel tenceresine alıp hafif diri kalacak şekilde pişirin. Pirinçleri harmanlayıp soğutun. Pirinç sirkesi ve şekeri ekleyip tekrar harmanlayın. \n" + "\n" + "Pirinçten iki parmak kalınlığında ve bir parmak uzunluğunda köfte şeklinde parçalar hazırlayın. Pirinç köftelerinin üzerine aynı boyutlarda kesilmiş levrek, tonbalığı, somon veya karides yerleştirin. Servis tabağına dizdiğiniz sushileri zencefil turşusu, dilimlenmiş avokado, salatalık ve soya sosuyla birlikte servis yapın.";
                    yemek_bilgi[2]="100 gr Japon pirinci\n"+"1 çay bardağı pirinç sirkesi\n"+"1 tatlı kaşığı tozşeker\n"+"İnce somon dilimleri\n"+"Buharda pişmiş karides\n"+"İnce dilimlenmiş levrek ve tonbalığı\n"+"İnce dilimlenmiş salatalık ve avokado";
                    imagess=R.drawable.sushi;
                }
                else if(name.getText().equals("Gyu Hire Teri")){
                    yemek_bilgi[0]="Gyu Hire Teri";
                    yemek_bilgi[1]="Ayçiçek yağını tavada kızdırın. Bonfileyi ekleyip iki taraflı pişirin. Mirin ve soya sosunu ekleyip et yumuşayıncaya ve sos koyulaşana kadar kısık ateşte pişirin. \n" + "\n" + "Beyaz lahana yaprağını kıyın. Et piştikten sonra dilimleyip servis tabağına alın. Eti, lahana, salatalık, domates ve dolmalık yeşilbiberle servis yapın.";
                    yemek_bilgi[2]="200 gr bonfile\n"+"2 çorba kaşığı ayçiçek yağı\n"+"Yarım su bardağı mirin (Japon şarabı)\n"+"2 çorba kaşığı soya sosu\n"+ "2 dilim salatalık\n"+"2 dilim domates\n"+"2 halka kesilmiş dolmalık yeşilbiber\n"+"1 yaprak beyaz lahana";
                    imagess=R.drawable.bonfile;
                }
                else if(name.getText().equals("Nabeyaki Udon")){
                    yemek_bilgi[0]="Nabeyaki Udon";
                    yemek_bilgi[1]="Sebzeleri yıkayıp süzün. Pırasayı dilimleyin. Havucu uzunlamasına ortadan ikiye kesip tekrar enine ikiye kesin. Mantarların üzerine bıçakla çizgiler çizin. Çin lahasını iri parçalar şeklinde doğrayın. \n" + "\n" + "Soya yağını tavada kızdırıp sebzeleri soteleyin. Tavayı ocaktan alın. Balık suyunu 'nabe' adını verdikleri güveç kabına alıp ocakta ısıtın. Udonları ekleyip hafifçe yumuşayana kadar pişirin. Sebzeleri ekleyip 5-6 dakika daha pişirin. Üzerine 1 yumurtayı kırıp güveç kabını ocaktan indirin. Özel kaşığı ve kâsesi içinde servis yapın.";
                    yemek_bilgi[2]="3-4 ıspanak yaprağı\n"+"Yarım pırasa\n"+"Yarım havuç\n"+"2-3 shitake mantarı\n"+"1 yaprak Çin lahanası\n"+"2 çorba kaşığı soya yağı\n"+"190 gr udon (noodle veya erişte)\n"+"2 su bardağı balık suyu\n"+"1 yumurta";
                    imagess=R.drawable.udon;
                }
                intent.putExtra("yemek_bilgi",yemek_bilgi);
                intent.putExtra("yemek_img",imagess);
                startActivity(intent);
            }
        });

    }
}
