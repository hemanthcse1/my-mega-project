package com.hemanth.problemsolving.arrays.easy;

import java.util.Arrays;
import java.util.Map;

public class MinNumberOfMovesLeetcode2037 {


    public static void main(String[] args) {

        int[] seats = {2, 2, 6, 6};
        int[] students = {1, 3, 2, 6};

        System.out.println(minMovesToSeat(seats, students));
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int minMoves = 0;


        for (int i = 0; i < seats.length; i++) {

            minMoves += Math.abs(seats[i] - students[i]);
        }

        return minMoves;
    }
}
