package com.company;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        // Write a program that draws a pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of lines:");

        int lineCounts = scanner.nextInt();

        for (int i = 1; i <= lineCounts ; i++) {

            // draw spaces
            for (int j = lineCounts - i; j > 0; j--) {
                System.out.print(" ");
            }

            // draw "*"
            for (int j = 2; j <= 2*i ; j ++) {
                System.out.print("*");
            }

            System.out.println();

        }


    }

}
