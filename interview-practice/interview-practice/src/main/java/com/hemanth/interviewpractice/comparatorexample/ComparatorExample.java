package com.hemanth.interviewpractice.comparatorexample;

import com.hemanth.interviewpractice.StudentOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {


    public static void main(String[] args) {


        List<StudentOne> students = new ArrayList<>();
        students.add(new StudentOne(112,"Hemanth",31));
        students.add(new StudentOne(101,"Kumar",25));
        students.add(new StudentOne(98,"Sam",28));


        students.forEach(System.out::println);

        System.out.println("\n\n\n----------------\n\n\n");


        Collections.sort(students,new SortByRollNumber());
        students.forEach(System.out::println);

        System.out.println("\n\n\n----------------\n\n\n");

        Collections.sort(students,new SortByName());
        students.forEach(System.out::println);

        System.out.println("\n\n\n----------------\n\n\n");

        Collections.sort(students,new SortByAge());
        students.forEach(System.out::println);
    }
}
