package com.hemanth.stackdatastructure.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FindNextGreaterElementAndMatch {

    public static void main(String[] args) {

        int[] arr1 = {4,1,2};
        int[] arr2 = {1,3,4,2};

        int[] nextGreaterElementAndMatch = findNextGreaterElementAndMatch(arr1, arr2);

        System.out.println(Arrays.toString(nextGreaterElementAndMatch));

    }


    public static int[] findNextGreaterElementAndMatch(int[] arr1, int[] arr2) {

        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();


        for (int num : arr2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = nextGreaterMap.getOrDefault(arr1[i], -1);
        }

        return result;
    }
}
