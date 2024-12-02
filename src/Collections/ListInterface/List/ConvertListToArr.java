package Collections.ListInterface.List;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToArr {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Object[] objArr = list.toArray(); // this isn't usually
        String[] strArr = list.toArray(new String[0]);
        list.clear();
        System.out.println(objArr.length);
        System.out.println(strArr.length);
    }
}
