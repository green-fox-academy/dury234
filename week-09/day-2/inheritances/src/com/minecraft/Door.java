package com.minecraft;

import java.awt.*;
import java.util.Arrays;

public class Door extends Block{
    int quality;
    String producerName;

    public Door(int quality, String producerName, Color color, int transmission) {
        this.quality = quality;
        this.color = color;
        this.producerName = producerName;
        this.transmission = transmission;
        type = BlockType.DOOR;
        isCrossable = true;
        canBeAdjacentTO = Arrays.asList(BlockType.MUD, BlockType.BRICK, BlockType.AIR, BlockType.WINDOW);
    }

    @Override
    public void printStatus() {
        super.printStatus();
        System.out.println("Manufactured by " + producerName + " on quality level " + quality);
    }
}
