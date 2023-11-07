package com.hemanth.problemsolving.slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class CountGoodSubstringsLeetcode1876 {


    public static void main(String[] args) {

      //  String s = "xyzzaz";
        String s = "aababcabc";

        System.out.println(countGoodSubstrings(s));
    }

    public static int countGoodSubstrings(String s) {
        if (s == null || s.length() < 3) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            String substring = s.substring(i, i + 3);
            if (isGoodString(substring)){
                count++;
            }
        }

        return count;
    }

    public static boolean isGoodString(String subString) {
        Set<Character> seen = new HashSet<>();

        for (char c : subString.toCharArray()) {
            if (seen.contains(c)) {
                return false;
            } else {
                seen.add(c);
            }
        }

        return true;
    }
}
