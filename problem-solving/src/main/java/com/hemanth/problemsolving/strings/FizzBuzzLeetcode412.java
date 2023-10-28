package com.hemanth.problemsolving.strings;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzLeetcode412 {

    public static void main(String[] args) {

        System.out.println(fizzBuss(15));
    }

    public static List<String> fizzBuss(int n) {
        List<String> result = new ArrayList<>();


        for (int i = 0; i < n; i++) {

            int byProduct = i + 1;
            if (byProduct % 3 == 0 && byProduct % 5 == 0) {
                result.add("FizzBuzz");
            } else if (byProduct % 3 == 0 || byProduct % 5 == 0) {

                if (byProduct % 3 == 0) {
                    result.add("Fizz");
                } else {
                    result.add("Buzz");
                }

            }  else {
                result.add(String.valueOf(byProduct));
            }
        }

        return result;
    }
}
