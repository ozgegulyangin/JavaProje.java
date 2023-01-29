package gun22;

import java.util.ArrayList;

public class _02_Array2DList {
    public static void main(String[] args) {

        int sayi=5; // tek bir rakam tutabilen bir değişken tipi
        int [] dizi=new int[20]; // 1'den fazla sayı saklayabilen değişken, uzunluğu sabit.‼️ burada"20"
        int [][] tablo=new int[20][2]; // 20*2'lik sayı saklayabilen değişken, uzunluğu sabit

        ArrayList<Integer>Liste=new ArrayList<>();// istenildiği kadar sayı eklenebilen,
        // uzunluğu sabit olmayan bir değişken

       /*************************************************************/

       // 20 kişilik bir sınıf var ve bunların 3 dersi var.Öğrencilerin bu 3 derse ait notlarını
        //nasıl bir değişkende saklayabilirim

        ArrayList<Integer> matNotlari=new ArrayList<>();
        ArrayList<Integer> fizikNotlari=new ArrayList<>();
        ArrayList<Integer> kimyaNotlari=new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizikNotlari.add(60);
        fizikNotlari.add(40);

        kimyaNotlari.add(50);
        kimyaNotlari.add(65);
        kimyaNotlari.add(90);
        kimyaNotlari.add(100);
        System.out.println("matNotlari = " + matNotlari);
        System.out.println("kimyaNotlari = " + kimyaNotlari);
        System.out.println("fizikNotlari = " + fizikNotlari);

        // ArrayListin 2 boyutlu hali lazım bize ‼️   Listlerin Listesi
        ArrayList<ArrayList<Integer>> notlarListesi=new ArrayList<>();
        notlarListesi.add(matNotlari);
        System.out.println("notlarListesi = " + notlarListesi);
        notlarListesi.add(fizikNotlari);
        System.out.println("notlarListesi = " + notlarListesi);
        notlarListesi.add(kimyaNotlari);
        System.out.println("notlarListesi = " + notlarListesi);

        notlarListesi.get(0); // -->  MAT notlarını verir
        System.out.println("notlarListesi = " + notlarListesi);
        int matBirNot=notlarListesi.get(0).get(0);// --> Mat notlarının ilkini alır  ‼️
        System.out.println("Matematik 1. not = " + matBirNot);
        int birNotSec=notlarListesi.get(2).get(1);
        System.out.println("Kimya'nın 2. notu = " + birNotSec);

        // yukarıdakilerin hepsini bir for döngüsüyle yazdıralım

        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println("notlarListesi for döngüsü ile = " + notlarListesi.get(i));

        }

        // ****** SATIR SÜTUN YAZDIRMA ******

        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                //System.out.println("notlarListesi satır sütun = " + notlarListesi.get(i).get(j) +"\t");
                System.out.print(notlarListesi.get(i).get(j)+"\t");
            }
            System.out.println();
        }
         /****************************************************/
        // Dizilerde--> notlar.[i].length ***  2D Arrays tablolarda--> notlar.[i][j] ‼️
        // 2D ArrayList te  notlarListesi.get(i).get(j) ‼️



    }
}
