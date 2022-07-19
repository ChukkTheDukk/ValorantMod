package net.chukkthedukk.valorantmod;

import net.chukkthedukk.valorantmod.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValorantMod implements ModInitializer {
	public static final String MOD_ID = "valorantmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("valorantmod");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
