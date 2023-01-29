package gun04;

public class _07_SayiKelime {
    public static void main(String[] args) {
        // sayiları birbirine çevirdik shortu byte inte vs.
        //yazıların rakamlara, rakamların yazılara çevrilmesi var.

        String kelimeSayi="65"; // String halde, toplama gib bir işleme giremez

        int sayiDeger= Integer.parseInt(kelimeSayi);
        int toplam= sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);
        // toplam şu anda int yani sayı , bunu Stringe nasıl dönüştürürüm?
        String strToplam= Integer.toString(toplam); // String e dönüştürür
        System.out.println("strToplam = " + strToplam);
    }
}
