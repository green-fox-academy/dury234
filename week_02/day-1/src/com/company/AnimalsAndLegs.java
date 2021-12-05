package com.company;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many chickens do you have?");

        int chickens = scanner.nextInt();

        System.out.println("How many pigs do you have?");

        int pigs = scanner.nextInt();

        int legs = 2* chickens + 4* pigs;

        System.out.println("Your animals have " + legs + " legs.");
    }
}
