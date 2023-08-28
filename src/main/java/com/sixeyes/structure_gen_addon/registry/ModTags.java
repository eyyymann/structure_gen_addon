package com.sixeyes.structure_gen_addon.registry;

import com.sixeyes.structure_gen_addon.StructureGenAddonMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static final TagKey<Block> DELTA_FEATURE_CANNOT_REPLACE = blockTagOf("delta_feature_cannot_replace");

    private static TagKey<Block> blockTagOf(String name) {
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(StructureGenAddonMod.MOD_ID, name));
    }

    public static void registerModTags() {

        StructureGenAddonMod.LOGGER.info("Registering Mod Tags " + StructureGenAddonMod.MOD_ID);
    }
}
