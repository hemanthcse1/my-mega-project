package com.hemanth.problemsolving.strings.easy;

public class CheckIsPangram1832 {

    public static void main(String[] args) {


       // String sentence = "thequickbrownfoxjumpsoverthelazydog";
        String sentence = "leetcode";

        System.out.println(checkIfPangram(sentence));

    }

    public static boolean checkIfPangram(String sentence) {

        boolean[] alphabet = new boolean[26];


        for (char ch : sentence.toCharArray()) {
            if ('a' <= ch && ch <= 'z') {
                alphabet[ch - 'a'] = true;
            }
        }

        for (boolean present: alphabet){
            if (!present){
                return false;
            }
        }

        return true;
    }
}
