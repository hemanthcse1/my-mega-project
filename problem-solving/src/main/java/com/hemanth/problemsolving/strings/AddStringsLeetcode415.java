package com.hemanth.problemsolving.strings;

public class AddStringsLeetcode415 {


    public static void main(String[] args) {

        String num1 = "12";
        String num2 = "12";

        System.out.println(addStrings(num1, num2));
    }


    public static String addStrings(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;


        while (i >= 0 || j >= 0 || carry > 0) {

            int x = ((i >= 0) ? num1.charAt(i) - '0' : 0);
            int y = ((j >= 0) ? num2.charAt(j) - '0' : 0);

            System.out.println("------------");
            System.out.println("x -> " + x);
            System.out.println("y -> " + y);


            int sum = x + y + carry;

            System.out.println("sum -> " + sum);

            carry = sum / 10;

            System.out.println("carry -> " + carry);
            result.append(sum % 10);

            System.out.println("result -> " + result);


            i--;
            j--;

        }

        return result.reverse().toString();
    }
}
