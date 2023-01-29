package gun35._03_Soru;

public class OkulMain {
    /*
  1-Ogrenci isimli  ad , soyad, görevi , subesi olan bir class yazınız
  2-Calisan isimli  ad, soyad, görevi , departmanı olan bir sınıf yazınız.
  3-Yukarıdaki sınıflardan oluşturacağınız 2 adet nesne için de geçerli
      olacak kimlik belgesi formu oluşturan tek bir metod yazınız.*/
    public static void main(String[] args) {

        Ogrenci ogrenci = new Ogrenci("Özge", "Gül Yangın", "Öğrenci", "11FenA");
        Calisan calisan = new Calisan("Celal", "Yangın", "Öğretmen", "Fizik Öğretmeni");

        Okuldakiler.KimlikFormuBelgesi(ogrenci);
        Okuldakiler.KimlikFormuBelgesi(calisan);

    }



}