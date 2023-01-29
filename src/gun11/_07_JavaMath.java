package gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {
        // Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner oku= new Scanner(System.in);

        int a= oku.nextInt();
        int b= oku.nextInt();
        int c= oku.nextInt();

        System.out.println("büyük olan sayı=" + Math.max(a, Math.max(b,c)));

        // 2. yöntem
        int enb= Math.max(a,b);
        enb=Math.max(enb,c);
        System.out.println("enb" + enb);

        // 3. yöntem
        int enb2= Math.max(a,Math.max(b,c));
        System.out.println("enb2=" +enb2);
    }
}
