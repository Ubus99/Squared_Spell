package com.example.spell2.assets;

import com.example.spell2.assets.entitys.ScriptingTableEntity;
import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityHandler {

	public static void init() {
		GameRegistry.registerTileEntity(ScriptingTableEntity.class, ScriptingTableEntity.name);
	}
}
