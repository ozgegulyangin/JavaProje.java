package gun16;

import java.util.Scanner;

public class _01_JavaDizisiNedir {
    public static void main(String[] args) {
        int ogrNot; // 1 tane not saklar
        // benden istenen 50 kişi var bana bunlardan istenenin notlarını yazdır

        // bana bir tanımlamada BİRDEN FAZLA değer tutabilen bir değişkene
        //ihtiyacım var
        //ÇÖZÜM:
        int[]notlar=new int[50]; // 50 tane int saklayabilen notlar isimli değişken
        // Scanner 'da tek tek int sayi1=oku.... int sayi2=oku.... yapmadan
        // kaç tane sayı kullanmam gerekiyorsa int[]sayi=new int[50]; şeklinde yapıyoruz
        notlar[0]=75;   // index 0'dan 49'a kadar alıyoruz (index lengtt-1 old için 49)‼️
        notlar[1]=88;
        //...
        //...
        notlar[49]=95;
        System.out.println("notlar[0]="+ notlar[0]);

        System.out.println("notlar.length="+ notlar.length); // 50, yani dizinin eleman sayısını verir.

        // dizi nasıl okutulur. --> başı belli sonu belli değerler belli FOR kullanacağız

        Scanner oku=new Scanner(System.in);
        for (int i=0; i<notlar.length; i++) {    // i<notlar.length  bütün kutucukları son elemana kadar doldurur
            System.out.print("Notu Giriniz=");
            notlar[i]= oku.nextInt();
            // bu döngü SCANNER - değer okuma işlemi için 1️⃣
        }
        for (int i=0; i<notlar.length;i++) {
            System.out.println(notlar[i]);
            // [i] charAt gibi oda numarasını verir bize‼️
            // [i] -> 0,1,2,3,4,5,6.....49

            // bu döngü girilen değerleri YAZMA işlemi için!! 2️⃣
        }


    }
}
