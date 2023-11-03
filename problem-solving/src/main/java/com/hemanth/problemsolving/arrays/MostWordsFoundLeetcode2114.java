package com.hemanth.problemsolving.arrays;

public class MostWordsFoundLeetcode2114 {

    public static void main(String[] args) {

       // String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] sentences = {"please wait", "continue to fight", "continue to win"};


        System.out.println(mostWordsFound(sentences));

    }


    public static int mostWordsFound(String[] sentences){

        int count = 0;
        for (int i = 0; i<sentences.length; i++){
            String[] words = sentences[i].split(" ");
            if (words.length > count){
                count = words.length;
            }
        }

        return count;
    }
}
