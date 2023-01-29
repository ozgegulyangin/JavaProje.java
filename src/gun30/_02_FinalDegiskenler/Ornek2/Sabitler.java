package gun30._02_FinalDegiskenler.Ornek2;

import java.util.Scanner;

public class Sabitler {

    final static int saat = 24;
    final static int dakika = 60;
    final static int saniye = 60;

    // hem değiştirilemez :hem de bir tane olan değerler
    // final              :      static

    public static int hesapla(int gun, int saat, int dakika) {
        int toplamSaniye =
                gun
                        * Sabitler.saat * Sabitler.dakika * Sabitler.saniye
                        + Sabitler.saat
                        * Sabitler.dakika * Sabitler.saniye
                        +
                        Sabitler.dakika * Sabitler.saniye;
        return toplamSaniye;
    }


}

