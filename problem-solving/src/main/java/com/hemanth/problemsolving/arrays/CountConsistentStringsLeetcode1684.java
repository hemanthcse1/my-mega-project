package com.hemanth.problemsolving.arrays;

public class CountConsistentStringsLeetcode1684 {

    public static void main(String[] args) {


        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};

        String allowed = "cad";

        System.out.println(countConsistentStrings(allowed, words));

    }

    public static int countConsistentStrings(String allowed, String[] words) {

        if (words.length < 1) {
            return 0;
        }

        int ans = 0;
        for (int i = 0; i < words.length; i++) {
            int j = 0;
            char[] wordMatch = words[i].toCharArray();

            int letterCount = 0;
            while (j < wordMatch.length) {

                if (allowed.contains(String.valueOf(wordMatch[j]))) {
                    letterCount++;
                } else {
                    break;
                }

                if (letterCount== wordMatch.length){
                    ans++;
                }
                j++;
            }

        }


        return ans;
    }
}
