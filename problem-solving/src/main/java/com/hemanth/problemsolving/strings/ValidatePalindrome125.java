package com.hemanth.problemsolving.strings;

public class ValidatePalindrome125 {

    public static void main(String[] args) {

        String s1 = "A man, a plan, a canal, Panama";
        String s2 = "race a car";

        System.out.println("Is it palindrome -> "+isPalindrome(s1));
        System.out.println("Is it palindrome -> "+isPalindrome(s2));

    }


    public static boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }

        return true;
    }
}
