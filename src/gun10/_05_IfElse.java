package gun10;

import java.util.Scanner;

public class _05_IfElse {
    public static void main(String[] args) {
        // Girilen bir stringin uzunluğu 10 dan büyükse ve string içinde
        // "study" kelimesi geçiyorsa ekrana evet yazdırın değilse hayır
        // hayır yazdırınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("x=");
        String x= oku.nextLine();

        if (x.length()>10 && x.contains("study")) {
            System.out.println("evet");
        }
        else {
            System.out.println("hayır"); }


        // büyük küçük harf duyarsız -->

        if (x.length()>10 && x.toLowerCase().contains("study")) {
            System.out.println("EVET"); }
        else {
            System.out.println("HAYIR");}


    }
}
