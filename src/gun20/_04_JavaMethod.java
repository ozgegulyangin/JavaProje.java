package gun20;

import java.util.Random;
import java.util.Scanner;

public class _04_JavaMethod {
    public static void main(String[] args) {

        //Kullanıcının gireceği 2 sayının toplamını
        //bir fonksiyonda buldurup, bunun sonucunu main de yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.print("s1=");
        int s1= oku.nextInt();
        System.out.print("s2=");
        int s2= oku.nextInt();

        int toplam=toplamBul(s1,s2);
        System.out.println("toplam=" +toplam);

    }

    public static int toplamBul(int a,int b) {

        int toplam = a+b;
        return toplam;

        // return (a+b);   --> bu şekilde de yapılabiliyor ‼️

    }

}
