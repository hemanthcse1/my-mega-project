package com.hemanth.problemsolving.strings;

public class FindTheLongestLastWord {


    public static void main(String[] args) {


        //String s = "    fly me     to    the moon     ";
        // String s = "Hello world";
         String s = "luffy is still joyboy";

        int length = lengthOfLastWord(s);

        System.out.println("Word length -> " + length);
    }

    public static int lengthOfLastWord(String s) {

        //String s1 = s.trim();
        String[] words = s.trim().replaceAll("\\s+", " ").split(" ");
        return words[words.length - 1].length();
    }
}
