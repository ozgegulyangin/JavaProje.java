package gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {
        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız
        // toplam 3 fonks olacak

        int[] dizi = new int[5]; // int dizi[]= new int[20]   aynı şey
        diziDoldurYazdir(dizi);
        ortalama(dizi);
        enBuyukSayi(dizi);
        enKucukSayi(dizi);
    }

    public static void diziDoldurYazdir(int[] sayi) {
        Scanner oku = new Scanner(System.in);

        for (int i = 0; i < sayi.length; i++) {
            System.out.print("Sayıyı Giriniz=");
            sayi[i] = oku.nextInt();
        }
        System.out.println(Arrays.toString(sayi));
    }

    public static void ortalama(int[] ort) {
        int toplam = 0;
        int ortalama = 0;
        for (int i = 0; i < ort.length; i++) {
            toplam = toplam + ort[i];
            ortalama = toplam / ort.length;
        }
        System.out.println("Ortalama=" + ortalama);
    }

    public static void enBuyukSayi(int[] enB) {
        int max = enB[0];
        for (int i = 0; i < enB.length; i++) {
            if (enB[i] > max)
                max = enB[i];
        }
        System.out.println("En büyük sayı=" + max);
    }


    public static void enKucukSayi(int[] enK) {
        int min = enK[0];
        for (int i = 0; i < enK.length; i++) {
            if (enK[i] < min)
                min = enK[i];
        }
        System.out.println("En küçük sayı=" + min);
    }


}
