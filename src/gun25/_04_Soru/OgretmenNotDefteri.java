package gun25._04_Soru;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


public class OgretmenNotDefteri {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        Scanner strOku=new Scanner(System.in);
        ArrayList<Ogrenci> sinif=new ArrayList<>();


        for (int i = 0; i <20; i++) {
            Ogrenci ogrBilgi = new Ogrenci();
            System.out.print("Öğrenci okul no: "); ogrBilgi.okulNo= oku.nextInt();
            System.out.print("Öğrenci adı ve soyadı:"); ogrBilgi.tamAd=strOku.nextLine();
            System.out.print("Öğrenci Notu:"); ogrBilgi.not= oku.nextInt();
            sinif.add(ogrBilgi);
        }

        bilgileriYazdir(sinif);
        ortalama(sinif);
    }
    public static void ortalama(ArrayList<Ogrenci> sinif){
        int toplam=0;
        for (Ogrenci ogr: sinif) {
            toplam=toplam+ogr.not;

        }
        System.out.println("ortalama = " + (toplam/ sinif.size()));

    }
    public static void bilgileriYazdir( ArrayList<Ogrenci> sinif){
        for (Ogrenci ogr: sinif) {
            System.out.println("Öğrenci okul no: " +ogr.okulNo);
            System.out.println("Öğrenci adı ve soyası:"+ogr.tamAd);
            System.out.println("Öğrenci Notu:"+ogr.not);
        }


    }
}
