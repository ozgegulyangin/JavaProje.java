package gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {
        // 50 kişilik bir sınıfın notlarını giriniz ve ortalamadan büyük
        // kaç not olduğunu bulunuz ve bunları yazdırınız

        int[] notlar = new int[50];  // 50 tane int kutusu oluşturuldu ‼️
        Scanner oku = new Scanner(System.in);
        int toplam = 0;
        for (int i = 1; i < notlar.length; i++) {
            System.out.print(i+".Notu Giriniz=");
            notlar[i] = oku.nextInt();
            toplam = toplam + notlar[i];
        }

        int ort = toplam / notlar.length;
        System.out.println("Ortalama=" +ort);
        int gecenler = 0;
        for (int i = 0; i < notlar.length; i++) {

            if (notlar[i] > ort){
                System.out.println("ortalamadan büyük olan notlar=" + notlar[i]);
                gecenler++;}
        }
        System.out.println("Geçenler=" + gecenler);














        }
}
