package com.company;

import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that draws a square like this:
        //
        // %%%%%%
        // %    %
        // %    %
        // %    %
        // %    %
        // %%%%%%
        //
        // The square should have as many lines as lineCount is

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of lines:");

        int lineCounts = scanner.nextInt();

        for (int i = 1; i <= lineCounts ; i++) {
            System.out.print("%");
        }
        System.out.println();

        for (int i = 1; i <= lineCounts-2 ; i++) {
            System.out.print("%");

            for (int j = 1; j <= lineCounts - 2 ; j++) {
                System.out.print(" ");
            }

            System.out.println("%");
        }

        for (int i = 1; i <= lineCounts ; i++) {
            System.out.print("%");
        }

    }
}
