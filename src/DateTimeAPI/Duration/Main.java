package DateTimeAPI.Duration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        LocalDateTime firstDate = LocalDateTime.now();
        LocalDateTime secondDate = LocalDateTime.parse("2020-01-01T00:00:00");

        Duration duration = Duration.between(firstDate, secondDate);

        long days = duration.toDays();
        long hours = duration.toHours();
        long minutes = duration.toMinutes();
        long seconds = duration.getSeconds();


        System.out.println("days: " + days);
        System.out.println("hours: " + hours);
        System.out.println("minutes: " + minutes);
        System.out.println("seconds: " + seconds);


        // tuong tu Period




    }
}
