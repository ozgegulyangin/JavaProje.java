package gun10;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir öğrenci notuna göre 50'den büyük eşit ise geçtiniz
        // küçük ise kaldınız yazınız

        Scanner oku= new Scanner(System.in);
        System.out.print("Notu giriniz=");
        int not= oku.nextInt();

        /* 1. yöntem
        if (not>=50)
            System.out.println("geçtiniz");
        if (not<50)
            System.out.println("kaldınız");  */

        // 2. Yöntem
        // her zaman tek bir kontrol yapar : baklava dilimi

        if (not>=50)
            System.out.println("Geçtiniz");   // evet
        else
            System.out.println("Kaldınız");  // hayır


    }
}
