package gun11;

import java.util.Scanner;

public class _05_JavaTernary {
    public static void main(String[] args) {
        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.print("sayı giriniz=");
        int sayi= oku.nextInt();

        System.out.println( (sayi>0) ? "pozitif" :  (sayi<0) ? "negatif"  : "sıfır"  );

        //2.yöntem

        System.out.println(sayi==0 ? "sıfır" : (sayi>0 ? "poz": "neg"));
    }
}
