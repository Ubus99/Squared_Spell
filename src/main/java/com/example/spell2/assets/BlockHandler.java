package com.example.spell2.assets;

import com.example.spell2.assets.blocks.Spell2Block;
import cpw.mods.fml.common.registry.GameRegistry;

import java.util.LinkedList;

public class BlockHandler {

    public static final LinkedList<Spell2Block> BlockBuffer = new LinkedList<>();

    public static final void init() {
        //automate or outsource item declaration
        BlockBuffer.add(new Spell2Block(null));
        BlockBuffer.forEach(Block -> GameRegistry.registerBlock(Block, Block.getUnlocalizedName()));
    }
}