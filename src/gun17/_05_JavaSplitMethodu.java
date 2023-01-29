package gun17;

import java.util.Scanner;

public class _05_JavaSplitMethodu {
    public static void main(String[] args) {
        // Split = Ayırmak
        // Bir Stringi parçalara ayırmak

        // Kullanıcıdan alacağınız cümleyi kelimelerine göre alt alta yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("cumle=");
        String cumle = oku.nextLine();

        String[] kelimeler = cumle.split(" "); // boşluğa göre böldük


        for (int i = 0; i < kelimeler.length; i++) {
            System.out.println("kelimeler=" + kelimeler[i]);
            System.out.println("kelime sayısı=" + i);


        }
    }
}