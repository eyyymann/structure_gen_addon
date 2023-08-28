package com.sixeyes.structure_gen_addon.mixin;

import com.google.common.collect.ImmutableList;
import com.sixeyes.structure_gen_addon.StructureGenAddonMod;
import com.sixeyes.structure_gen_addon.registry.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.gen.feature.DeltaFeature;
import net.minecraft.world.gen.feature.DeltaFeatureConfig;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DeltaFeature.class)
public class DeltaFeatureMixin {

	@Inject(at = @At("HEAD"), method = "canPlace", cancellable = true)
	private static void canPlace(WorldAccess world, BlockPos pos, DeltaFeatureConfig config, CallbackInfoReturnable<Boolean> cir) {
		BlockState blockState1 = world.getBlockState(pos);
		if (blockState1.isIn(ModTags.DELTA_FEATURE_CANNOT_REPLACE))
			cir.setReturnValue(false);
	}
}