package com.hemanth.problemsolving.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TriangleLeetcode120 {

    public static void main(String[] args) {

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(List.of(2));
        triangle.add(List.of(3, 4));
        triangle.add(List.of(6, 5, 7));
        triangle.add(List.of(4, 1, 8, 3));

        System.out.println(minTotal(triangle));

    }

    public static int minTotal(List<List<Integer>> triangle) {

        int height = triangle.size();
        int[][] dp = new int[height + 1][height + 1];

        for (int level = height - 1; level >= 0; level--) {

            for (int i = 0; i <= level; i++) {

                dp[level][i] = triangle.get(level).get(i) +
                        Math.min(dp[level + 1][i], dp[level + 1][i + 1]);
            }
        }

        return dp[0][0];
    }
}
