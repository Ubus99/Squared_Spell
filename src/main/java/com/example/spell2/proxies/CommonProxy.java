package com.example.spell2.proxies;

import com.example.spell2.assets.BlockHandler;
import com.example.spell2.assets.ItemHandler;
import com.example.spell2.assets.TileEntityHandler;
import com.example.spell2.assets.recipes.RecipeLoader;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ItemHandler.init();
		BlockHandler.init();
		RecipeLoader.init();
		TileEntityHandler.init();
	}

	public void init(FMLInitializationEvent e) {
		//PacketHandler.init(NetworkRegistry.INSTANCE.newSimpleChannel(Main.MODID + "_Channel"));
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
