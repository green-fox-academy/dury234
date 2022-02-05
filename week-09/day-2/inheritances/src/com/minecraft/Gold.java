package com.minecraft;

import java.awt.*;
import java.util.Arrays;

public class Gold extends Block {

    public Gold(int transmission) {
        type = BlockType.GOLD;
        this.transmission = transmission;
        color = new Color(255, 215, 0);
        isCrossable = false;
        canBeAdjacentTO = Arrays.asList(BlockType.GLOWSTONE, BlockType.GLASS);
    }
}
