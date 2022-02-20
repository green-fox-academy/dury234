package com.greenfoxacademy.cab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CowsAndBulls {
    GameState state;
    int numberToGuess;
    int counter;
    int cows;
    int bulls;
    List<Integer> ciphers;

    public CowsAndBulls() {
        state = GameState.PLAYING;
        numberToGuess = (int) (1000 + Math.random() * 8999);
        int temp = numberToGuess;
        counter = 0;
        ciphers = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ciphers.add(temp % 10);
            temp /= 10;
        }
    }

    public void guess() {
        counter++;
        bulls = 0;
        cows = 0;
        System.out.println("Input your guess no. " + counter + ":");
        Scanner scanner = new Scanner(System.in);
        int guessNum = scanner.nextInt();
        if (guessNum == numberToGuess) {
            state = GameState.FINISHED;
            System.out.println("That's correct! You needed " + counter + " tries.");
            return;
        }
        int temp = guessNum;

        List<Integer> guessNumCiphers = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            guessNumCiphers.add(temp % 10);
            temp /= 10;
        }

        for (int i = 0; i < 4; i++) {
            if (ciphers.get(i) == guessNumCiphers.get(i)) {
                cows++;
            } else if (ciphers.contains(guessNumCiphers.get(i)) && Collections.frequency(ciphers, guessNumCiphers.get(i)) >= Collections.frequency(guessNumCiphers, guessNumCiphers.get(i))) {
                bulls++;
            }
        }
        System.out.println(cows + " cow, " + bulls + " bulls");
    }

    public void play() {
        while (state == GameState.PLAYING) {
            guess();
        }
    }

    public void printNum() {
        System.out.println(numberToGuess);
        System.out.println(ciphers);
    }


    public static void main(String[] args) {
        CowsAndBulls cowsAndBulls = new CowsAndBulls();
        cowsAndBulls.play();
    }
}
