package gun10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {
        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner oku= new Scanner(System.in);
        System.out.print("Sayıları Giriniz=");
        String sayilar= oku.nextLine();
        int bosluk=sayilar.indexOf(" ");
        String strSayi1= sayilar.substring(0,bosluk);
        sayilar=sayilar.replaceFirst(" ",".").replace(" ","_");
        int nokta= sayilar.indexOf(".");
        int altTire=sayilar.indexOf("_");
        String strSayi2= sayilar.substring(nokta+1,altTire);
        sayilar=sayilar.replace("."," ").replace("_"," ");
        int bosluk2=sayilar.lastIndexOf(" ");
        String strSayi3= sayilar.substring(bosluk2+1);
        int sayi1=Integer.parseInt(strSayi1);
        int sayi2=Integer.parseInt(strSayi2);
        int sayi3=Integer.parseInt(strSayi3);
        int toplam= (sayi1+sayi2+sayi3);

        if (toplam%2!=0) {
            System.out.println("TEK");
        }
        else {
            System.out.println("ÇİFT");
        }



    }
}
