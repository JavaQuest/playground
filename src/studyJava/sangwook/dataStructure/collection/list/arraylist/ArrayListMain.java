package studyJava.sangwook.dataStructure.collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);

        list.remove(0);
        list.remove(Integer.valueOf(2));
        list.add(null);
        list.add(3);
        list.remove(1);
        list.remove(0);
        System.out.println(list);

        System.out.println(list);
        System.out.println(list.size());

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(null);
        System.out.println(integers);

    }
}
