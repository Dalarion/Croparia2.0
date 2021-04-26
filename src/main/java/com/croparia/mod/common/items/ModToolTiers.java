package com.croparia.mod.common.items;

import java.util.function.Supplier;

import com.croparia.mod.core.init.ItemInit;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.LazyValue;

public enum ModToolTiers implements IItemTier
{
    OBSIDIAN(3, 3000, 12.0f, 5.0f, 12, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)Items.OBSIDIAN })), 
    RENFORCED(3, 6000, 24.0f, 10.0f, 24, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)Items.DIAMOND })), 
    WATER(3, 7500, 27.0f, 15.0f, 27, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)ItemInit.ELEMENTAL_WATER.get()})), 
   	FIRE(3, 7500, 27.0f, 15.0f, 27, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)ItemInit.ELEMENTAL_FIRE.get()})), 
    EARTH(3, 7500, 27.0f, 15.0f, 27, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)ItemInit.ELEMENTAL_EARTH.get()})), 
    AIR(3, 7500, 27.0f, 15.0f, 27, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)ItemInit.ELEMENTAL_AIR.get()})), 
  	WOOD_MULTI(0, 236, 2.0f, 0.0f, 15, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)Items.OAK_PLANKS })), 
    STONE_MULTI(1, 524, 4.0f, 1.0f, 5, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)Items.STONE })), 
    IRON_MULTI(2, 1000, 6.0f, 2.0f, 14, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)Items.IRON_BLOCK })), 
    GOLD_MULTI(2, 128, 12.0f, 0.0f, 22, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)Items.GOLD_BLOCK })), 
    DIAMOND_MULTI(3, 6244, 8.0f, 3.0f, 10, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)Items.DIAMOND })), 
    NETHERITE_MULTI(3, 9000, 10.0f, 4.0f, 11, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)Items.NETHERITE_INGOT })), 
    OBSIDIAN_MULTI(3, 12000, 12.0f, 5.0f, 12, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)Items.OBSIDIAN })), 
    RENFORCED_MULTI(3, 24000, 24.0f, 10.0f, 24, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)Items.DIAMOND })),
    ELEMENTAL_MULTI(3, 30000, 48.0f, 15.0f, 32, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)ItemInit.ELEMATILIUS.get()}));
    
    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;
    
    private ModToolTiers(final int harvestLevelIn, final int maxUsesIn, final float efficiencyIn, final float attackDamageIn, final int enchantabilityIn, final Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = (LazyValue<Ingredient>)new LazyValue((Supplier)repairMaterialIn);
    }

	@Override
	public int getMaxUses() {
		return maxUses;
	}

	@Override
	public float getEfficiency() {
		return efficiency;
	}

	@Override
	public float getAttackDamage() {
		return attackDamage;
	}

	@Override
	public int getHarvestLevel() {
		return harvestLevel;
	}

	@Override
	public int getEnchantability() {
		return enchantability;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return (Ingredient)this.repairMaterial.getValue();
	}
}