package studyJava.dataStructure.collection.linkedlist;

//LinkedList를 직접 구현하자
public class MyLinkedList<E> {

    private int size = 0;
    private Node<E> first;
    private Node<E> last;

    public MyLinkedList() {
    }

    public boolean add(E e) {
        Node<E> node = last;
        Node<E> newNode = new Node<>(node, e, null);
        if (node == null) {
            //첫번째 노드라는 것
            first = newNode;
            last = newNode;
        }
        else {
            //기존의 마지막이었던 node에 newNode를 다음으로 연결
            node.next = newNode;
        }
        size++;
        return true;
    }

    public void add(int index, E e) {
        //인덱스 유효 확인
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == size) { //마지막에 추가하는 것과 같다
            add(e);
        }
        else {
            //해당하는 인덱스의 노드를 가져옴
            Node<E> node = node(index);

            //해당하는 인덱스의 전 노드를 가져옴
            Node<E> prev = node.prev;

            //새로운 노드를 만든다
            Node<E> newNode = new Node<>(null, e, node);

            if (prev == null) {
                //첫번째 노드라는 뜻
                first = newNode;
            }
            else {
                newNode.prev = prev;
                prev.next = newNode;
            }

            size++;

        }

    }

    //Node를 순회하여 특정 인덱스의 노드 찾아오는 메서드
    private Node<E> node(int index) {
        Node<E> x;
        if (index < (size / 2)) {
            //앞쪽부터 탐색
            x = first;
            for (int i = 0; i < index; i++) {
                x = x.next;
            }
        }
        else {
            //뒤쪽부터 탐색
            x = last;
            for (int i = size - 1; i > index; i--) {
                x = x.prev;
            }
        }
        return x;
    }

    //배열이 없고 Node 기반으로 작동한다
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<E> current = first;
        for (int i = 0; i < size - 1; i++) {
            sb.append(current.item).append(", ");
            current = current.next;
        }
        sb.append(current.item);
        sb.append("]");
        return sb.toString();
    }
}
