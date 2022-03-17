package com.greenfoxacademy.ex10;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fox {
    String name;
    String color;
    int age;

    public Fox(String name, String color, int age) {
        this.age = age;
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Fox{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public static List<Fox> greenFoxes(List<Fox> foxes) {
        return foxes.stream()
                .filter(fox -> fox.color == "GREEN")
                .collect(Collectors.toList());
    }

    public static List<Fox> youngFoxes(List<Fox> foxes) {
        return foxes.stream()
                .filter(fox -> fox.age < 5)
                .collect(Collectors.toList());
    }

    public static Map<String, Integer> colorsFreq(List<Fox> foxes) {
        return foxes.stream()
                .collect(Collectors.toMap(Fox::getColor, fox -> 1, (a, b) -> a + b));
    }



    public static void main(String[] args) {
        Fox fox1 = new Fox("One", "GREEN", 5);
        Fox fox2 = new Fox("Two", "GREEN", 4);
        Fox fox3 = new Fox("Three", "YELLOW", 5);
        Fox fox4 = new Fox("Four", "BLACK", 2);
        Fox fox5 = new Fox("Five", "WHITE", 5);
        Fox fox6 = new Fox("Six", "GREEN", 5);
        Fox fox7 = new Fox("Seven", "WHITE", 1);
        Fox fox8 = new Fox("Eight", "RED", 8);
        Fox fox9 = new Fox("Nine", "RED", 10);

        List<Fox> foxes = Arrays.asList(fox1, fox2, fox3, fox4, fox5, fox6, fox7, fox8, fox9);

        List<Fox> greenF = greenFoxes(foxes);

        greenF.stream()
                .forEach(System.out::println);

        List<Fox> youngF = youngFoxes(foxes);

        youngF.stream()
                .forEach(System.out::println);

        System.out.println(colorsFreq(foxes));
    }
}
