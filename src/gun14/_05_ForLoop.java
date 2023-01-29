package gun14;

import java.util.Scanner;

public class _05_ForLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz

        Scanner oku= new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();   // sayı sınır belirtiyor burada örn; 10'a kadar vs
        int carpim=1;
        int i=1;

        for (i=1; i<=sayi; i++)
            carpim=carpim*i;


        System.out.println("Çarpım=" +carpim);


    }
}
