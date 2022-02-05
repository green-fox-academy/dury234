package com.minecraft;

import java.awt.*;
import java.util.Arrays;

public class Mud extends Block {
    public Mud() {
        type = BlockType.MUD;
        color = Color.darkGray;
        transmission = 0;
        isCrossable = false;
        canBeAdjacentTO = Arrays.asList(BlockType.BRICK, BlockType.AIR, BlockType.LAVA, BlockType.DOOR, BlockType.WINDOW, BlockType.GOLD);
    }
}
