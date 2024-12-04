package Collections.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // create new an Arraylist
        ArrayList<String> list = new ArrayList<>();



        // add element
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("B");
        list.add(1, "E");
//        ArrayList<String> list1 = list;
//        list.addAll(list1);

        System.out.println(list);

        // size
        System.out.println(list.size());


        // access element
        String element = list.get(0);
        System.out.println("Element at index 0: " + element);

        // change element
        list.set(0, "F");
        System.out.println(list);

        // remove element
        list.remove("F"); // remove Object
//        list.remove(0); // remove index
        System.out.println(list);
//        list.removeAll(list1);
//        list.removeAll(Arrays.asList("A", "B", "C"));

        // clear
//        list.clear();

        // loop element
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for (String s : list) {
//            System.out.println(s);
//        }
//
//        list.forEach(System.out::println);

            // bên cạnh đó còn thừa hưởng các pt của interface list: clone, removeIf, isEmpty,....
//
    }
}
