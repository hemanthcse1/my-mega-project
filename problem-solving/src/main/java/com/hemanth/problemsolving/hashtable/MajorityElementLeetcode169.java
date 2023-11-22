package com.hemanth.problemsolving.hashtable;

import java.util.HashMap;
import java.util.Map;

public class MajorityElementLeetcode169 {

    public static void main(String[] args) {


        int[] arr = {2, 2, 1, 1, 1, 2, 2, 3, 4, 4, 4, 4, 4, 4, 4};
        // int[] arr = {3, 2, 3};

        System.out.println(majorityElement(arr));

    }


  /*  public static int majorityElement(int[] nums) {


        if (nums.length == 0) {
            return 0;
        }

        Map<Integer, Integer> majorityElement = new HashMap<>();

        for (int num : nums) {
            if (majorityElement.containsKey(num)) {
                int elementCount = majorityElement.get(num) + 1;
                majorityElement.put(num, elementCount);

            } else {
                majorityElement.put(num, 1);
            }
        }


        int majElement = 0;
        for (Map.Entry<Integer, Integer> mapNums : majorityElement.entrySet()) {

            System.out.println("key -> " + mapNums.getKey() + "      " + "value -> " + mapNums.getValue());
            if (mapNums.getValue() >= nums.length / 2) {
                majElement = mapNums.getKey();
            }
        }


        return majElement;
    }*/


    public static int majorityElement(int[] nums) {


        if (nums.length == 0) {
            return 0;
        }

        Map<Integer, Integer> majorityElement = new HashMap<>();

        for (int num : nums) {
            if (majorityElement.containsKey(num)) {
                int elementCount = majorityElement.get(num) + 1;
                majorityElement.put(num, elementCount);

            } else {
                majorityElement.put(num, 1);
            }
        }


        int majElement = 0;
        for (Map.Entry<Integer, Integer> mapNums : majorityElement.entrySet()) {

            System.out.println("key -> " + mapNums.getKey() + "      " + "value -> " + mapNums.getValue());
            if (mapNums.getValue() >= nums.length / 2) {
                majElement = mapNums.getKey();
            }
        }


        return majElement;
    }
}
