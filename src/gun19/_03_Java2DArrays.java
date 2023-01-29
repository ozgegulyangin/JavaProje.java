package gun19;

import javafx.scene.transform.Scale;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _03_Java2DArrays {
    public static void main(String[] args) {
        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.
        Scanner oku = new Scanner(System.in);
        int[][] tablo = new int[3][2];

        int tekMik = 0;
        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {
                System.out.print("sayı giriniz=");
                tablo[i][j] = oku.nextInt();

                if (tablo[i][j] % 2 != 0)  // kaç tane tek sayı geleceğini bilmediğimiz için
                    // bu işlemle kaç tane tek sayı olacağını ona göre oda sayımızı belirledik 1️⃣
                    tekMik++;
            }
        }
        int [] teklerDizisi = new int[tekMik]; // teklerin miktarı kadar bir dizi tanımlandı 2️⃣

        tekMik = 0;
        for (int i = 0; i < tablo.length; i++) {

            for (int j = 0; j < tablo[i].length; j++) {

                if (tablo[i][j] % 2 != 0){
                    teklerDizisi[tekMik] = tablo[i][j];  // tekler dizisinin elemanlarını burada atadık 3️⃣
                    // tek geldikçe 1 arttırıp kontrol ediyor döngüye girerek
                    tekMik++;}

            }

        }
        System.out.println(Arrays.toString(teklerDizisi));
    }
}