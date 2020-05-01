package com.example.spell2.network.playerData;

import com.example.spell2.PlayerData;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;

public class ManaPacket implements IMessage {

	private int playerID;
	private byte mana;

	public ManaPacket() {
	}

	public ManaPacket(EntityPlayer playerMana, int mana) {
		this.playerID = playerMana.getEntityId();
		this.mana = (byte) mana;
	}

	@Override
	public void fromBytes(ByteBuf buf) {
		playerID = buf.readInt();
		mana = buf.readByte();
	}

	@Override
	public void toBytes(ByteBuf buf) {
		buf.writeInt(playerID);
		buf.writeByte(mana);
	}

	public static class Handler implements IMessageHandler<ManaPacket, IMessage> {

		@Override
		public IMessage onMessage(ManaPacket message, MessageContext ctx) {
			Entity entity = Minecraft.getMinecraft().theWorld.getEntityByID(message.playerID);
			if (entity instanceof EntityPlayer) {
				PlayerData.get((EntityPlayer) entity).setMana(message.mana);
			}
			return null;
		}
	}
}
