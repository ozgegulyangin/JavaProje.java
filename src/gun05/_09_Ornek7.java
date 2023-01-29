package gun05;

import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class _09_Ornek7 {
    public static void main(String[] args) {
        // Kullanıcıdan ağılığını double, boyunu double olarak alınız.
        //ve bir satırda boyunuz.. ve kilonuz.. şeklinde yazınız.
        // vki de bularak yazdırınız. (kg/(boy*boy)
        Scanner oku= new Scanner(System.in);
        System.out.print("kilo=");
        double kilo= oku.nextDouble();
        System.out.print("boy=");
        double boy= oku.nextDouble();
        double vki= kilo/(boy*boy);

        System.out.println("kilo = " + kilo+" " +"boy = " + boy );

        System.out.println("vki = " + vki);
    }
}
