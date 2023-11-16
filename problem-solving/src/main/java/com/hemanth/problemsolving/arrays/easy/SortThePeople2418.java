package com.hemanth.problemsolving.arrays.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortThePeople2418 {

    public static void main(String[] args) {


        int[] heights = {180, 165, 170};
        String[] names = {"Mary", "John", "Emma"};

        System.out.println(Arrays.toString(sortPeople(names, heights)));

    }

    public static String[] sortPeople(String[] names, int[] heights) {


        int n = names.length;

        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        Arrays.sort(indices,Comparator.comparingInt(i -> heights[i]));

        String[] sortedNames = new String[n];
        for (int i = 0; i < n; i++) {
            sortedNames[i] = names[indices[i]];
        }

        return sortedNames;
    }
}
