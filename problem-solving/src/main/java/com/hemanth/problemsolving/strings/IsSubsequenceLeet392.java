package com.hemanth.problemsolving.strings;

public class IsSubsequenceLeet392 {


    public static void main(String[] args) {

       /* String s = "ace";
        String t = "abcde";*/


        String s = "axc";
        String t = "ahbgdc";

        System.out.println("Is Subsequence -> " + isSubsequence(s, t));

    }

    public static boolean isSubsequence(String s, String t) {

        int iOfs = 0;
        int iOft = 0;

        while (iOfs < s.length() && iOft < t.length()) {
            if (s.charAt(iOfs) == t.charAt(iOft)) {
                iOfs++;
            }
            iOft++;
        }

        return iOfs == s.length();
    }
}
