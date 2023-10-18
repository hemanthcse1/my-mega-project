package com.hemanth.problemsolving.arrays;

public class FindPairsInArrayWithGivenSum {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int sum = 9;

        findPair(arr, sum);

    }

    public static void findPair(int[] arr, int sum) {


        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            if ((arr[low] + arr[high]) == sum) {
                System.out.println("Pair is ( " + arr[low] + " , " + arr[high] + " )");
                low++;
                high--;
            } else if ((arr[low] + arr[high]) > sum) {
                high--;
            } else if ((arr[low] + arr[high]) < sum) {
                low++;
            }
        }

    }
}
