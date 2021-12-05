package com.company;

import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");

        int number1 = scanner.nextInt();

        System.out.println("Enter second number:");

        int number2 = scanner.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " is bigger");
        } else if (number1 == number2) {
            System.out.println("Numbers are same");
        } else {
            System.out.println(number2 + " is bigger");
        }
    }
}
