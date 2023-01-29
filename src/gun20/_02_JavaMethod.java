package gun20;

import java.util.Scanner;

public class _02_JavaMethod {
    public static void main(String[] args) {

// Kullanıcının gireceği 2 sayıdan büyük olanını bulma işlemini bir metodda
        // yaptıktan sonra main de yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("1.sayıyı giriniz=");
        int sayi1 = oku.nextInt();

        System.out.print("2.sayıyı giriniz=");
        int sayi2= oku.nextInt();

        int enb=enBuyukBul(sayi1,sayi2);
        System.out.println("enb = " + enb);
    }
    public static int enBuyukBul(int s1,int s2){

        int donecek=0;
        // 1. yöntem1️⃣
       /* if (s1>s2)
            donecek=s1;
        else
            donecek=s2;
        return donecek;*/

        // 2. yöntem  2️⃣
       // return s1>s2 ? s1 :s2;

        // 3. yöntem ‼️3️⃣

        if (s1>s2)
            return s1;
        else
            return s2;

    }
}