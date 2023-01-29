package gun08;

import java.util.Scanner;

public class _08_Ornek {
    public static void main(String[] args) {
        //girilen cümledeki ilk kelimeyi yazdırınız
        Scanner oku=new Scanner(System.in);
        String cumle= oku.nextLine();

        int boslukIndex= cumle.indexOf(" ");
        String kelime= cumle.substring(0,boslukIndex);
        System.out.println("kelime = " + kelime);
    }
}
