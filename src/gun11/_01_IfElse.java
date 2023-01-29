package gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        // Girilen bir sayıyı poz , neg, sıfır mı yazdırınız yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();



        if (sayi>0)
            System.out.println("POZİTİF");

        else   // if basamağından sonra buraya negatif ve sıfır şartları kaldı

            if (sayi<0)   // bu yüzden 2. If kullanıyoruz
                System.out.println("NEGATİF");
            else
                System.out.println("SIFIR");






    }
}
