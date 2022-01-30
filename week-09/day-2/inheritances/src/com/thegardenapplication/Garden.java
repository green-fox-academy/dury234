package com.thegardenapplication;

import java.util.ArrayList;

public class Garden {

    ArrayList<Plant> plants;

    public Garden() {
        plants = new ArrayList<Plant>();
    }

    public void addPlant(Plant plant) {
        plants.add(plant);
    }

    public void printGardenInfo() {
        for (Plant plant : plants) {
            plant.printInfo();
        }
        System.out.println();
    }

    public int numberOfThirstyPlants() {
        int result = 0;
        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).needsWater()) {
                result++;
            }
        }
        return result;
    }

    public void waterGarden(int amount) {
        int divider = numberOfThirstyPlants();

        for (int i = 0; i < plants.size(); i++) {
            if (plants.get(i).needsWater()) {
                plants.get(i).waterPlant(amount / divider);
            }
        }
        System.out.println("Watering with " + amount);
        printGardenInfo();
    }
}
