package gun43;

import java.util.Scanner;

public class _06_ThrowExample2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yeni şifre oluşturma");

        System.out.print("Yeni şifreniz=");
        String newPassword = scan.nextLine();

        try {
            if (newPassword.length() < 8) // bu mesaj ile suni mesaj oluşturduk
                throw new Exception("Şifre en az 8 karakterden oluşmalı");

            if (newPassword.length() > 15) // bu mesaj ile suni mesaj oluşturduk
                throw new Exception("Şifre en fazla 15 karakterden oluşmalı");

        } catch (Exception ex) {

            System.out.println("Lütfen Dikkat!");
            System.out.println(ex.getMessage());
            //log tutma
        }

    }
}
