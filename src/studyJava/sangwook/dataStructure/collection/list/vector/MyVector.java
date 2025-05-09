package studyJava.sangwook.dataStructure.collection.list.vector;

import java.util.Arrays;

public class MyVector<E> {

    private static final int DEFAULT_CAPACITY = 10;

    private int elementCount;

    private Object[] elementData;

    public MyVector(int initialCapacity) {
        if (initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            this.elementData = new Object[]{};
        }
    }

    public MyVector() {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    /**
     * elementData 배열에 집어넣고 size를 증가시키는데
     * elementData가 가득찬 경우 기존 배열을 바탕으로 사이즈를 늘린 새로운 배열로 할당
     */
    public synchronized boolean add(E e) {
        if (elementCount == elementData.length) { //element가 가득찬 경우
            elementData = grow();
        }
        elementData[elementCount] = e;
        elementCount++;
        return true;
    }

    public synchronized E remove(int index) {
        //index가 유효한 값인지 확인
        if (index >= elementCount || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        //index의 값을 없애고 배열을 다 앞으로 당겨야함
        @SuppressWarnings("unchecked")
        E oldValue = (E) elementData[index];

        remakeArray(index);

        return oldValue;
    }

    public synchronized boolean remove(Object o) {
        //배열 순회하여 object 탐색
        Integer index = null;

        for (int i = 0; i < elementData.length; i++) {
            if (elementData[i].equals(o)) {
                index = i;
                break;
            }
        }

        if (index == null) {
            return false;
        }

        remakeArray(index);
        return true;
    }

    //remove시 배열을 재조정하고 사이즈를 줄인다
    private void remakeArray(int index) {
        elementData[index] = null;

        for (int i = index; i < elementCount - 1; i++) {
            elementData[i] = elementData[i + 1];
            elementData[i + 1] = null;
        }

        elementCount--;
    }

    @SuppressWarnings("unchecked")
    public synchronized E get(int index) {
        return (E) elementData[index];
    }

    public synchronized int size() {
        return elementCount;
    }

    //간단하게 2배로 늘림
    private Object[] grow() {
        return Arrays.copyOf(elementData, elementData.length * 2);
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "elementData=" + Arrays.toString(elementData) +
                '}';
    }
}
