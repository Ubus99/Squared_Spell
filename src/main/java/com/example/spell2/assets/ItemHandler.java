package com.example.spell2.assets;

import com.example.spell2.assets.items.Scroll;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

import java.util.LinkedList;

public final class ItemHandler {

    public static LinkedList<Item> ItemBuffer = new LinkedList<>();

    public static Item Scroll = new Scroll();

    public static final void init() {
        //automate or outsource item declaration
        ItemBuffer.add(Scroll);
        ItemBuffer.forEach(Item -> GameRegistry.registerItem(Item, Item.getUnlocalizedName()));
    }
}
