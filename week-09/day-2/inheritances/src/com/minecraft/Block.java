package com.minecraft;

import java.awt.*;
import java.util.List;

public class Block {
    BlockType type;
    Color color;
    int transmission;
    boolean isCrossable;
    List<BlockType> canBeAdjacentTO;

    public boolean canPlaceAfter(Block b) {
        return canBeAdjacentTO.contains(b.type);
    }

    public int getTransmission() {
        return transmission;
    }

    public void printStatus() {
        System.out.println("Block of type: " + type);
        System.out.println("Has light transmission: " + transmission);
        if (isCrossable) {
            System.out.println("Can be crossed.");
        } else
            System.out.println("Can not be crossed.");
    }

    public Block transform(Block b){
        return b;
    }


}
