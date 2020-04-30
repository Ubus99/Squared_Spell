package com.example.spell2.networking;

import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class PacketHandler {

	private static SimpleNetworkWrapper NetworkWrapper;

	public static void init(SimpleNetworkWrapper NetworkWrapperIn) {
		NetworkWrapper = NetworkWrapperIn;
		NetworkWrapper.registerMessage(MessageHandler.class, Message.class, 0, Side.CLIENT);
	}
}
