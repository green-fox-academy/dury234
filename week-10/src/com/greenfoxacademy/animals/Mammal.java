package com.greenfoxacademy.animals;

public class Mammal extends Animal {
    public Mammal(String name) {
        this.name = name;
        breedBy = "pushing miniature versions out";
        gender = Gender.MALE;
        age = 10;
        numberOfLegs = 4;
        speed = 5;
    }

    public Mammal(String name, Gender gender, int age, int numberOfLegs) {
        this.name = name;
        breedBy = "pushing miniature versions out";
        this.gender = gender;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        speed = 5;
    }


}
