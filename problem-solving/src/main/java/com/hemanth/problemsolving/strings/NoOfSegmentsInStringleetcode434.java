package com.hemanth.problemsolving.strings;

public class NoOfSegmentsInStringleetcode434 {

    public static void main(String[] args) {

        String s = "Hello, my name is John";

        System.out.println(countSegments(s));
    }


    public static int countSegments(String s) {


        String[] segments = s.split("\\s+");
        int segmentCount = 0;
        for (String segment : segments) {
            if (!segment.isEmpty()) {
                segmentCount++;
            }
        }
        return segmentCount;
    }
}
