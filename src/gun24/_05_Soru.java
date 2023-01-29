package gun24;

import apple.laf.JRSUIUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Soru {
    public static void main(String[] args) {
        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisi ve manasını bir cümle ile yazınız)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secenekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış

        TreeMap<String,String> sozluk=new TreeMap<>();
        Scanner okuStr=new Scanner(System.in);
        Scanner oku=new Scanner(System.in);
        int secim=0;
        do {
            /*menu çıkacak--> seçim alınacak--> seçime göre işlem yapılacak*/
            System.out.print("MENÜ\n1-EKLEME\n2-DÜZELTME\n3-LİSTELEME\n4-ARAMA\n5-SİLME\n6-ÇIKIŞ");
            System.out.println();
            System.out.print("Seçiminizi Yapınız:");

            secim= oku.nextInt();
            switch (secim) {
                case 1:
                    System.out.print("Kelime Giriniz:");
                    String kelime= okuStr.nextLine();
                    System.out.print("Mana Giriniz:");
                    String mana= okuStr.nextLine();
                    System.out.print(sozluk.put(kelime,mana));
                    break;
                case 2:

                    System.out.print("Mana Giriniz:");
                    String manaGir= okuStr.nextLine();
                    System.out.print("Manayı düzeltiniz:");
                    String manaDuzelt= okuStr.nextLine();
                    sozluk.replace(manaGir,manaDuzelt);
                    break;

                case 3:
                    System.out.print("Kelime Giriniz:");
                    String kelimeGir= okuStr.nextLine();
                    System.out.print("Mana Giriniz:");
                    String manaa= okuStr.nextLine();
                    sozluk.put(kelimeGir,manaa);
                    System.out.println("sozluk = " + sozluk.entrySet());break;

                case 4:
                    System.out.println("Kelime:");
                    String kelimeArama= okuStr.nextLine();
                    System.out.print("Mana:");
                    String manasi= okuStr.nextLine();
                    sozluk.put(kelimeArama,manasi);
                    System.out.println("Kelime al = " + sozluk.entrySet());
                    break;



                case 5:
                    sozluk.clear();
                    break;


                case 6: break;
            }
        }while (secim!=6); //"çıkıs olmadığı sürece devam et"












    }
}
