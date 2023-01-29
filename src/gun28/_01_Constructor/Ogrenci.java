package gun28._01_Constructor;

public class Ogrenci {
    //    mühendisin arabayı çizdiği kağıttaki modeller: class, tipin adı, türün adı
    //    buna bakarak yapılmış araba ise nesne, araba üretilirken yapılan işlemlerin
    //    yapıldığı metos ise Constructor yani yapıcı metodlar


    int id;
    String ad;
    String soyad;
    int sinif;

    Ogrenci() { // new dediğimiz an çalışan metod
        //içi boş olduğu için göstermiyor java
        System.out.println("nesne oluşturuldu.");
        // içini so outla doldurduk

        //Yapıcı metodlar: Constructor method
    }

    Ogrenci(int id, String ad, String soyad, int sinif) {

        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.sinif = sinif;
        // this --> bu CLASStaki demek

    }

    Ogrenci(int id, String ad, String soyad) {
        this(id, ad, soyad, 0);
        // this -->  Ogrenci() metodunun kendisi

        /*this.id=id;
        this.ad=ad;
        this.soyad=soyad;
        this.sinif=0;*/
    }
}