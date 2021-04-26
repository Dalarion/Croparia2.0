package com.croparia.mod.core.util;

import com.croparia.mod.core.init.BlockInit;
import com.croparia.mod.core.init.ItemInit;
import com.croparia.mod.core.util.recipes.InfusorRecipe;
import com.croparia.mod.core.util.recipes.RitualRecipe;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ModRecipesRegistry {
	
	public static void registerInfusorRecipe() 
	{
		InfusorRecipe.addRecipe("elemental_stone", Items.STONE, ElementsEnum.ELEMENTAL, ItemInit.ELEMENTAL_STONE.get());
		
		InfusorRecipe.addRecipe("croparia2", ItemInit.CROPARIA.get(), ElementsEnum.ELEMENTAL, ItemInit.CROPARIA2.get());
		InfusorRecipe.addRecipe("croparia3", ItemInit.CROPARIA2.get(), ElementsEnum.ELEMENTAL, ItemInit.CROPARIA3.get());
		InfusorRecipe.addRecipe("croparia4", ItemInit.CROPARIA3.get(), ElementsEnum.ELEMENTAL, ItemInit.CROPARIA4.get());
		InfusorRecipe.addRecipe("croparia5", ItemInit.CROPARIA4.get(), ElementsEnum.ELEMENTAL, ItemInit.CROPARIA5.get());
		InfusorRecipe.addRecipe("croparia6", ItemInit.CROPARIA5.get(), ElementsEnum.ELEMENTAL, ItemInit.CROPARIA6.get());
		InfusorRecipe.addRecipe("croparia7", ItemInit.CROPARIA6.get(), ElementsEnum.ELEMENTAL, ItemInit.CROPARIA7.get());
		
		InfusorRecipe.addRecipe("elemental_seed1", Items.BEETROOT_SEEDS, ElementsEnum.ELEMENTAL, ItemInit.ELEMENTAL_SEED.get());
		InfusorRecipe.addRecipe("elemental_seed2", Items.WHEAT_SEEDS, ElementsEnum.ELEMENTAL, ItemInit.ELEMENTAL_SEED.get());
	
		InfusorRecipe.addRecipe("iron_seed", ItemInit.COAL_SEED.get(), ElementsEnum.ELEMENTAL, ItemInit.IRON_SEED.get());
		InfusorRecipe.addRecipe("gold_seed", ItemInit.IRON_SEED.get(), ElementsEnum.ELEMENTAL, ItemInit.GOLD_SEED.get());
		InfusorRecipe.addRecipe("redstone_seed", ItemInit.GOLD_SEED.get(), ElementsEnum.ELEMENTAL, ItemInit.REDSTONE_SEED.get());
		InfusorRecipe.addRecipe("lapis_seed", ItemInit.REDSTONE_SEED.get(), ElementsEnum.ELEMENTAL, ItemInit.LAPIS_SEED.get());
		InfusorRecipe.addRecipe("diamond_seed", ItemInit .LAPIS_SEED.get(), ElementsEnum.ELEMENTAL, ItemInit.DIAMOND_SEED.get());
		InfusorRecipe.addRecipe("emerald_seed", ItemInit .DIAMOND_SEED.get(), ElementsEnum.ELEMENTAL, ItemInit.EMERALD_SEED.get());

		InfusorRecipe.addRecipe("elemental_water", Items.PRISMARINE, ElementsEnum.ELEMENTAL, ItemInit.ELEMENTAL_WATER.get());
		InfusorRecipe.addRecipe("elemental_fire", Items.MAGMA_BLOCK, ElementsEnum.ELEMENTAL, ItemInit.ELEMENTAL_FIRE.get());
		InfusorRecipe.addRecipe("elemental_earth", Items.PODZOL, ElementsEnum.ELEMENTAL, ItemInit.ELEMENTAL_EARTH.get());
		InfusorRecipe.addRecipe("elemental_air", Items.END_STONE, ElementsEnum.ELEMENTAL, ItemInit.ELEMENTAL_AIR.get());

		InfusorRecipe.addRecipe("water_chest", ItemInit .RENFORCED_CHEST.get(), ElementsEnum.WATER, ItemInit.WATER_CHEST.get());
		InfusorRecipe.addRecipe("water_helm", ItemInit .RENFORCED_HELMET.get(), ElementsEnum.WATER, ItemInit.WATER_HELMET.get());
		InfusorRecipe.addRecipe("water_legs", ItemInit .RENFORCED_LEGS.get(), ElementsEnum.WATER, ItemInit.WATER_LEGS.get());
		InfusorRecipe.addRecipe("water_feet", ItemInit .RENFORCED_FEET.get(), ElementsEnum.WATER, ItemInit.WATER_FEET.get());
		InfusorRecipe.addRecipe("water_axe", ItemInit .RENFORCED_AXE.get(), ElementsEnum.WATER, ItemInit.WATER_AXE.get());
		InfusorRecipe.addRecipe("water_pickaxe", ItemInit .RENFORCED_PICKAXE.get(), ElementsEnum.WATER, ItemInit.WATER_PICKAXE.get());
		InfusorRecipe.addRecipe("water_shovel", ItemInit .RENFORCED_SHOVEL.get(), ElementsEnum.WATER, ItemInit.WATER_SHOVEL.get());
		InfusorRecipe.addRecipe("water_sword", ItemInit .RENFORCED_SWORD.get(), ElementsEnum.WATER, ItemInit.WATER_SWORD.get());
		InfusorRecipe.addRecipe("water_hoe", ItemInit .RENFORCED_HOE.get(), ElementsEnum.WATER, ItemInit.WATER_HOE.get());

		InfusorRecipe.addRecipe("fire_chest", ItemInit .RENFORCED_CHEST.get(), ElementsEnum.FIRE, ItemInit.FIRE_CHEST.get());
		InfusorRecipe.addRecipe("fire_helm", ItemInit .RENFORCED_HELMET.get(), ElementsEnum.FIRE, ItemInit.FIRE_HELMET.get());
		InfusorRecipe.addRecipe("fire_legs", ItemInit .RENFORCED_LEGS.get(), ElementsEnum.FIRE, ItemInit.FIRE_LEGS.get());
		InfusorRecipe.addRecipe("fire_feet", ItemInit .RENFORCED_FEET.get(), ElementsEnum.FIRE, ItemInit.FIRE_FEET.get());
		InfusorRecipe.addRecipe("fire_axe", ItemInit .RENFORCED_AXE.get(), ElementsEnum.FIRE, ItemInit.FIRE_AXE.get());
		InfusorRecipe.addRecipe("fire_pickaxe", ItemInit .RENFORCED_PICKAXE.get(), ElementsEnum.FIRE, ItemInit.FIRE_PICKAXE.get());
		InfusorRecipe.addRecipe("fire_shovel", ItemInit .RENFORCED_SHOVEL.get(), ElementsEnum.FIRE, ItemInit.FIRE_SHOVEL.get());
		InfusorRecipe.addRecipe("fire_sword", ItemInit .RENFORCED_SWORD.get(), ElementsEnum.FIRE, ItemInit.FIRE_SWORD.get());
		InfusorRecipe.addRecipe("fire_hoe", ItemInit .RENFORCED_HOE.get(), ElementsEnum.FIRE, ItemInit.FIRE_HOE.get());

		InfusorRecipe.addRecipe("earth_chest", ItemInit .RENFORCED_CHEST.get(), ElementsEnum.EARTH, ItemInit.EARTH_CHEST.get());
		InfusorRecipe.addRecipe("earth_helm", ItemInit .RENFORCED_HELMET.get(), ElementsEnum.EARTH, ItemInit.EARTH_HELMET.get());
		InfusorRecipe.addRecipe("earth_legs", ItemInit .RENFORCED_LEGS.get(), ElementsEnum.EARTH, ItemInit.EARTH_LEGS.get());
		InfusorRecipe.addRecipe("earth_feet", ItemInit .RENFORCED_FEET.get(), ElementsEnum.EARTH, ItemInit.EARTH_FEET.get());
		InfusorRecipe.addRecipe("earth_axe", ItemInit .RENFORCED_AXE.get(), ElementsEnum.EARTH, ItemInit.EARTH_AXE.get());
		InfusorRecipe.addRecipe("earth_pickaxe", ItemInit .RENFORCED_PICKAXE.get(), ElementsEnum.EARTH, ItemInit.EARTH_PICKAXE.get());
		InfusorRecipe.addRecipe("earth_shovel", ItemInit .RENFORCED_SHOVEL.get(), ElementsEnum.EARTH, ItemInit.EARTH_SHOVEL.get());
		InfusorRecipe.addRecipe("earth_sword", ItemInit .RENFORCED_SWORD.get(), ElementsEnum.EARTH, ItemInit.EARTH_SWORD.get());
		InfusorRecipe.addRecipe("earth_hoe", ItemInit .RENFORCED_HOE.get(), ElementsEnum.EARTH, ItemInit.EARTH_HOE.get());

		InfusorRecipe.addRecipe("air_chest", ItemInit .RENFORCED_CHEST.get(), ElementsEnum.AIR, ItemInit.AIR_CHEST.get());
		InfusorRecipe.addRecipe("air_helm", ItemInit .RENFORCED_HELMET.get(), ElementsEnum.AIR, ItemInit.AIR_HELMET.get());
		InfusorRecipe.addRecipe("air_legs", ItemInit .RENFORCED_LEGS.get(), ElementsEnum.AIR, ItemInit.AIR_LEGS.get());
		InfusorRecipe.addRecipe("air_feet", ItemInit .RENFORCED_FEET.get(), ElementsEnum.AIR, ItemInit.AIR_FEET.get());
		InfusorRecipe.addRecipe("air_axe", ItemInit .RENFORCED_AXE.get(), ElementsEnum.AIR, ItemInit.AIR_AXE.get());
		InfusorRecipe.addRecipe("air_pickaxe", ItemInit .RENFORCED_PICKAXE.get(), ElementsEnum.AIR, ItemInit.AIR_PICKAXE.get());
		InfusorRecipe.addRecipe("air_shovel", ItemInit .RENFORCED_SHOVEL.get(), ElementsEnum.AIR, ItemInit.AIR_SHOVEL.get());
		InfusorRecipe.addRecipe("air_sword", ItemInit .RENFORCED_SWORD.get(), ElementsEnum.AIR, ItemInit.AIR_SWORD.get());
		InfusorRecipe.addRecipe("air_hoe", ItemInit .RENFORCED_HOE.get(), ElementsEnum.AIR, ItemInit.AIR_HOE.get());
	}
	
	public static void registerRitualRecipe() 
	{	
		RitualRecipe.addRecipe("midas", Items.STICK, Blocks.GOLD_BLOCK.getDefaultState(), ItemInit.MIDAS_HAND.get(), 1);
		RitualRecipe.addRecipe("horn_plenty", Items.SPRUCE_LOG, Blocks.NETHER_WART_BLOCK.getDefaultState(), ItemInit.HORN_PLENTY.get(), 1);
		RitualRecipe.addRecipe("infinite_apple", Items.GOLDEN_APPLE, Blocks.NETHER_WART_BLOCK.getDefaultState(), ItemInit.INFINITE_APPLE.get(), 1);
		
		RitualRecipe.addRecipe("accelerator", Items.CLOCK, BlockInit.ELEMENTAL_STONE.get().getDefaultState(), ItemInit.ACCELERATOR.get(), 2);
		RitualRecipe.addRecipe("elemental_time", ItemInit.ELEMATILIUS.get(), BlockInit.ACCELERATOR.get().getDefaultState(), ItemInit.ELEMENTAL_TIME.get(), 2);
	}
}
