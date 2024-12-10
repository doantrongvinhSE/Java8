package Collections.QueueInterface;


import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Hello");
        queue.offer("World");
        queue.offer("Java");
        queue.offer("Python");
        queue.offer("C++");

        System.out.println(queue);
        queue.poll();
        System.out.println(queue.peek());
        System.out.println(queue);




    }
}
