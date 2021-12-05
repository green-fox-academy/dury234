package com.company;

public class FizzBuzz {

    public static void fizzBuzz() {
        // write your code here for Gradescope testing
        for (int i = 1; i <=100 ; i++) {
            if (i % 3 ==0) {
                if (i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else {
                    System.out.println("Fizz");
                }
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        fizzBuzz();

    }
}
