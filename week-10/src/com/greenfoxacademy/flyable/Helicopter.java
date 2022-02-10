package com.greenfoxacademy.flyable;

public class Helicopter extends Vehicle implements Flyable {
    @Override
    public void fly() {
        distanceTraveled += 5;
    }

    @Override
    public void land() {
        status = VehiclesStatus.ONTHEGROUND;
        distanceTraveled += 1;
    }

    @Override
    public void takeOff() {
        status = VehiclesStatus.INTHEAIR;
        distanceTraveled += 1;
    }

    public Helicopter(String producer) {
        this.producer = producer;
        fuel = 100;
        distanceTraveled = 0;
        status = VehiclesStatus.ONTHEGROUND;

    }
}
