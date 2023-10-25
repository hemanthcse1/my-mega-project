package com.hemanth.problemsolving.stacks;

import java.util.Arrays;
import java.util.Stack;

public class ReverseStringUsingStack {

    public static void main(String[] args) {

        String str = "ABCD";


        System.out.println("original string -> " + str);
        System.out.println("reversed string -> " + reverseString(str));

    }

    public static String reverseString(String str) {

        char[] chars = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }

        char[] reverseString = new char[chars.length];


        for (int i = 0; i < chars.length; i++) {
            reverseString[i] = stack.pop();
        }


        return String.valueOf(reverseString);
    }
}
