package Collections.QueueInterface.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer("Java");
        priorityQueue.offer("C++");
        priorityQueue.offer("Python");
        priorityQueue.offer("JavaScript");
        System.out.println(priorityQueue);

        priorityQueue.poll();
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);
    }
}
