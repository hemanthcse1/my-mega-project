package com.hemanth.problemsolving.strings;

public class LicenseKeyFormattingLeetcode482 {


    public static void main(String[] args) {


        String s = "5F3Z-2e-9-w";
        int k = 4;

       /* String s = "2-5g-3-J";
        int k = 2;*/

        System.out.println(licenseKeyFormatting(s, k));
    }


    public static String licenseKeyFormatting(String s, int k) {

        String inputKey = s.replace("-", "").toUpperCase();

        int inputKeySize = inputKey.length();
        int firstSegment = inputKeySize % k;

        StringBuilder outputString = new StringBuilder();

        if (firstSegment > 0) {
            outputString.append(inputKey, 0, firstSegment);
            if (inputKeySize > k) {
                outputString.append("-");
            }
        }

        for (int i = firstSegment; i < inputKeySize; i += k) {
            outputString.append(inputKey, i, i + k);
            if (i + k < inputKeySize) {
                outputString.append("-");
            }
        }

        return outputString.toString();
    }
}
