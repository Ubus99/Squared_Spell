package com.example.spell2.assets.items;

import com.example.spell2.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Scroll extends Item {

    private final String Name = "testItem";
    private final String Texture = "TestSprite";
    private final CreativeTabs Tab = CreativeTabs.tabMisc;

    public Scroll() {
        this.setUnlocalizedName(Name);
        this.setCreativeTab(Tab);
        this.setTextureName(Main.MODID + ":" + Texture);
    }
}
