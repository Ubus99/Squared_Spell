package com.example.spell2.network;

import com.example.spell2.network.playerData.ManaPacket;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketHandler {

	private static SimpleNetworkWrapper NetworkWrapper;

	public static final void init(SimpleNetworkWrapper NetworkWrapperIn) {
		NetworkWrapper = NetworkWrapperIn;
		NetworkWrapper.registerMessage(ManaPacket.Handler.class, ManaPacket.class, 0, Side.SERVER);
		NetworkWrapper.registerMessage(ManaPacket.Handler.class, ManaPacket.class, 0, Side.CLIENT);
	}

	public static void sendToServer(IMessage message) {
		NetworkWrapper.sendToServer(message);
	}

	public static void sendTo(IMessage message, EntityPlayerMP player) {
		NetworkWrapper.sendTo(message, player);
	}
}
