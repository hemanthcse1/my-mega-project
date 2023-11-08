package com.hemanth.problemsolving.arrays;

import java.util.Arrays;

public class PlusOnesLeetcode66 {

    public static void main(String[] args) {

        int[] digits = {9};

        System.out.println(Arrays.toString(plusOnes(digits)));

    }

    public static int[] plusOnes(int[] digits){

        StringBuilder digitsString = new StringBuilder();

        for (int i = 0; i<digits.length; i++){
            digitsString.append(String.valueOf(digits[i]));
        }

        int digitInt = Integer.parseInt(String.valueOf(digitsString));

        digitInt = digitInt+1;

        System.out.println(digitInt);

        String digitFinalString = String.valueOf(digitInt);

        System.out.println(digitFinalString);

        if (digitFinalString.length() > digits.length){
            int[] output = new int[digits.length+1];

            char[] chars = digitFinalString.toCharArray();
            for (int j = 0; j< chars.length; j++){

                String digit = String.valueOf(chars[j]);
                output[j] = Integer.parseInt(digit);
            }

            return output;

        }else if (digitFinalString.length() == digits.length){
            int[] output = new int[digits.length];
            char[] chars = digitFinalString.toCharArray();
            for (int j = 0; j< chars.length; j++){

                String digit = String.valueOf(chars[j]);
                output[j] = Integer.parseInt(digit);
            }


            return output;
        }

        return null;
    }
}
