package com.company;

import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // triangle like this:
        //
        // *
        // **
        // ***
        // ****
        //
        // The triangle should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of lines:");

        int numberOfLines = scanner.nextInt();

        for (int i = 1; i <= numberOfLines ; i++) {
            System.out.println();
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }

        }

    }
}
