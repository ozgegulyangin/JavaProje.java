package gun06;

import java.util.Scanner;

public class _06_Ornek_TekrarEEETTTT {
    public static void main(String[] args) {
        // Girilen bir ad soyadı "Özge Yangın" Ö.Y. şeklinde yazınız
        Scanner oku= new Scanner(System.in);
        System.out.print("isim giriniz=");
        String adSoyad= oku.nextLine();

        // Özge Gül'den -> Ö.Y. -> Ö-> charAt(0) Ö.
        // indexOf(" ")-> boşluğun indexini verir, bunun 1 fazlası charAt() -> soyadın ilk harfini verir
        // ad ve soyad arasında boşluk vardır, soyadın en belirgin konumu boşluk sonrasında olması
        // bu konumu belirtiyoruz

        char ilkHarf=adSoyad.charAt(0); // Ö
        int boslukIndex= adSoyad.indexOf(" ");
        char soyadIlkHarf= adSoyad.charAt(boslukIndex+1);

        System.out.println(ilkHarf+"."+soyadIlkHarf+".");

       // char soyadIlkHarf=adSoyad.charAt(adSoyad.indexOf(" ")+1);





    }
}
