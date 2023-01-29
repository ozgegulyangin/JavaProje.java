package gun21;

import java.awt.image.ShortLookupTable;
import java.util.ArrayList;
import java.util.Scanner;

public class _03_Arraylist_Soru {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız,
        // Öğretmene devam etmek istiyormusunuz (E/H) şeklinde sorunuz
        // ve ortalamayı geçen öğrenci sayısını bulunuz.
        // koşulda sınır yok ve koşul sonda bu yüzden do while ‼️

        Scanner okuNot = new Scanner(System.in);
        Scanner okuEH=new Scanner(System.in);
        ArrayList<Integer> Notlar = new ArrayList<Integer>();
        int toplam=0;
        String devamMi;
       // Boolean devam=false;

        do {
            //notu giricez
            // notları Arrayliste at
            // girilen notları topla
            //devam etmek istiyor musun(E/H)
            System.out.print("Not Giriniz=");
            int notlar= okuNot.nextInt();
            Notlar.add(notlar);
            toplam=toplam+notlar;
            System.out.print("Devm etmek istiyor musunuz? (E/H)=");
            devamMi=okuEH.next();
            // devam=devamMi.equalsIgnoreCase("E");
        }while (devamMi.equalsIgnoreCase("E"));
        //ortalama bu
        int ort= toplam/ Notlar.size();
        System.out.println("ort = " + ort);
        // gecen sayısını bul
        int gecenSayisi=0;
        for (int i = 0; i < Notlar.size(); i++) {
            if (Notlar.get(i)>ort)
                gecenSayisi++;
        }
        System.out.println("gecenSayisi = " + gecenSayisi);
        }
    }

