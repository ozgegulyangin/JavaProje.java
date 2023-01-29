package gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        //  Kullanıcının 2 kez gireceği şifresinin aynı olup olmadığını
        // AYNI veya DEĞİL şeklinde yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("şifre=");
        String sifre= oku.nextLine();
        System.out.print("yeniden gir=");
        String yenidengir= oku.nextLine();


        if (sifre.equals(yenidengir))
            System.out.println("AYNI");

        if (!sifre.equals(yenidengir))
            System.out.println("DEĞİL");


    }
}
