package com.thegardenapplication;

public class Tree extends Plant {

    public Tree(String color) {
        setColor(color);
        setAbsorbtionEffectivity(0.4);
        setCurrentWaterAmount(0);
        setWaterNeededPoint(10);
        setType("Tree");
    }

}
