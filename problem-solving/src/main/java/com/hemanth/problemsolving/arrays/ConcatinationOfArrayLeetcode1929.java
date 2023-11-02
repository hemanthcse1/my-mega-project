package com.hemanth.problemsolving.arrays;

import java.util.Arrays;

public class ConcatinationOfArrayLeetcode1929 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};


        System.out.println(Arrays.toString(concateArray(nums)));


    }

    public static int[] concateArray(int[] nums) {

        int n = nums.length * 2;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {

            if (i >= nums.length) {
                result[i] = nums[i- nums.length];

            } else {
                result[i] = nums[i];
            }
        }

        return result;
    }


}
