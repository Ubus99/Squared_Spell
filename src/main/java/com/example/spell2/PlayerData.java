package com.example.spell2;

import com.example.spell2.network.PacketHandler;
import com.example.spell2.network.playerData.ManaPacket;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class PlayerData implements IExtendedEntityProperties {

	// PROPERTIES ------------------------------------------------------------------------------------------------------

	private static final String identifier = Main.MODID + "PlayerData"; // identifies data from this mod inside the entity
	private final EntityPlayer player;

	private final int maxMana = 100;
	private int mana;

	// CONSTRUCTOR, GETTER, REGISTER -----------------------------------------------------------------------------------

	public PlayerData(EntityPlayer player) {
		this.player = player;
		this.mana = 100;
	}

	public static PlayerData get(EntityPlayer player) {
		return (PlayerData) player.getExtendedProperties(identifier);
	}

	public static void register(EntityPlayer player) {
		player.registerExtendedProperties(identifier, new PlayerData(player));
	}

	public boolean isServerSide() {
		return this.player instanceof EntityPlayerMP;
	}

	public int getMana() {
		return this.mana;
	}

	public void setMana(int mana) {
		if (mana < maxMana && mana > 0) {
			this.mana = mana;
			syncMana();
		}
	}

	private void syncMana() {
		if (this.isServerSide()) {
			PacketHandler.sendTo(new ManaPacket(player, mana), (EntityPlayerMP) player);
		}
	}
	// HANDLER ---------------------------------------------------------------------------------------------------------

	@Override
	public void saveNBTData(NBTTagCompound nbt) {
		nbt.setInteger("mana", this.getMana());
	}

	@Override
	public void loadNBTData(NBTTagCompound nbt) {
		if (nbt.hasKey("mana", 3))
			this.setMana(nbt.getInteger("mana"));
	}

	@Override
	public void init(Entity entity, World world) {
	}
}