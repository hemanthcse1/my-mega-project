package com.hemanth.problemsolving.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class ProblemsOnStreams {


    /*
     * 1. Intermediate Operations
     * filter()
     * map()
     * flatMap()
     *
     * 2. Terminal Operations
     * forEach()
     * collect()
     * reduce()
     * */

    public static void main(String[] args) {


        /* 1. Find the sum of all elements in a list using streams*/

        List<Integer> numbs = Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum = numbs.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of all elements -> " + sum);


        System.out.println("----------------------------------------------\n\n");



        /*Given a List of integers, write a program to find the maximum element using streams*/

        Integer maxValue = numbs.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.println("Max element  -> " + maxValue);





    }
}
