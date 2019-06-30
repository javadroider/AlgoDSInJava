package com.javadroider.ds.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int array[] = {10, 8, 13, 6, 15, 1};
        int n = array.length;
        for (int pass = n - 1; pass >= 0; pass--) {
            for (int i = 0; i < pass; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        Arrays.stream(array).forEach(ele -> System.out.print(ele + " "));
    }
}
