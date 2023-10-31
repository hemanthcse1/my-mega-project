package com.hemanth.problemsolving.strings;

public class ReverseWordsInStringLeetcode557 {


    public static void main(String[] args) {

      //  String s = "Hello World";
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWordsInString(s));
    }


    public static String reverseWordsInString(String s){
        StringBuilder result = new StringBuilder();

        String[] wordsArray = s.split(" ");

        for (int i = 0; i< wordsArray.length; i++){
            result.append(reverseWord(wordsArray[i])).append(" ");
        }

        return new String(result);
    }

    public static String reverseWord(String s){
        char[] word = s.toCharArray();
        int left = 0;
        int right = s.length()-1;

        while (left < right){
            char temp = word[left];
            word[left] = word[right];
            word[right] = temp;
            left++;
            right--;
        }

        return new String(word);
    }
}
