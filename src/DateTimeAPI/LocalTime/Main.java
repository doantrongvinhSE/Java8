package DateTimeAPI.LocalTime;

import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        LocalTime time = LocalTime.of(23, 59, 59);
        LocalTime time2 = LocalTime.parse("00:01:59");
        LocalTime midnight = LocalTime.MIDNIGHT;
        LocalTime noon = LocalTime.NOON;
        LocalTime time3 = now.plusHours(1).plusMinutes(1).plusSeconds(1);
        LocalTime time4 = now.minusHours(1).minusMinutes(1).minusSeconds(1);

        System.out.println(now);
        System.out.println(time);
        System.out.println(time2);
        System.out.println(midnight);
        System.out.println(noon);
        System.out.println(time3);
        System.out.println(time4);
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.compareTo(time4));
        System.out.println(now.isAfter(time4));
        System.out.println(now.isBefore(time4));











    }
}
