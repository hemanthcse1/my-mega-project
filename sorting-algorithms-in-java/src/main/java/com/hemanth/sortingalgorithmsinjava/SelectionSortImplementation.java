package com.hemanth.sortingalgorithmsinjava;

import java.util.Arrays;

public class SelectionSortImplementation {

    public static void main(String[] args) {


        int[] arr1 = {20, 35, -15, 7, 55, 1, -22};




       System.out.println(Arrays.toString(selectionSort(arr1)));
    }

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] selectionSort(int[] nums) {
        for (int lastUnsortedIndex = nums.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {

            int largest = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {

                if (nums[i] > nums[largest]) {
                    largest = i;
                }
            }
            swap(nums, largest, lastUnsortedIndex);

        }

        System.out.println(Arrays.toString(nums));

        return nums;
    }
}
