package gun20;

public class _06_JavaMethods {
    public static void main(String[] args) {

        int s1 = 4;
        int s2 = 8;
        int s3 = 54;
        int s4 = 85;

        int sonuc1 = toplamBul("Özge",s1, s2);
        System.out.println("sonuc1 = " + sonuc1);
        int sonuc2 = toplamBul("Celal",s1, s2, s3);
        System.out.println("sonuc2 = " + sonuc2);
        int sonuc3 = toplamBul("Yangın",s1, s2, s3, s4);
        System.out.println("sonuc3 = " + sonuc3);

    }
    // ... ile ilgili 2 kural var
    // 1- Bir metodda parametre olarak sadece 1 tane olabilir.
    // 2- Her zaman son parametre olmalı

   // int sonuc1 = toplamBul(s1, s2, "Özge"); bu şekilde olamıyor
    // gelen kaç sayı olursa olsun hepsini al dizi şeklinde metoda al

    public static int toplamBul(String isim,int... sayilar){  // aynı işlemi yapacaksak/kullanacaksak
        // tiplerin yanına 3 nokta koyarak yapabiliyoruz
        int toplam=0;
        System.out.println("isim = " + isim);
        for (int i = 0; i < sayilar.length; i++) {
            toplam=toplam+sayilar[i];
        }
        return toplam;
    }
   /*
    public static int toplamBul(int a, int b) {
        return a + b;
    }

    public static int toplamBul(int a, int b, int c) {
        return a + b + c;
    }

    public static int toplamBul(int a, int b, int c, int d) {
        return a + b + c + d;
    }
*/

}
