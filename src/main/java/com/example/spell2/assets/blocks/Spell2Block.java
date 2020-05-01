package com.example.spell2.assets.blocks;

import com.example.spell2.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class Spell2Block extends Block {

	private final String Name = "TestBlock";
	private final String Texture = Main.MODID + ":" + "TestTexture";
	//private final String Texture = Main.MODID + ":" + Name;
	private final CreativeTabs Tab = CreativeTabs.tabBlock;

	public Spell2Block(Material material) {
		super(material);
		this.setUnlocalizedName(Name);
		this.setTextureName(Texture);
		this.setCreativeTab(Tab);
		this.setLightLevel(0.2f);
		this.setHarvestLevel("axe", 0);
	}
}
