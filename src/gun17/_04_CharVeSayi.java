package gun17;

public class _04_CharVeSayi {
    public static void main(String[] args) {
        // A yazdığımızda bilgisayar bunu A olarak saklayamıyor
        // sayı saklayabiliyor bilgisayar harf değil
        // Harfleri rakamla eşleştirerek saklar
        // ascii tablosu deniyor buna

        int sayi=65;
        System.out.println("sayi="+sayi);
        char harf=(char)sayi;
        System.out.println("harf="+harf); // A
        sayi=sayi+32;
        harf= (char)sayi;
        System.out.println("harf="+harf); //a

        char h='k';
        System.out.println((int)h);


        for (int i = 0; i <=255 ; i++) {
            harf=(char) i;
            System.out.println(i+".harf="+harf);
        }
    }
}
