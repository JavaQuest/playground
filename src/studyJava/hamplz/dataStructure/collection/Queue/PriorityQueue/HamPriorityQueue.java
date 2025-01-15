package studyJava.hamplz.dataStructure.collection.Queue.PriorityQueue;

public class HamPriorityQueue<E> {
    private static final int DEFAULT_INITIAL_CAPACITY = 11;
    private static int size;
    public Object[] queue;

    // O(log(n)) time : offer, poll, remove(),add
    // linear time : remove(Object) and contains(Object)
    // constant time : peek, element, and size

    public HamPriorityQueue() {
        this.queue = new Object[DEFAULT_INITIAL_CAPACITY];
        this.size = 0;
    }

    //  우선순위 큐에 원소를 추가. 큐가 꽉 찬 경우 에러 발생
    public boolean add(E e) {
        offer(e);
        return true;
    }

    // 우선순위 큐에 원소를 추가. 값 추가 실패 시 false를 반환
    public boolean offer(E e) {
        if (e == null)
            throw new NullPointerException();

        ensureCapacity();
        queue[size] = e;
        size++;

        heapifyUp(size - 1);

        return true;
    }

    public E peek() {
        if (size == 0) {
            return null;
        }
        return (E) queue[0];
    }

    // 우선순위 큐에서 첫 번째 값을 반환하고 제거, 비어있으면 null 반환
    public E poll() {
        if (size == 0) {
            return null;
        }

        E root = peek();
        queue[0] = queue[size - 1];
        queue[size - 1] = null;
        size--;

        heapifyDown(0);

        return root;
    }

    // 우선순위 큐에서 첫 번째 값을 반환하고 제거, 비어있으면 에러 발생
    public boolean remove(Object o) {
        if (o == null) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (queue[i].equals(o)) {
                // 제거된 요소를 마지막 요소로 교체
                queue[i] = queue[size - 1];
                queue[size - 1] = null;
                size--;
                // 힙 성질 유지
                heapifyDown(i);
                return true;
            }
        }

        return true;
    }

    // 큐에 주어진 객체가 있는지 확인하는 메서드
    public boolean contains(Object o) {
        if (o == null) {
            return false;
        }

        for (int i = 0; i < size; i++) {
            if (queue[i].equals(o)) return true;
        }

        return false;
    }

    // 우선순위 큐를 초기화
    public void clear() {
        size = 0;
        queue = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    // 우선순위 큐에 포함되어 있는 원소의 수를 반환
    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == queue.length) {
            int newCapacity = queue.length + (queue.length >> 1);
            Object[] newQueue = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newQueue[i] = queue[i];
            }
            queue = newQueue;
        }
    }

    private void swap(int index1, int index2) {
        Object temp = queue[index1];
        queue[index1] = queue[index2];
        queue[index2] = temp;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if ((Integer) queue[index] < (Integer) queue[parentIndex]) {
                swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    private void heapifyDown(int index) {
        int leftChildIndex = 2 * index + 1; // 왼쪽 자식
        int rightChildIndex = 2 * index + 2;// 오른쪽 자식
        int minValue = index;

        if (leftChildIndex < size && (Integer)queue[leftChildIndex] < (Integer)queue[minValue]) {
            minValue = leftChildIndex;
        }

        if (rightChildIndex < size && (Integer)queue[rightChildIndex] < (Integer)queue[minValue]) {
            minValue = rightChildIndex;
        }

        if (minValue != index) {
            swap(index, minValue);
            heapifyDown(minValue);
        }
    }

}
