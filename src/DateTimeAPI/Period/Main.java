package DateTimeAPI.Period;

import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1).plusMonths(3).plusYears(5);
        Period period = Period.between(today, tomorrow);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println(period);

        Period period2 = Period.of(2, 5, 10);
        System.out.println(period.equals(period2));

        System.out.println(period2.isZero());
        System.out.println(period2.toTotalMonths());
    }
}
