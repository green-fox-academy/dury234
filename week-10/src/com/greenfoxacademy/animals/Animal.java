package com.greenfoxacademy.animals;

public abstract class Animal {
    String name;
    int age;
    Gender gender;
    int numberOfLegs;
    String breedBy;
    double distanceTraveled;
    double speed;

    public void move(){
        distanceTraveled += speed;
    }

    public String getName() {
        return name;
    }

    public String breed() {
        return breedBy;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }
}
