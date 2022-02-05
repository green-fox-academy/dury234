package com.minecraft;

import java.awt.*;
import java.util.Arrays;

public class Brick extends Block {
    public Brick() {
        type = BlockType.BRICK;
        color = new Color(144, 76, 42);
        transmission = 0;
        isCrossable = false;
        canBeAdjacentTO = Arrays.asList(BlockType.MUD, BlockType.GLASS, BlockType.AIR, BlockType.DOOR, BlockType.WINDOW);
    }

    public Brick(Color color) {
        type = BlockType.BRICK;
        this.color = color;
        transmission = 0;
        isCrossable = false;
        canBeAdjacentTO = Arrays.asList(BlockType.MUD, BlockType.GLASS, BlockType.AIR, BlockType.DOOR, BlockType.WINDOW);
    }
}
