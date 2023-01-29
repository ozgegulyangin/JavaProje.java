package gun26._01_Ornek;

import com.sun.xml.internal.ws.wsdl.writer.document.Import;

public class Kampus {
    public static void main(String[] args) {
        //Bir kampus programı için aşağıdaki özelliklte bilgilerin
        //kaydedileceği classları yazınız
        //Okul: adı,mudurAdi, ucreti(double) -->Tip
        // Öğrenci: okulNo, tamAdi,okulu -> Tip

        // bu şekilde bir öğrenci tanımlayınız bütün bilgileri kendiniz
        //atayıp yazdırınız


        Ogrenci ogr=new Ogrenci();
        ogr.okulNo=1352;
        ogr.tamAd="Özge Gül Yangın";
       // 1. yöntem
        ogr.okulu=new Okul();  // önce yeni tip olan okulu new ile atamamız lazım
        ogr.okulu.adi="Yıldız Teknik Üniversitesi";
        ogr.okulu.mudurAdi="Celal Yangın";
        ogr.okulu.ucreti=50000;

        // 2. yöntem
        Okul ok=new Okul();
        ok.adi="Mecidiyeköy Anadolu Lisesi";
        ok.mudurAdi="Celal Yangın";
        ok.ucreti=50000;
        ogr.okulu=ok;

        System.out.println("ogr.okulNo = " + ogr.okulNo);
        System.out.println("ogr.tamAd = " + ogr.tamAd);
        System.out.println("ogr.okulu.adi = " + ogr.okulu.adi);
        System.out.println("ogr.okulu.mudurAdi = " + ogr.okulu.mudurAdi);
        System.out.println("ogr.okulu.ucreti = " + ogr.okulu.ucreti);

    }
}
