package gun05;

import java.util.Scanner;

public class _04_Ornek3 {
    public static void main(String[] args) {
        //KUllanıcının adını ve soyadını ayrı ayrı okutarak alıp
        //birlikte ekrana yazdırınız.
        Scanner oku =  new Scanner(System.in);
        System.out.print("Adınız=");
        String ad= oku.next();

        System.out.print("Soyadınız=");
        String soyad= oku.next();

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("adınız ve soyadınız=" +ad+" "+ soyad) ;
        //Adınızı yazdıktan sonra ENTER'a bas sıradaki adım Soyadınız çıkıyor!!!!!!



    }
}
