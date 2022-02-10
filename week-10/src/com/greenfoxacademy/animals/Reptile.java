package com.greenfoxacademy.animals;

public class Reptile extends Animal {
    public Reptile(String name) {
        this.name = name;
        breedBy = "laying eggs";
        gender = Gender.MALE;
        age = 10;
        numberOfLegs = 4;
        speed = 4;
    }

    public Reptile(String name, Gender gender, int age, int numberOfLegs) {
        this.name = name;
        breedBy = "laying eggs";
        this.gender = gender;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        speed = 4;
    }
}
