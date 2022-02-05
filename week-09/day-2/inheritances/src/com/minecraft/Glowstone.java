package com.minecraft;

import java.awt.*;
import java.util.Arrays;

public class Glowstone extends Block {

    Boolean transformed = false;

    @Override
    public Block transform(Block b) {
        if (b.type.equals(BlockType.GLASS)) {
            transformed = true;
            return new Gold(160);
        }
        return b;
    }

    public Glowstone() {
        type = BlockType.GLOWSTONE;
        color = Color.white;
        transmission = 300;
        isCrossable = false;
        canBeAdjacentTO = Arrays.asList(BlockType.GLASS, BlockType.ICE, BlockType.LAVA, BlockType.AIR);
    }

    @Override
    public void printStatus() {
        super.printStatus();
        if (transformed)
            System.out.println("Has transformed a block of type GLASS to GOLD");
        else
            System.out.println("Made no transformation");
    }
}
