package studyJava.sangwook.dataStructure.collection.queue.deque.arraydeque;

import java.util.*;

public class ArrayDequeMain {
    public static void main(String[] args) {
        MyArrayDeque<Integer> queue = new MyArrayDeque<>(1);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.remove();
        queue.remove();
        queue.remove();
        queue.add(3);
        queue.add(3);
        queue.add(3);
        queue.add(3);
        queue.add(3);
        queue.add(3);
        queue.add(3);
        queue.add(3);

        System.out.println(queue.size());
        System.out.println(Arrays.toString(queue.elements));
        System.out.println(queue.head);
        System.out.println(queue.tail);
    }
}
