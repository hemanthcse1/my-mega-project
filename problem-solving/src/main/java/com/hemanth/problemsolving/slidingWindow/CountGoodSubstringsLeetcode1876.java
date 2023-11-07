package com.hemanth.problemsolving.slidingWindow;

public class CountGoodSubstringsLeetcode1876 {


    public static void main(String[] args) {

        String s = "xyzzaz";

        System.out.println(countGoodSubstrings(s));
    }

    public static int countGoodSubstrings(String s){
        if (s == null || s.length() < 3){
            return 0;
        }

        for (int i = 0; i< s.length()-3; i++){
            String substring = s.substring(i, i+3);

            System.out.println(substring);
        }

        return 0;
    }
}
