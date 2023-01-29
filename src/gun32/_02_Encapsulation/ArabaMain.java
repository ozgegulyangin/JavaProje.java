package gun32._02_Encapsulation;

import java.util.Scanner;

public class ArabaMain {

    // GÜVENLİ PROGRAM YAZMAK İÇİN GETTER SETTER OLUŞTURUP
    //CONSTRUCTOR İÇİNE ATAYIP ÖYLE KULLANIYORUZ ‼️

    // Bir araba nesnesi oluşturulmak isteniyor. fields(Renk, Model, MotorHacmi,KapiSayisi)
    // Bu nesnenin verilerini OOP kurallarına uygun olarak verip alınız.
    // Main de 1 tane nesne oluşturup bunu kontrol ediniz.
    public static void main(String[] args) {

        // Scanner oku=new Scanner(System.in);
        //System.out.println("Model giriniz:");
        //car.setModel(oku.nextInt());


        Araba car = new Araba();
        car.setRenk("Kırmızı");
        car.setModel(2022);
        car.setMotorHacmi(1500);
        car.setKapiSayisi(4);
        System.out.println("car = " + car);

        Araba car2 = new Araba("Lacivert", 2030, 1500, 6);
        // GET ile sonradan güvenli olarak kullanmış oluyoruz
        // set fonksiyonda model<=2022 şartı koyduğumuz için 2030 almadı
        System.out.println("car2 = " + car2);

        // ‼️GENEL YAZILIM KURALIDIR
        // BÜTÜN DEĞİŞKENLER PRİVİATE YAPILIR.
        // yani Kapsulleme ile kullanılır.
        // Eğer gerekiyorsa private kaldırılır.‼️

    }
}
