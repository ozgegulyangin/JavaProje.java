package gun41;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _04_JavaLocalDateTime {
    public static void main(String[] args) {
        // LocalDateTime hem tarih hem de saat bilgisini tutar

        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt = " + dt);

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonthValue() = " + dt.getMonthValue());
        System.out.println("dt.getDayOfYear() = " + dt.getDayOfYear());
        System.out.println("dt.getDayOfWeek() = " + dt.getDayOfWeek());
        System.out.println("dt.getDayOfWeek().getValue() = " + dt.getDayOfWeek().getValue());
        System.out.println("dt.getHour() = " + dt.getHour());   // vs vs...

        System.out.println("dt.format(DateTimeFormatter.ISO_DATE_TIME) = " + dt.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("Short = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("Medium = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
        
        // özel formatta istediğimiz gibi
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd:MM:yy hh:mm:ss");
        System.out.println("dt.format(f) = " + dt.format(f));






    }
}
