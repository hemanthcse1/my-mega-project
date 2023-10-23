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

       // Collections.sort(fruits, Comparator.comparingInt(String::length));
       // System.out.println(fruits);


        System.out.println("\n\n--------------------------------------\n");
        /*2. Sort the list of integers in descending order and print the result*/

        List<Integer> nums = Arrays.asList(3, 2, 9, 34, 21, 12);
        nums.sort(Comparator.reverseOrder());

        System.out.println("Numbs in reverse order -> " + nums);

        System.out.println("\n\n--------------------------------------\n");
        /*3. Sor the list of employees based on their age in ascending order and print the result*/

        List<CompEmployee> employees = Arrays.asList(
                new CompEmployee(1,"Hemanth",31,30000),
                new CompEmployee(2,"Rahul",34,40000),
                new CompEmployee(3,"Sharad",35,230000),
                new CompEmployee(4,"Ashwin",30,40000),
                new CompEmployee(5,"Kanika",26,80000),
                new CompEmployee(5,"Sharma",26,70000)
        );

       // employees.sort(Comparator.comparingInt(CompEmployee::getAge));
       // System.out.println(employees);


        System.out.println("\n\n--------------------------------------\n");
        /*4. Sort the list of employees based on their age in ascending order. IF the ages are the same, compare by salary, print the result*/

        employees.sort(Comparator.comparingInt(CompEmployee::getAge).thenComparing(CompEmployee::getSalary));
        System.out.println(employees);



        System.out.println("\n\n--------------------------------------\n");
        /*5. Sort the list of Strings based on the index of the first occurrence of "e" in each string and print the result.*/

        fruits.sort(Comparator.comparingInt(s->s.indexOf("e")));
        System.out.println(fruits);



        System.out.println("\n\n--------------------------------------\n");
        /*6. Sort a list of strings ignoring case sensitivity using a case-insensitive comparator. */

        List<String> fruitsMix = Arrays.asList("APPLE", "cherry", "banana", "pineapple", "KiWI", "orange", "graphs");

        Comparator<String> caseInsensitiveOrder = String.CASE_INSENSITIVE_ORDER;
        fruitsMix.sort(caseInsensitiveOrder);

      /*  Collections.sort(fruitsMix);*/

        System.out.println(fruitsMix);
    }
}
