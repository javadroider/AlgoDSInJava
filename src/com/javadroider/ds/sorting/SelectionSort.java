package com.javadroider.ds.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int array[] = {10, 8, 13, 6, 15, 1};
        int n = array.length;
        int min = 0;
        for (int i = 0; i < n; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

        Arrays.stream(array).forEach(ele -> System.out.print(ele + " "));
    }
}
