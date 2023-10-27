package com.hemanth.problemsolving.strings;

public class LongestPalindromeLeetcode409 {


    public static void main(String[] args) {
        String s = "abccccdd";

        System.out.println(longestPalindrome(s));
    }


    public static int longestPalindrome(String s) {
        int[] charCount = new int[128];

        for (char c : s.toCharArray()) {
            charCount[c]++;
        }

        int palindromeLength = 0;
        boolean hasOddCount = false;

        for (int count : charCount) {
            palindromeLength += (count / 2) * 2;
            if (count % 2 == 1) {
                hasOddCount = true;
            }
        }


        if (hasOddCount) {
            palindromeLength++;
        }

        return palindromeLength;
    }
}
