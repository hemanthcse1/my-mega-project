package com.hemanth.problemsolving.strings.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistanceCityLeetcode1436 {


    public static void main(String[] args) {
        List<List<String>> paths = List.of(
                List.of("London", "New York"),
                List.of("New York", "Lima"),
                List.of("Lima", "Sao Paulo")
        );

        System.out.println(distCity(paths));
    }


    public static String distCity(List<List<String>> paths){
        Set<String> sourceCities = new HashSet<>();

        for (List<String> path : paths) {
            sourceCities.add(path.get(0));
        }

        for (List<String> path : paths) {
            String destinationCity = path.get(1);
            if (!sourceCities.contains(destinationCity)) {
                return destinationCity;
            }
        }

        return null;
    }
}
