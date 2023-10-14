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

    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1);
        for (int num : nums) {
            sum += num;
            if (sumMap.containsKey(sum - k)) {
                count += sumMap.get(sum - k);
            }
            sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    /*
    * 5. Longest Subarray with Sum Divisible by K:
    * Problem: Given an array of integers, find the length of the longest subarray with a sum that is divisible by k.
    * */

    public static int maxSubarraySum(int[] nums, int k) {
        int maxLen = 0, sum = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i]) % k;
            if (sumMap.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - sumMap.get(sum));
            } else {
                sumMap.put(sum, i);
            }
        }
        return maxLen;
    }







}
