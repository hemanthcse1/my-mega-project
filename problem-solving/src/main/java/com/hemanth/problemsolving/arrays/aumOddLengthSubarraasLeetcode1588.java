package com.hemanth.problemsolving.arrays;

public class aumOddLengthSubarraasLeetcode1588 {

    public static void main(String[] args) {

        int[] arr = {1, 4, 2, 5, 3};
        System.out.println(sumOddLengthSubarrays(arr));

    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if ((j - i + 1) % 2 == 1) { // Check if the subarray length is odd
                    for (int k = i; k <= j; k++) {
                        sum += arr[k];
                    }
                }
            }
        }

        return sum;
    }
}
