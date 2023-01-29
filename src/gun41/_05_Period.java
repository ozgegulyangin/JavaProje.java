package gun41;

import java.time.LocalDate;
import java.time.Period;

public class _05_Period {
    public static void main(String[] args) {
        // period iki tarih arasındaki farkı gösterir.
        // Sadece localDate'ler için kullanıyoruz

        LocalDate dogumTarihi=LocalDate.of(1993,3,24);
        LocalDate bugun=LocalDate.now();
        Period fark=Period.between(dogumTarihi,bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println( fark.getYears()+" Yaşındasınız");
        
        /***********************************************/
        Period period3Gun=Period.ofDays(3);
        Period period3Ay=Period.ofMonths(3);
        
        LocalDate ucGunSonra=bugun.plus(period3Gun);
        System.out.println("ucGunSonra = " + ucGunSonra);
        LocalDate ucAySonra=bugun.plus(period3Ay);
        System.out.println("ucAySonra = " + ucAySonra);
        
        /***********************************************/
        LocalDate baslangic=LocalDate.of(2022,10,31);
        Period period6Ay=Period.ofMonths(6);
        LocalDate bitis=baslangic.plus(period6Ay);
        System.out.println("Kursun bitiş tarihi = " + bitis);
        System.out.println("bitis.getDayOfWeek() = " + bitis.getDayOfWeek());

        Period neKadarKaldi=Period.between(bugun,bitis);
        System.out.println("neKadarKaldi = " + neKadarKaldi.getMonths()+" ay,"+neKadarKaldi.getDays()+" gün");
        
        Period suAnaKadarGecenSure= Period.between(baslangic,bugun);
        System.out.println("suAnaKadarGecenSure = " + suAnaKadarGecenSure.getMonths()+" ay,"+suAnaKadarGecenSure.getDays()+" gün");




    }
}
