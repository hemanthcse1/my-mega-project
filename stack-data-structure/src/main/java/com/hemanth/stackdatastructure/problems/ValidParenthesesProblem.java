package com.hemanth.stackdatastructure.problems;

import java.util.Stack;

public class ValidParenthesesProblem {

    public static void main(String[] args) {

        String statement = "{[()]}";

        System.out.println(isValid(statement));

    }


    private static boolean isValid(String statement) {

        Stack<Character> stack = new Stack<>();

        for (char c : statement.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char top = stack.peek();
                    if ((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
