package com.croparia.mod.common.items;

import java.util.function.Supplier;

import com.croparia.mod.core.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public enum ModArmorMaterial implements IArmorMaterial{
	
	OBSIDIAN("obsidian", 40, new int[] { 5, 8, 10, 5 }, 12, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)Items.OBSIDIAN})), 
    RENFORCED("renforced", 80, new int[] { 10, 16, 20, 10 }, 24, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0f, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)Items.DIAMOND })),
    WATER("elemental", 120, new int[] { 15, 24, 30, 15 }, 36, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 6.0f, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)ItemInit.ELEMENTAL_WATER.get() })), 
    EARTH("elemental", 120, new int[] { 15, 24, 30, 15 }, 36, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 6.0f, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)ItemInit.ELEMENTAL_EARTH.get() })), 
    FIRE("elemental", 120, new int[] { 15, 24, 30, 15 }, 36, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 6.0f, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)ItemInit.ELEMENTAL_FIRE.get() })), 
    AIR("elemental", 120, new int[] { 15, 24, 30, 15 }, 36, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 6.0f, () -> Ingredient.fromItems(new IItemProvider[] { (IItemProvider)ItemInit.ELEMENTAL_AIR.get() }));
   
    private static final int[] MAX_DAMAGE_ARRAY = new int[] { 13, 15, 16, 11 };
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final LazyValue<Ingredient> repairMaterial;
    
    private ModArmorMaterial(final String nameIn, final int maxDamageFactorIn, final int[] damageReductionAmountsIn, final int enchantabilityIn, final SoundEvent equipSoundIn, final float p_i48533_8_, final Supplier<Ingredient> repairMaterialSupplier) {
        this.name = nameIn;
        this.maxDamageFactor = maxDamageFactorIn;
        this.damageReductionAmountArray = damageReductionAmountsIn;
        this.enchantability = enchantabilityIn;
        this.soundEvent = equipSoundIn;
        this.toughness = p_i48533_8_;
        this.repairMaterial = (LazyValue<Ingredient>)new LazyValue((Supplier)repairMaterialSupplier);
    }

	@Override
	public int getDurability(EquipmentSlotType slotIn) {
		return ModArmorMaterial.MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		return damageReductionAmountArray[slotIn.getIndex()];
	}

	@Override
	public int getEnchantability() {
		return enchantability;
	}

	@Override
	public SoundEvent getSoundEvent() {
		return soundEvent;
	}

	@Override
	public Ingredient getRepairMaterial() {
		return (Ingredient)repairMaterial.getValue();
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public float getToughness() {
		return toughness;
	}

	@Override
	public float getKnockbackResistance() {
		return 0;
	}
}
