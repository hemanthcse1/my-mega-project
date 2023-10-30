package com.hemanth.problemsolving.strings;

public class DetectCapitalLeetcode520 {

    public static void main(String[] args) {

       // String s = "USA";
       // String s = "India";
        String s = "FlaG";

        System.out.println(detectCapitalUse(s));

    }


    public static boolean detectCapitalUse(String word) {
        if (word == null || word.isEmpty()) {
            return false;
        }

        boolean firstCharCapitalized = Character.isUpperCase(word.charAt(0));
        boolean allOtherCharsCapitalized = true;

        for (int i = 1; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i)) != firstCharCapitalized) {
                allOtherCharsCapitalized = false;
                break;
            }
        }


        if (firstCharCapitalized && allOtherCharsCapitalized) {
            return true;
        } else if (!firstCharCapitalized && allOtherCharsCapitalized) {
            return true;
        } else if (!firstCharCapitalized && !allOtherCharsCapitalized) {
            return true;
        }

        return false;
    }
}
