package com.company;

import java.util.Scanner;

public class SecondsInADay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Current hour: ");
        int currentHours = scanner.nextInt();
        System.out.println("Current minute: ");
        int currentMinutes = scanner.nextInt();
        System.out.println("Current second: ");
        int currentSeconds = scanner.nextInt();

        int numberOfSeconds = 60*60*currentHours + 60*currentMinutes + currentSeconds;
        System.out.println("Number of seconds in this day: " + numberOfSeconds);

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above
    }

}
