package studyJava.hamplz.dataStructure.collection.Set.HashSet;

import java.util.Arrays;

public class HamHashSetTest {
    public static void main(String[] args) {
        HamHashSet<String> hamSet = new HamHashSet<>();

        // 1. Add 테스트
        System.out.println("Add 'apple': " + hamSet.add("apple")); // true
        System.out.println("Add 'banana': " + hamSet.add("banana")); // true
        System.out.println("Add 'apple': " + hamSet.add("apple")); // false

        // 2. Size 테스트
        System.out.println("size: " + hamSet.size()); // 2

        // 3. Contains 테스트
        System.out.println("Contains 'apple': " + hamSet.contains("apple")); // true
        System.out.println("Contains 'cherry': " + hamSet.contains("cherry")); // false

        // 4. Remove 테스트
        System.out.println("Remove 'banana': " + hamSet.remove("banana")); // true
        System.out.println("Remove 'banana': " + hamSet.remove("banana")); // false

        // 5. IsEmpty 테스트
        System.out.println("empty: " + hamSet.isEmpty()); // false
        hamSet.remove("apple");
        System.out.println("empty ?" + hamSet.isEmpty()); // true

        // 6. Null 값 테스트
        System.out.println("Add null: " + hamSet.add(null)); // true
        System.out.println("Add null: " + hamSet.add(null)); // false
        System.out.println("Remove null: " + hamSet.remove(null)); // false
    }
}
