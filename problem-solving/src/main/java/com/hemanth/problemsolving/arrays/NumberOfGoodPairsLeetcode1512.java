package com.hemanth.problemsolving.arrays;

import java.util.HashMap;
import java.util.Map;

public class NumberOfGoodPairsLeetcode1512 {

    public static void main(String[] args) {


         int[] nums = {1, 2, 3, 1, 1, 3};
        //int[] nums = {1, 1, 1, 1};

        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {

        Map<Integer, Integer> countMap = new HashMap<>();
        int goodPairs = 0;

        for (int num : nums) {

            Integer count = countMap.getOrDefault(num, 0);

            goodPairs += count;
            countMap.put(num, count + 1);
        }

        return goodPairs;
    }
}
