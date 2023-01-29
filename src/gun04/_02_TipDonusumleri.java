package gun04;
 // control+shift+R Run kısayol
public class _02_TipDonusumleri {
    public static void main(String[] args) {
        byte ogrNot1=98;
        byte ogrNot2=95;
        byte ogrNot3=91;
        byte ogrNot4=100;
        byte ogrNot5=97;
        int toplam=ogrNot1; // byte -> int'e atınca problem çıkmadı (GENİŞLETNE -Widening Casting))
        // çünkü byte için hafızada ayrılan yere int zaten sığar,
        //sığdığı için kabul edilir. çünkü veri kaybı olma ihtimali yok.

        // ogrNot1=toplam;// int-> byte atunca dur bakalım dedi (DARALTMA -Narrow Casting)
        //büyük hafıza ayrılmış bir alanı,küçük hafıza ayrılmış alana atma işlemi var.
        // veri kaybı ihtimali var
        //DARALTMA yapıyorsan başında belirtmen gerek

        ogrNot1=(byte)toplam; // şeklinde belirtmek gerekiyor.






    }
}
