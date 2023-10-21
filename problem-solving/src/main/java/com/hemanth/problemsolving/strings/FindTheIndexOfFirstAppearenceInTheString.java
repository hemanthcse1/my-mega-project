package com.hemanth.problemsolving.strings;

public class FindTheIndexOfFirstAppearenceInTheString {

    public static void main(String[] args) {


        String haystack = "sadbutsad";
        String needle = "db";

        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        int index = haystack.indexOf(needle);

        if (index != -1) {
            return index;
        } else {
            return -1;
        }
    }
}
