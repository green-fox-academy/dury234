package com.minecraft;

import java.awt.*;
import java.util.Arrays;

public class Glass extends Block {

    public Glass(Color color, int transmission) {
        type = BlockType.GLASS;
        this.color = color;
        this.transmission = transmission;
        isCrossable = false;
        canBeAdjacentTO = Arrays.asList(BlockType.MUD, BlockType.BRICK, BlockType.ICE, BlockType.AIR, BlockType.GLOWSTONE, BlockType.DOOR);
    }

    public Glass() {
        this(new Color(255, 255, 255, 1), 99);
    }

}
