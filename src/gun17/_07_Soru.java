package gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {
        // 10 Elemanlı bir diziyi random(10) olarak doldurduktan sonra,
        // kullanıcının gireceği bir rakamı arattırınız.
        // bu rakam var ise indexini yazdırınız.

        int[] dizi = new int[10];
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 11);
        }
        System.out.println(Arrays.toString(dizi));
        Scanner oku = new Scanner(System.in);
        System.out.print("rakam giriniz=");
        int rakam = oku.nextInt();
        boolean varMi=false; // BOOLEAN ile sayı dizide var mı yok mu onu ekledim
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == rakam)
                varMi=true;
                System.out.println("var oda numarası=" + i + ".index");

            // Burada döngü olduğu için aynı rakamdan kaç tane varsa indexlerini veriyor,
            // eğer ilkinden sonra dursun istiyorsak BREAK koymamız gerkeiyordu.
        }
        System.out.println("sayı var mı?=" + varMi);
    }
}