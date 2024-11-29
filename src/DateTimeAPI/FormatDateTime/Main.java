package DateTimeAPI.FormatDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(today.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(today.format(DateTimeFormatter.BASIC_ISO_DATE));


        // LocalDateTime
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));







    }
}
