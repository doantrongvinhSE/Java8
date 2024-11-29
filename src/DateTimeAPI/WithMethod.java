package DateTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;

public class WithMethod {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate tomorrow = today.withDayOfMonth(today.getDayOfMonth() + 1);
        LocalDate date = today.withYear(2025);


        System.out.println(tomorrow);
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime tomorrowTime = time.withHour(12);
        LocalTime time1 = time.withMinute(5);
        LocalTime time2 = time.withSecond(2);

        System.out.println(tomorrowTime);
        System.out.println(time1);
        System.out.println(time2);







    }
}
