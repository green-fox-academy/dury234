package farm;

import animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    int limit;
    List<Animal> listOfAnimals;

    public Farm(int limit) {
        this.listOfAnimals = new ArrayList<>();
        this.limit = limit;
    }

    public void breed() {
        if (listOfAnimals.size() < limit) {
            Animal animal = new Animal();
            listOfAnimals.add(animal);
        } else {
            System.out.println("The farm is full, you should sell something in order to have a place for a new one");
        }
    }

    public void sell() {
        int minHunger = 1000;
        int index = 0;
        for (int i = 0; i < listOfAnimals.size(); i++) {
            if (listOfAnimals.get(i).getHunger() < minHunger) {
                index = i;
                minHunger = listOfAnimals.get(i).getHunger();
            }
        }
        listOfAnimals.remove(index);
    }

    public static void main(String[] args) {
        Farm farm = new Farm(5);
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();
        Animal animal4 = new Animal();

        animal4.eat();

        farm.listOfAnimals.add(animal1);
        farm.listOfAnimals.add(animal2);
        farm.listOfAnimals.add(animal3);
        farm.listOfAnimals.add(animal4);

        for (int i = 0; i < farm.listOfAnimals.size(); i++) {
            System.out.println("Hunger of animal " + (i + 1) + ": " + farm.listOfAnimals.get(i).getHunger());
        }

        farm.breed();
        farm.breed();

        for (int i = 0; i < farm.listOfAnimals.size(); i++) {
            System.out.println("Hunger of animal " + (i + 1) + ": " + farm.listOfAnimals.get(i).getHunger());
        }

        farm.sell();
        System.out.println();

        for (int i = 0; i < farm.listOfAnimals.size(); i++) {
            System.out.println("Hunger of animal " + (i + 1) + ": " + farm.listOfAnimals.get(i).getHunger());
        }

        System.out.println();

        farm.breed();

        for (int i = 0; i < farm.listOfAnimals.size(); i++) {
            System.out.println("Hunger of animal " + (i + 1) + ": " + farm.listOfAnimals.get(i).getHunger());
        }
        System.out.println();
        farm.breed();

    }
}
