package com.hemanth.problemsolving.arrays;

import java.util.*;

public class FindDuplicatesLeetcode442 {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums){
       /* List<Integer> output = new ArrayList<>();

        Map<Integer,Integer> numbersMap = new HashMap<>();

        for (int i = 0; i< nums.length; i++){
            if (numbersMap.containsValue(nums[i])){
                output.add(nums[i]);
            }else {
                numbersMap.put(i, nums[i]);
            }
        }
        return output;*/


        List<Integer> duplicates = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                duplicates.add(index + 1);
            } else {
                nums[index] = -nums[index];
            }
        }

        return duplicates;
    }
}
