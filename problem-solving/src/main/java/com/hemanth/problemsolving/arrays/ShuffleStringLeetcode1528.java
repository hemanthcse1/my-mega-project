package com.hemanth.problemsolving.arrays;

import java.util.Arrays;

public class ShuffleStringLeetcode1528 {

    public static void main(String[] args) {

        String s = "codeleet";
        int[] indecis = {4, 5, 6, 7, 0, 1, 2, 3};

        System.out.println(restoreString(s,indecis));

    }


    public static String restoreString(String s, int[] indecis) {
       char[] output = new char[indecis.length];

        for (int i = 0; i<indecis.length; i++){
            output[indecis[i]] = s.charAt(i);
        }

        return new String(output);
    }
}
