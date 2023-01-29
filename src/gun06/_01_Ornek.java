package gun06;

import java.util.Scanner;

public class _01_Ornek {
    public static void main(String[] args) {
        // Kullanıcıdan cadde,sokak,postakodu(int) ve ülke şeklinde adres
        //bilgisi olarak yazdırınız.
        Scanner oku=new Scanner(System.in);
        Scanner sayi=new Scanner(System.in);
        // String ve İnt için ayrı scanner tanımla!!
        System.out.print("Mahalle=" );
        String mahalle=oku.next();

        System.out.print("Sokak=");
        String sokak=oku.next();

        System.out.print("Posta kodu=");
        int pk= sayi.nextInt();

        System.out.print("ulke=");
        String ulke= oku.next();

        System.out.print("Adres="+mahalle+" "+sokak+" "+pk+" "+ulke);

    }
}
