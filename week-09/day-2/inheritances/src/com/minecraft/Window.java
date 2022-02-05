package com.minecraft;

import java.awt.*;
import java.util.Arrays;

public class Window extends Block {
    int quality;
    String producerName;

    public Window(int quality, String producerName, Color color, int transmission, Boolean canBeCrossed) {
        this.quality = quality;
        this.color = color;
        this.producerName = producerName;
        this.transmission = transmission;
        this.isCrossable = canBeCrossed;
        type = BlockType.WINDOW;
        canBeAdjacentTO = Arrays.asList(BlockType.MUD, BlockType.BRICK, BlockType.AIR, BlockType.DOOR, BlockType.GLOWSTONE);
    }

    @Override
    public void printStatus() {
        super.printStatus();
        System.out.println("Manufactured by " + producerName + " on quality level " + quality);
    }
}
