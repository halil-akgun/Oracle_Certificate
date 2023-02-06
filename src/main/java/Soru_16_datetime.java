import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Soru_16_datetime {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
        dt.plusDays(30);// We have to asign the last value.
        dt.plusMonths(1);
        System.out.print(dt.format(DateTimeFormatter.ISO_DATE));


        System.out.println();
        LocalDate date = LocalDate.of(1995,9,12);
        System.out.println(date);

    }
}
