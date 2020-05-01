package com.example.spell2.proxies;

import com.example.spell2.Main;
import com.example.spell2.assets.BlockHandler;
import com.example.spell2.assets.ItemHandler;
import com.example.spell2.assets.recipes.RecipeLoader;
import com.example.spell2.network.PacketHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ItemHandler.init();
		BlockHandler.init();
		RecipeLoader.init();
	}

	public void init(FMLInitializationEvent e) {
		PacketHandler.init(NetworkRegistry.INSTANCE.newSimpleChannel(Main.MODID + "_Channel"));
	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
