package com.hemanth.problemsolving.math.easy;

public class ProductSumLeetcode1281 {

    public static void main(String[] args) {
        int n = 234;


        System.out.println(subtractProductAndSum(n));
    }

    public static int subtractProductAndSum(int n) {

        char[] chars = String.valueOf(n).toCharArray();

        int i2 = Integer.parseInt(String.valueOf(chars[chars.length - 1]));
        int sum = i2;
        int product = i2;
        for (int i = chars.length - 2; i >= 0; i--) {
            int i1 = Integer.parseInt(String.valueOf(chars[i]));

            sum = sum + i1;

            product = product * i1;
        }


        return product - sum;
    }
}
