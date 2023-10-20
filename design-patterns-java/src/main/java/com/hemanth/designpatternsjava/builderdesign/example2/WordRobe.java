package com.hemanth.designpatternsjava.builderdesign.example2;

import lombok.Data;

@Data
public class WordRobe {

    private int doors;
    private boolean isMirrors;
    private boolean isWheels;
    private boolean isHangingRod;
    private int compartments;

    public WordRobe(int doors, boolean isMirrors, boolean isWheels, boolean isHangingRod, int compartments) {
        this.doors = doors;
        this.isMirrors = isMirrors;
        this.isWheels = isWheels;
        this.isHangingRod = isHangingRod;
        this.compartments = compartments;
    }
}
