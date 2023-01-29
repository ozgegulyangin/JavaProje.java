package gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {

        // Baklava dilimi--> javadaki adı "if"
        // girilen bir sayı 10'dan büyük ise ekrana 10'dan büyük yazırınız
        // 1-Başla
        // 2- sayi oku   -> int sayi=oku.nextInt()
        // 3- sayi>10 ise ->> if(sayi>10) sout...
        // 4-Dur

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi giriniz=");
        int sayi= oku.nextInt();
        if (sayi>10)
        {  // if şartı sağlandığında yapılacakların parantesi { } (opt 7-0)
            // if in içinde birden fazla komut var ise if parantezleri şarttır.
            // burada tek komut olsaydı {} kullanılmasa da olurdu iki tane sout olduğu için {}kullandık
            // if den sonra  "  ; "  kullanılmıyor, hata veriyor!!! ‼️
            System.out.println("10'dan büyük");
            System.out.println("");
        }
    }
}
