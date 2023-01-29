package gun23;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet {
    public static void main(String[] args) {

        int sayi=5; // tek bir rakam tutabilen bir değişken tipi
        int [] dizi=new int[20]; // 1'den fazla sayı saklayabilen değişken, uzunluğu sabit.‼️ burada"20"
        int [][] tablo=new int[20][2]; // 20*2'lik sayı saklayabilen değişken, uzunluğu sabit
        ArrayList<Integer> Liste=new ArrayList<>();// istenildiği kadar sayı eklenebilen ya da silinebilen
        // uzunluğu sabit olmayan bir değişken

        ArrayList<ArrayList<Integer>>ListelerinListesi=new ArrayList<>();

        /*******************************************************/

        // Java bana öyle bir dizi ver ki hem ArrayList gibi olsun hem de TEKRAR değerleri içine almasın❕
        // BENZERSİZ olan değerleri içine alıyor (String,int,double vs)
        //Bu işlemler için tasarlanmış SET ler adı verilen diziler var.
        // 1️⃣HashSet--->  biz ekledikçe hızlı çalışmak için kendine göre bir sıralamada elemanları tutar
        // 2️⃣LinkedHashSet --->  sen ekledikçe EKLENME SIRASINA göre elemanları saklar
        // 3️⃣ TreeSet --->  sen ekledikçe onları her zaman SIRALI tutar (sort yapmış gibi) A-->Z, 1-->9 gibi

        // TC kimlik no, telefon no gibi tekrar edemeyecek değerler için kullanılır
        // bunların ortak özelliği hiç TEKRAR değer bulundurmaz.❕

        HashSet<Integer>hs1=new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(38);
        hs1.add(22);
        hs1.add(4);
        hs1.add(5);
        hs1.add(5);   // bunu eklemiyor
        hs1.add(1);  // bunu eklemiyor
        hs1.add(2); // bunu eklemiyor
        System.out.println("hs1 = " + hs1);
        System.out.println("hs1.size() = " + hs1.size()); // size 6 verir













    }
}
