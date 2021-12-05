package com.company;

import java.util.Scanner;

public class DrawPyramid {

    public static void drawPyramid (int lineCount) {
        // write your code here for Gradescope testing


        for (int i = 1; i <= lineCount ; i++) {

            // draw spaces
            for (int j = lineCount - i; j > 0; j--) {
                System.out.print(" ");
            }

            // draw "*"
            for (int j = 2; j <= 2*i ; j ++) {
                System.out.print("*");
            }

            System.out.println();

        }
    }

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



        System.out.println("Enter the number of lines:");
        Scanner scanner = new Scanner(System.in);
        int lineCounts = scanner.nextInt();
        drawPyramid(lineCounts);




    }

}
