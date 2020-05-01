package com.example.spell2.assets.entitys;

import net.minecraft.server.gui.IUpdatePlayerListBox;
import net.minecraft.tileentity.TileEntity;

public class ScriptingTableEntity extends TileEntity implements IUpdatePlayerListBox {

	public static String name = "ScriptingTableEntity";

	@Override
	public void update() {
		System.out.println("haha");
	}
}
