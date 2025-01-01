package studyJava.dataStructure.collection.stack;

import java.util.EmptyStackException;
import java.util.Vector;

//간단히 구현하기 위해 MyVector가 아닌 Vector를 상속받아 만들었다
public class MyStack<E> extends Vector<E> {

    //제일 마지막 요소를 조회하는 peek()
    public synchronized E peek() {
        int size = size();

        if (size == 0) {
            throw new EmptyStackException();
        }
        return elementAt(0);
    }

    //값을 집어넣는 push()
    public E push(E item) {
        addElement(item); // addElement에 synchronized가 붙어있다

        return item;
    }

    //제일 마지막 요소를 꺼내는 pop()
    public synchronized E pop() {
        E element;
        int size = size();

        element = peek();
        removeElementAt(size - 1);
        return element;
    }

    //비어있는 경우라면 true를 반환하는 empty()
    public boolean empty() {
        return size() == 0;
    }

}
