import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Soru_3_datetime {


    public static void main(String[] args) {



//        String date = LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE_TIME);
//        System.out.println(date);

        /**************************
        The code is giving an error because the format being passed to the format() method,
         DateTimeFormatter.ISO_DATE_TIME, is for a date and time,
         but the LocalDate object being parsed, "2014-05-04", only contains a date.

        Instead of DateTimeFormatter.ISO_DATE_TIME, the DateTimeFormatter.ISO_DATE format should be used.

        Also it should be LocalDate not LocalDateTime,

        Here's the corrected code:
         */

//        String date = LocalDateTime.parse("2014-05-04T12:33:33").format(DateTimeFormatter.ISO_DATE_TIME);
//        System.out.println(date);


    }
}
