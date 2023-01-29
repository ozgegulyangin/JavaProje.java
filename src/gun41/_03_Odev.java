package gun41;

import Utility.MyFunction;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _03_Odev {
    public static void main(String[] args) {
        // geriye doğru akan dijital saat yap

        DateTimeFormatter format = DateTimeFormatter.ofPattern("kk:mm:ss");
        LocalTime saat = LocalTime.now();

        while (true) {
            System.out.print("\r" + saat.format(format));
            saat=saat.minusSeconds(1);
            MyFunction.Bekle(1);



        }

    }
}