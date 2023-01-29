package gun14;

import java.util.Scanner;

public class _10_ContinueOrnek {
    public static void main(String[] args) {
        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // şekilde yazdırınız, boşlukları yazmasın.

        Scanner oku=new Scanner(System.in);
        System.out.print("Cümle Giriniz:");
        String cumle= oku.nextLine();


         for(int i=0; i<cumle.length(); i++){

             if (cumle.charAt(i)==' ')
                 continue;  // boşlukları es geçmiş oluyoruz


             System.out.println(cumle.charAt(i));  // 0 indexli harf, 1 indx harf, 2 indx harf...


         }


    }
}
