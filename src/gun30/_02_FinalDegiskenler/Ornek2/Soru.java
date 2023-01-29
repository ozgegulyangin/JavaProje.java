package gun30._02_FinalDegiskenler.Ornek2;

import java.util.Scanner;

public class Soru {
    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan gun, saat, dakika alarak toplam
    // saniyeyi bulunuz.

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Gün:");
        int gun=oku.nextInt();
        System.out.print("Saat:");
        int saat=oku.nextInt();
        System.out.print("Dakika:");
        int dakika=oku.nextInt();


        int toplamSaniye=
                gun * Sabitler.saat * Sabitler.dakika * Sabitler.saniye
                + Sabitler.saat * Sabitler.dakika * Sabitler.saniye +
                Sabitler.dakika * Sabitler.saniye;
        System.out.println("toplamSaniye = " + toplamSaniye);

        //2. yöntem
        System.out.println("Toplam Saniye=" + Sabitler.hesapla(gun,saat,dakika));


    }
}
