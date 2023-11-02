package com.hemanth.problemsolving.arrays;

import java.util.Arrays;

public class ShuffleAnArrayLeetcode1470 {

    public static void main(String[] args) {

       /* int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;*/

        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;

        System.out.println(Arrays.toString(shuffle(nums, n)));

    }


    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];

        int shufflePosition = nums.length / n;

        for (int i = 0; i < nums.length / 2; i++) {

            result[i * shufflePosition] = nums[i];
            result[i * shufflePosition + 1] = nums[i + n];
        }

        return result;
    }
}
