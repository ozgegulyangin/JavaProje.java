package gun31._03_Enum;

public class AylarMain {
    //ayın kaç gün sürdüğünü metod gerekiyor
    // ayın türkçe yazılışı metod gerekiyor
    // ayın gerçek sıra nosu metod gerekiyor

    // Java diyorki bu şekilde tek bir kelime veya
    // sayı olan degerleri olacaksa, sana bir kolaylık
    public static void main(String[] args) {

        Aylar ay=Aylar.MART;
        System.out.println("ay = " + ay);
        System.out.println("ay.ayNo = " + ay.ayNo);
        System.out.println("ay.gunSayisi = " + ay.gunSayisi);
        System.out.println("ay.ayAd = " + ay.ayAd);

        Aylar celal=Aylar.EKIM;
        System.out.println("ay = " + celal);
        System.out.println("ay.ayNo = " + celal.ayNo);
        System.out.println("ay.gunSayisi = " + celal.gunSayisi);
        System.out.println("ay.ayAd = " + celal.ayAd);

        for (Aylar a:Aylar.values()) {
            System.out.println(a.ayNo+"-"+a.ayAd+"-"+a.gunSayisi);

        }
    }
}
