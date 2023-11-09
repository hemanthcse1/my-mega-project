package com.hemanth.problemsolving.arrays.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortThePeople2418 {

    public static void main(String[] args) {


        int[] heights = {180,165,170};
        String[] names = {"Mary","john","Emma"};

        System.out.println(Arrays.toString(sortPeople(names, heights)));

    }

    public static String[] sortPeople(String[] names, int[] heights){

        int n = names.length;
        String[] output = new String[n];

        Arrays.sort(heights);

        for (int i = 0; i < n / 2; i++) {
            int temp = heights[i];
            heights[i] = heights[n - i - 1];
            heights[n - i - 1] = temp;
        }


        for (int i = 0; i< n; i++){
            System.out.println(heights[i]);
        }


        return output;

    }
}
