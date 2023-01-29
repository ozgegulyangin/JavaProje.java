package gun14;

import java.util.Scanner;

public class _06_ForLoop {
    public static void main(String[] args) {
        // Girilen bir sayıya(dahil) kadar olan sayıların çarpımını bulunuz
        // Çarpımın değeri 10000ü geçtiğinde işlem sonlansın
        Scanner oku= new Scanner(System.in);
        System.out.print("Sayı Giriniz=");
        int sayi= oku.nextInt();   // sayı sınır belirtiyor burada örn; 10'a kadar vs
        int carpim=1;
        int i=1;
        //boolean sinirAsildi=false;
        for (i=1; i<=sayi; i++) {
            carpim=carpim*i;


           if (carpim>=10000) {
               System.out.println("işlem sonlandı");
               //sinirAsildi=true;
               break;}
           }
        //if (sinirAsildi==false)    --> sınır aşılırsa çarpımı yazmaz
        System.out.println("Çarpım=" +carpim);
    }
}
