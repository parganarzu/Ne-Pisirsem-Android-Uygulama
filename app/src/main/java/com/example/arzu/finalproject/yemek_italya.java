package com.example.arzu.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class yemek_italya extends AppCompatActivity {
    List yemek_italya;
    GridView grid;



   String[] web = {"Risotto Alla Pescatore",
       "Pasta", "Tiramisu",
            "Pizza",
            "Cappaletti",
            "Lazanya"

    } ;
    int[] imageId = {
            R.drawable.risottoalla,
            R.drawable.pasta,
            R.drawable.tiramisu,
            R.drawable.pizza,
            R.drawable.cappaletti,
            R.drawable.lazanya
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek_italya);




        yemek_italya = new ArrayList<>();
        yemek_italya.add(new Yemek("Risotto Alla Pescatore","45 dk","4 kişilik",R.drawable.risottoalla,"Soğanları zeytinyağında kavurduktan sonra, üzerine pirinci ilave edip tekrar kavurun. Beyaz şarabı ekleyin. Beyaz şarabı çekince kepçe yardımı ile başka kapta kaynatılan balık suyunu azar azar yedirerek risottoyu pişirin. Pişmeye yakın karışık deniz mahsullerini ekleyip, 5-6 dakika daha pişirin. Fesleğen, kıyılmış maydanoz, tuz, karabiber ve zeytinyağını ekleyip akıcı bir risotto kıvamı olana kadar karıştırın. Risottoyu çukur veya hafif oval bir tabağa alıp, üzerine fesleğen ve ekstra sızma zeytinyağı ilave ederek servis yapın.","280 gr risotto pirinci (Arborio tipi)\n" + "50 gr ince kıyılmış soğan\n" + "50 ml beyaz şarap\n" + "40 ml zeytinyağı\n" + "400 gr karışık kabuklu deniz mahsulleri (karides~vongole~midye~kalamar v.b. )\n" + "100 gr domates sos veya domates püresi\n" + "1 litre balık suyu\n" + "1/3 demet maydanoz\n" + "10 gr fesleğen\n" + "6 gr tuz\n" + "5 gr karabiber"));
        yemek_italya.add(new Yemek("Pasta","30 dk","4 kişilik",R.drawable.pasta,"Tencereye su doldurulup ocağın üzerinde kaynamaya bırakılır.\n" + "\n" + "Kaynayan suyun içerisine tuz ve makarnalar ilave edilip, makarnalar yumuşayıncaya kadar pişirilir.\n" + "\n" + "Makarnalar yumuşayınca ocaktan alınıp, süzgeç yardımı ile suyu süzülür.\n" + "\n" + "Makarnaların birbirine yapışmasını engellemek için, üzerine biraz soğuk su gezdirilir.\n" + "\n" + "Biber yıkanıp ortadan ikiye bölünür ve çekirdeği temizlenip doğranır.\n" + "\n" + "Doğranan biberler, 3 yemek kaşığı sıvı yağ içerisinde kavrulur.\n" + "\n" + "Üzerine sarımsak rendesi ve yarım yemek kaşığı salça ilave edilip, biraz kavrulur.\n" + "\n" + "Kabukları soyulup, küçük küp şeklinde doğranan domatesler ilave edilip, biraz pişirilir.\n" + "\n" + "Son olarak tuz, ince kıyılmış maydanoz ve baharatlar ilave edilip karıştırılır.\n" + "\n" + "Domatesli biberli sos içerisine, suyu süzülen makarnalar ilave edilip, güzelce karıştırılır.\n" + "\n" + "Hazırlanan domatesli biberli makarna, 2-3 dakika daha pişirilip, ocaktan alınır.\n" + "\n" + "Sıcak olarak servis edilir.","Yarım paket makarna (250 gram),\n" + "2 adet domates,\n" + "1 adet biber,\n" + "3 yemek kaşığı sıvı yağ,\n" + "Yarım yemek kaşığı domates salçası,\n" + "1 tutam maydanoz,\n" + "1 diş sarımsak,\n" + "Pul biber,\n" + "Kuru nane,\n" + "Kekik,\n" + "Tuz."));
        yemek_italya.add(new Yemek("Tiramisu","60 dk","5 kişilik",R.drawable.tiramisu,"Öncelikle muhallebi için şeker, un, süt ve yumurta çırpılarak ocakta kaynayıncaya kadar karıştırılarak pişirilir. Kaynadıktan sonra altı kapatılarak ılımaya bırakılır. 15dk kadar bekleyip ılındıktan sonra labne peyniri ilave edilip mikser ile pürüzsüz hale gelene kadar çırpılır. Diğer taraftan sıcak su içinde hazır kahve çözdürülerek hazırlanır ve hafif soğuması beklenir. Servis tabağına pandispanya kekinin bir katı yerleştirilerek kahvenin yarısı ile ıslatılır. Üzerine kremanın yarısı ilave edilip kalan kahve ile üst kat da ıslatıldıktan sonra ikinci kat kapatılır. Kalan krema da dökülerek pastanın üzeri ve kenarları güzelce kapatılır. Son olarak pastanın üzerine süzgeç yardımı ile kakao serpilir. Buzdolabında birkaç saat dinlendirildikten sonra dilimlenerek servis edilir. ","1 adet hazır pandispanya keki\n" + "\n" + "muhallebisi için;\n" + "2.5 su bardağı süt\n" + "3 yemek kaşığı toz şeker (tepeleme dolu)\n" + "3 yemek kaşığı un (tepeleme dolu)\n" + "1 adet yumurta\n" + "200 gram labne peyniri (1 paket)\n" + "\n" + "ıslatmak için;\n" + "1/2 su bardağı sıcak su\n" + "3’ü bir arada hazır kahve\n" +"\n" + "üzeri için;\n" + "kakao"));
        yemek_italya.add(new Yemek("Pizza","80 dk","6 kişilik",R.drawable.pizza,"Hamuru için; bir kaba mayayı, şekeri ve ılık sütü koyup karıştıralım.\n" + "\n" + "Bu şekilde 10 dakika bekletelim.\n" + "\n" + "Kabaran mayanın içine sıvı yağı, yumurtayı ve tuzu koyup iyice karıştıralım.\n" + "\n" + "Üzerine azar azar unu ilave edip yumuşak kıvamlı bir hamur yoğuralım.\n" + "\n" + "Hamurun üzerini kapatıp ılık bir ortamda 30 dakika mayalandıralım. Hamurumuz iki katına çıkmalı.\n" + "\n" + "Sosu için; salçayı, sıvı yağı, sarımsağı, kekiği, karabiberi ve tuzu koyup iyice karıştıralım.\n" + "\n" + "Yuvarlak bir tepsiyi ya da fırın tepsisini yağlayalım.\n" + "\n" + "Hamurun yarısını tepsiye alalım.\n" + "\n" + "Elimizi sıvı yağı ile yağlayıp hamuru nazik hareketlerle tepsiyi kaplayana kadar yayalım.\n" + "\n" + "Hamurun her yerine çatal ile delikler açalım. (pişerken kabarmaması için)\n" + "\n" + "Hazırladığımız hamurun üzerine hazırladığımız sostan sürelim.\n" + "\n" + "Rendelenmiş kaşarın yarısını sosun üzerine serpelim.\n" + "\n" + "Sonra üzerine sıra ile sucuğu, salamı, mantarı, çekirdekleri çıkarılmış zeytini, mısırı, ince ince doğradığımız sivri biberi ve domatesi yerleştirelim.\n" + "\n" + "Önceden ısıtılmış 200° fırında 20 dakika pişirelim.","5 su bardağı un,\n" + "1 paket instant maya (10 gr),\n" + "1 yemek kaşığı toz şeker,\n" + "1,5 su bardağı ılık süt,\n" + "Yarım su bardağı sıvı yağı,\n" + "1 adet yumurta,\n" + "1 tatlı kaşığı tuz.\n"+ "Sucuk,\n" + "Salam,\n" + "Mantar,\n" + "Zeytin,\n" + "Sivri biber,\n" + "Domates,"));
        yemek_italya.add(new Yemek("Cappaletti","100 dk","5 kişilik",R.drawable.cappaletti,"Hindi ve tavuk etlerini bir tencerede bol suyla haşlayın. Ayıklayıp didikleyin. Tereyağını bir tavada eritin. Etleri ekleyerek 2 dakikadan fazla olmamak şartıyla orta ateşte soteleyin. Sertleşmemesine ve kızarmamasına özen gösterin. Soğuması için büyük bir kaseye alın.  \n" + "\n" + "Jambonu çok ince doğrayın. Etler soğuduğunda peynir, hindistancevizi, tuz, biber ve yumurtayı bir kaşıkla iyice karıştırıp kenara ayırın. \n" + "\n" + "Yumurtaları çırpın. Una yavaş yavaş yedirerek tuzsuz ve yağsız bir hamur elde edin. Hamuru incecik açın. 5 cm genişliğinde uzun şeritlere ve sonra 5 cm’lik karelere bölün. Her parçanın içine bir çay kaşığı kadar malzeme koyup şekillendirerek kapatın. Hamurun yapışması için sık sık sütle ıslatın. \n" + "\n" + "Bir tepsiye mutfak bezi serip üzerine un serpin ve kestiğiniz hamurları dizip kuruması için bırakın. Kuruduktan sonra da buzdolabında 4 saat kadar dinlendirin. \n" + "\n" + "Büyük bir tencerede su kaynatın. Cappalettileri içine atın. Sık sık karıştırarak ağır ateşte 35 dakika pişirin. Ocaktan alıp süzün. Üzerine parmesan peyniri serpip servis yapın. ","300 gr un\n" + "3 yumurta\n" + "1 fincan süt\n" + "İç malzeme\n" + "30 gr tuzsuz tereyağı\n" + "125 gr tavuk göğüs eti\n" + "125 gr hindi eti\n" + "150 gr dana jambon\n" + "30 gr parmesan peyniri\n" + "1 yumurta\n" + "Bir tutam hindistancevizi\n" + "Yarım çay kaşığı tuz\n" + "Yarım çay kaşığı beyaz biber"));
        yemek_italya.add(new Yemek("Lazanya","65 dk","5 kişilik",R.drawable.lazanya,"Geniş bir tavaya sıvı yağı alın. Küçük küçük doğradığınız soğanları ilave edin, biraz kavurduktan sonra üzerine kıymayı ilave ederek kavurmaya devam edin. Kıymalar yeterince kavrulunca doğradığınız sarımsakları ve kabuğunu soyup küp küp doğradığınız domatesleri de ilave edin ve orta ateşte 10 dakika kadar daha soteleyin. Üzerine salçayı ekleyerek kavurun ve yaklaşık 1 su bardağı sıcak su ekleyin. Tuzunu da ekledikten sonra ocaktan alıp soğumaya bırakın. Beşamel sos için tereyağı ve unu küçük bir tencereye koyun ve orta ateşte kavurun. Üzerine sütü azar azar ekleyin ve topaklanmaması için sürekli çırparak karıştırın. Muhallebi kıvamına gelince ocaktan alın.\n" + "Kıymalı sos ve beşamel sos hazırlandıktan sonra ısıya dayanıklı bir fırın kabını biraz yağlayın ve tabanına lazanya dizin. Lazanyaların üzerine biraz beşamel sos dökerek güzelce yayın. Ardından üzerine kıymalı harçtan dökün. Üzerine tekrar lazanya koyun. Bu işlemi malzemeleriniz bitene kadar devam ettirin. En üstteki lazanyalara tekrar beşamel sos dökün ve kaşar peyniri rendesi serpin. Lazanyaların yumuşaması için 10-15 dakika kadar bekletin.. Son olarak 180 derece fırında yaklaşık 15 dakika pişirin. Üzeri tamamen kızarınca dilimleyerek servis yapın.","Yarım paket lazanya\n" + "300 g kıyma\n" + "2 adet  soğan\n" + "2 adet domates\n" + "2 yemek kaşığı salça\n" + "3 yemek kaşığı sıvı yağ\n" + "2 diş sarımsak\n"+"2 yemek kaşığı tereyağı\n" + "4 yemek kaşığı un\n" + "2 su bardağı süt"));




        grid=(GridView)findViewById(R.id.grid);
        grid.setAdapter(new CustomGrid(yemek_italya.this, web, imageId));
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(yemek_italya.this, Yemek_Bilgi.class);

                if(position==0){
                  Yemek italya= (Yemek)yemek_italya.get(position);

                    String[] yemek_bilgi=new String[5];
                    yemek_bilgi[0]=italya.getYemek_adi();
                    yemek_bilgi[1]=italya.getYapilisi();
                    yemek_bilgi[2]=italya.getMalzemeler();
                    int img=italya.getYemek_img();
                    intent.putExtra("yemek_bilgi",yemek_bilgi);
                    intent.putExtra("yemek_img",img);
                    startActivity(intent);
                }
                else if(position==1){
                    Yemek italya= (Yemek)yemek_italya.get(position);

                    String[] yemek_bilgi=new String[5];
                    yemek_bilgi[0]=italya.getYemek_adi();
                    yemek_bilgi[1]=italya.getYapilisi();
                    yemek_bilgi[2]=italya.getMalzemeler();
                    int img=italya.getYemek_img();
                    intent.putExtra("yemek_bilgi",yemek_bilgi);
                    intent.putExtra("yemek_img",img);
                    startActivity(intent);
                }
                else if(position==2){
                    Yemek italya= (Yemek)yemek_italya.get(position);

                    String[] yemek_bilgi=new String[5];
                    yemek_bilgi[0]=italya.getYemek_adi();
                    yemek_bilgi[1]=italya.getYapilisi();
                    yemek_bilgi[2]=italya.getMalzemeler();
                    int img=italya.getYemek_img();
                    intent.putExtra("yemek_bilgi",yemek_bilgi);
                    intent.putExtra("yemek_img",img);
                    startActivity(intent);
                }
                else if(position==3){
                    Yemek italya= (Yemek)yemek_italya.get(position);

                    String[] yemek_bilgi=new String[5];
                    yemek_bilgi[0]=italya.getYemek_adi();
                    yemek_bilgi[1]=italya.getYapilisi();
                    yemek_bilgi[2]=italya.getMalzemeler();
                    int img=italya.getYemek_img();
                    intent.putExtra("yemek_bilgi",yemek_bilgi);
                    intent.putExtra("yemek_img",img);
                    startActivity(intent);
                }
                else if(position==4){
                    Yemek italya= (Yemek)yemek_italya.get(position);

                    String[] yemek_bilgi=new String[5];
                    yemek_bilgi[0]=italya.getYemek_adi();
                    yemek_bilgi[1]=italya.getYapilisi();
                    yemek_bilgi[2]=italya.getMalzemeler();
                    int img=italya.getYemek_img();
                    intent.putExtra("yemek_bilgi",yemek_bilgi);
                    intent.putExtra("yemek_img",img);
                    startActivity(intent);
                }
                else if(position==5){
                    Yemek italya= (Yemek)yemek_italya.get(position);

                    String[] yemek_bilgi=new String[5];
                    yemek_bilgi[0]=italya.getYemek_adi();
                    yemek_bilgi[1]=italya.getYapilisi();
                    yemek_bilgi[2]=italya.getMalzemeler();
                    int img=italya.getYemek_img();
                    intent.putExtra("yemek_bilgi",yemek_bilgi);
                    intent.putExtra("yemek_img",img);
                    startActivity(intent);
                }

            }
        });

    }
}


