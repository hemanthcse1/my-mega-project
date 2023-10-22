package com.hemanth.problemsolving.java8.stream;

import java.util.*;
import java.util.stream.Collectors;

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


        System.out.println("----------------------------------------------\n\n");
        /*Give a list fo strings, write a program to count the number of strings that start with a specific character using streams. */

        List<String> fruits = Arrays.asList("cherry", "banana", "apple", "orange", "coconut", "berry");

        long fruitsCount = fruits.stream()
                .filter(s -> s.startsWith("c"))
                .count();

        System.out.println("fruits count -> " + fruitsCount);


        System.out.println("----------------------------------------------\n\n");
        /*Convert a list of strings to uppercase using streams*/


        fruits.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        System.out.println("----------------------------------------------\n\n");
        /*5. Given a list of integers, write a program to filter out the even numbers using streams.
         Count the number of elements in a list that satisfy a specific condition using streams*/

        List<Integer> numbers = Arrays.asList(1, 2, 4, 5, 6, 7, 8, 9);

        long filteredCount = numbers.stream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("filtered count -> " + filteredCount);


        System.out.println("----------------------------------------------\n\n");
        /*6. Write a program to find the average of a list of floating-point numbers using streams*/

        List<Double> floatNumbers = Arrays.asList(1.1, 1.2, 1.3, 1.4, 1.5);

        double average = floatNumbers.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .getAsDouble();

        System.out.println("average -> " + average);


        System.out.println("----------------------------------------------\n\n");
        /*7. Given a list of strings, write a program to concatenate all the strings using streams*/
        String concatFruits = fruits.stream()
                .collect(Collectors.joining(", "));

        System.out.println("concat fruits -> " + concatFruits);


        System.out.println("----------------------------------------------\n\n");
        /*8. Write a program to remove duplicate elements from a list using streams.*/

        List<Integer> dupNumbers = Arrays.asList(1, 2, 2, 4, 5, 5, 6, 7, 7, 8, 9, 9);

        dupNumbers.stream()
                .distinct()
                .forEach(System.out::println);


        System.out.println("----------------------------------------------\n\n");
        /*9. Give a list of Objects, write a program to sort the objects based on a specific attribute using streams. */
        List<Personn> people = Arrays.asList(
                new Personn("Hemanth", 31),
                new Personn("Sharad", 35),
                new Personn("Rahul", 34),
                new Personn("Bob", 43),
                new Personn("Charlie", 32)
        );

        Collections.sort(people, Comparator.comparing(Personn::getAge));

        System.out.println(people);

        people.stream()
                .sorted(Comparator.comparing(Personn::getAge))
                .forEach(System.out::println);


        System.out.println("----------------------------------------------\n\n");
        /*10. Write a program to check if all the elements in a list satisfy a given condition using streams.*/


        List<Integer> numbers2 = Arrays.asList(2, 4, 6, 8, 10,11);
        boolean isEven = numbers2.stream()
                .anyMatch(n -> (n % 2) == 0);

        System.out.println("is Even -> " + isEven);


    }
}
