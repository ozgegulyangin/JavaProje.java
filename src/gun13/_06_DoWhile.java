package gun13;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {
        // Kullanıcı 0 değeri girene kadar girdiği sayıların toplamını bulunuz.
        Scanner oku=new Scanner(System.in);
        int sayi;
        int toplam=0;

        System.out.println("sayi giriniz=");
        // aşağıda sayı döngüye girecek bu yüzden ilk girdiği sayının değerinin burada belli olması lazım.
        sayi=oku.nextInt();
        toplam=toplam+sayi;

        while (sayi !=0) {

            // alttaki işlemler sayesinde sayı 0'dan farklıysa tekrar tekrar 0 girilene kadar sayı ister
            System.out.println("sayi giriniz=");
            sayi= oku.nextInt();

        }
        System.out.println("toplam=" +toplam);

    }
}
