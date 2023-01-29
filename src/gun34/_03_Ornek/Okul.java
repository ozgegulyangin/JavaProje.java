package gun34._03_Ornek;

public class Okul {
    // 1- Ogrenci isimli id,isim ve tipi(ENUM ILK,ORTA,LISE)  olan bir class oluşturunuz.
    // 2- LiseOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz, field: brans (String,  MF,TM)
    // 3- İlkOgrencisi adında  Ogrenci sınıfından bir sınıf üretiniz,  filed: klup  (String SATRANC, TIYATRO ..)
    // 4- Okul isimli mainde 3 adet farklı tipte öğrenci oluşturunuz,
    // 5- Oluşturuken her öğrenciye Lise ve İlk okul için farklı olarak,
    // Ogrenci sınıfında tanımlanmış bir sayaçtan no veriniz.
    public static void main(String[] args) {

        LiseOgrencisi liseOgrencisi=new LiseOgrencisi("Özge","MF", ogrTip.LISE);
        System.out.println(liseOgrencisi);

        IlkOgrencisi ilkOgrencisi=new IlkOgrencisi("Celal","Satranc", ogrTip.ILK);
        System.out.println(ilkOgrencisi);

        LiseOgrencisi liseOgrencisi1=new LiseOgrencisi("Atakan","TM", ogrTip.LISE);
        System.out.println(liseOgrencisi1);

    }
}
