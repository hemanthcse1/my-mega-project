package com.hemanth.problemsolving.strings;

public class FindTheDifferenceleetcode389 {

    public static void main(String[] args) {

        String s = "";
        String t = "y";

        System.out.println(findTheDifference(s, t));

    }


    public static char findTheDifference(String s, String t) {

        char[] charCount = new char[26];

        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            charCount[c - 'a']--;
        }

        for (int i = 0; i < 26; i++) {

            if (charCount[i] > 0) {
                return (char) ('a' + i);
            }
        }

        return ' ';
    }
}
