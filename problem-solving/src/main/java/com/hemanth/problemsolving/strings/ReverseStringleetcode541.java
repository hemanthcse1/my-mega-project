package com.hemanth.problemsolving.strings;

public class ReverseStringleetcode541 {


    public static void main(String[] args) {

        String s = "abcdefg";
        int k = 2;


        System.out.println(reverseString(s, k));

    }


    public static String reverseString(String s, int k) {
        char[] chars = s.toCharArray();
        int strSize = s.length();


        for (int start = 0; start < strSize; start += 2 * k) {
            int left = start;
            int right = Math.min(start + k - 1, strSize - 1);

            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        return new String(chars);
    }
}
