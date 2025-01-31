package studyJava.sangwook.algorithm.sort.selection;

import java.util.Arrays;

public class MySelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 6, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int minIndex, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j; // minIndex 갱신
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    /**
     * 바꿀 index(i)는 0부터 길이-1까지로 순서대로 진행되고
     * 바꿀 타깃의 인덱스 (minIndex)를 갱신시켜 위치를 바꾼다
     */


}
