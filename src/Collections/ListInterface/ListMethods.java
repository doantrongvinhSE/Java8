package Collections.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("SD"); // SD
        list.add(0, "NY"); // NY, SD
        list.set(1, "FL"); // NY, FL
        System.out.println(list.get(0)); // NY
        list.remove("NY"); // FL
        list.remove(0); // [] isEmpty
//        list.set(0, "?"); // IndexOutOfBoundsException


        var numbers = Arrays.asList(1, 2 ,3);
        numbers.replaceAll(x -> x * 2);
//        numbers.replaceAll(x -> 999);
        System.out.println(numbers);

        // Overload Remove
        var list1 = new LinkedList<Integer>();
        list1.add(3);
        list1.add(2);
        list1.add(1);
        System.out.println(list1);
        list1.remove(2);
        System.out.println(list1);
        list1.remove(Integer.valueOf(2));
        System.out.println(list1);
//        list1.remove(3); // IndexOutOfBoundsException



    }
}
