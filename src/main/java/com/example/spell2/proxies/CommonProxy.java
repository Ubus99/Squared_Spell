package com.example.spell2.proxies;

import com.example.spell2.Main;
import com.example.spell2.RecipeHandler;
import com.example.spell2.assets.BlockHandler;
import com.example.spell2.assets.ItemHandler;
import com.example.spell2.networking.PacketHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ItemHandler.init();
		BlockHandler.init();
		RecipeHandler.init();
		PacketHandler.init(NetworkRegistry.INSTANCE.newSimpleChannel(Main.MODID + "Channel"));
	}

	public void init(FMLInitializationEvent e) {

	}

	public void postInit(FMLPostInitializationEvent e) {

	}
}
