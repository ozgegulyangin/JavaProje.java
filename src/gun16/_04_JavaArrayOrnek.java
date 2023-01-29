package gun16;

import java.util.Scanner;

public class _04_JavaArrayOrnek {
    public static void main(String[] args) {
        // Kullanıcıdan alacağınız 7 sayıyı aldıktan sonra
        // kaç tanesinin ortalamadan büyük ve tek sayı olduğunu bulunuz.

        int [] dizi=new int[7];
        Scanner oku= new Scanner(System.in);
        int toplam = 0;
        for (int i = 1; i < dizi.length; i++) {
            System.out.print(i+".Sayıyı Giriniz=");
            dizi[i] = oku.nextInt();
            toplam = toplam + dizi[i];
        }

        int ort = toplam / dizi.length;
        System.out.println("Ortalama=" +ort);
        int kacTane=0;

        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] > ort && dizi[i]%2!=0){
                System.out.println("ortalamadan büyük ve tek olan sayılar=" + dizi[i]);
                kacTane++;
              }
        }
        System.out.println("kaç tanesi ortalamadan büyük ve tek=" +kacTane);




    }
}
