package gun30._01_StaticDegiskenler.Ornek1;

import gun30._01_StaticDegiskenler.Ornek1.Ogrenci;

public class Okul {
    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci("Özge", "Gül Yangın");
        System.out.println("ogr1 = " + ogr1);

        Ogrenci.okulAd = "Atatürk İlkokulu";  // burada yeni okul tanımadığımız andan
        //itibaren yeni girilecek her öğrenciye bu okulu veriyor.
        // class'ta okulAdi'nı STATİC ile aldığımız an tüm okulAd'larını ortak almış olduk
        System.out.println("ogr1 tekrar = " + ogr1);
        // Aynı verinin çok kez girişi engellendi
        // Aynı verinin hazıfazada NESNE sayısı kadar tekrarlanması engellendi
        Ogrenci ogr2=new Ogrenci("Celal","Yangın");
        System.out.println("ogr2 = " + ogr2);


    }

}
