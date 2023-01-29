package gun05;

import java.util.Scanner;

public class _02_Ornek {
    public static void main(String[] args) {
        // girilen bir adı ekrana yazdırınız.
        Scanner okuyucu= new Scanner(System.in);
        // okuyucu yerine ne istersen onu yaz

        System.out.print("adınızı giriiz=");
        String ad= okuyucu.next(); // next() ekrandan bir kelime okur.
        System.out.println("ad = " + ad);


        /*
        okuyucu.next();  -> bir kelime okur
        okuyucu.nextLine(); -> satırın tümünü okur

        okuyucu.nextInt();  -> int değeri okumak için.
        okuyucu.nextShort();  short değeri okumak için
        okuyucu.nextByte();  byte değeri okumak için
        okuyucu.nextFloat();  float değeri okumak için
        okuyucu.nextDouble(); double değeri okumak için */

    }
}
