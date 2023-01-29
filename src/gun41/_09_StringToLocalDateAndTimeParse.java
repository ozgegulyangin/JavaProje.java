package gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _09_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {


        // kullanıcan alınan ve string durumundaki time veya tarih
        // bilgisinin time veya tarih bilgisine çevirilmesi

        long startTime=System.currentTimeMillis();  // kodun performansı için

        Scanner oku = new Scanner(System.in);
        System.out.print("Tarih giriniz (gg aa yyyy):");
        String strTarih = oku.nextLine();

       // kullanıcının gireceği formata göre format oluşturduk
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy");
        // stringin formatı bu fırmata uygun olmalı. parse ile çevirdik
        LocalDate tarih = LocalDate.parse(strTarih, f);
        System.out.println("tarih = " + tarih);


        long finishTime=System.currentTimeMillis(); // bitis anına burdan
        System.out.println("Geçen süre = " + (finishTime-startTime)+" sn");

    }
}
