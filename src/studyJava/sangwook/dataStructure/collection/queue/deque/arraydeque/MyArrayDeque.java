package studyJava.sangwook.dataStructure.collection.queue.deque.arraydeque;

//ArrayDeque를 직접 구현하자
public class MyArrayDeque<E> {

    public Object[] elements;

    //Deque에 들어가는 요소의 인덱스
    public int head; //pop()에 의해 제거되는 제일 상단의 인덱스를 뜻함
    public int tail; //제일 마지막 요소의 인덱스X -> 제일 마지막 요소가 추가'될' 인덱스 즉, 비어있는 index를 뜻한다
    int size;

    public MyArrayDeque() {
        elements = new Object[16 + 1];
    } //기본적으로 16개를 담을 수 있는 element 배열 생성

    public MyArrayDeque(int size) {
        elements = new Object[size + 1];
    }

    private void grow() { //간단하게 2배 증가 시킴
        final int oldCapacity = elements.length;
        int newCapacity = oldCapacity * 2;

        Object[] newElements;

        //2배로 배열을 늘린 후
        newElements = new Object[newCapacity];
        //새로운 배열에 head부터 값 집어넣는다
        for (int i = 0; i < size() + 1; i++) {
            newElements[i] = elements[(head + i) % oldCapacity];
        }

        //head를 0으로 변경
        head = 0;
        tail = size();

        // 새 배열을 사용하도록 설정
        elements = newElements;
    }

    public boolean isEmpty() {
        return head == tail;
    }

    public int size() {
        return size;
    }

    public boolean add(E e) {
        if (e == null) { //null 허용 X -> null을 배열의 빈곳으로 판단하기 때문
            throw new NullPointerException();
        }

        //tail부분에 값을 집어넣는다
        elements[tail] = e;

        if (head == (tail + 1) % elements.length) { //배열이 가득 찬 경우
            grow();
        }

        tail = (tail + 1) % elements.length;
        size++;

        return true;
    }

    public E remove() {
        @SuppressWarnings("unchecked")
        E e = (E) elements[head];

        if (e != null) {
            elements[head] = null;
            head = (head + 1) % elements.length;
        }
        size--;
        return e;
    }

}
