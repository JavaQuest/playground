package studyJava.hamplz.dataStructure.collection.List.ArrayList;

import java.util.Arrays;
/*
* 생성자
* ArrayList() : 초기 용량이 10인 빈 목록을 구성
* ArrayList(int initialCapacity) : 지정된 초기 용량으로 빈 목록을 구성
* ArrayList(Collection<? extends E> c) : 지정된 컬렉션의 요소를 컬렉션의 반복자가 반환한 순서대로 포함하는 목록을 구성
* 
* void add(int index, E element) : 특정 위치에 요소를 추가
* boolean add(E e) : 요소를 리스트 끝에 추가
*
* void clear() : 모든 요소를 제거
*
* boolean contains(Object o) : 특정 객체가 리스트에 포함되어 있는지 확인
*
* E get(int index) : 특정 인덱스의 요소를 반환
* E set(int index, E element) : 특정 인덱스의 요소를 새로운 값으로 교체
*
* E remove(int index) : 지정된 인덱스의 요소를 제거
* boolean remove(Object o) : 지정된 객체를 리스트에서 제거
*
* int indexOf(Object o) : 특정 객체의 첫 번째 인덱스를 반환
* int lastIndexOf(Object o) : 특정 객체의 마지막 인덱스를 반환
*
* boolean isEmpty() : 리스트가 비어 있는지 확인
*
* int size() - 리스트의 크기를 반환
*/
public class HamArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10; // 기본 용량
    private static final Object[] EMPTY_DATA = {}; // 빈 배열

    private Object[] data; // 데이터 저장 배열
    private int size; // 실제 데이터의 크기

    public HamArrayList() {
        this.data = EMPTY_DATA;
    }

    public HamArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            this.data = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.data = EMPTY_DATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        size = 0;
    }

    /**
     * 특정 위치에 요소를 추가
     *
     * @param index 위치
     * @param element 추가할 요소
     */
    public void add(int index, E element) {
        // range check
        // 용량을 충분히 확보
        // index 위치부터 요소를 뒤로 밀어서 공간을 확보
    }

    /**
     * 요소를 리스트 끝에 추가
     *
     * @param element 추가할 요소
     * @return 추가된 요소
     */
    public E add(E element) {
        // 용량을 충분히 확보
        // 새 요소를 배열에 추가
        return (E) element;
    }

    /**
     * 모든 요소를 제거
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    /**
     * 특정 객체가 리스트에 포함되어 있는지 확인
     *
     * @param o 확인할 객체
     * @return 포함되면 true, 아니면 false
     */
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    /**
     * 특정 인덱스의 요소를 반환
     *
     * @param index 조회할 인덱스
     * @return 해당 인덱스의 요소
     */
    public E get(int index) {
        return (E) data[index];
    }

    /**
     * 특정 인덱스의 요소를 새로운 값으로 교체
     *
     * @param index 교체할 인덱스
     * @param element 교체할 새로운 값
     * @return 교체된 이전 값
     */
    public E set(int index, E element) {
        E old = get(index);
        data[index] = element;
        return old;
    }

    /**
     * 지정된 인덱스의 요소를 제거
     *
     * @param index 제거할 인덱스
     * @return 제거된 요소
     */
    public E remove(int index) {
        // 유효한 인덱스 확인

        E old = get(index);
        elementRemove(index);
        return old;
    }

    /**
     * 지정된 객체를 리스트에서 제거
     *
     * @param o 제거할 객체
     * @return 제거되었으면 true, 아니면 false
     */
    public boolean remove(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) {
                    elementRemove(i);
                    return true;
                }
            }
        }
        else {
            for (int i = 0; i < size; i++) {
                if (o.equals(data[i])) {
                    elementRemove(i);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 특정 객체의 첫 번째 인덱스를 반환
     *
     * @param o 찾을 객체
     * @return 첫 번째 인덱스, 없으면 -1
     */
    public int indexOf(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (data[i] == null) return i;
            }
        }
        else {
            for (int i = 0; i < size; i++) {
                if (o.equals(data[i])) return i;
            }
        }
        return -1;
    }

    /**
     * 특정 객체의 마지막 인덱스를 반환
     *
     * @param o 찾을 객체
     * @return 마지막 인덱스, 없으면 -1
     */
    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = size-1; i >= 0; i--) {
                if (data[i] == null) return i;
            }
        }
        else {
            for (int i = size-1; i >= 0; i--) {
                if (o.equals(data[i])) return i;
            }
        }

        return -1;
    }

    /**
     * 리스트가 비어 있는지 확인
     *
     * @return 리스트가 비어 있으면 true, 그렇지 않으면 false
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 리스트의 크기를 반환
     *
     * @return 리스트에 저장된 요소의 개수
     */
    public int size() {
        return size;
    }

    // 요소 삭제 시 효율적인 방식
    private void elementRemove(int index) {
        int numMoved = size - index - 1;
        for (int i = index; i < numMoved; i++) {
            data[i] = data[i+1];
        }
        data[--size] = null;
    }

    // 용량을 확보하는 메소드
    private void ensureCapacity(int minCapacity) {
        if (minCapacity - data.length > 0) {
            grow(minCapacity);
        }
    }

    // 배열 용량 증가시키는 메소드
    private void grow(int minCapacity) {
        int newCapacity = data.length * 2;
        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
        }
        data = Arrays.copyOf(data, newCapacity);
    }

    // 인덱스 범위 체크
    private void rangeCheck(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

}