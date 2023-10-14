package com.hemanth.problemsonhashmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class ProblemsOnHashmapApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProblemsOnHashmapApplication.class, args);


    }

    /* 1. Two Sum - Find Pairs in an Array:
     *   Problem: Given an array of integers, find two numbers such that they add up to a specific target.
     * */

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }





}
