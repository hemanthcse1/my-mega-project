package com.hemanth.problemsolving.strings;

public class LongestUnCommonSubsequenceLeetcode522 {

    public static void main(String[] args) {


        String[] strs = {"abc", "def", "ghij"};

        System.out.println(LUCS(strs));

    }

    public static int LUCS(String[] strs) {
        int maxUncommonLength = -1;

        for (int i = 0; i < strs.length; i++) {
            boolean isUnCommon = true;
            for (int j = 0; j < strs.length; j++) {
                if (i != j && isSubsequence(strs[i], strs[j])) {
                    isUnCommon = false;
                    break;
                }
            }

            if (isUnCommon) {
                maxUncommonLength = Math.max(maxUncommonLength, strs[i].length());
            }
        }

        return maxUncommonLength;

    }


    public static boolean isSubsequence(String a, String b) {
        int i = 0;
        int j = 0;

        while (i < a.length() && j < b.length()) {
            if (a.charAt(i) == b.charAt(j)) {
                i++;
            }
            j++;
        }

        return i == a.length();
    }
}
