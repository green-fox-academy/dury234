package com.greenfoxorganisation;

public class Sponsor extends Person implements Cloneable {
    String company;
    int hiredStudents;

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        hiredStudents++;
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }

    public Sponsor(String name, int age, Gender gender, String company) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        hiredStudents = 0;
    }

    public Sponsor() {
        name = "Jane Doe";
        age = 30;
        gender = Gender.FEMALE;
        company = "Google";
        hiredStudents = 0;
    }

    @Override
    public Sponsor clone() {
        return new Sponsor(name, age, gender, company);
    }
}
