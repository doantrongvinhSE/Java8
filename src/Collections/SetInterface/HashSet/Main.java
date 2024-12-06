package Collections.SetInterface.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(66);
        set.add(88);
        set.add(14);
        set.add(32);
        set.add(88); // false
        System.out.println(set);


        // duyet
//        set.forEach(System.out::println);
//        Iterator<Integer> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Integer element = iterator.next();
//            System.out.println(element);
//        }

        // remove
        set.remove(88); //88 là Obj ko phải index
        System.out.println(set);
//        set.removeAll(set);

        HashSet<Integer> set2 = new HashSet<>();
        set2.add(66);
        set2.add(17);
        set2.add(100);
        set2.add(88);
        set2.add(14);

        System.out.println(set2);
        set2.addAll(set);
        System.out.println(set2);


        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        System.out.println("HashSet1: " + primeNumbers);

        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        System.out.println("HashSet2: " + evenNumbers);

        // Intersection of two sets
        evenNumbers.retainAll(primeNumbers);
        System.out.println("Intersection is: " + evenNumbers);

        // hiệu set remove All
        // HashSet1: [2, 3, 5]
        //HashSet2: [1, 3, 5]
        //Difference: [2]


        // Kiểm tra có phải tập con hay không trong HashSet => containsAll
//        HashSet1: [1, 2, 3, 4]
//        HashSet2: [2, 3]
//        Is HashSet2 is a subset of HashSet1? true





    }
}
