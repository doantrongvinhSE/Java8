package StreamAPI.BasicOfStream;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();

        // before filter of stream
        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }

        females.forEach(System.out::println);
        System.out.println("-".repeat(10));

        // using filter
        List<Person> females2 = people.stream().
                filter(person -> person.getGender().equals(Gender.FEMALE))
                .toList();
        females2.forEach(System.out::println);
        System.out.println("-".repeat(10));

        // sort
        List<Person> sorted = females2.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed()).toList();


        // all match
        Boolean isMoreThan20 = females2.stream().allMatch(person -> person.getAge() >= 20);
        Boolean allFemales = females2.stream().allMatch(person -> person.getGender().equals(Gender.FEMALE));

        // None Match
        Boolean isFemale = females2.stream().noneMatch(person -> person.getGender().equals(Gender.MALE)); // không cái nào là Male
        System.out.println(isFemale);

        // any Match
        Boolean check = females2.stream().anyMatch(person -> person.getAge() == 22);
        System.out.println(check);

        // max
        females2.stream().max(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);


        // min
        Optional<Person> minAge = females2.stream().min(Comparator.comparing(Person::getAge));
        System.out.println(minAge);


        // map
        females2.stream().map(person -> person.getName().toUpperCase()).forEach(p -> System.out.print(p + " "));





        

    }


    private static List<Person> getPeople() {
        return List.of(
                new Person("James", 20, Gender.MALE),
                new Person("Sarah", 22, Gender.FEMALE),
                new Person("Michael", 25, Gender.MALE),
                new Person("Jessica", 28, Gender.FEMALE),
                new Person("David", 30, Gender.MALE),
                new Person("Emily", 24, Gender.FEMALE),
                new Person("John", 35, Gender.MALE),
                new Person("Anna", 29, Gender.FEMALE),
                new Person("Robert", 40, Gender.MALE),
                new Person("Laura", 32, Gender.FEMALE)
        );
    }
}
