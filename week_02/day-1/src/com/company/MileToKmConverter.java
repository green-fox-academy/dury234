package com.company;

import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input distance in miles: ");

        double miles = scanner.nextDouble();

        double kilometers = miles * 1.60;

        System.out.println(miles + " miles is " + kilometers + " kilometers!");
    }
}
