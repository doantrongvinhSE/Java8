package Collections.SetInterface.Set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMethod {
    public static void main(String[] args) {
        // create Set
        Set<Character> letters = Set.of('z', 'o', 's');
        Set<Character> copy = Set.copyOf(letters);
        System.out.println(copy);

        // iterator
        Iterator<Character> iterator = letters.iterator();
        while (iterator.hasNext()) {
            Character element = iterator.next();
            System.out.println(element);
        }

        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66); // true
        boolean b2 = set.add(10); // true
        boolean b3 = set.add(66); // false
        boolean b4 = set.add(8); // true
        System.out.println(set);





    }
}
