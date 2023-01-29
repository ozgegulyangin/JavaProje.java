package gun10;

import java.util.Scanner;

public class _03_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi=oku.nextInt();

        if (sayi%2 !=0)
           System.out.println("Tek sayı");
        else
            System.out.println("Çift sayı");

        // 2. yöntem
        if (sayi%2==0)
            System.out.println("Çift sayı");

        else
            System.out.println("Tek sayı");








    }
}
