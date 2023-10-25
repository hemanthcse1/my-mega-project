package com.hemanth.problemsolving.strings;

import java.util.HashMap;
import java.util.Map;

public class WordPatterLeetcode290 {


    public static void main(String[] args) {

        String pattern = "abba";
        String words = "hemanth kumar kumar hemanth";

        System.out.println(isPatternMatching(pattern, words));

    }

    public static boolean isPatternMatching(String pattern, String s) {


        String[] words = s.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }


        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();


        for (int i = 0; i < pattern.length(); i++) {


            if (charToWord.containsKey(pattern.charAt(i))) {
                if (!charToWord.get(pattern.charAt(i)).equals(words[i])) {
                    return false;
                }
            } else {
                charToWord.put(pattern.charAt(i), words[i]);
            }

            if (wordToChar.containsKey(words[i])) {
                if (wordToChar.get(words[i]) != pattern.charAt(i)) {
                    return false;
                }
            } else {
                wordToChar.put(words[i], pattern.charAt(i));
            }
        }

        return true;
    }
}
