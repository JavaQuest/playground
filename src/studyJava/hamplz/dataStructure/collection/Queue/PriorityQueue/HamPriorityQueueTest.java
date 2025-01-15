package studyJava.hamplz.dataStructure.collection.Queue.PriorityQueue;

public class HamPriorityQueueTest {
    public static void main(String[] args) {
        HamPriorityQueue<Integer> pq = new HamPriorityQueue<>();

        // 1. add & offer 테스트
        System.out.println("Add & Offer");
        pq.add(10);
        pq.add(15);
        pq.add(5);
        pq.add(30);
        pq.add(20);

        // peek() 테스트
        System.out.println("Peek: " + pq.peek()); // 5

        // 2. poll() 테스트
        System.out.println("Poll");
        System.out.println("Poll: " + pq.poll()); // 5
        System.out.println("Poll: " + pq.poll()); // 10

        // 3. add 후 peek() 테스트
        pq.add(25);
        pq.add(3);
        System.out.println("Peek : " + pq.peek()); // 3

        // 4. contains() 테스트
        System.out.println("25 ? " + pq.contains(25)); // true
        System.out.println("10 ? " + pq.contains(10)); // false

        // 5. remove() 테스트
        System.out.println("25 제거");
        pq.remove(25); // 25 제거
        System.out.println("25 ? " + pq.contains(25)); // false

        // 6. clear() 테스트
        System.out.println("clear");
        pq.clear();
        System.out.println("Size: " + pq.size()); // 0
        System.out.println("Peek: " + pq.peek()); // null (큐가 비었으므로)
    }
}
