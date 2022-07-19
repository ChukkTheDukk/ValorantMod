package net.chukkthedukk.valorantmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValorantMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("valorantmod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
