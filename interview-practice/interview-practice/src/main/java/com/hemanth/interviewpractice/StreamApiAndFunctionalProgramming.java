package com.hemanth.interviewpractice;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiAndFunctionalProgramming {

    public static void main(String[] args) {

        // immutability of original data
        // Immutability();

        // power of parallel processing with stream API
        // parallelProcessing();


        // exception handling with Stream API
        errorHandlingWithStreamAPI();


    }


    public static void Immutability() {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        List<Integer> squaredNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(Collectors.toList());


        System.out.println("Original numbers -> " + numbers);
        System.out.println("Squared numbers -> " + squaredNumbers);

    }

    public static void parallelProcessing() {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        long sequentialProcessStartTime = System.currentTimeMillis();
        int sequentialNumbers = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        long sequentialProcessEndTime = System.currentTimeMillis();

        System.out.println("Sum of numbers (Sequential) -> " + sequentialNumbers);
        System.out.println("Time (Sequential) -> " + (sequentialProcessEndTime - sequentialProcessStartTime) + " ms");


        System.out.println("\n\n\n-----------------------------------\n\n\n");

        long parallelProcessStartTime = System.currentTimeMillis();
        int parallelNumbersSum = numbers.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();
        long parallelProcessEndTime = System.currentTimeMillis();

        System.out.println("Sum of numbers (Parallel) -> " + parallelNumbersSum);
        System.out.println("Time (Parallel) -> " + (parallelProcessEndTime - parallelProcessStartTime) + " ms");


    }


    public static void errorHandlingWithStreamAPI() {

        List<Integer> numbers = List.of( 4, 16, -9, 36, -3);


        List<Double> squaredNumbers = numbers.stream()
                .map(n -> {
                            try {
                                if (n < 0) {
                                    throw new IllegalArgumentException("Negative number");
                                }
                                return Math.sqrt(n);
                            } catch (IllegalArgumentException e) {
                                System.err.println("Error : " + e.getMessage());
                                return Double.NaN; // NaN refers undefined or non-real number
                            }
                        }
                ).toList();

        squaredNumbers.forEach(System.out::println);
    }
}
