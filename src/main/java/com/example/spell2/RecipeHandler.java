package com.example.spell2;

import com.example.spell2.assets.ItemHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipeHandler {

	public static final void init() {
		loadShapedRecipes();
		loadShapelessRecipes();
	}

	private static void loadShapedRecipes() {
		GameRegistry.addRecipe(new ItemStack(ItemHandler.Scroll), "S", "L", "S", 'S', Items.stick, 'L', Items.leather);
	}

	private static void loadShapelessRecipes() {

	}
}
