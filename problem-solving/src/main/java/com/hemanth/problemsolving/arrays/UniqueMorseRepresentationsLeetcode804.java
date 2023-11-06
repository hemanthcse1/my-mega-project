package com.hemanth.problemsolving.arrays;

import java.util.HashMap;
import java.util.Map;

public class UniqueMorseRepresentationsLeetcode804 {

    public static void main(String[] args) {


        String[] words = {"gin", "zen", "gig", "msg"};

        System.out.println(uniqueMorseRepresentations(words));


    }

    public static int uniqueMorseRepresentations(String[] words) {
        Map<Character,String> morseCodeMap = createMorseCodeMap();

        Map<String,Integer> uniqueCount = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toUpperCase().toCharArray();
            StringBuilder morseCode = new StringBuilder();
            for (char c : word) {
                if (morseCodeMap.containsKey(c)){
                    morseCode.append(morseCodeMap.get(c));
                }
            }

            if (!uniqueCount.containsKey(morseCode.toString())){
                uniqueCount.put(morseCode.toString(),1);
            }
        }

        return uniqueCount.size();
    }

    private static HashMap<Character, String> createMorseCodeMap() {
        HashMap<Character, String> morseCodeMap = new HashMap<>();
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");
        return morseCodeMap;
    }
}
