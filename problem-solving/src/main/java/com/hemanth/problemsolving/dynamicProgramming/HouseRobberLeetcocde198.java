package com.hemanth.problemsolving.dynamicProgramming;

public class HouseRobberLeetcocde198 {

    public static void main(String[] args) {

        int[] nums = {2, 7, 9, 3, 1};

        System.out.println(rob(nums));

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
