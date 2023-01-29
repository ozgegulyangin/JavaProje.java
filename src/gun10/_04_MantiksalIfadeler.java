package gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {
    public static void main(String[] args) {
        // Mantıksal İfadeler
        //   &&  ve işaretimiz
        //   ||  veya işaretimiz  (opt+>)

        // Girilen sayı poz ve tek ise ekrana uygun sayı girildi
        // değilse uygun sayı girilmedi yazdırınız
        Scanner oku= new Scanner(System.in);
        System.out.print("Sayi=");
        int sayi= oku.nextInt();

        //  hem TEK hem POZ -> sayı%2==1 && sayi>0


        if (sayi%2==1 && sayi>0) {
            System.out.println("uygun sayı girildi");
        }

        else {
            System.out.println("uygun sayı girilmedi");

        }



    }








}
