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


//        List.of(null, 3, 5); // null X
        List<Integer> newList = new ArrayList<>();
        ArrayList<Integer> newList1 = (ArrayList<Integer>) newList;
        newList1.add(3);

        List<Integer> immutable = List.of(1, 3, 5);
//        ArrayList<Integer> arrayList = (ArrayList<Integer>) immutable; //casting 자체가 되지않음 ClassCastException 발생
//        immutable.set(0, 3); UnsupportedOperationException 발생

        List<Integer> asList = Arrays.asList(1, 2, 3);
//        asList.add(3); UnsupportedOperationException 발생
        asList.set(0, 3);
        System.out.println(asList);

//        ArrayList<Integer> asList1 = (ArrayList<Integer>) asList; ClassCastException 발생

        List<Integer> asList2 = Arrays.asList(null, 3, 5);
        System.out.println(asList2);
        System.out.println(asList2 instanceof ArrayList<Integer>); //false
    }
}
