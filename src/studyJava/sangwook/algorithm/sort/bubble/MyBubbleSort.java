package studyJava.sangwook.algorithm.sort.bubble;

import java.util.Arrays;

public class MyBubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    /**
     * n번째 요소와 n-1요소 비교 (n은 1부터 시작)
     * 1회전이 끝나면 마지막 원소는 가장 큰것이 확정이므로 j의 범위에서 -i
     */
}
