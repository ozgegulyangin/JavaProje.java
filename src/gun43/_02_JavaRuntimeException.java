package gun43;

import java.util.Scanner;

public class _02_JavaRuntimeException {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            try {
                Scanner oku = new Scanner(System.in);

                System.out.print("Sayi 1=");
                int sayi1 = oku.nextInt();

                System.out.print("Sayi 2=");
                int sayi2 = oku.nextInt();

                int bolum = sayi1 / sayi2;
                System.out.println("bolum = " + bolum);

            } catch (Exception hata) {
                System.out.println("hata = " + hata.getMessage());
                System.out.println("Lütfen tekrar deneyiniz.");
                i--;
            }
        }
        System.out.println("program bitti");
    }
}
