package com.hemanth.interviewpractice.comparatorexample;

import com.hemanth.interviewpractice.StudentOne;

import java.util.Comparator;

public class SortByRollNumber implements Comparator<StudentOne> {

    @Override
    public int compare(StudentOne o1, StudentOne o2) {
        return o1.getRollNumber() - o2.getRollNumber();
    }
}
