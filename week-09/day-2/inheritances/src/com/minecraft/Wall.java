package com.minecraft;

import java.util.ArrayList;
import java.util.List;

public class Wall {
    List<Block> blocks = new ArrayList<>();

    public void placeBlock(Block b) {
        if (blocks.size() == 0) {
            blocks.add(b);
            return;
        }
        Block lastBlock = blocks.get(blocks.size() - 1);
        if (b.canPlaceAfter(lastBlock)) {
            blocks.set(blocks.size() - 1, b.transform(lastBlock));
            blocks.add(b);
        }
    }

    public void printStatus() {
        System.out.println("Wall status:");
        for (Block block : blocks) {
            block.printStatus();
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    public int calculateLightTransmission() {
        int sum = 0;
        for (Block block : blocks) {
            sum += block.getTransmission();
        }
        return sum / blocks.size();
    }

}
