package com.company;

import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %%  %
        // % % %
        // %  %%
        // %%%%%
        //
        // The square should have as many lines as the number was

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
                if (j == i){
                    System.out.print("%");
                } else{
                    System.out.print(" ");
                }
            }

            System.out.println("%");
        }

        for (int i = 1; i <= lineCounts ; i++) {
            System.out.print("%");
        }

    }
}
