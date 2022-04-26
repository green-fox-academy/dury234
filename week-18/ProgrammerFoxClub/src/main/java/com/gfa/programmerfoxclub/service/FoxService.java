package com.gfa.programmerfoxclub.service;

import com.gfa.programmerfoxclub.model.Fox;
import com.gfa.programmerfoxclub.model.Tricks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;

@Component
public class FoxService {

    @Autowired
    private Fox fox;

    private List<Tricks> tricksDatabase = new ArrayList<Tricks>(EnumSet.allOf(Tricks.class));

    public void setFoodDrink(String food, String drink) {
        fox.setDrink(drink);
        fox.setFood(food);
    }

    public void learnTrick(String s) {
        Tricks trick = Tricks.valueOf(s);
        if (!fox.getTricks().contains(trick)) {
            fox.getTricks().add(trick);
            tricksDatabase.remove(trick);
        }
    }

    public String getFoxName() {
        return fox.getName();
    }

    public void setFoxName(String name) {
        fox.setName(name);
    }

    public String getFoxFood() {
        return fox.getFood();
    }

    public String getFoxDrink() {
        return fox.getDrink();
    }

    public List<Tricks> getTricks() {
        return fox.getTricks();
    }

    public List<Tricks> getTricksDatabase() {
        return tricksDatabase;
    }

    public void setTricksDatabase(List<Tricks> tricksDatabase) {
        this.tricksDatabase = tricksDatabase;
    }
}
