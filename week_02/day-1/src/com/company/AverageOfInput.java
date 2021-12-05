package com.company;

import java.util.Scanner;

public class AverageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number1 = scanner.nextInt();

        System.out.println("Enter a number:");
        int number2 = scanner.nextInt();

        System.out.println("Enter a number:");
        int number3 = scanner.nextInt();

        System.out.println("Enter a number:");
        int number4 = scanner.nextInt();

        System.out.println("Enter a number:");
        int number5 = scanner.nextInt();

        int sum = number1 + number2 + number3 + number4 + number5;

        float average = (float) sum / 5;

        System.out.println("Sum: " + sum + ". Average is: " + average);

    }
}
