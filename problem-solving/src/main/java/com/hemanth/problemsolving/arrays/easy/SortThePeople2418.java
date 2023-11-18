package com.hemanth.problemsolving.arrays.easy;

import org.apache.logging.log4j.util.PropertySource;

import java.util.*;

public class SortThePeople2418 {

    public static void main(String[] args) {


        int[] heights = {180, 165, 170};
        String[] names = {"Mary", "John", "Emma"};

        System.out.println(Arrays.toString(sortPeople(names, heights)));

    }

    public static String[] sortPeople(String[] names, int[] heights) {


        Map<Integer,Integer> peopleHeight = new HashMap<>();

        for (int i = 0; i<heights.length; i++){
            peopleHeight.put(heights[i],i);
        }

        Arrays.sort(heights);
        reverseArray(heights);

        System.out.println(Arrays.toString(heights));


        int n = names.length;

        String[] sortedNames = new String[n];
        for (int i = 0; i < n; i++) {

            sortedNames[i] = names[peopleHeight.get(heights[i])];


        }

        return sortedNames;
    }

    private static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
