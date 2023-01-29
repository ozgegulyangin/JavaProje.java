package gun11;

import java.util.Scanner;

public class _03_JavaTernary {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayının tek mi çift mi old yazınız

        Scanner oku= new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi= oku.nextInt();

        String sonuc= (sayi%2 == 0) ? "çift" : "tek";
        // ? -> if     : -> else    yerine kullanılıyor
        System.out.println("sonuc=" + sonuc);

        System.out.println( ((sayi%2 == 0) ? "çift" : "tek"));


    }
}
