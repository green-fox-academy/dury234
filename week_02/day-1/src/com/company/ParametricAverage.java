package com.company;

import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number
        // It would ask this many times to enter an integer
        // If all the integers are entered it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers you want to enter?");

        int countOfNumbers = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= countOfNumbers ; i++) {
            System.out.println("Enter " + i + ". number:");
            int yourNumber = scanner.nextInt();
            sum += yourNumber;
        }

        float average = (float) sum / countOfNumbers;

        System.out.println("Sum: " + sum + ", Average: " + average);

    }
}
