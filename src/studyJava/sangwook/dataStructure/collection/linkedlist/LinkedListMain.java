package studyJava.sangwook.dataStructure.collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(12);
        list.add(24);
        list.add(25);
        list.add(26);
        list.add(21);
        list.add(28);

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next.equals(28)) {
                iterator.remove();
            }
        }

        System.out.println(list);

    }
}
