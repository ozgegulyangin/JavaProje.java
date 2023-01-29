package gun16;

import java.util.HashSet;
import java.util.Iterator;

public class _06_JavaArray {
    public static void main(String[] args) {
        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra rndom olarak bir tanesini seçip ekrana seçileni yazıdırnız.
        // TODO : gunun sorusu : bir döngü ile 5 tane buldurunuz
        // fakat bir bulduğunu tekrar bulmasın

        String[] kanallar = {"Halk Tv", "Fox Tv", "Disney Channel", "Cartoon Network", "Number 1"};
        HashSet<String> tekrarsizDizi = new HashSet<>();

        for (int i = 0; i < kanallar.length; ++i) {
            int randomSayi = (int) (Math.random() * (kanallar.length));
            System.out.println("kanallar = " + kanallar[randomSayi]);
            tekrarsizDizi.add(kanallar[i]);

        }

        System.out.println("tekrarsizDizi = " + tekrarsizDizi);
        Iterator gosterge = tekrarsizDizi.iterator();
        while (gosterge.hasNext()) {
            System.out.println("gosterdigi eleman = " + gosterge.next());

        }
    }
}