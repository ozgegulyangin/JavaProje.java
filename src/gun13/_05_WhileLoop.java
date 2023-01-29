package gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {
          // 100 e kadar olan sayıların toplamını bulunuz
        int sayac=1;
        int toplam=0;

        while (sayac<=100){
            int sayi=sayac+1;

            toplam=toplam+sayac;
            sayac++;
            // i++;
            // sayac için "i" kullanılır.!!!


        }

        System.out.println("toplam=" +toplam);

    }
}
