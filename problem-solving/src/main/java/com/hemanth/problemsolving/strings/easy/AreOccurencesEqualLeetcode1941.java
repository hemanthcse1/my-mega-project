package com.hemanth.problemsolving.strings.easy;

import java.util.HashMap;
import java.util.Map;

public class AreOccurencesEqualLeetcode1941 {

    public static void main(String[] args) {

        String s = "abacc";

        System.out.println(areOccurencesEqual(s));

    }

    public static boolean areOccurencesEqual(String s){

        Map<Character, Integer> charCount = new HashMap<>();
        for (char ch : s.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }

        int firstFrequency = 0;
        for (int frequency : charCount.values()) {
            if (firstFrequency == 0) {
                firstFrequency = frequency;
            } else if (frequency != firstFrequency) {
                return false;
            }
        }

        return true;

    }
}
