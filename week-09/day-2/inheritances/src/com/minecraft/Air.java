package com.minecraft;

import java.awt.*;
import java.util.Arrays;

public class Air extends Block {
    public Air() {
        type = BlockType.AIR;
        color = new Color(255, 255, 255, 0);
        transmission = 100;
        isCrossable = true;
        canBeAdjacentTO = Arrays.asList(BlockType.MUD, BlockType.BRICK, BlockType.GLASS, BlockType.DOOR, BlockType.WINDOW, BlockType.GOLD);
    }
}
