package com.company;

import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input side1 length:");
        int side1 = scanner.nextInt();

        System.out.println("Input side2 length:");
        int side2 = scanner.nextInt();

        System.out.println("Input side3 length:");
        int side3 = scanner.nextInt();

        int volume = side1 * side2 * side3;
        int surfaceArea = 4 * side1 * side2 + 2 * side2 * side3;

        System.out.println("Surface area: " + surfaceArea);
        System.out.println("Volume: " + volume);

    }
}
