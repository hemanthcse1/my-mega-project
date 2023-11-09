package com.hemanth.problemsolving.strings.easy;

public class SortTheSentence1859 {

    public static void main(String[] args) {

      //  String s = "is2 sentence4 This1 a3";
        String s = "Myself2 Me1 I4 and3";

        System.out.println(sortSentence(s));

    }

    public static String sortSentence(String s) {
        StringBuilder output = new StringBuilder();

        String[] original = s.split(" ");

        String[] sorted = new String[original.length];

        for (int i = 0; i < original.length; i++) {


            String word = original[i];
            char indexString = word.charAt(word.length() - 1);
            int index = Integer.parseInt(String.valueOf(indexString))-1;
            sorted[index] = word.substring(0, word.length() - 1);

        }

        for (int i = 0; i< sorted.length; i++){
            output.append(sorted[i]).append(" ");
        }

        return output.toString().trim();
    }
}
