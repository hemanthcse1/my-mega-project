package com.hemanth.problemsolving.dynamicProgramming;

public class FibonacciNumberLeetcode509 {

    public static void main(String[] args) {


        int n = 1;

        System.out.println(fibonacciNumber(n));
    }

    public static int fibonacciNumber(int n) {

        if (n <= 1){
            return n;
        }

        int fNum = 0;
        int sNum = 1;

        int fcNum = 0;

        for (int i = 2; i <= n; i++) {

            fcNum = fNum + sNum;
            fNum = sNum;
            sNum = fcNum;


        }

        return fcNum;
    }
}
