package com.sixeyes.structure_gen_addon;

import com.sixeyes.structure_gen_addon.registry.ModTags;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StructureGenAddonMod implements ModInitializer {
	public static final String MOD_ID = "structure_gen_addon";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModTags.registerModTags();
		LOGGER.info("Hello Fabric world!");
	}
}