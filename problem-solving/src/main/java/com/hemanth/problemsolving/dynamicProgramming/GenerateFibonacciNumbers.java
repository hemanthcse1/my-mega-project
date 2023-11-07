package com.hemanth.problemsolving.dynamicProgramming;

import java.util.Arrays;

public class GenerateFibonacciNumbers {


    public static void main(String[] args) {

        int n = 9;

        System.out.println(Arrays.toString(generateFibonacciNumbers(n)));
    }


    public static int[] generateFibonacciNumbers(int n) {
        int[] fibonacciNumbers = new int[n + 1];

        int fNum = 0;
        int sNum = 1;

        fibonacciNumbers[0] = fNum;
        fibonacciNumbers[1] = sNum;

        for (int i = 2; i <= n; i++) {

            fibonacciNumbers[i] = fNum + sNum;

            fNum = sNum;
            sNum = fibonacciNumbers[i];
        }


        return fibonacciNumbers;

    }
}
