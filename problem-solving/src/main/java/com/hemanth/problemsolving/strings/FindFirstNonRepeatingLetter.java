package com.hemanth.problemsolving.strings;

import java.util.HashMap;
import java.util.Map;

public class FindFirstNonRepeatingLetter {

    public static void main(String[] args) {


        String str = "abcdcaf";

        int firstNonRepeatingCharacter = findFirstNonRepeatingCharacter(str);

        System.out.println("index -> " + firstNonRepeatingCharacter);

    }

    public static int findFirstNonRepeatingCharacter(String str) {
        char[] charStr = str.toCharArray();

        Map<Character, Integer> charFrequency = new HashMap<>();

        for (int i = 0; i < charStr.length; i++) {

            if (charFrequency.containsKey(charStr[i])) {

                Integer count = charFrequency.get(charStr[i]);
                count++;
                charFrequency.put(charStr[i], count);

            } else {
                charFrequency.put(charStr[i], 0);
            }
        }

        char firstRepeatingChar = 0;
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            if (entry.getValue() == 0) {
                firstRepeatingChar = entry.getKey();
                break;
            }
        }

        for (int i = 0; i < charStr.length; i++) {
            if (charStr[i] == firstRepeatingChar) {
                return i;
            }
        }
        return -1;
    }
}
