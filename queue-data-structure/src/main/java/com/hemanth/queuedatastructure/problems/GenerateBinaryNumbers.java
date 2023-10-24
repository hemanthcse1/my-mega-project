package com.hemanth.queuedatastructure.problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class GenerateBinaryNumbers {

    public static void main(String[] args) {

        int n = 7;

        System.out.println("Binary numbers " + Arrays.asList(generateBinaryNumbers(5)));
    }


    public static String[] generateBinaryNumbers(int n) {
        String[] result = new String[n];
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        for (int i = 0; i < n; i++) {
           /* result[i] = queue.poll();
            String n1 = result[i] + "0";
            String n2 = result[i] + "1";
            queue.offer(n1);
            queue.offer(n2);*/

            result[i] = queue.poll();
            queue.offer(result[i] + "0");
            queue.offer(result[i] + "1");
        }

        return result;
    }
}
