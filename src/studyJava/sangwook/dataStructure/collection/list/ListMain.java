package studyJava.sangwook.dataStructure.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
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


        /**
         * 참조 여부 확인
         */
        Integer[] arr = {1, 2, 3};

        List<Integer> asList1 = Arrays.asList(arr);

        List<Integer> listOf = List.of(arr);


        arr[1] = 999;

        System.out.println(asList1); //변경
        System.out.println(listOf); //변경X
    }
}
