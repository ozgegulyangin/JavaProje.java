package gun22;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _03_Array2DList {
    public static void main(String[] args) {
        ArrayList<Integer> matNotlari = new ArrayList<>();
        ArrayList<Integer> fizikNotlari = new ArrayList<>();
        ArrayList<Integer> kimyaNotlari = new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizikNotlari.add(60);
        fizikNotlari.add(40);

        kimyaNotlari.add(50);
        kimyaNotlari.add(65);
        kimyaNotlari.add(90);
        kimyaNotlari.add(100);
        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>();
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizikNotlari);
        notlarListesi.add(kimyaNotlari);

        // Soru 1:1️⃣
        // Notları ekrana ders adlarını bir ArrayListten alarak her dersin adını ve notlarını
        // her bir satıra yazdırınız
        // Matematik : 40 50 60
        // Fizik : 30 40
        // Kimya : 70 80 90 100

        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        for (int i = 0; i < notlarListesi.size(); i++) {  // size,yani kaç satır, her bi dersteki tüm notlar
            System.out.print(dersler.get(i) + ":" + "\t"); //----> BU SATIRLA DERS ADI EKLEDİK
            for (int j = 0; j < notlarListesi.get(i).size(); j++) { // her bir satırdaki notları verir
                System.out.print(notlarListesi.get(i).get(j) + "\t");
            }

            System.out.println();
        }
        System.out.println("**************************************");
        // Soru 2: 2️⃣
        // Kullanıcıdan istediği bir dersin no:sunu alarak ()
        // sadece istediği derse ait notları bir metodda yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Ders No (0-Mat,1-Fizik, 2-Kimya)=");
        int dersNo = oku.nextInt();
        dersNotlariniYazdir(notlarListesi, dersNo); // döneni olmadığı için VOİD

        // Dönen olması için not ortalaması bul, toplamlarını bul vs demesi lazım.‼️‼️

        // Soru 3: Yukarıda verilen derse ait not ortalaması ve geçen sayısını bir metodda yazdırınız
        ortVeDersiGecenSayisiBul(notlarListesi, dersNo);


    }

    public static void dersNotlariniYazdir(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo) {
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            System.out.print(notlarListesi.get(dersNo).get(i) + "\t");
        }

    }

    public static void ortVeDersiGecenSayisiBul(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo) {
        int toplam = 0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            toplam += notlarListesi.get(dersNo).get(i);

        }
        int ort = toplam / notlarListesi.get(dersNo).size();
        int gecenMiktari = 0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {

            gecenMiktari++;
        }
        System.out.println("ort = " + ort);
        System.out.println("gecenMiktari = " + gecenMiktari);
    }


}