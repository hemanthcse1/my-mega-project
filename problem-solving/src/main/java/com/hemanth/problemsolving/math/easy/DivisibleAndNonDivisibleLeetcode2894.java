package com.hemanth.problemsolving.math.easy;

public class DivisibleAndNonDivisibleLeetcode2894 {

    public static void main(String[] args) {

        int n = 5;
        int m = 1;


        System.out.println(differenceOfSums(n, m));
    }

    public static int differenceOfSums(int n, int m) {

        int num1 = 0;
        int num2 = 0;

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }

        return num1 - num2;
    }
}
