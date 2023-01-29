package gun10;

import java.util.Scanner;

public class _06_IfElse {
    public static void main(String[] args) {
        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku= new Scanner(System.in);
        System.out.print("Şifrenizi Giriniz=");
        String Sifre=oku.nextLine();

        //if (Sifre.length()>=8 && Sifre.length()<=12 && !Sifre.contains("pass")) -> DİĞER YÖNTEM

        if (Sifre.length()>=8 && Sifre.length()<=12 && Sifre.toLowerCase().contains("pass")==false)
            System.out.println("kullanılabilir");
        else
            System.out.println("yeniden deneyiniz");




    }
}
