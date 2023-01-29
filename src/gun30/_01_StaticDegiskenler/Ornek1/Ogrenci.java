package gun30._01_StaticDegiskenler.Ornek1;

public class Ogrenci {
    String ad;
    String soyad;
    static String okulAd = "Talatpaşa İlköğretim Okulu";
    // sen bir tanesin
    //hepsi için geçerli tek bir tane eleman
    //Tekrarlayan ve tum nesneler için kullanılacak olan
    //değişkenler için STATIC kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar. hepsine atanır,
    //tek olarak hafızada bulunur
    //tipin, sınıfın, classın değişkeni oldu

    public Ogrenci(String ad, String soyad) {
        this.ad = ad;
        this.soyad = soyad;

    }

    @Override
    public String toString() {
        return "Ogrenci'nin{" +
                "Adı='" + ad + '\'' +
                ", Soyadı='" + soyad + '\'' +"Okul adı="+okulAd+
                '}';
    }
}
