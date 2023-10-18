package com.hemanth.problemsolving.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateElementsInArray {

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 7, 5, 6, 8, 7};

        printDuplicates(arr);
    }


    public static void printDuplicates(int[] arr) {

        Set<Integer> uniqueNumbers = new HashSet<>();

        boolean isDuplicatePresent = false;

        for (int i = 0; i < arr.length; i++) {

            if (uniqueNumbers.contains(arr[i])) {
                isDuplicatePresent = true;
                System.out.println("Duplicate number -> " + arr[i]);
            } else {
                uniqueNumbers.add(arr[i]);
            }
        }

        if (!isDuplicatePresent) {
            System.out.println("There are no duplicate elements in the given array");
        }

        System.out.println(Arrays.toString(uniqueNumbers.toArray()));

    }
}
