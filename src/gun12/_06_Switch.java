package gun12;

import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen bir sayının birler basamağının değerini yazı ile yazdırınız

        Scanner oku=new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();
        int birlerBasamagi=sayi%10;  // birler basamağı sayının 10a bölümünden kalandır yani mod
        // onlar basamağını nasıl alırız: sayi/10 sonra mod 10
        // 567/10 = 56  56%10 ile de 6 yı buluruz böylece 10lar basamağını bulmuş oluruz


        switch (birlerBasamagi) {
            case 0: System.out.println("Sıfır");break;
            case 1: System.out.println("Bir");break;
            case 2: System.out.println("İki");break;
            case 3: System.out.println("Üç");break;
            case 4: System.out.println("Dört");break;
            case 5: System.out.println("Beş");break;
            case 6: System.out.println("Altı");break;
            case 7: System.out.println("Yedi");break;
            case 8: System.out.println("Sekiz");break;
            case 9: System.out.println("Dokuz");break;
            default:System.out.println("geçersiz"); // yazmasak da olur çünkü 0-9 başka seçenek yok



        }




    }
}
