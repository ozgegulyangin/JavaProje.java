package gun25._02_Soru;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.
        // bu yapıyı oluşturunuz.
        // Daha sonra 3 tane öğrenci bilgilerini kullanıcıdan alarak doldurunuz.
        
        Scanner oku = new Scanner(System.in);
        Scanner strOku=new Scanner(System.in);
        ArrayList<Ogrenci>sinif=new ArrayList<>();

        for (int i = 0; i <3; i++) {
            Ogrenci ogrBilgi = new Ogrenci();
            System.out.print("Öğrenci Adı:");     ogrBilgi.ogrAdi= strOku.nextLine();
            System.out.print("Öğrenci Soyadı:");  ogrBilgi.ogrSoyadi= strOku.nextLine();
            System.out.print("Öğrenci Sınıfı:");  ogrBilgi.ogrSinifi= oku.nextInt();
            System.out.print("Öğrenci Adresi:");  ogrBilgi.ogrAdresi= strOku.nextLine();
            sinif.add(ogrBilgi);
        }

        for (Ogrenci ogr: sinif) {
            System.out.println("Öğrenci Adı = "    + ogr.ogrAdi);
            System.out.println("Öğrenci Soyadi = " + ogr.ogrSoyadi);
            System.out.println("Öğrenci Sinifi = " + ogr.ogrSinifi);
            System.out.println("Öğrenci Adresi = " + ogr.ogrAdresi);
            
        }
       
       /* 1.Yöntem -- uzun
        Ogrenci ogr1 = new Ogrenci();
        System.out.println("Öğrenci Adı:");  ogr1.ogrAdi= strOku.nextLine();
        System.out.println("Öğrenci Soyadı:");  ogr1.ogrSoyadi= strOku.nextLine();
        System.out.println("Öğrenci Sınıfı:");  ogr1.ogrSinifi= oku.nextInt();
        System.out.println("Öğrenci Adresi:");  ogr1.ogrAdresi= strOku.nextLine();

        Ogrenci ogr2 = new Ogrenci();
        System.out.println("Öğrenci Adı:");     ogr2.ogrAdi= strOku.nextLine();
        System.out.println("Öğrenci Soyadı:");  ogr2.ogrSoyadi= strOku.nextLine();
        System.out.println("Öğrenci Sınıfı:");  ogr2.ogrSinifi= oku.nextInt();
        System.out.println("Öğrenci Adresi:");  ogr2.ogrAdresi= strOku.nextLine();
        
        Ogrenci ogr3 = new Ogrenci();
        System.out.println("Öğrenci Adı:");  ogr3.ogrAdi= strOku.nextLine();
        System.out.println("Öğrenci Soyadı:");  ogr3.ogrSoyadi= strOku.nextLine();
        System.out.println("Öğrenci Sınıfı:");  ogr3.ogrSinifi= oku.nextInt();
        System.out.println("Öğrenci Adresi:");  ogr3.ogrAdresi= strOku.nextLine();*/

    }
}

class Ogrenci {
    // properties, field,özellik
    String ogrAdi;
    String ogrSoyadi;
    int ogrSinifi;
    String ogrAdresi;
}