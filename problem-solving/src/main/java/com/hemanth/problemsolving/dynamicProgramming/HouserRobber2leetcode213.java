package com.hemanth.problemsolving.dynamicProgramming;

public class HouserRobber2leetcode213 {

    public static void main(String[] args) {

        int[] nums = {2,3,2};

        System.out.println(robber2(nums));

    }

    public static int robber2(int[] nums) {

        if (nums.length < 2) {
            return nums[0];
        }

        int[] firstSkippedArray = new int[nums.length-1];
        int[] lastSkippedArray = new int[nums.length-1];

        for (int i = 0; i < nums.length - 1; i++) {
            firstSkippedArray[i] = nums[i + 1];
            lastSkippedArray[i] = nums[i];
        }

        int firstIndexSkipValue = rob(firstSkippedArray);
        int lastIndexSkipValue = rob(lastSkippedArray);


        return Math.max(firstIndexSkipValue,lastIndexSkipValue);
    }

    public static int rob(int[] nums) {

        if (nums.length < 2) {
            return nums[0];
        }

        int[] output = new int[nums.length];

        output[0] = nums[0];
        output[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {

            output[i] = Math.max(output[i - 2] + nums[i], output[i - 1]);

        }

        return output[nums.length - 1];
    }
}
