package com.hemanth.problemsolving.hashtable;

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements1745 {

    public static void main(String[] args) {


        int[] nums = {1,1,1,1,1,1};


        System.out.println(sumOfUniqueElements(nums));

    }

    /*public static int sumOfUniqueElements(int[] nums){
        int sum = 0;

        Map<Integer,Integer> uniqueElements = new HashMap<>();

        for (int i = 0; i< nums.length; i++){

            if (uniqueElements.containsKey(nums[i])){
                int count = uniqueElements.get(nums[i]);
                count++;
                uniqueElements.put(nums[i],count);
            }else {
                uniqueElements.put(nums[i],0);
            }
        }

        for (Integer key : uniqueElements.keySet()) {
            if (uniqueElements.get(key) == 0){
                sum+=key;
            }
        }

        return sum;

    }*/


    public static int sumOfUniqueElements(int[] nums){
        int sum = 0;

        Map<Integer,Integer> uniqueElements = new HashMap<>();

        for (int i = 0; i< nums.length; i++){

            if (uniqueElements.containsKey(nums[i])){
                int count = uniqueElements.get(nums[i]);
                count++;
                uniqueElements.put(nums[i],count);
            }else {
                uniqueElements.put(nums[i],0);
            }
        }

        for (Integer key : uniqueElements.keySet()) {
            if (uniqueElements.get(key) == 0){
                sum+=key;
            }
        }

        return sum;

    }
}
