package studyJava.sangwook.algorithm.sort.insertion;

import java.util.Arrays;

public class MyInsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i]; //현재값 - while문 후에도 일정하게 유지
            int prev = i - 1; //이전 인덱스
            while (prev >= 0 && arr[prev] > temp) { //이전 인덱스가 0 이상이고, 이전 값이 현재 값보다 크다면
                arr[prev + 1] = arr[prev]; //현재값을 이전값과 변경
                prev--; //이전 인덱스 -1
            }
            arr[prev + 1] = temp;
        }
    }

    /**
     * temp를 계속 들고있는 상태에서 temp와 이전값을 비교
     * 이전인덱스 + 1하면 현재 인덱스이므로 현재값에 이전값을 넣어놓고 prev를 1씩 줄임
     * while문에 빠져나오면 prev는 temp값보다 작은 값들중 제일 큰 값의 위치를 가르킴
     * -> prev + 1의 위치에 temp를 넣음
     */
}
