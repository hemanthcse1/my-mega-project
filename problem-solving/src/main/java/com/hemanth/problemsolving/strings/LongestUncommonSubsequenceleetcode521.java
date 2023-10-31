package com.hemanth.problemsolving.strings;

public class LongestUncommonSubsequenceleetcode521 {

    public static void main(String[] args) {


        String a = "abc";
        String b = "cde";

        System.out.println(longestUncommonSubsequence(a, b));

    }


    public static int longestUncommonSubsequence(String a, String b) {
        if (a.equals(b)) {
            return -1;
        } else {
            return Math.max(a.length(), b.length());
        }
    }
}
