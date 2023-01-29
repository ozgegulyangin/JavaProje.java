package gun41;

import Utility.MyFunction;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    public static void main(String[] args) {
        // Canlı dijital saat yapınız
        DateTimeFormatter format = DateTimeFormatter.ofPattern("kk:mm:ss");

        while (true) {
            LocalTime saat = LocalTime.now();
            System.out.print("\r" + saat.format(format));
            MyFunction.Bekle(1);

            //   ---->   \r  çıktıyı her seferınde silip yeniden yazdırıyo
        }

    }
}