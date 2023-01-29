package gun06;

import java.util.Scanner;

public class _04_Ornek_ONEMLİİİ {
    public static void main(String[] args) {
        // Girilen bir stringin son harfini yazdırınız
        Scanner oku= new Scanner(System.in);
        System.out.print("bir cümle giriniz=");
        String cumle= oku.nextLine();
        // 01234  -> bugün de 5 harf var yani uzunluk-1=4 son harfi bulur bilgisayar
        // bugün-> son harfin oda numarası UZUNLUĞUN bir eksiği
        // oda numaraları 0'dan başlar bunlara index denir

        int uzunluk=cumle.length();

        char sonHarf= cumle.charAt(uzunluk-1);
        System.out.println("sonHarf = " + sonHarf);




    }
}
