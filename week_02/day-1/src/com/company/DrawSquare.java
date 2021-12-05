package com.company;

import java.util.Scanner;



public class DrawSquare {

    public static void drawSquare(int lineCount) {
        // write your code here for Gradescope testing

        for (int i = 1; i <= lineCount ; i++) {
            System.out.print("%");
        }
        System.out.println();

        for (int i = 1; i <= lineCount-2 ; i++) {
            System.out.print("%");

            for (int j = 1; j <= lineCount - 2 ; j++) {
                System.out.print(" ");
            }

            System.out.println("%");
        }

        for (int i = 1; i <= lineCount ; i++) {
            System.out.print("%");
        }

    }

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

        int lineCount = scanner.nextInt();

        drawSquare(lineCount);

    }
}
