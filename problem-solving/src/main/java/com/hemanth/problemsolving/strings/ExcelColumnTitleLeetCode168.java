package com.hemanth.problemsolving.strings;

public class ExcelColumnTitleLeetCode168 {

    public static void main(String[] args) {

        int columnNumber = 28;
        String columnTitle = convertToTitle(columnNumber);
        System.out.println("Excel column title for " + columnNumber + " is: " + columnTitle);
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26;
            char charValue = (char) ('A' + remainder);
            result.insert(0, charValue);
            columnNumber = (columnNumber - 1) / 26;
        }

        return result.toString();
    }
}
