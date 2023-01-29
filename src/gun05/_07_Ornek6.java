package gun05;

import java.util.Scanner;

public class _07_Ornek6 {
    public static void main(String[] args) {
        // Bir dikdörtgrnin iki kenarını kullanıcıdan isteyip cevresini ve alanını bulunz.
        Scanner oku= new Scanner(System.in);
        System.out.print("a=");
        int a= oku.nextInt();


        System.out.print("b=");
        int b=oku.nextInt();
        int cevre= 2*(a+b);
        int alan=a*b;

        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);

    }
}
