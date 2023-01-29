package gun08;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {
        // kullanıcıdan gireceği 2 sayının birbirine eşit olup olmadığını yazdırınız

        Scanner oku= new Scanner(System.in);
        System.out.print("x=");
        int x= oku.nextInt();
        System.out.print("y=");
        int y= oku.nextInt();
        System.out.println("(Eşit mi=) = " + (x==y));

        // 2. yöntem
        boolean esitMi= (x==y);
        System.out.println("esitMi = " + esitMi);

    }
}
