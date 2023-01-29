package gun32._01_Encapsulation;

public class KisiMain {
    public static void main(String[] args) {
        Kisi kisi1=new Kisi();

        //kisi1.ad="Özge";
        //kisi1.soyad="Gül Yangın";
        // kisi1.yas=-29;   YAŞ negatif olamaz bu yüzden metod tanımladık
        // PRİVATE yaptık ki mainde yaş atayamasın

        kisi1.setAd("Özge");  // set ile veriyi girdik
        kisi1.setSoyad("Gül Yangın");
        kisi1.yasAta(-29);
        System.out.println(kisi1.yasVer());
        System.out.println(kisi1.getAd());  // get ile yazdırdık
        System.out.println(kisi1.getSoyad());

        System.out.println("kisi1 = " + kisi1);

        //SET ile bilgi veriyoruz
        // GET ile bilgiyi getiriyoruz
        // set belirliyor  get getiriyor

        //değişkene direkt erişimi kapatıp metodla veri alıp verme işlemine
        // ENCAPSULATION denir
        // private yapılan değerleri fonksiyonla alma işi
    }
}
