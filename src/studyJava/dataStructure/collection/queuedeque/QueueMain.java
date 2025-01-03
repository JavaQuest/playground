package studyJava.dataStructure.collection.queuedeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(4);
        System.out.println(queue.element());
        queue.remove();
        System.out.println(queue.element());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(2);
        deque.poll();
        deque.add(3);
        deque.pop();
        System.out.println(deque);
    }
}
