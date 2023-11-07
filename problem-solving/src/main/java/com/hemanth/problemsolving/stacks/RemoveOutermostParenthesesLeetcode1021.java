package com.hemanth.problemsolving.stacks;

public class RemoveOutermostParenthesesLeetcode1021 {


    public static void main(String[] args) {


        String s = "(()())(())";

        System.out.println(removeOuterParentheses(s));

    }


    public static String removeOuterParentheses(String s) {
       /* StringBuilder output = new StringBuilder();
        int openCount = 0;
        int closeCount = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                closeCount++;
            }


            if (openCount == closeCount) {
                output.append(s, 1, output.length() - 1);
                openCount = 0;
                closeCount = 0;
            } else {
                output.append(c);
            }
        }

        return output.toString();*/


        StringBuilder result = new StringBuilder();
        int openCount = 0;
        int closeCount = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                openCount++;
            } else if (c == ')') {
                closeCount++;
            }

            if (openCount == closeCount) {
                // We found a primitive string, remove the outer parentheses.
                result.append(s, 1, result.length() - 1); // Append the primitive string without outer parentheses.
                openCount--;
                closeCount--;
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
