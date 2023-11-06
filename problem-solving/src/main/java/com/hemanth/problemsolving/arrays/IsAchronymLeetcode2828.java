package com.hemanth.problemsolving.arrays;

import java.util.ArrayList;
import java.util.List;

public class IsAchronymLeetcode2828 {

    public static void main(String[] args) {

       // String[] words = {"alice","bob","charlie"};
        List<String> words = new ArrayList<>();
        words.add("alice");
        words.add("bob");
        words.add("charlie");
        String s = "abc";

        System.out.println(isAcronym(words,s));
    }

    public static boolean isAcronym(List<String> words, String s){
        StringBuilder output = new StringBuilder();

        for (int i = 0; i< words.size(); i++){
            output.append(words.get(i).charAt(0));
        }

        if (output.toString().equals(s)){
            return true;
        }

        return false;
    }
}
