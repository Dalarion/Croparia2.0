package com.croparia.mod.data.recipes;

import java.util.function.Consumer;

import com.croparia.mod.core.init.CropsInit;
import com.croparia.mod.core.init.ItemInit;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraftforge.common.Tags.Items;

public class ModRecipeProvider extends RecipeProvider{

	public ModRecipeProvider(DataGenerator generatorIn) {
		super(generatorIn);
	}
	
	@Override
	public String getName() {
		return "Croparia - Recipes";
	}
	
	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		CropsInit.crops.forEach(crop -> {
			System.out.println(crop.getName());
			if(crop.getName() == CropsInit.ELEMENTAL.getName()) {
				ShapedRecipeBuilder.shapedRecipe(crop.getSeeds().get())
				.key('C', ItemInit.getCropariaItemByTier(crop.getTier()))
				.key('S', Items.SEEDS)
				.key('I', ItemInit.ELEMATILIUS.get())
				.patternLine("ISI")
				.patternLine("SCS")
				.patternLine("ISI")
				.addCriterion("has_item", hasItem(crop.getSeeds().get()))
				.build(consumer);
				
				ShapelessRecipeBuilder.shapelessRecipe(crop.getIngredient())
				.addIngredient(crop.getFruit().get())
				.addCriterion("has_item", hasItem(crop.getFruit().get()))
				.build(consumer);
			}
			else {
				ShapedRecipeBuilder.shapedRecipe(crop.getSeeds().get())
				.key('C', ItemInit.getCropariaItemByTier(crop.getTier()))
				.key('S', Items.SEEDS)
				.key('I', crop.getIngredient())
				.patternLine("ISI")
				.patternLine("SCS")
				.patternLine("ISI")
				.addCriterion("has_item", hasItem(crop.getSeeds().get()))
				.build(consumer);
				
				ShapelessRecipeBuilder.shapelessRecipe(crop.getIngredient())
				.addIngredient(crop.getFruit().get())
				.addCriterion("has_item", hasItem(crop.getFruit().get()))
				.build(consumer);
			}
		});
	}
}
