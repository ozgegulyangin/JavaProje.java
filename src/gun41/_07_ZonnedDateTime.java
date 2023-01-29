package gun41;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class _07_ZonnedDateTime {
    public static void main(String[] args) {
        // Başka zaman bölgelerinin(Time Zone) zaman bilgisini alma

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println("zdt = " + zdt);
        // su an bulunduğum TimeZone'un saatini veriyor.

        Set<String> zamanBolgeleri = ZoneId.getAvailableZoneIds();
        for (String z : zamanBolgeleri) {
            if (z.toLowerCase().contains("new"))
                System.out.println("z = " + z);

        }

        ZoneId zoneIdNewYork=ZoneId.of("America/New_York");
        ZonedDateTime zoneNY=ZonedDateTime.now(zoneIdNewYork);
        System.out.println("zoneNY = " + zoneNY);

        ZoneId zoneIdLondon=ZoneId.of("Europe/London");
        ZonedDateTime zoneLondon=ZonedDateTime.now(zoneIdLondon);
        System.out.println("zoneLondon = " + zoneLondon);


    }
}
