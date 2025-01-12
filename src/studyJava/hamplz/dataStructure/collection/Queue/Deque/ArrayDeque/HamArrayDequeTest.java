package studyJava.hamplz.dataStructure.collection.Queue.Deque.ArrayDeque;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class HamArrayDequeTest {
    public static void main(String[] args) {
        // HamArrayDeque 인스턴스를 생성.
        HamArrayDeque<Integer> deque = new HamArrayDeque<>();

        // addLast() 테스트.
        for (int i = 0; i < 16; i++) {
            deque.addLast(i);
        }

        System.out.println(Arrays.toString(deque.elements));
        System.out.println("Removed first: " + deque.removeFirst());  // 첫 번째 요소 제거.

        System.out.println(Arrays.toString(deque.elements));

        deque.add(16);
        System.out.println(Arrays.toString(deque.elements));

        deque.add(17);
        System.out.println(Arrays.toString(deque.elements));

        System.out.println("size : " + deque.size());  // 현재 크기 확인.

        /*System.out.println("Expected: 1, Actual: " + deque.peekFirst());  // 첫 번째 요소 확인.
        System.out.println("Expected: 3, Actual: " + deque.peekLast());   // 마지막 요소 확인.

        // addFirst() 테스트.
        deque.addFirst(0);  // 처음에 0 추가.

        System.out.println("Expected: 0, Actual: " + deque.peekFirst());  // 첫 번째 요소 확인.
        System.out.println("Expected: 3, Actual: " + deque.peekLast());   // 마지막 요소 확인.

        // removeFirst() 테스트.
        System.out.println("Removed first: " + deque.removeFirst());  // 첫 번째 요소 제거.
        System.out.println("Expected: 1, Actual: " + deque.peekFirst());  // 첫 번째 요소 확인.

        // removeLast() 테스트.
        System.out.println("Removed last: " + deque.removeLast());   // 마지막 요소 제거.
        System.out.println("Expected: 2, Actual: " + deque.peekLast());  // 마지막 요소 확인.

        // size() 테스트.
        System.out.println("Expected: 2, Actual: " + deque.size());  // 현재 크기 확인.

        // 더 이상 요소가 없을 때 removeFirst()와 removeLast() 테스트.
        deque.removeFirst();  // 1 제거.
        deque.removeFirst();  // 2 제거

        try {
            deque.removeFirst();  // 예외 발생 예상
        } catch (NoSuchElementException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        try {
            deque.removeLast();  // 예외 발생 예상
        } catch (NoSuchElementException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }*/
    }
}
