package studyJava.sangwook.dataStructure.collection.set.hashset;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSet<E> {

    static final int DEFAULT_CAPACITY = 16;

    public LinkedList<E>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_CAPACITY;
    public MyHashSet(int capacity) {
        this.capacity = capacity;
        init();
    }

    public MyHashSet() {
        init();
    }

    private void init() {
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(E e) {
        //hashIndex 구한다
        int hashIndex = hashIndex(e);

        //hashIndex에 해당하는 bucket을 가져온 후
        LinkedList<E> bucket = buckets[hashIndex];

        //bucket에 e가 이미 있는지 확인
        if (bucket.contains(e)) {
            return false;
        }

        bucket.add(e);
        size++;
        return true;
    }

    public boolean remove(E e) {
        int hashIndex = hashIndex(e);
        LinkedList<E> bucket = buckets[hashIndex];

        boolean result = bucket.remove(e);
        if (result) {
            size--;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean contains(E e) {
        int hashIndex = hashIndex(e);
        LinkedList<E> bucket = buckets[hashIndex];
        return bucket.contains(e);
    }

    private int hashIndex(Object value) {
        return Math.abs(value.hashCode()) % capacity;
    }

    @Override
    public String toString() {
        return "MyHashSet{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
