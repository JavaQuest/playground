package studyJava.dataStructure.collection.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {

        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(21);
        list.add(1, 22);
        System.out.println(list);

    }
}
