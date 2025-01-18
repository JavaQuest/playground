package studyJava.hamplz.dataStructure.collection.Set.HashSet;

import java.util.HashMap;
import java.util.Objects;

public class HamHashSet<E> {
    private transient HashMap<E,Object> map;
    private static final Object PRESENT = new Object();

    public HamHashSet() {
        map = new HashMap<>();
    }

    public boolean add(E e) {
        return map.put(e, PRESENT)==null;
    }

    public boolean remove(Object o) {
        return map.remove(o)==PRESENT;
    }

    public boolean contains(Object o) {
        return map.containsKey(o);
    }

    public int size() {
        return map.size();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public void clear() {
        map.clear();
    }
}
