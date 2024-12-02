package Collections.ListInterface;

import java.util.Arrays;
import java.util.List;

public class ListWithAFactory {
    public static void main(String[] args) {
        // create a List with a Factory
        String[] array = new String[] {"a", "b", "c"};
        List<String> asList = Arrays.asList(array);
        List<String> ofList = List.of(array);
//        List<String> ofList = List.of("a", "b", "c");
        List<String> copyList = List.copyOf(asList);

        array[0] = "z";
        System.out.println(asList);
        System.out.println(ofList);
        System.out.println(copyList);

        // result
//        [z, b, c]
//        [a, b, c]
//        [a, b, c]

         asList.set(0, "x");
        System.out.println(Arrays.toString(array));
        copyList.add("y"); // UnsupportedOperationException


    }
}
