package studyJava.sangwook.concurrent;

import studyJava.sangwook.dataStructure.collection.list.arraylist.MyArrayList;
import studyJava.sangwook.dataStructure.collection.list.vector.MyVector;

//MyArrayList와 synchronized가 붙은 MyVector의 차이를 알아보자
//but 이 코드는 순서를 보장하지 않기 때문에 vector가 0이 나오지 않을 가능성도 있다 -> 테스트 결과 보통은 나오는듯
public class MyVectorVSMyArrayList {
    public static void main(String[] args) throws InterruptedException {

        MyArrayList<Integer> list = new MyArrayList<>();
        MyVector<Integer> vector = new MyVector<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                if (list.size() > 0) {
                    list.remove(0);
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                vector.add(i);
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                if (vector.size() > 0) {
                    vector.remove(0);
                }
            }
        });

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println(list.size());
        System.out.println(vector.size());

    }
}
