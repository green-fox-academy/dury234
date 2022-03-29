package com.gfa.thymeleafexercise;

import java.util.Objects;

public class BankAccount {
    private String name;
    private Integer balance;
    private String animalType;
    private Boolean isKing;
    private Boolean isGood;

    public BankAccount(String name, Integer balance, String animalType, Boolean isKing, Boolean isGood) {
        this.name = name;
        this.animalType = animalType;
        this.isKing = Objects.nonNull(isKing) ? isKing : false;
        this.isGood = Objects.nonNull(isGood) ? isGood : false;
        this.balance = Objects.nonNull(balance) ? balance : 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public Boolean getIsKing() {
        return isKing;
    }

    public void setIsKing(Boolean king) {
        isKing = king;
    }

    public Boolean getIsGood() {
        return isGood;
    }

    public void setIsGood(Boolean good) {
        isGood = good;
    }
}
