package com.company;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of lines (if even, program will add a line to complete a diamond shape):");

        int lineCounts = scanner.nextInt();

        int halfOfLines = lineCounts / 2;

        for (int i = 1; i <= halfOfLines; i++) {

            // draw spaces
            for (int j = halfOfLines - i +1; j > 0; j--) {
                System.out.print(" ");
            }

            // draw "*"
            for (int j = 2; j <= 2 * i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }

        for (int i = 1; i <= lineCounts; i++) {
            System.out.print("*");
        }

        System.out.println();

        for (int i = halfOfLines; i > 0; i--) {

            // draw spaces
            for (int j = halfOfLines - i +1; j > 0; j--) {
                System.out.print(" ");
            }

            // draw "*"
            for (int j = 2; j <= 2 * i; j++) {
                System.out.print("*");
            }

            System.out.println();

        }


    }
}
