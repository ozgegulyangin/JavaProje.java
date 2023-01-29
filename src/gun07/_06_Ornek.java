package gun07;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        // Tek seferde girilen bir ad soyadın adını ve soyadını ayırın

        Scanner oku=new Scanner(System.in);
        System.out.print("isim giriniz=");
        String adSoyad= oku.nextLine();


        // Özge Gül ad soyad ayıracağız.
        // ad:0'dan boşluğun indexine kadar gider
        // soyad: boşluk +1'den sonuna kadar gider, index yazmazsak sonuna kadar gider
        // o yüzden önce boşluğun indexini buluyoruz!!!!
        int boslukIndex= adSoyad.indexOf(" ");
        String ad= adSoyad.substring(0,boslukIndex);
        String soyad= adSoyad.substring(boslukIndex+1);

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);









    }
}
