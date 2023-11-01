package com.hemanth.problemsolving.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElement2Leetcode229 {

    public static void main(String[] args) {


        //int[] nums = {2, 2, 1, 1, 1, 2, 2, 4, 4, 4, 4, 4, 4};

        int[] nums = {3, 2, 3};


        System.out.println(majorityElement2(nums));
    }


    public static List<Integer> majorityElement2(int[] nums) {
        List<Integer> result = new ArrayList<>();

        Map<Integer, Integer> elements = new HashMap<>();

        for (int number : nums) {
            if (elements.containsKey(number)) {
                int elementCount = elements.get(number) + 1;
                elements.put(number, elementCount);
            } else {
                elements.put(number, 1);
            }
        }

        for (Map.Entry<Integer, Integer> numbers : elements.entrySet()) {

            if (numbers.getValue() > nums.length / 3) {
                result.add(numbers.getKey());
            }
        }

        return result;
    }
}
