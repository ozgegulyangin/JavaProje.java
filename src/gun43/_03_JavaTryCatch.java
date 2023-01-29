package gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("Program çalışmaya başladı");
        try {
            LocalDate tarih = LocalDate.of(2023, Month.FEBRUARY, 30);
        } // hata olduğu zaman programı kırma
        catch (Exception ex) {
            System.out.println("hata oluştu");
            System.out.println("Tüm hata mesajı" + ex);
            System.out.println("Hatanın açıklaması=" + ex.getCause());

            // kendine hata mesajını mail atabilirsin
            // log tutma: program nasıl çalışıyor, hata loglarını harddiske yazabilirsin

        }

        System.out.println("Program bitti");
        try {

            // Java ve Toolları çalışmaya devam et
            // Konuları öğrenmeye ve çalışmaya devam et
            }// anlamadığın yer mi oldu= kırılmadan devam et:
             catch (Exception ex) {
            // hatanın sebebini anla
            //derse daha fazla odaklan
            //gereken videoları izle
            //grup çalışması yap
            //öğren ve kırılmadan devam et
            //unutma sen bir söz verdin,DEVAM


        }
    }
}