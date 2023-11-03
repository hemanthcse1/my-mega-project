package com.hemanth.problemsolving.arrays;

public class ArrayStringsAreEqualLeetcode1662 {

    public static void main(String[] args) {
       /* String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};*/


        String[] word1 = {"abc", "d", "defg"};
        String[] word2 = {"abcddefg"};

        System.out.println(arrayStringsAreEqual(word1,word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder outputOne = new StringBuilder();
        StringBuilder outputTwo = new StringBuilder();
        int i = 0;
        while (i< word1.length){
            outputOne.append(word1[i]);
            i++;
        }
        int j = 0;
        while (j < word2.length){
            outputTwo.append(word2[j]);
            j++;
        }

        if (outputOne.toString().equals(outputTwo.toString())){
            return true;
        }

        return false;
    }
}
