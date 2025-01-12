package studyJava.hamplz.dataStructure.collection.List.LinkedList;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();

        // 처음 OR 끝에 삽입 : O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list : " + list);

        // 특정 위치에 삽입 : O(N)
        list.add(2, 7);
        list.add(3, 8);
        System.out.println("7 at index 2, 8 at index 3 : " + list);

        // 특정 위치 삭제 : O(N)
        // 처음 OR 끝 삭제 : O(1)
        list.remove(3);
        System.out.println("remove index 3 : " + list);

        // 특정 위치 값 조회 : O(N)
        // 특정 값 검색 : O(N)
        list.get(2);
        System.out.println("element get index 2: " + list.get(2));

        System.out.println("list size: " + list.size());


    }


}
