package gun28._01_Constructor;

public class Okul {
    public static void main(String[] args) {

        // 1. YOL  1️⃣
        Ogrenci ogr1 = new Ogrenci(); // nesne olmuşma anı
        // ogr 1 adında nur topu gibi bir bebek dünyaya geliyor ‼️👨‍🍼
        ogr1.id = 1; // özelliklerinin değerlerini veriyoruz
        ogr1.ad = "Özge";
        ogr1.soyad = "Gül Yangın";
        ogr1.sinif = 1;
        System.out.println("ogr1.ad = " + ogr1.ad);


       // 2.YOL  2️⃣
        Ogrenci ogr2=new Ogrenci(2,"Celal","Yangın",4);
        System.out.println("ogr2.ad = " + ogr2.ad);


        // yeni metodla SINIFı belirsiz öğrenci kaydettik
        Ogrenci ogr3=new Ogrenci(3,"Atakan","Batmaz");

    }
}
