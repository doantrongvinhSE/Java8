package Compare.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainEmployee {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(10, "An", 25, 8.5));
        list.add(new Employee(7, "Binh", 28, 7.8));
        list.add(new Employee(12, "Hoa", 30, 9.0));
        list.add(new Employee(8, "Nam", 27, 6.5));
        list.add(new Employee(5, "Lan", 24, 7.2));
        list.add(new Employee(15, "Phuc", 26, 8.0));

        Collections.sort(list);

        System.out.println(list);
    }
}
