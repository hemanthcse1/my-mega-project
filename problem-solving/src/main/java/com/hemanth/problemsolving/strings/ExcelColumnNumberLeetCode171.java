package com.hemanth.problemsolving.strings;

public class ExcelColumnNumberLeetCode171 {

    public static void main(String[] args) {

        String columnTitle = "AA";

        System.out.println('C'-'B');

        System.out.println(titleToNumber(columnTitle));
    }

    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            result = result * 26 + (c - 'A' + 1);
        }

        return result;
    }
}
