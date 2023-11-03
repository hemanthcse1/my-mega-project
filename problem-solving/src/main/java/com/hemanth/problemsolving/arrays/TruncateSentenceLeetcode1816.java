package com.hemanth.problemsolving.arrays;

public class TruncateSentenceLeetcode1816 {

    public static void main(String[] args) {

       // String s = "Hello how are you Contestant";
        String s = "What is the solution to this problem";
        int k = 4;


        System.out.println(truncateSentence(s, k));
    }

    public static String truncateSentence(String s, int k) {
        StringBuilder output = new StringBuilder();
        String[] words = s.split(" ");

        for (int i = 0; i < k; i++) {
            output.append(words[i]).append(" ");
        }


        return output.toString().trim();
    }


}
