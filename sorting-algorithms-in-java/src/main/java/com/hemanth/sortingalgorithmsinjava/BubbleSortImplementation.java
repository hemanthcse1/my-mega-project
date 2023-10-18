package com.hemanth.sortingalgorithmsinjava;

import java.util.Arrays;

public class BubbleSortImplementation {

    /*
     * Time complexity is O(n^2) -> quadratic
     * */

    public static void main(String[] args) {

        int[] arr = {20, 35, -15, 7, 55, 1, -22};


        // bubble the largest number from left to right

        for (int lastUnsortedIndex = arr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }

        System.out.println(Arrays.toString(arr));


        System.out.println("---------------------");

        // bubble the largest number from right to left

        int[] arr2 = {34, 0, -12, 64, 12, 1, -44, 21, 3};

        for (int lastUnSortedIndex = 0; lastUnSortedIndex < arr2.length - 1; lastUnSortedIndex++) {

            for (int i = arr2.length - 1; i > 0; i--) {
                if (arr2[i] < arr2[i - 1]) {
                    swap(arr2, i, i - 1);
                }
            }
        }

        System.out.println(Arrays.toString(arr2));

    }


    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
