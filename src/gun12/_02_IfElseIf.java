package gun12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {

        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("sayi1=");
        int sayi1= oku.nextInt();
        System.out.print("sayi2=");
        int sayi2= oku.nextInt();

        System.out.println("Toplama için T");
        System.out.println("Çıkarma için Ç");
        System.out.println("Bölme için B");
        System.out.println("Çarpma için P");
        System.out.print("Seçiminiz=");

        Scanner oku2=new Scanner(System.in);
        String secim=oku2.next();

        if (secim.equalsIgnoreCase("T"))
            System.out.println("toplam=" +(sayi1+sayi2));
        else
            if (secim.equalsIgnoreCase("Ç"))
                System.out.println("çıkartma=" + (sayi1-sayi2) );
            else
                if (secim.equalsIgnoreCase("B"))
                    System.out.println("bölme=" +(sayi1/sayi2) );
                else
                    if (secim.equalsIgnoreCase("P"))
                        System.out.println("çarpma=" + (sayi1*sayi2));
                    else
                        System.out.println("Verilen işlemlerden birini kullanınız.");



    }
}
