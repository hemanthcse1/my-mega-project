package com.hemanth.problemsolving.strings.easy;

import static com.hemanth.problemsolving.strings.ValidatePalindrome125.isPalindrome;

public class RemovePalindromicLeetcode1332 {

    public static void main(String[] args) {


        String s = "abb";

        System.out.println(removePalindromeSub(s));


    }

    public static int removePalindromeSub(String s) {
        if (s.isEmpty() || isPalindrome(s)) {
            return 1;
        }

        return 2;
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
