package gun40;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        // LocalDate Sadece gün ay yıl bilgisini tutar

        LocalDate tarih = LocalDate.now();
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());

        // KENDİSİNDEKİ hazır formatlar
        System.out.println("ISO_DATE=" + tarih.format(DateTimeFormatter.ISO_DATE));
        System.out.println("SHORT=" + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM=" + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG=" + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL=" + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

        // Lokalde aldığım tarihi istediğim ülkenin formatına göre,diline göre nasıl gösteririm?
        // örneğin lokaldaki tarihi Almanya'ya uygun nasıl gösteririz.

        System.out.println("FULL Almanya gösterimi=\n" +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));

        // Lokalizasyon tanımlaması
        // en-US : birincisi DİLİ, ikincisi ülkeyi temsil ediyor. Amerikan İngilizcesi
        // en-UK :  Birleşik Krallık İngilizcesi
        // fr-CA : Kanada Fransızcası
        // tr-TR

        Locale[] kullanilabilirLocaller = Locale.getAvailableLocales();
        for (Locale l : kullanilabilirLocaller) {

            if (l.getDisplayCountry().toLowerCase().contains("chi"))// eğer çince ise yazdır
            {
                System.out.print("Dil= " + l.getDisplayLanguage());
                System.out.print(",Ülke= " + l.getDisplayCountry());
                System.out.print(",=  " + l.getLanguage());
                System.out.println("-" + l.getCountry());
            }
        }
        Locale lokalCince = new Locale("zh", "CN");
        System.out.println("Çince tarih formatı =  "
                + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));

        System.out.println("****************İSTEDİĞİM FORMATTA GÖSTERİM******************");
        System.out.println("tarih = " + tarih);
        DateTimeFormatter ozelFormat1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("tarih dd/MM/yyy = " + tarih.format(ozelFormat1));
        DateTimeFormatter ozelFormat2=DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih  d.M.yy= " + tarih.format(ozelFormat2));
        DateTimeFormatter ozelFormat3=DateTimeFormatter.ofPattern("EEEE dd-MM-yyyy");
        System.out.println("tarih EEEE dd-MM-yyyy = " + tarih.format(ozelFormat3));
        DateTimeFormatter ozelFormat4=DateTimeFormatter.ofPattern("dd-MM-yyyy EEEE");
        System.out.println("tarih dd-MM-yyyy EEEE ve Dil = " + tarih.format(ozelFormat4.withLocale(Locale.GERMAN)));
        DateTimeFormatter ozelFormat5=DateTimeFormatter.ofPattern("dd.M.yy -EE");
        System.out.println("tarih dd.M.yy-EE = " + tarih.format(ozelFormat5));

        // Kendimiz bir tarihi nasıl set ediyorux, int sayi=5

        LocalDate tarih1=LocalDate.of(1993,Month.MARCH,24);
        System.out.println("Doğum Günüm = " + tarih1);
        LocalDate tarih2=LocalDate.of(1990,10,3);
        System.out.println("Celal'in Doğum Günü = " + tarih2);






    }
}
