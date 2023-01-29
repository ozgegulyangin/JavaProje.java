package gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {
        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız
        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi= oku.nextInt();

        if (sayi%2==0) // 2'ye bölümde mod 0 ise sayı çifttir.
            System.out.println("sayı çifttir");

        if (sayi%2 !=0) // 2'ye bölümde mod 1 ise sayi tektir
            System.out.println("sayı tektir");
        // (!= farklı ise) negatif sayılarda da işler
        //  sayi%2 ==1 dersek negatifleri dikkate almaz yani -15%2 =-1 kalır bunu almaz






    }
}
