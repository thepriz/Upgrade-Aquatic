package com.minecraftabnormals.upgrade_aquatic.common.blocks.trees;

import java.util.Random;

import javax.annotation.Nullable;

import com.minecraftabnormals.upgrade_aquatic.common.world.gen.feature.RiverTreeFeature;
import com.minecraftabnormals.upgrade_aquatic.core.registry.UAFeatures;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

public class RiverTree extends Tree {
	
	@Nullable
	@Override
	protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean p_225546_2_) {
		return UAFeatures.RIVER_TREE.get().withConfiguration(RiverTreeFeature.RIVER_TREE_CONFIG);
	}
	
}