package gun11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Otopark ücretleri :
        // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 5 den buyukse 20 tl  dir.
        // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız

        Scanner oku= new Scanner(System.in);
        System.out.print("Kaç saat kaldınız=");
        int saat= oku.nextInt();

        if (saat<=3)
            System.out.println("10 TL ödeyiniz");
        else
            if(saat<=5)
                System.out.println("15 TL ödeyiniz");
            else
                System.out.println("20 TL ödeyiniz");
    }
}
