package com.example.spell2.assets.recipes;

import com.example.spell2.assets.ItemHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class RecipeLoader {

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
