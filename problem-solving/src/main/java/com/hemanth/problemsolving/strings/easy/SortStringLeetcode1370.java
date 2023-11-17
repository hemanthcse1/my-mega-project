package com.hemanth.problemsolving.strings.easy;

import java.util.Arrays;

public class SortStringLeetcode1370 {

    public static void main(String[] args) {

        String s = "rat";


        System.out.println(sortString(s));

    }

    public static String sortString(String s){
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        int n = chars.length;
        int left = 0, right = n - 1;
        char[] result = new char[n];
        int index = 0;

        while (left <= right) {
            result[index++] = chars[left++];
            if (left <= right) {
                result[index++] = chars[right--];
            }
        }

        return new String(result);
    }
}
