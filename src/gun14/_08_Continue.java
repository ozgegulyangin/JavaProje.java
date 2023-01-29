package gun14;

import java.util.Scanner;

public class _08_Continue {
    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz
        // Bu sayılardan 6 ile 10 arasındakiler hariç diğerlerini toplasın.

        Scanner oku=new Scanner(System.in);

        int toplam=0;

        for (int i=0; i<5; i++){
            System.out.print("Bir sayı giriniz=");
            int sayi= oku.nextInt();
            if (sayi>6 && sayi<=10)
                continue; // ÇAlıştığı zaman kendinden sonra gelen komutları pas geçirir
            // 6 ve 10 arası sayı gelirse TOPLAMA‼️

            toplam=toplam+sayi;
            System.out.println("toplam="+toplam);



        }
    }
}
