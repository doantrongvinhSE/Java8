package Collections.QueueInterface.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.offer("Java");
        deque.offer("Python");
        deque.offer("JavaScript");
        deque.offer("C++");
        deque.offer("Go");
        System.out.println(deque);

        deque.offerFirst("Ruby");
        deque.offerLast("C#");
//        deque.addFirst("Ruby");
//        deque.addLast("C#");
        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque);
    }
}
