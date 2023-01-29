package gun13;

import java.util.Scanner;

public class _07_DoWhile {
    public static void main(String[] args) {
        // Kullanıcı 0 değeri girene kadar girdiği sayıların toplamını bulunuz.
        Scanner oku=new Scanner(System.in);
        int sayi;
        int toplam=0;


        do {
            System.out.print("sayi giriniz=");
            sayi= oku.nextInt();
            toplam=toplam+sayi;
        } while (sayi!=0);

        // kontrolün sonda olan hali. Böylece iki kere sayi okutmamıza gerek kalmıyor‼️‼️

        System.out.println("toplam="+toplam);
    }
}
