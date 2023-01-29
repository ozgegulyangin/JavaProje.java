package gun05;

import java.util.Scanner;

public class _08_Double_Deneme {
    public static void main(String[] args) {
        Scanner oku= new Scanner(System.in);
        System.out.print("bir DOUBLE deger giriniz=");
        // double değeri Virgüllü girmeyince hata veriyor.
        double deger=oku.nextDouble();
        System.out.println("deger = " + deger);

    }
}
