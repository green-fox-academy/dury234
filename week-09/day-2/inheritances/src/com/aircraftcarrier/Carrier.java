package com.aircraftcarrier;

import java.util.ArrayList;

public class Carrier {
    ArrayList<Aircraft> aircrafts;
    private int storedAmmo;
    private int healthPoints;

    public Carrier(int storedAmmo, int healthPoints) {
        aircrafts = new ArrayList<>();
        this.healthPoints = healthPoints;
        this.storedAmmo = storedAmmo;
    }

    public void add(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public void fill() throws Exception {
        if (storedAmmo == 0) {
            throw new Exception("There is no ammo");
        } else {

            for (Aircraft craft : aircrafts) {
                if (craft.isPriority()) {
                    storedAmmo = craft.refillAmmo(storedAmmo);
                    if (storedAmmo == 0)
                        return;
                }
            }

            for (Aircraft craft : aircrafts) {
                if (!craft.isPriority()) {
                    storedAmmo = craft.refillAmmo(storedAmmo);
                    if (storedAmmo == 0)
                        return;
                }
            }
        }
    }

    public void fight(Carrier enemy) {
        for (Aircraft aircraft : aircrafts) {
            enemy.healthPoints -= aircraft.fight();
        }
    }

    public void getStatus() {
        if (healthPoints <= 0) {
            System.out.println("It's dead Jim :(");
        } else {

            int totalDamage = 0;
            for (Aircraft aircraft : aircrafts) {
                totalDamage += aircraft.getBaseDamage() * aircraft.getAmmoStorage();
            }

            System.out.println("HP: " + getHealthPoints() + ", Aircraft count: " + getAircrafts().size() + ", Ammo Storage: " + getStoredAmmo() + ", Total damage: " + totalDamage);
            System.out.println("Aircrafts:");

            for (Aircraft aircraft : aircrafts) {
                aircraft.getStatus();
            }
        }
        System.out.println();
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public ArrayList<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public int getStoredAmmo() {
        return storedAmmo;
    }
}
