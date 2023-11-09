package com.hemanth.problemsolving.arrays;

public class LongestAltitudeLeetcode1732 {

    public static void main(String[] args) {

        int[] gain = {-4,-3,-2,-1,4,3,2};

        System.out.println(longestAltitude(gain));

    }

    public static int longestAltitude(int[] gain){
        int highest = 0;

        int ref =0;
        for (int i = 0; i<gain.length; i++){

            ref = ref + gain[i];

            if (ref > highest){
                highest = ref;
            }
        }

        return highest;
    }
}
