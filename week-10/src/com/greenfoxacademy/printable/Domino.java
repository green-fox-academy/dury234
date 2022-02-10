package com.greenfoxacademy.printable;

public class Domino {
    int sideA;
    int sideB;

    public Domino(int a, int b) {
        sideA = a;
        sideB = b;
    }

    public void printInfo() {
        System.out.println("Domino A side: " + sideA + ", B side: " + sideB);
    }
}
