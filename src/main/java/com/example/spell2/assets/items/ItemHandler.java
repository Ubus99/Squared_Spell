package com.example.spell2.assets.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.LinkedList;

public final class ItemHandler {

    public static LinkedList<Item> ItemBuffer;

    public static final void init() {
        //automate or outsource item declaration
        ItemBuffer.add(new Item().setUnlocalizedName("testItem").setCreativeTab(CreativeTabs.tabMisc));
        ItemBuffer.forEach(item -> GameRegistry.registerItem(item, item.getUnlocalizedName()));
    }
}
