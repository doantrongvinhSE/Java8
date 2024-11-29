package DateTimeAPI.LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime dt1 = LocalDateTime.of(2024, 11, 11, 4, 30, 1);
        LocalTime lt1 = LocalTime.of(23, 59, 59);
        LocalDate ld = LocalDate.now();
        LocalDateTime dt2 = LocalDateTime.of(ld, lt1);
        LocalDate ld1 = dt2.toLocalDate();
        LocalTime lt2 = dt2.toLocalTime();
        System.out.println(ldt);
        System.out.println(dt1);
        System.out.println(dt2);
        System.out.println(ld1);
        System.out.println(lt2);

        

        // cũng tương tự LocalDate, LocalTime



    }
}
