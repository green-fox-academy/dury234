package com.company;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number and the user has to figure it out
        // The user can input guesses
        // After each guess the program would tell one of the following:
        //
        // The stored number is higher
        // The stored number is lower
        // You found the number: 8

        Scanner scanner = new Scanner(System.in);

        int storedNumber = 8;
        int guessN = 0;

        System.out.println("Enter your guess:");

        while (guessN != storedNumber) {
            guessN = scanner.nextInt();
            if (guessN > storedNumber) {
                System.out.println("Stored number is lower");
            } else if (guessN < storedNumber) {
                System.out.println("Stored number is higher");
            } else {
                System.out.println("You found the number: " + storedNumber);
            }
        }

    }
}
