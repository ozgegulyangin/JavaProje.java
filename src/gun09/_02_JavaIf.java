package gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {
        // Girilen sayının negatif mi poz mi old. yazınız
        // sıfır ise sıfır yazınız

        Scanner oku= new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi=oku.nextInt();

        if (sayi >0)
            System.out.println("pozitif");

        if (sayi<0)
            System.out.println("negatif");

        if (sayi==0)
            System.out.println("sıfır");




    }
}
