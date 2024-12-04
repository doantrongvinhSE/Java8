package Collections.ListInterface.LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // create a LinkedList
        LinkedList<String> list = new LinkedList<String>();

        // add element
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);

        // vì Linkedlist được implement List Interface nên cũng có các phương thức sẵn.


        // QUEUE  và Deque
        // addFirst and addLast
        list.addFirst("A");
        list.addLast("E");
        System.out.println(list);

        // getFirst, getLast, peak
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list);
        String element = list.peek();
        System.out.println(element);
        System.out.println(list);

        // removeFirst, Last,
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        // poll => get => delete first element
        String firstElement = list.poll();
        System.out.println(firstElement);
        System.out.println(list);

        // offer() return Boolean, func add element to last LinkedList
        list.offer("E");
        System.out.println(list);



    }
}
