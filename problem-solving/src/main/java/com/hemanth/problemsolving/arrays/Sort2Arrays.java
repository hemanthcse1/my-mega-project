package com.hemanth.problemsolving.arrays;

import java.util.Arrays;

public class Sort2Arrays {

    public static void main(String[] args) {

        int[] a = {5, 2, 8, 1, 6};
        int[] b = {9, 4, 7, 3, 1, 11, 10, 18, 16};

        System.out.println(Arrays.toString(sort2Arrays(a, b)));

    }

    public static int[] sort2Arrays(int[] a, int[] b) {

        int[] one = sortArray(a);
        int[] two = sortArray(b);

        int[] result = new int[one.length + two.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < one.length) {
            if (one[i] < two[j]) {
                result[k++] = one[i++];
            } else if (one[i] == two[j]) {
                result[k++] = one[i++];
                result[k++] = two[j++];
            } else if (one[i] > two[j]) {
                result[k++] = two[j++];
            }
        }

        for (int l = j; l < two.length; l++) {
            result[k++] = two[j++];
        }


        return result;
    }

    private static int[] sortArray(int[] a) {
        for (int i = 0; i < a.length; i++) {

            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        return a;
    }
}
