package com.hemanth.problemsolving.arrays;

import java.util.Arrays;

public class SmallerNumberThanCurrentLeetCode1365 {

    public static void main(String[] args) {

        // int[] nums = {8, 1, 2, 2, 3};
        int[] nums = {6, 5, 4, 8};

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] output = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {

                if (nums[i] > nums[j] && i != j) {
                    count++;
                }
            }
            output[i] = count;
        }

        return output;
    }
}
