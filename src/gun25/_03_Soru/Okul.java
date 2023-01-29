package gun25._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
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

    }
}
