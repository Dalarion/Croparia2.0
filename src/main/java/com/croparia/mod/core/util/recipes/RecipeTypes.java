package com.croparia.mod.core.util.recipes;

import java.util.Optional;

import com.croparia.mod.CropariaMod;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class RecipeTypes {
	
	public static final IRecipeType<IRitualRecipe> RITUAL = new IRecipeType<IRitualRecipe>() {
        @Override
        public <C extends IInventory> Optional<IRitualRecipe> matches(IRecipe<C> recipe, World world, C inv) {
            return recipe.matches(inv, world) ? Optional.of((IRitualRecipe) recipe) : Optional.empty();
        }
    };
    public static final IRecipeType<IInfusorRecipe> INFUSOR = new IRecipeType<IInfusorRecipe>() {
        @Override
        public <C extends IInventory> Optional<IInfusorRecipe> matches(IRecipe<C> recipe, World world, C inv) {
            return recipe.matches(inv, world) ? Optional.of((IInfusorRecipe) recipe) : Optional.empty();
        }
    };

    static {
        Registry.register(Registry.RECIPE_TYPE, new ResourceLocation(CropariaMod.mod_id, "ritual"), RITUAL);
        Registry.register(Registry.RECIPE_TYPE, new ResourceLocation(CropariaMod.mod_id, "infusor"), INFUSOR);
    }
}
