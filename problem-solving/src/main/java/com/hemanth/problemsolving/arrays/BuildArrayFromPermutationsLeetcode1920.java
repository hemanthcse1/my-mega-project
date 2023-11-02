package com.hemanth.problemsolving.arrays;

import java.util.Arrays;

public class BuildArrayFromPermutationsLeetcode1920 {

    /*
    * Given an array of integers nums, sort the array in ascending order and return it.

      You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.
    * */


    /*
    *   Example 1:

        Input: nums = [5,2,3,1]
        Output: [1,2,3,5]
        Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
        Example 2:

        Input: nums = [5,1,1,2,0,0]
        Output: [0,0,1,1,2,5]
        Explanation: Note that the values of nums are not necessairly unique.


        Constraints:

        1 <= nums.length <= 5 * 104
        -5 * 104 <= nums[i] <= 5 * 104
    *
    *
    * */


    public static void main(String[] args) {


        int[] nums = {0, 2, 1, 5, 3, 4};

        System.out.println(Arrays.toString(buildArray(nums)));
    }

    public static int[] buildArray(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }
}
