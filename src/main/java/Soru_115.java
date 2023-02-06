import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Soru_115 {
    public static void main(String[] args) {
        LocalDate datel = LocalDate.now();
        LocalDate date2 = LocalDate. of (6, 20, 2014 ) ;
        LocalDate date3 = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        System.out.println("datel = " + datel);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);
    }
}
