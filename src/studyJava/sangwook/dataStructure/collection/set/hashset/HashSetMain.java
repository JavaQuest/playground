package studyJava.sangwook.dataStructure.collection.set.hashset;

public class HashSetMain {
    public static void main(String[] args) {
        MyHashSet<Integer> set = new MyHashSet<>(10);
        set.add(3);
        set.add(3);
        set.add(33);
        set.add(333);
        set.remove(3);
        System.out.println(set);

        System.out.println(set.contains(4));
        System.out.println(set.contains(33));
    }
}
