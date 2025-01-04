package studyJava.sangwook.dataStructure.collection.queuedeque;

public class MyArrayDeque<E> {

    Object[] elements;

    //Deque에 들어가는 요소의 인덱스
    int head; //pop()에 의해 제거되는 제일 상단의 인덱스를 뜻함
    int tail; //제일 마지막 요소의 인덱스

    public MyArrayDeque() {
        elements = new Object[16 + 1];
    }
}
