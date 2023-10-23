package com.hemanth.problemsolving.java8.comparator;

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {


    public static void main(String[] args) {


        /*1. Sort the strings based on their length in ascending order*/
        List<String> fruits = Arrays.asList("apple", "cherry", "banana", "pineapple", "kiwi", "orange", "graphs");

        // inplace sorting
       /* fruits.sort(Comparator.comparingInt(String::length));
        System.out.println(fruits);*/

        Collections.sort(fruits, Comparator.comparingInt(String::length));
        System.out.println(fruits);


        System.out.println("\n\n--------------------------------------\n");
        /*2. Sort the list of integers in descending order and print the result*/

        List<Integer> nums = Arrays.asList(3, 2, 9, 34, 21, 12);
        nums.sort(Comparator.reverseOrder());

        System.out.println("Numbs in reverse order -> " + nums);


    }
}
