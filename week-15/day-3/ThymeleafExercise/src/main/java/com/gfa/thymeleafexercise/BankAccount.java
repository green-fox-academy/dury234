package com.gfa.thymeleafexercise;

public class BankAccount {
    private String name;
    private int balance;
    private String animalType;
    private boolean isKing = false;
    private boolean isGood;

    public BankAccount(String name, int balance, String animalType, boolean isGood) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
        this.isGood = isGood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }
}
