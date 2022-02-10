package com.greenfoxacademy.animals;

import com.greenfoxacademy.flyable.Flyable;

public class Bird extends Animal implements Flyable {
    public Bird(String name) {
        this.name = name;
        breedBy = "laying eggs";
        gender = Gender.MALE;
        age = 10;
        numberOfLegs = 2;
        speed = 15;
    }

    public Bird(String name, Gender gender, int age) {
        this.name = name;
        breedBy = "laying eggs";
        this.gender = gender;
        this.age = age;
        numberOfLegs = 2;
        speed = 15;
    }

    @Override
    public void fly() {
        move();
    }

    @Override
    public void land() {
        System.out.println("This bird is landing");
    }

    @Override
    public void takeOff() {
        System.out.println("This bird is taking off");
    }
}
