package DateTimeAPI.LocalDate;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today is " + today);

        LocalDate myBirthday = LocalDate.of(2002, 4, 13);
        System.out.println("My birthday is " + myBirthday);

        LocalDate myGirlBirthday = LocalDate.of(1999, 11, 03);

        Boolean isSameDate = myGirlBirthday.isEqual(myBirthday);
        System.out.println(isSameDate);

        LocalDate randomDate = LocalDate.parse("1999-01-02");
        System.out.println(randomDate.getDayOfMonth());
        System.out.println(randomDate.getDayOfWeek());
        System.out.println(randomDate.getMonth());
        System.out.println(randomDate.getYear());
        System.out.println(randomDate);


        System.out.println(randomDate.plusDays(10));
        System.out.println(randomDate.plusMonths(10));
        System.out.println(randomDate.plusYears(10));
        System.out.println(randomDate.plusWeeks(10));
        System.out.println(randomDate.minusDays(10));
        System.out.println(randomDate.minusMonths(10));
        System.out.println(randomDate.minusYears(10));
        System.out.println(randomDate.minusWeeks(10));
        System.out.println(randomDate.isAfter(myGirlBirthday));
        System.out.println(randomDate.isBefore(myBirthday));

        System.out.println(randomDate);




    }
}
