package studyJava.hamplz.dataStructure.collection.Queue.Deque.ArrayDeque;

import java.util.NoSuchElementException;

public class HamArrayDeque<E> {
    private static final int DEFAULT_CAPACITY = 16; // 초기 size

    private Object[] elements; // 내부 배열
    private int head;          // 덱의 시작 인덱스
    private int tail;          // 덱의 끝 인덱스
    private int size;          // 덱의 현재 크기

    public HamArrayDeque() {
        elements = new Object[DEFAULT_CAPACITY];
        head = 0;
        tail = 0;
        size = 0;
    }

    public boolean add(E e) {
        addLast(e);
        return true;
    }

    public void addFirst(E e) {
        ensureCapacity();
        head = (head - 1 + elements.length) % elements.length; // head 왼쪽 슬라이드
        elements[head] = e;
        size++;
    }

    public void addLast(E e) {
        ensureCapacity();
        elements[tail] = e; // tail 위치에 추가
        tail = (tail + 1) % elements.length; // tail 오른쪽 슬라이드
        size++;
    }

    public E remove() {
        return removeFirst();
    }

    public E removeFirst() {
        if (size == 0) {
            throw new NoSuchElementException("Deque is empty");
        }
        E value = (E) elements[head];
        elements[head] = null; // GC null 처리
        head = (head + 1) % elements.length; // head 오른쪽 슬라이드
        size--;
        return value;
    }

    public E removeLast() {
        if (size == 0) {
            throw new NoSuchElementException("Deque is empty");
        }
        tail = (tail - 1 + elements.length) % elements.length; // tail 왼쪽 슬라이드
        E value = (E) elements[tail];
        elements[tail] = null; // GC null 처리
        size--;
        return value;
    }

    public E peek() {
        return peekFirst();
    }

    public E peekFirst() {
        if (size == 0) {
            return null;
        }
        return (E) elements[head];
    }

    public E peekLast() {
        if (size == 0) {
            return null;
        }
        int lastIndex = (tail - 1 + elements.length) % elements.length;
        return (E) elements[lastIndex];
    }

    public int size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == elements.length) { // 배열이 다 차면
            int newCapacity = elements.length * 2;
            Object[] newArray = new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = elements[(head + i) % elements.length]; // 원형 배열에서 요소를 복사
            }
            elements = newArray;
            head = 0;
            tail = size;
        }
    }
}
