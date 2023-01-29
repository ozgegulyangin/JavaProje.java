package gun05;

import java.util.Scanner;

public class _06_Ornek5 {
    public static void main(String[] args) {
        // Bir karenin kenarını kullanıcıdan isteyip cevresini ve alanını bulunz.

        Scanner oku= new Scanner(System.in);
        System.out.print("a="); // bunu yazmasan da direkt sayı gireibliriz ama bunu yazınca a= şeklinde çıkıyor

        int a=oku.nextInt();
        int cevre= 4*a;
        int alan= a*a;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);




    }
}
