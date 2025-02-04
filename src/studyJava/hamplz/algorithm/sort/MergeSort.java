package studyJava.hamplz.algorithm.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 7, 8, 3, 4, 1, 5, 6};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) return;

        int mid = (start + end) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }

    static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int p = start, q = mid + 1, idx = 0;

        while (p <= mid && q <= end) {
            if (arr[p] <= arr[q]) {
                temp[idx] = arr[p];
                p++;
            } else {
                temp[idx] = arr[q];
                q++;
            }
            idx++;
        }

        while (p <= mid) temp[idx++] = arr[p++];
        while (q <= end) temp[idx++] = arr[q++];

        System.arraycopy(temp, 0, arr, start, temp.length);
    }
}
