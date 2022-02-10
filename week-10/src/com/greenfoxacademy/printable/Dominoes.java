package com.greenfoxacademy.printable;

import java.util.ArrayList;
import java.util.List;

public class Dominoes implements Printable {
    List<Domino> dominoesList;

    public Dominoes() {
        dominoesList = new ArrayList<>();
    }

    public void add(Domino d) {
        dominoesList.add(d);
    }


    @Override
    public void printAllFields() {
        for (Domino domino : dominoesList) {
            domino.printInfo();
        }
    }
}
