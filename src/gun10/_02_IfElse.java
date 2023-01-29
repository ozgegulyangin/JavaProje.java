package gun10;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Vize notu giriniz=");
        int vize= oku.nextInt();
        System.out.print("Final Notu Giriniz=");
        int finalNotu= oku.nextInt();

        double ortalama=(double) (vize+finalNotu)/2;  // kusüratlı cevap çıkabilir double yapabiliriz


        if (ortalama>=60)
            System.out.print("Geçtiniz,Tebrikler.");
        else
            System.out.print("Bütünlemeye kaldınız.");

    }
}
