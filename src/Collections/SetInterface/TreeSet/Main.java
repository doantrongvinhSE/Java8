package Collections.SetInterface.TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(5);
        treeSet.add(4);
        treeSet.add(6);
        treeSet.add(7);

        System.out.println(treeSet);
        //get phan tu min
        System.out.println("MIN = " +treeSet.first());


        // get phan tu max
        System.out.println("MAX = " + treeSet.last());

        // tim phan tu lon thu 2
        System.out.println(treeSet.lower(treeSet.last()));

        // tim phan tu nho nhat > 1 so chi dinh
        System.out.println(treeSet.higher(treeSet.first()));

        // phan tu nho nhat >= 4 
        System.out.println(treeSet.ceiling(4));

        // phan tu lon nhat >= 3
        System.out.println(treeSet.floor(3));

        // remove first last element
        Integer number1 = treeSet.pollLast();
        Integer number2 = treeSet.pollFirst();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(treeSet);

        // print all element < number and >= number
        System.out.println(treeSet.headSet(5));
        System.out.println(treeSet.tailSet(5));










        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Karl");
        names.add("White");
        names.add("Lyly");
        names.add("Bob");

        System.out.println(names);





    }
}
