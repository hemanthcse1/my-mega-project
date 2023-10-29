package com.hemanth.problemsolving.strings;

public class RepeatedSubStringPatternLeetcode459 {


    public static void main(String[] args) {

        String s = "abcabcd";

        System.out.println(repeatedSubstringPattern(s));

    }


    public static boolean repeatedSubstringPattern(String s) {

        int n = s.length();
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {

                String subString = s.substring(0, i);
                StringBuilder repeated = new StringBuilder();

                for (int j = 0; j < n / i; j++) {
                    repeated.append(subString);
                }

                if (repeated.toString().equals(s)) {
                    return true;
                }
            }
        }

        return false;
    }
}
