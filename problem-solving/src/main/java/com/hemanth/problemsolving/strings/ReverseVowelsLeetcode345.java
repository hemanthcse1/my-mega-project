package com.hemanth.problemsolving.strings;

public class ReverseVowelsLeetcode345 {


    public static void main(String[] args) {

        //String s = "leetcode";
        String s = "hello";


        System.out.println("original -> " + s);
        System.out.println("reversed -> " + reverseVowels(s));
    }

    public static String reverseVowels(String s) {

        char[] chars = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            while (i < j && !isVowel(chars[i])) {
                i++;
            }

            while (i < j && !isVowel(chars[j])) {
                j--;
            }

            if (i < j) {
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }


        }

        return String.valueOf(chars);
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


}
