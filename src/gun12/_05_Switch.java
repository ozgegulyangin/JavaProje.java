package gun12;

import java.util.Scanner;

public class _05_Switch {
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

        switch (secim.toUpperCase()){
            case "T": System.out.println(sayi1+sayi2); break;
            case "Ç": System.out.println(sayi1-sayi2);break;
            case "B": System.out.println(sayi1/sayi2);break;
            case "P": System.out.println(sayi1*sayi2);break;
            default: System.out.println("Geçersiz bir işlem denediniz");


        }
    }
}
