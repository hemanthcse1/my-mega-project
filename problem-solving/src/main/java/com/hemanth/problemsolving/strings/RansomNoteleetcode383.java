package com.hemanth.problemsolving.strings;

public class RansomNoteleetcode383 {


    public static void main(String[] args) {


        String ransomNote = "ccb";
        String magazine = "bcc";

        System.out.println(canConstruct(ransomNote, magazine));


    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] charCount = new char[26];


        for (char c : magazine.toCharArray()) {
            charCount[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (charCount[c - 'a'] > 0) {
                charCount[c - 'a']--;
            } else {
                return false;
            }
        }

        return true;
    }
}
