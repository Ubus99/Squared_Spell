package com.example.spell2.assets.blocks;

import com.example.spell2.Main;
import com.example.spell2.assets.entitys.ScriptingTableEntity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class ScriptingTable extends BlockContainer {

	private final String Name = "ScriptingTable";
	private final String Texture = Main.MODID + ":" + "TestTexture";
	//private final String Texture = Main.MODID + ":" + Name;
	private final CreativeTabs Tab = CreativeTabs.tabBlock;

	public ScriptingTable(Material material) {
		super(material);
		this.setUnlocalizedName(Name);
		this.setTextureName(Texture);
		this.setCreativeTab(Tab);
		this.setLightLevel(0.2f);
		this.setHarvestLevel("axe", 0);
		this.isBlockContainer = true;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new ScriptingTableEntity();
	}

	@Override
	public void breakBlock(World worldIn, int x, int y, int z, Block blockBroken, int meta) {
		super.breakBlock(worldIn, x, y, z, blockBroken, meta);
		worldIn.removeTileEntity(x, y, z);
	}

	@Override
	public boolean onBlockEventReceived(World worldIn, int x, int y, int z, int eventId, int eventData) {
		super.onBlockEventReceived(worldIn, x, y, z, eventId, eventData);
		TileEntity tileEntity = worldIn.getTileEntity(x, y, z);
		return tileEntity == null ? false : tileEntity.receiveClientEvent(eventId, eventData);
	}

	@Override
	public int getRenderType() {
		return 3;
	}
}
