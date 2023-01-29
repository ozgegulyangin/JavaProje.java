package gun14;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {
        //Girilen bir sayıya kadar olan sayılardan,aynı iki sayının çarpımına eşit olan(tam kare)
        //var ise bulunuz.
        // 4 girdim --> bu tam karedir  2*2
        //5 girdim --> değildir
        // 9 girdim --> bu tam karedir  3*3

        Scanner oku=new Scanner(System.in);
        System.out.print("sayı giriniz:");
        int sayi= oku.nextInt();
        int sayac=0;
        int arananRakam=0;
        // boolean buulndu=false; ikinci yöntem

        // 5 girildi , 5 e kadar olan sayıları gözden geçiriyorm 1,2,3,4
        //9 girildi, 9'a kadar olan sayıları gözden geçiriyorum 1,2,3,4,5,6,7,8

        while (sayac<sayi){
            if(sayac*sayac==sayi) {
                System.out.println("tam karedir");
                arananRakam=sayac;
                // buulndu==true -- ikinci yöntem
                break; // çalıştığım döngüden istediğim sonucu alınca çıkar

            }
            sayac++;
        }


         if(arananRakam==0)
             System.out.println("tam kare değildir");

        // if (bulundu==false)   --ikinci yöntem
        // System.out.println("tam kare değildir");




    }
}
