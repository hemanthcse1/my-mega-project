package com.hemanth.interviewpractice.associativeinstream;

import java.util.List;
import java.util.Optional;

public class AssociativeExample {

    public static void main(String[] args) {


      //  additionAssociative();

      //  productAssociative();

        findMax();

    }



    public static void additionAssociative(){

        List<Integer> numbers = List.of(1,2,3,4,5);

        Integer sumAssociative = numbers.stream()
                .reduce(0, (a, b) -> (a + b));


        System.out.println("Sum associative -> "+sumAssociative);
    }

    public static void productAssociative(){
        List<Integer> numbers = List.of(1,2,3,4,5);

        Integer productAssociative = numbers.stream()
                .reduce(1, (a, b) -> (a * b));

        System.out.println("Product associative -> "+productAssociative);
    }

    public static void findMax(){
        List<Integer> numbers = List.of(10,34,12,90,2);

        Optional<Integer> findMax = numbers.stream()
                .reduce(Integer::max);

        findMax.ifPresent(value -> System.out.println("Max value -> "+value));


    }


}
