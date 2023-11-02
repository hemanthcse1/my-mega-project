package com.hemanth.problemsolving.arrays;

import java.util.Arrays;

public class RunningSumOfOneDArrayLeetcode1480 {

    public static void main(String[] args) {

        // int[] nums = {1, 2, 3, 4};
        int[] nums = {1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(runningSum(nums)));

    }


    public static int[] runningSum(int[] nums) {
        int[] output = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            output[i] = sum;
        }
        return output;
    }
}
