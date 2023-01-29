package gun05;

import java.util.Scanner;

public class _03_Ornek2 {
    public static void main(String[] args) {
        // Kullanıcının adını ve soyadını alarak ekrana yazdırınız.
        Scanner okuyucu= new Scanner(System.in);// okuma işlemini yapacak olan değişken tanımlandı
        System.out.print("adınız ve soyadınız=");
        // ekrana neyin girileceğini yazdık bilgilendirme

        String adSoyad= okuyucu.nextLine(); // okuma işlemi bu noktada yapılıyor

        System.out.println("adSoyad = " + adSoyad); // verinin gerçekten okunabildiğini
        // tekrar ekrana yazarak kontrol ettim

    }
}
