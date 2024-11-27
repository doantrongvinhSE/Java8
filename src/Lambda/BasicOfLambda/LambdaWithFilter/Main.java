package Lambda.BasicOfLambda.LambdaWithFilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person(1, "Alice", 25, "USA"));
        list.add(new Person(2, "Bob", 30, "UK"));
        list.add(new Person(3, "Charlie", 28, "Canada"));
        list.add(new Person(4, "Diana", 22, "Australia"));
        list.add(new Person(5, "Eve", 35, "Germany"));
        list.add(new Person(6, "Frank", 40, "France"));
        list.add(new Person(7, "Grace", 27, "Vietnam"));
        list.add(new Person(8, "Hank", 32, "Japan"));
        list.add(new Person(9, "Ivy", 29, "South Korea"));
        list.add(new Person(10, "Jack", 26, "Italy"));

        Stream<Person> filterData = list.stream().filter(p -> p.getAge() > 30);
        filterData.forEach(person -> System.out.println(person.getName() + " " + person.getAge()));





    }
}
