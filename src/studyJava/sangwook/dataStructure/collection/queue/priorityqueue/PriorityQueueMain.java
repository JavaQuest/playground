package studyJava.sangwook.dataStructure.collection.queue.priorityqueue;

import java.util.Arrays;
import java.util.Comparator;

public class PriorityQueueMain {
    public static void main(String[] args) {
//        Student student1 = new Student(100, 40);
//        Student student2 = new Student(100, 50);
//        Student student3 = new Student(90, 40);
//
//        PriorityQueue<Student> q = new PriorityQueue<>(new StudentComparator());
//        q.offer(student1);
//        q.offer(student2);
//        q.offer(student3);
//
//        while (!q.isEmpty()) {
//            System.out.println(q.poll());
//        }

//        PriorityQueue<Integer> integers = new PriorityQueue<>(Comparator.naturalOrder());
//
//        integers.offer(3);
//        integers.offer(5);
//        integers.offer(4);
//        integers.offer(11);
//        integers.offer(12);
//        integers.offer(13);
//        integers.offer(2);
//
//        System.out.println(integers);

        MyPriorityQueue<Integer> q1 = new MyPriorityQueue<>(Comparator.naturalOrder());
        q1.add(3);
        q1.add(5);
        q1.add(4);
        q1.add(11);
        q1.add(12);
        q1.add(13);
        q1.add(2);
        q1.poll();
        q1.poll();
        q1.poll();
        q1.poll();
        System.out.println(Arrays.toString(q1.queue));
        System.out.println(q1.size);

        MyPriorityQueue<Integer> q2 = new MyPriorityQueue<>(Comparator.reverseOrder());
        q2.add(3);
        q2.add(5);
        q2.add(4);
        q2.add(11);
        q2.add(12);
        q2.add(13);
        q2.add(2);
        q2.poll();
        q2.poll();
        q2.poll();
        q2.poll();
        System.out.println(Arrays.toString(q2.queue));
        System.out.println(q2.size);




    }
}
