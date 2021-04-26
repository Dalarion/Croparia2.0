package com.croparia.mod.core.util.recipes;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.crafting.IRecipe;

public interface IRitualRecipe extends IRecipe<IInventory> {
    @SuppressWarnings("unchecked")
	default <T extends IRitualRecipe> T cast() {
        return (T) this;
    }
}