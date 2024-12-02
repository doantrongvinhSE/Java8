package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Collection {
    public static void main(String[] args) {
        java.util.Collection<String> list = new java.util.ArrayList<>();
        System.out.println(list.add("A")); // return true
        System.out.println(list.add("B")); // return true
        System.out.println(list.add("C")); // return true

        java.util.Collection<String> set = new java.util.HashSet<>();
        System.out.println(set.add("A")); // return true
        System.out.println(set.add("A")); // return false

        // remove -> return boolean
        System.out.println(list.remove("D")); // return false
        System.out.println(list.remove("A"));
        System.out.println(list);

        // counting element
        System.out.println(list.size()); // return int
        System.out.println(list.isEmpty()); // return boolean

        // clearing the collection
//        list.clear();
//        System.out.println(list);
//        System.out.println(list.isEmpty());

        //check contents
        Boolean cAvailable = list.contains("C");
        System.out.println(cAvailable);

         // remove if
        java.util.Collection<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(numbers.removeIf(num -> num % 2 == 0));

        java.util.Collection<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Mary");
        names.add("Jane");
        names.add("");
        names.removeIf(name -> name.equalsIgnoreCase("jane"));
        System.out.println(names);

        // remove if with method reference
        names.removeIf(String::isEmpty);
        System.out.println(names);

        // Iterator element
        // using forEach
        /*
            names.forEach(System.out::println);
            names.forEach(element -> System.out.println(element));
            for (String name : names) {
            System.out.println(name);
        }
         */
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }


        // Determining Equality
        var list1 = List.of(1, 2);
        var list2 = List.of(2, 1);
        var set1 = Set.of(1, 2);
        var set2 = Set.of(2, 1);

        System.out.println(list1.equals(list2)); // false
        System.out.println(set1.equals(set2)); // true
        System.out.println(list1.equals(set1)); // false


    }
}
