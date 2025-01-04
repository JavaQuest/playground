package studyJava.sangwook.dataStructure.collection.arraylist;


public class ArrayListMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(1);
        list.add(2);

        list.remove(0);
        list.remove(Integer.valueOf(2));

        System.out.println(list);
        System.out.println(list.size());
    }
}
