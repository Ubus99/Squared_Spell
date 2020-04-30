package com.example.spell2.assets.items;

import com.example.spell2.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Scroll extends Item {

    private final String Name = "TestItem";
    private final String Texture = Main.MODID + ":" + "TestSprite";
    //private final String Texture = Main.MODID + ":" + Name;
    private final CreativeTabs Tab = CreativeTabs.tabMisc;

    public Scroll() {
        this.setUnlocalizedName(Name);
        this.setCreativeTab(Tab);
        this.setTextureName(Texture);
    }
}
