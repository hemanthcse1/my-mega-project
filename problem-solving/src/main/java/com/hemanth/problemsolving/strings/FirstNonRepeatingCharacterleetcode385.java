package com.hemanth.problemsolving.strings;

public class FirstNonRepeatingCharacterleetcode385 {


    public static void main(String[] args) {

       // String s = "leetcode";
        String s = "loveleetcode";

        System.out.println(firstUniqChar(s));
    }


    public static int firstUniqChar(String s) {


        char[] charCount = new char[26];

        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {

            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }


        return -1;
    }
}
