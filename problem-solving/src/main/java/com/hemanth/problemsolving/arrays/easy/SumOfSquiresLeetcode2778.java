package com.hemanth.problemsolving.arrays.easy;

public class SumOfSquiresLeetcode2778 {

    public static void main(String[] args) {

        int[] nums = {2, 7, 1, 19, 18, 3};

        System.out.println(sumOfSquires(nums));

    }

    public static int sumOfSquires(int[] nums) {
        int sum = 0;
        int n = nums.length;


        for (int i = 1; i <= n; i++) {
            if ((n % i) == 0) {
                int prod = nums[i-1]*nums[i-1];
                sum += prod;
            }
        }

        return sum;
    }
}
