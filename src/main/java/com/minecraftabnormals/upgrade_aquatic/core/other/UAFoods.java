package com.minecraftabnormals.upgrade_aquatic.core.other;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class UAFoods {
	public static final Food MULBERRY = new Food.Builder().hunger(3).saturation(0.1F).build();
	public static final Food MULBERRY_JAM = new Food.Builder().hunger(4).saturation(0.2F).setAlwaysEdible().build();
	public static final Food MULBERRY_BREAD = new Food.Builder().hunger(9).saturation(0.4F).build();
	public static final Food MULBERRY_PIE = new Food.Builder().hunger(7).saturation(0.6F).build();

	public static final Food buildPickerelweed(boolean purple) {
		return purple ? new Food.Builder().hunger(3).saturation(0.0F).setAlwaysEdible().build() : new Food.Builder().hunger(2).saturation(0.0F).setAlwaysEdible().build();
	}
	
	public static final Food buildPike(boolean cooked) {
		return cooked ? new Food.Builder().hunger(8).saturation(0.8F).build() : new Food.Builder().hunger(3).saturation(0.3F).build();
	}
	
	public static final Food buildLionfish(boolean cooked) {
		return cooked ? new Food.Builder().hunger(6).saturation(0.7F).build() : new Food.Builder().effect(() -> new EffectInstance(Effects.POISON, 550, 3), 1.0F).effect(() -> new EffectInstance(Effects.NAUSEA, 320, 2), 1.0F).hunger(2).saturation(0.3F).build();
	}
}