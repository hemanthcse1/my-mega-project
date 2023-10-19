package com.hemanth.problemsolving.strings;

public class StringRotations {

    public static void main(String[] args) {

        String s = "abcde";
        String goal = "cdeab";
        int noOfShifts = 2;

        System.out.println(rotateString(s, goal, noOfShifts));

    }

    public static boolean rotateString(String s, String goal, int noOfShifts) {

        String rotatedString = s.substring(noOfShifts) + s.substring(0, noOfShifts);

        if (rotatedString.equals(goal)) {
            return true;
        }

        return false;
    }
}
