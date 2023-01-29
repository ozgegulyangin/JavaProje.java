package gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Yeni şifre oluşturma");

        System.out.print("Yeni şifreniz=");
        String newPassword=scan.nextLine();

        if(newPassword.length()<8)
        {
            System.out.println("Lütfen dikkat!");
            System.out.println("Şifre en az 8 karakterden oluşmalı");
            //log tutma : kullanıcı 8 karakterden az deneme yaptı
        }
        if (newPassword.length()>15)
        {
            System.out.println("Lütfen dikkat!");
            System.out.println("Şifre en fazla 15 karaktarden oluşmalı");
            //log tutma
        }
    }
}
