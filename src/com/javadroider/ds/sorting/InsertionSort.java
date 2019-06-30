package com.javadroider.ds.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {10, 8, 13, 6, 15, 1};
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        Arrays.stream(arr).forEach(ele -> System.out.print(ele + " "));
    }
}
