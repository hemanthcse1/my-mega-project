package com.hemanth.designpatternsjava.builderdesign.example2;

public class WordRobeBuilder {

    private int doors;
    private boolean isMirrors;
    private boolean isWheels;
    private boolean isHangingRod;
    private int compartments;




    public WordRobeBuilder doors(int value) {
        doors = value;
        return this;
    }

    public WordRobeBuilder isMirrors(boolean value) {
        isMirrors = value;
        return this;
    }

    public WordRobeBuilder isWheels(boolean value) {
        isWheels = value;
        return this;
    }

    public WordRobeBuilder isHangingRod(boolean value) {
        isHangingRod = value;
        return this;
    }

    public WordRobeBuilder compartment(int value) {
        compartments = value;
        return this;
    }

    public WordRobe build() {
        return new WordRobe(doors, isMirrors, isWheels, isHangingRod, compartments);
    }
}
