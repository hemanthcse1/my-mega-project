package com.hemanth.problemsolving.arrays;

public class CountKDifferenceLeetCode2006 {

    public static void main(String[] args) {

        // int[] arr = {1, 2, 2, 1};
        // int[] arr = {1, 3};
        int[] arr = {3, 2, 1, 5, 4};
        int k = 2;

        System.out.println(countKDifference(arr, k));
    }

    public static int countKDifference(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if (i < j) {
                    int diff = Math.abs(nums[i] - nums[j]);
                    if (diff == k) {
                        count++;
                    }
                }
            }
        }


        return count;
    }
}
