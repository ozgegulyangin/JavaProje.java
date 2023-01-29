package gun08;

import java.util.Scanner;

public class _07_Ornek {
    public static void main(String[] args) {
        // girilen bir sayının tek sayı olup olmadığını yazdırınız.
        Scanner oku= new Scanner(System.in);
        System.out.print("x=");
        int x= oku.nextInt();
        int kalan= x%2; // bu 1'e eşitse tek sayıdır.
        System.out.println("tek mi?=" +(kalan==1));
        System.out.println("tek mi?=" +((x%=2)==1)); // 2. yöntem

        System.out.println("x = " + (x%2 != 0)); //3. yöntem negatif girilme durumunda doğru çalışır
        // EN DOĞRUSU BU


        // 3 9 17 24249 726417 tek sayılardır. 2'ye bölümünden kalan 1 ise tektir.
        // MOD kullanıcaz!!

    }
}
