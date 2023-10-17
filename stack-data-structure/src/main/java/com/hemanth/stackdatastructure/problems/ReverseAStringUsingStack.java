package com.hemanth.stackdatastructure.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReverseAStringUsingStack {

    public static void main(String[] args) {

        String str = "abcdef";

        char[] chars = str.toCharArray();

        Stack<Character> stack = new Stack<>();

        for (char c: chars){
            stack.push(c);
        }

        for (int i = 0; i<str.length(); i++){
            chars[i] = stack.pop();
        }

        System.out.println(chars);

        System.out.println("--------------------------------");
        Stack<Integer> intStack = new Stack<>();
        List<Integer> numbers = Arrays.asList(1,2,3,5,6,7,8,9);

        for (int number: numbers){
            intStack.push(number);
        }

        for (int i =0; i<numbers.size(); i++){

            numbers.set(i, intStack.pop());
        }


        System.out.println(numbers);

    }
}
