package studyJava.sangwook.dataStructure.collection.queue.priorityqueue;

import java.util.Comparator;
import java.util.NoSuchElementException;

public class MyPriorityQueue<E> {

    //힙 - 0번째 요소는 null이고 1부터 시작한다
    public Object[] queue;

    //Comparator
    public Comparator<? super E> comparator;

    public int size;

    public MyPriorityQueue(Comparator<? super E> comparator) {
        this.comparator = comparator;
        queue = new Object[11];
    }

    public boolean add(E e) {
        if (e == null) {
            throw new NullPointerException();
        }

        if (size == 0) {
            size++;
            queue[size] = e;
            return true;
        }
        else {
            //일단 배열의 맨 뒤에 집어 넣는다
            size++;
            int idx = size;
            queue[idx] = e;

            //우선순위에 맞게 올려보냄
            heapifyUp(idx);
        }
        return true;
    }

    public E poll() {
        if (size == 0) {
            throw new NoSuchElementException();
        }

        //꺼내올 값을 저장
        @SuppressWarnings("unchecked")
        E poll = (E) queue[1];

        //루트 노드를 마지막 노드로 갱신
        queue[1] = queue[size];
        queue[size] = null;
        size--;

        heapifyDown(1);

        return poll;
    }


    //이진트리의 왼쪽 자식으로 간다 -> 현재 index * 2
    //이진트리의 오른쪽 자식으로 간다 -> 현재 index * 2 + 1
    //부모 인덱스 = 자식 노드 / 2
    private int getParent(int index) {
        return index / 2;
    }

    private int getLeftChild(int index) {
        return index * 2;
    }

    private int getRightChild(int index) {
        return index * 2 + 1;
    }

    private void heapifyUp(int idx) {
        while (idx > 1) {

            @SuppressWarnings("unchecked")
            E child = (E) queue[idx];

            //집어넣은 트리에서 부모 노드를 찾아온다
            @SuppressWarnings("unchecked")
            E parent = (E) queue[getParent(idx)];

            //comparator를 반복 사용하여 우선순위대로 노드를 올려보냄
            int compare = comparator.compare(child, parent);

            if (compare < 0) {
                queue[getParent(idx)] = child;
                queue[idx] = parent;

                idx = getParent(idx);
            }
            else {
                break;
            }
        }
    }

    private void heapifyDown(int idx) {
        while (getLeftChild(idx) < size) { //왼쪽 자식이 있어야 비교가 가능하므로 왼쪽자식이 존재하는 경우 반복

            int leftChildIdx = getLeftChild(idx);
            int rightChildIdx = getRightChild(idx);

            // 현재 부모와 자식 노드
            @SuppressWarnings("unchecked")
            E parent = (E) queue[idx];

            @SuppressWarnings("unchecked")
            E leftChild = (E) queue[leftChildIdx];

            E rightChild = null;

            if (rightChildIdx < size) { //오른쪽 자식이 유효한 경우
                rightChild = (E) queue[rightChildIdx];
            }

            //더 작은 자식 노드의 인덱스를 찾음
            int smallerChildIdx = leftChildIdx; //기본은 왼쪽 자식
            if (rightChild != null && comparator.compare(rightChild, leftChild) < 0) {
                smallerChildIdx = rightChildIdx; //오른쪽 자식이 더 작은 경우
            }

            //부모와 더 작은 자식을 비교
            if (comparator.compare((E) queue[smallerChildIdx], parent) >= 0) {
                break; // 부모가 자식보다 작거나 같으면 종료
            }

            //부모와 작은 자식을 교환
            queue[idx] = queue[smallerChildIdx];
            queue[smallerChildIdx] = parent;

            //인덱스를 작은 자식의 위치로 갱신
            idx = smallerChildIdx;

        }
    }
}
