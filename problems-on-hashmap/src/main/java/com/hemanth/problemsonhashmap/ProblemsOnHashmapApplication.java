package com.hemanth.problemsonhashmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class ProblemsOnHashmapApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProblemsOnHashmapApplication.class, args);


    }

    /* 1. Two Sum - Find Pairs in an Array:
     *   Problem: Given an array of integers, find two numbers such that they add up to a specific target.
     * */

    public static int[] twoSum(int[] nums, int target) {
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


    /*
    * 2. Find the First Non-Repeating Character in a String:
    * Problem: Find the first non-repeating character in a string.
    * */

    public static char firstUniqChar(String s) {
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (countMap.get(c) == 1) {
                return c;
            }
        }
        return ' ';
    }

    /*3. Group Anagrams:
    * Problem: Given an array of strings, group anagrams together.
    * */

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            if (!anagramMap.containsKey(sortedStr)) {
                anagramMap.put(sortedStr, new ArrayList<>());
            }
            anagramMap.get(sortedStr).add(str);
        }
        return new ArrayList<>(anagramMap.values());
    }

    /*
    * Subarray Sum Equals K:
    * Problem: Given an array of integers, find the total number of subarrays whose sum equals k.
    * */





}
