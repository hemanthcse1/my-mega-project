package com.hemanth.problemsolving.arrays;

public class FindValueAfterOperationLeetcode2011 {

    public static void main(String[] args) {

       // String[] operations = {"--X","X++","X++"};
      //  String[] operations = {"++X","++X","X++"};
        String[] operations = {"X++","++X","--X","X--"};

        System.out.println(finalValueAfterOperations(operations));

    }


    public static int finalValueAfterOperations(String[] operations) {

        int x = 0;
        for (String operation : operations
        ) {

            if (operation.equals("++X")) {
                ++x;
            } else if (operation.equals("X++")) {
                x++;
            } else if (operation.equals("--X")) {
                --x;
            } else if (operation.equals("X--")) {
                x--;
            }

        }


        return x;
    }
}
