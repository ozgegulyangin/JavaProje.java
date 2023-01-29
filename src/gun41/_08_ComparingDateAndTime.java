package gun41;

import java.time.Duration;
import java.time.LocalDate;

public class _08_ComparingDateAndTime {
    public static void main(String[] args) {

        LocalDate bugun=LocalDate.now();
        LocalDate dun=bugun.minusDays(1);

        Boolean sonraMi=bugun.isAfter(dun); // bugün dünden sonra mı?
        System.out.println("sonraMi = " + sonraMi);
        
        Boolean onceMi=bugun.isBefore(dun);
        System.out.println("onceMi = " + onceMi);
        
        boolean esitMi=bugun.isEqual(dun);
        System.out.println("esitMi = " + esitMi);  // bugün düne eşit mi?
        
        boolean artikYilMi=bugun.isLeapYear();
        System.out.println("artikYilMi = " + artikYilMi); // 4 yılda bir +1 gün olan yıl mı?
    }
}
