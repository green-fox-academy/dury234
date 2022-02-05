package com.minecraft;

import java.awt.*;
import java.util.Arrays;

public class Lava extends Block {

    Boolean transformedMud = false;
    Boolean transformIce = false;

    @Override
    public Block transform(Block b) {
        if (b.type.equals(BlockType.MUD)) {
            transformedMud = true;
            return new Brick();
        } else if (b.type.equals(BlockType.ICE)) {
            transformIce = true;
            return new Air();
        }
        return b;
    }

    public Lava() {
        type = BlockType.LAVA;
        color = Color.yellow;
        transmission = 170;
        isCrossable = false;
        canBeAdjacentTO = Arrays.asList(BlockType.MUD, BlockType.BRICK, BlockType.GLASS, BlockType.ICE, BlockType.AIR, BlockType.GLOWSTONE);
    }

    @Override
    public void printStatus() {
        super.printStatus();
        if (transformedMud)
            System.out.println("Has transformed a block of type MUD to BRICK");
        else if (transformIce)
            System.out.println("Has transformed a block of type ICE to AIR");
        else
            System.out.println("Made no transformation");
    }
}
