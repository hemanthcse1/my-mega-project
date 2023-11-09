package com.hemanth.problemsolving.strings.easy;

public class DefangingIPAddress1108 {

    public static void main(String[] args) {


        String address = "1.1.1.1";

        System.out.println(defangingIPAddress(address));

    }

    public static String defangingIPAddress(String address){
        return address.replace(".","[.]");
    }
}
