package com.hemanth.problemsolving.arrays;

import javax.crypto.spec.PSource;

public class ElementsSumLeetcode2535 {

    public static void main(String[] args) {

        int[] nums = {1, 15, 6, 3};

        System.out.println(differencesOfSum(nums));


    }

    public static int differencesOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;


        for (int i = 0; i < nums.length; i++) {
            elementSum += nums[i];

            if (nums[i] > 9) {
                int number = nums[i];
                while (number > 0) {
                    int digit = number % 10;
                    digitSum += digit;
                    number /= 10;
                }
            } else {
                digitSum += nums[i];
            }
        }

        return Math.abs(elementSum - digitSum);

    }


}
