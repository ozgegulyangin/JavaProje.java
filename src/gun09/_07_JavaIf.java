package gun09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        // Girilen bir cümledeki küçük veya büyük a harfinin olup olmadığını
        // var ya da yok şeklinde yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("cümle=");
        String cumle=oku.nextLine();
        //  cumle= cumle.toLowerCase()
        //  en başa bunu koyduğumuzda cümleyi küçük harfe çevireceğinden direkt if'le devam ederiz.

        if (cumle.toLowerCase().contains("a"))
            System.out.println("VAR");
        if (!cumle.toLowerCase().contains("a"))   // ! yok ise demek ‼️
            System.out.println("YOK");


    }
}
