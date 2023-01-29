package gun13;

import java.util.Scanner;

public class _08_DoWhileOrnek {
    public static void main(String[] args) {
        // Kullanıcıdan x  girilene kadar ekrana "Program çalışıyor" yazan
        // ve x girildiğinde ise "Program bitti" yazan programı yazınız.
        //****************************************/
        /*  harf okuma
         while (okunan Harf Xden Farklı İse) {
            program çalışıyor yaz
        harf okuma 'yı yeniden yapmam gerekiyor

        bunun yerine  do while kullanmak daha mantıklı
         }
        */

        Scanner oku=new Scanner(System.in);
        String okunan;  // aşağıda kullanmak içn önce tanımlıyoruz.

        do {
            System.out.print("ifade giriniz=");
            okunan=oku.next();
            if (!okunan.equalsIgnoreCase("x"))
               System.out.println("program çalışıyor");
        }while (!okunan.equalsIgnoreCase("x"));


            System.out.println("program bitti");
        }

    }

