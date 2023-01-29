package gun42;

import java.util.Arrays;

public class _03_VeriTipleriMetodda {
    public static void main(String[] args) {
        // ‼️Özet: Temel fark:
        // 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider.Eşitlendiğinde sadece değer aktarılır.
        // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri, bu yüzden ilkel tip gibi davranırlar
        // 3- Referans tipler metoda gönderildiklerinde kendileri giderler. Eşitlemelerde referanslar eşitlenir.

        //ilkel tip
        
        int sayi=5;
        sayiArttir(sayi);  //  hiçbir etkisi  olmaz "SAYI 5 yazar"
        System.out.println("sayi = " + sayi); // 5
        
        // referans tip
        int []dizi={1,2,3};
        diziSifirla(dizi);
        System.out.println("dizi = " + Arrays.toString(dizi)); // [0,0,0]

        // nesne tipler
        String kelime="Özge";
        kelimeSifirla(kelime);
        System.out.println("kelime = " + kelime);
    }
    
    public static void sayiArttir(int sayi){ //  ilkel değerlerin değeri gelir
        // ismine int sayi dememizin bir önemi yok
        sayi++;  // 6
    }
    public static void diziSifirla(int [] dizi){  //ismi dizi olmasa buraya farklı
        // bir isim bile versek Referans değerler kendisi geliyor
        dizi[0]=0;dizi[1]=0;dizi[2]=0;
    }
    public static void kelimeSifirla(String kelime){ // referans tip ama ilkel gibi davranır
        // kendisi değil değeri gelir bu yüzden yukarıda yazdırdığımızda bu metod ilk verdiğimix
        // değeri etkilemez
        kelime="";
    }
}
