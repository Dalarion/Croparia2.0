package com.croparia.mod.core.util;

import com.croparia.mod.core.init.ItemInit;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;
import net.minecraftforge.common.brewing.IBrewingRecipe;

public class ModPotionBrewing implements IBrewingRecipe{

	private final Item input;
	private final Item ingredient;
	private final ItemStack output;
	
	public static void addBrewingRecipe() 
	{
		BrewingRecipeRegistry.addRecipe(new ModPotionBrewing(Items.GLASS_BOTTLE, ItemInit.ELEMATILIUS.get(), ItemInit.POTION_ELEMATILIUS.get()));
		BrewingRecipeRegistry.addRecipe(new ModPotionBrewing(Items.DRAGON_BREATH, ItemInit.ELEMENTAL_WATER.get(), ItemInit.POTION_WATER.get()));
		BrewingRecipeRegistry.addRecipe(new ModPotionBrewing(Items.DRAGON_BREATH, ItemInit.ELEMENTAL_FIRE.get(), ItemInit.POTION_FIRE.get()));
		BrewingRecipeRegistry.addRecipe(new ModPotionBrewing(Items.DRAGON_BREATH, ItemInit.ELEMENTAL_EARTH.get(), ItemInit.POTION_EARTH.get()));
		BrewingRecipeRegistry.addRecipe(new ModPotionBrewing(Items.DRAGON_BREATH, ItemInit.ELEMENTAL_AIR.get(), ItemInit.POTION_AIR.get()));
	}

	public ModPotionBrewing(Item input, Item ingredient, Item output) {
		this.input = input;
		this.ingredient = ingredient;
		this.output = new ItemStack(output);
	}

	@Override
	public boolean isInput(ItemStack input) {
		return input.getItem().equals(this.input);
	}

	@Override
	public boolean isIngredient(ItemStack ingredient) {
		return ingredient.getItem().equals(this.ingredient);
	}

	@Override
	public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
		if(this.isInput(input) && isIngredient(ingredient)) {
			return this.output.copy();
		}
		else {
			return ItemStack.EMPTY;
		}
	}
}
