package gun06;

public class _02_StringLength {
    public static void main(String[] args) {
        //String yani kelime işlemleri, çok kullanılan işlemler
        // 0 72528745 28476, Stringlerin bölünmesi,istenilen kısmın alınması
        // uzunluğu, **** **** **** 7676, Özge Gül Yangın -> Ö.G.Y.

        String cumle= "Bensiz mutluysan hep öyle kal";
        int uzunluk= cumle.length();

        System.out.println("uzunluk = " + uzunluk);
        System.out.println("uzunluk 2 = " + cumle.length());

    }
}
