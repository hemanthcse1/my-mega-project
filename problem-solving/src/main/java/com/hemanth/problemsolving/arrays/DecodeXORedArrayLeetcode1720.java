package com.hemanth.problemsolving.arrays;

import java.util.Arrays;

public class DecodeXORedArrayLeetcode1720 {

    public static void main(String[] args) {

     /*   int[] encoded = {1, 2, 3};
        int first = 1;*/

        int[] encoded = {6, 2, 7, 3};
        int first = 4;

        System.out.println(Arrays.toString(decode(encoded, first)));
    }


    public static int[] decode(int[] encoded, int first) {
        int[] output = new int[encoded.length + 1];
        output[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            output[i + 1] = output[i] ^ encoded[i];
        }

        return output;

    }
}
