package Collections.MapInterface.TreeMap;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        TreeMap<String, Integer> numberTreeMap = new TreeMap<>();
        // sort by key
        numberTreeMap.put("Six", 6);
        numberTreeMap.put("Five", 5);
        numberTreeMap.put("Three",3);
        numberTreeMap.put("Two", 2);
        numberTreeMap.put("Four", 4);
        numberTreeMap.put("One", 1);

        System.out.println(numberTreeMap);

        // cac ham dieu huong
        System.out.println(numberTreeMap.firstKey());
        System.out.println(numberTreeMap.firstEntry().getValue());
        System.out.println(numberTreeMap.lastKey());
        System.out.println(numberTreeMap.lastEntry());

        System.out.println(numberTreeMap);


        // tra ve va xoa 
        var firstEntry = numberTreeMap.pollFirstEntry();
        System.out.println(firstEntry);
        System.out.println(numberTreeMap);

        var lastEntry = numberTreeMap.pollLastEntry().getValue();
        System.out.println(lastEntry);
        System.out.println(numberTreeMap);

        // bên cạnh đó còn nhiều hàm => tự tìm hiểu 
        




        


    }
}
