package com.hemanth.problemsolving.math;

public class IsPowerOfFourLeetcode342 {


    public static void main(String[] args) {

        int n = 5;

        System.out.println(isPowerOfFour(n));

    }


    public static boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }

        double logValue = Math.log(n) / Math.log(4);
        return logValue % 1 == 0;
    }
}
