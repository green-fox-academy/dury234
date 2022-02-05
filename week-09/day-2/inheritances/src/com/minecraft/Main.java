package com.minecraft;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall();
        wall.placeBlock(new Air());
        wall.placeBlock(new Brick());
        wall.placeBlock(new Door(2, "Mordor", Color.black, 60));
        wall.placeBlock(new Glass(Color.white, 80));
        wall.placeBlock(new Glowstone());
        wall.placeBlock(new Window(1, "Liliput", Color.white, 70, true));
        wall.placeBlock(new Window(2, "Agard", Color.lightGray, 90, true));
        wall.placeBlock(new Mud());
        wall.placeBlock(new Gold(50));
        wall.placeBlock(new Lava());
        wall.placeBlock(new Glowstone());
        wall.placeBlock(new Ice());
        wall.placeBlock(new Lava());
        wall.placeBlock(new Gold(30));
        wall.placeBlock(new Ice());

        System.out.println("Light transmitted: " + wall.calculateLightTransmission());
        wall.printStatus();
    }
}
