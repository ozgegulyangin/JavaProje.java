package gun41;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _06_Duration {
    public static void main(String[] args) {
        // Duration:   hem localTime hem de LocalTimeDate arasındaki farkı verir
        
        //LocalTime
        LocalTime dersBaslangic=LocalTime.of(19,0,0);
        LocalTime dersBitis=LocalTime.of(22,0,0);
        Duration gunlukDersSuresi= Duration.between(dersBaslangic,dersBitis);
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi);
        System.out.println("gunlukDersSuresi.toHours()) = " + gunlukDersSuresi.toHours()); // farkın toplam saat hali
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi.toMinutes()); // farkın toplan dakika hali


        // İki tarih arasindaki fark
        LocalDateTime from=LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to=LocalDateTime.now();

        Duration farkZaman=Duration.between(from,to);
        System.out.println("farkZaman = " + farkZaman);
        System.out.println("farkZaman.toDays() = " + farkZaman.toDays());
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours());
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes());
        

    }
}
