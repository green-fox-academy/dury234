package com.greenfoxorganisation;

public class Mentor extends Person implements Cloneable {
    Level level;

    @Override
    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " " + level + " mentor.");
    }

    public Mentor(String name, int age, Gender gender, Level level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    public Mentor() {
        name = "Jane Doe";
        age = 30;
        gender = Gender.FEMALE;
        level = Level.INTERMEDIATE;
    }


    @Override
    public Mentor clone() {
        return new Mentor(name, age, gender, level);
    }
}
