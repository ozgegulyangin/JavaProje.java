package gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // 0-ile sayı arasında ürettik hep peki 4-9 arası sayı nasıl üretilir?
        // Önce aralık kadar normal üret (9-4) yani 0-5 arası
        // üretilmiş olan sayıya min sayıyı ekle (üretilmiş sayı+4)
        // böylece aralığa yerleşmiş ol

        // (int)(Math.Random()*(max-min))+min ‼️

        // Girilen max-min aralığında random sayı ürettiriniz.

        Scanner oku=new Scanner(System.in);
        System.out.print("min=");
        int min= oku.nextInt();
        System.out.print("max=");
        int max=oku.nextInt();

        int randomSayi= (int)(Math.random()*(max-min))+min;
        System.out.println("Random sayı=" +randomSayi);



    }
}
