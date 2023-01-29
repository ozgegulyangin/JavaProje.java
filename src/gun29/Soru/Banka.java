package gun29.Soru;

public class Banka {
    // Hesap (yatan(int), cekilen(int), bakiye(int))
    // Musteri (hesapID(int), ad, soyad, MusteriHesap(Hesap tipinde))
    // Bir banka uygulaması için 1 müşteri tanımlayınız,
    // müşterini hesabına sırasıyla 100 tl, 200tl yatırınız,sonra 50 TL çekiniz.
    // Müşteirinin toplan yatanı, toplam cekılenı ve kalan bakiyesini yazdırınız.
    // bakiyeye direkt para atanamadıgını kontrol ediniz.


    public static void main(String[] args) {

        Musteri musteri1=new Musteri();
        musteri1.hesapId=1;
        musteri1.ad="Celal";
        musteri1.soyad="Yangın";
        
        
        musteri1.MusteriHesap.paraYatir(100);
        musteri1.MusteriHesap.paraYatir(200);
        musteri1.MusteriHesap.paraCek(50);

        System.out.println("Müşteri Hesap Hareketleri = " + musteri1.MusteriHesap);


    }
}
