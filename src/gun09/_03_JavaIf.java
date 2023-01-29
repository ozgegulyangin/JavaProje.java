package gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        // Girilen iki sayıdan büyük olanının değerini ekrana yazdırınız
        // eşit ise esit yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi1=");
        int sayi1= oku.nextInt();
        System.out.print("sayi2=");
        int sayi2=oku.nextInt();

        if (sayi1>sayi2)
            System.out.println("sayi1>sayi2" +"sayi1=" +sayi1);
        if (sayi2>sayi1)
            System.out.println("sayi2>sayi1" +"sayi2="+sayi2);
        if (sayi1==sayi2)
            System.out.println("sayi1=sayi2");


    }
}
