package com.minecraft;

import java.awt.*;
import java.util.Arrays;

public class Ice extends Block {
    boolean transformed = false;
    public Ice() {
        type = BlockType.ICE;
        transmission = 97;
        color = new Color(150, 215, 255, 1);
        isCrossable = false;
        canBeAdjacentTO = Arrays.asList(BlockType.MUD, BlockType.BRICK, BlockType.GLASS, BlockType.LAVA, BlockType.AIR, BlockType.GLOWSTONE);
    }

    @Override
    public Block transform(Block b) {
        if (b.type.equals(BlockType.LAVA)) {
            transformed = true;
            return new Glass();
        }
        return b;
    }

    @Override
    public void printStatus() {
        super.printStatus();
        if (transformed)
            System.out.println("Has transformed a block of type LAVA to GLASS");
        else
            System.out.println("Made no transformation");
    }
}
