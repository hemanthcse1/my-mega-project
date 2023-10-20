package com.hemanth.designpatternsjava.builderdesign.example2;

public class WordRobeMain {

    public static void main(String[] args) {



        WordRobe wordRobe1 = new WordRobeBuilder()
                .doors(2)
                .isMirrors(false)
                .isWheels(true)
                .isHangingRod(true)
                .compartment(2)
                .build();

        System.out.println(wordRobe1);

        WordRobe wordRobe2 = new WordRobeBuilder()
                .doors(1)
                .isMirrors(false)
                .compartment(1)
                .build();

        System.out.println(wordRobe2);

    }
}
