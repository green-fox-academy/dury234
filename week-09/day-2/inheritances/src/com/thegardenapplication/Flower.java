package com.thegardenapplication;

public class Flower extends Plant {

    public Flower(String color) {
        setColor(color);
        setAbsorbtionEffectivity(0.75);
        setCurrentWaterAmount(0);
        setWaterNeededPoint(5);
        setType("Flower");
    }
}
