package Collections.SetInterface.LinkedHashSet;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        // duy tri thu tu duoc them vao
        linkedHashSet.add(66);
        linkedHashSet.add(2);
        linkedHashSet.add(88);
        linkedHashSet.add(17);
        linkedHashSet.add(5);
        linkedHashSet.add(88);


        System.out.println(linkedHashSet);

    }
}
