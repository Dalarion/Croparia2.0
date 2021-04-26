package com.croparia.mod.common.items;

import net.minecraft.item.Food;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ModFood {
	public static final int FruitEffectDuration = 200;
	public static final int FruitEffectAmplifier = 1;
	
	public static final Food CROPARIA_FRUIT = (new Food.Builder()).hunger(2).saturation(0.3F).build();
	public static final Food CROPARIA_PIE = (new Food.Builder()).hunger(8).saturation(0.6F).build();
			
	public static Food FRUIT_SPEED = buildFruitEffect(Effects.SPEED);
	public static Food FRUIT_SLOWNESS = buildFruitEffect(Effects.SLOWNESS);
	public static Food FRUIT_HASTE = buildFruitEffect(Effects.HASTE);
	public static Food FRUIT_MINING_FATIGUE = buildFruitEffect(Effects.MINING_FATIGUE);
	public static Food FRUIT_STRENGTH = buildFruitEffect(Effects.STRENGTH, 0,FruitEffectDuration);
	public static Food FRUIT_INSTANT_HEALTH = buildFruitEffect(Effects.INSTANT_HEALTH, 1, 1);
	public static Food FRUIT_INSTANT_DAMAGE = buildFruitEffect(Effects.INSTANT_DAMAGE, 1, 1);
	public static Food FRUIT_JUMP_BOOST = buildFruitEffect(Effects.JUMP_BOOST);
	public static Food FRUIT_NAUSEA = buildFruitEffect(Effects.NAUSEA);
	public static Food FRUIT_REGENERATION = buildFruitEffect(Effects.REGENERATION, 0, FruitEffectDuration);
	public static Food FRUIT_RESISTANCE = buildFruitEffect(Effects.RESISTANCE);
	public static Food FRUIT_FIRE_RESISTANCE = buildFruitEffect(Effects.FIRE_RESISTANCE);
	public static Food FRUIT_WATER_BREATHING = buildFruitEffect(Effects.WATER_BREATHING);
	public static Food FRUIT_INVISIBILITY = buildFruitEffect(Effects.INVISIBILITY);
	public static Food FRUIT_BLINDNESS = buildFruitEffect(Effects.BLINDNESS);
	public static Food FRUIT_NIGHT_VISION = buildFruitEffect(Effects.NIGHT_VISION);
	public static Food FRUIT_HUNGER = buildFruitEffect(Effects.HUNGER);
	public static Food FRUIT_WEAKNESS = buildFruitEffect(Effects.WEAKNESS);
	public static Food FRUIT_POISON = buildFruitEffect(Effects.POISON);
	public static Food FRUIT_WITHER = buildFruitEffect(Effects.WITHER);
	public static Food FRUIT_HEALTH_BOOST = buildFruitEffect(Effects.HEALTH_BOOST);
	public static Food FRUIT_ABSORPTION = buildFruitEffect(Effects.ABSORPTION);
	public static Food FRUIT_SATURATION = buildFruitEffect(Effects.SATURATION);
	public static Food FRUIT_GLOWING = buildFruitEffect(Effects.GLOWING);
	public static Food FRUIT_LEVITATION = buildFruitEffect(Effects.LEVITATION);
	public static Food FRUIT_LUCK = buildFruitEffect(Effects.LUCK);
	public static Food FRUIT_UNLUCK = buildFruitEffect(Effects.UNLUCK);
	public static Food FRUIT_SLOW_FALLING = buildFruitEffect(Effects.SLOW_FALLING);
	public static Food FRUIT_CONDUIT_POWER = buildFruitEffect(Effects.CONDUIT_POWER, 0, 500);
	public static Food FRUIT_DOLPHINS_GRACE = buildFruitEffect(Effects.DOLPHINS_GRACE, 0, 500);
	public static Food FRUIT_BAD_OMEN = buildFruitEffect(Effects.BAD_OMEN);
	
	private static Food buildFruitEffect(Effect effect) {
		return (new Food.Builder()).hunger(2).saturation(0.3F).effect(new EffectInstance(effect, FruitEffectDuration, FruitEffectAmplifier), 1.0F).setAlwaysEdible().build();
	}
	
	private static Food buildFruitEffect(Effect effect, int duration, int amplifier) {
		return (new Food.Builder()).hunger(2).saturation(0.3F).effect(new EffectInstance(effect, duration, amplifier), 1.0F).setAlwaysEdible().build();
	}
}
