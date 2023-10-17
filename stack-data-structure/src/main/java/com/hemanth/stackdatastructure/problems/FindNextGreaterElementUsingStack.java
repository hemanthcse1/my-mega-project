package com.hemanth.stackdatastructure.problems;

import java.util.Arrays;
import java.util.Stack;

public class FindNextGreaterElementUsingStack {

    public static void main(String[] args) {

        int[] arr = {4, 7, 3, 4, 8, 1};

        int[] result = nextGreaterElement(arr);

        System.out.println(Arrays.toString(result));

    }


    public static int[] nextGreaterElement(int[] arr) {

        int[] result = new int[arr.length];
        Stack<Integer> numbers = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {

            if (!numbers.isEmpty()) {
                while (!numbers.isEmpty() && numbers.peek() <= arr[i]) {
                    numbers.pop();
                }
            }

            if (numbers.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = numbers.peek();
            }

            numbers.push(arr[i]);
        }

        return result;
    }
}
