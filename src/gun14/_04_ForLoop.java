package gun14;

import java.util.Scanner;

public class _04_ForLoop {
    public static void main(String[] args) {
        // Kullanıcının gireceği bir rakama kadar olan sayıların toplamını bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi = oku.nextInt();
        int toplam=0;
        int i=1;


        for (i=1; i<=sayi; i++)
            toplam=toplam+i;  // toplam+=i;

        System.out.println("toplam="+toplam);

    }
}
