package com.croparia.mod.core.util;

import com.croparia.mod.core.init.ItemInit;
import com.croparia.mod.core.util.dispenser.InfusorDispenserBehavior;
import com.croparia.mod.core.util.dispenser.KnifeDispenserBehavior;

import net.minecraft.block.DispenserBlock;
import net.minecraft.item.Items;

public class ModDispenserBehavior {
	public static void registerBehavior() {
		DispenserBlock.registerDispenseBehavior(Items.GLASS_BOTTLE.asItem(), new InfusorDispenserBehavior());
    	DispenserBlock.registerDispenseBehavior(ItemInit.POTION_ELEMATILIUS.get().asItem(), new InfusorDispenserBehavior());
    	DispenserBlock.registerDispenseBehavior(ItemInit.POTION_WATER.get().asItem(), new InfusorDispenserBehavior());
    	DispenserBlock.registerDispenseBehavior(ItemInit.POTION_FIRE.get().asItem(), new InfusorDispenserBehavior());
    	DispenserBlock.registerDispenseBehavior(ItemInit.POTION_EARTH.get().asItem(), new InfusorDispenserBehavior());
    	DispenserBlock.registerDispenseBehavior(ItemInit.POTION_AIR.get().asItem(), new InfusorDispenserBehavior());

		DispenserBlock.registerDispenseBehavior(ItemInit.WOOD_KNIFE.get().asItem(), new KnifeDispenserBehavior());
		DispenserBlock.registerDispenseBehavior(ItemInit.STONE_KNIFE.get().asItem(), new KnifeDispenserBehavior());
		DispenserBlock.registerDispenseBehavior(ItemInit.IRON_KNIFE.get().asItem(), new KnifeDispenserBehavior());
		DispenserBlock.registerDispenseBehavior(ItemInit.GOLD_KNIFE.get().asItem(), new KnifeDispenserBehavior());
		DispenserBlock.registerDispenseBehavior(ItemInit.DIAMOND_KNIFE.get().asItem(), new KnifeDispenserBehavior());
		DispenserBlock.registerDispenseBehavior(ItemInit.OBSIDIAN_KNIFE.get().asItem(), new KnifeDispenserBehavior());
		DispenserBlock.registerDispenseBehavior(ItemInit.RENFORCED_KNIFE.get().asItem(), new KnifeDispenserBehavior());
		DispenserBlock.registerDispenseBehavior(ItemInit.NETHERITE_KNIFE.get().asItem(), new KnifeDispenserBehavior());
    	
	}
}
