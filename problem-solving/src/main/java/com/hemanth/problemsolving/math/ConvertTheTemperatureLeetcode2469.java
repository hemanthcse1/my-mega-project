package com.hemanth.problemsolving.math;

import java.util.Arrays;

public class ConvertTheTemperatureLeetcode2469 {

    public static void main(String[] args) {

        double celsius = 122.11;

        System.out.println(Arrays.toString(convertTemperature(celsius)));

    }

    public static double[] convertTemperature(double celsius) {
        double[] temp = new double[2];


        temp[0] = celsius + 273.15;
        temp[1] = celsius * 1.80 + 32.00;

        return temp;

    }
}
