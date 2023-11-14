package com.hemanth.problemsolving.strings.easy;

public class FaultyKeyBoardLeetcode2810 {

    public static void main(String[] args) {

        String s = "poiinter";


        System.out.println(finalString(s));

    }

    public static String finalString(String s){
        StringBuilder output = new StringBuilder();

        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i) == 'i'){
                output.reverse();
            }else {
                output.append(s.charAt(i));
            }
        }
        return output.toString();
    }
}
