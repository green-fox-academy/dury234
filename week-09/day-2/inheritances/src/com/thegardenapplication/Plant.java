package com.thegardenapplication;

public class Plant {
    private double currentWaterAmount;
    private double absorbtionEffectivity;
    private String color;
    private int waterNeededPoint;
    String type;

    public void waterPlant(int amount) {
        currentWaterAmount += amount * absorbtionEffectivity;
    }

    public boolean needsWater() {
        if (currentWaterAmount < waterNeededPoint) {
            return true;
        } else
            return false;
    }

    public void printInfo() {
        if (needsWater()) {
            System.out.println("The " + getColor() + " " + getType() + " needs water");
        } else
            System.out.println("The " + getColor() + " " + getType() + " doesn't need water");
    }

    public void setAbsorbtionEffectivity(double absorbtionEffectivity) {
        this.absorbtionEffectivity = absorbtionEffectivity;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCurrentWaterAmount(double currentWaterAmount) {
        this.currentWaterAmount = currentWaterAmount;
    }

    public void setWaterNeededPoint(int waterNeededPoint) {
        this.waterNeededPoint = waterNeededPoint;
    }

    public double getAbsorbtionEffectivity() {
        return absorbtionEffectivity;
    }

    public double getCurrentWaterAmount() {
        return currentWaterAmount;
    }

    public int getWaterNeededPoint() {
        return waterNeededPoint;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
