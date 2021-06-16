package com.croparia.mod.data.recipes;

import java.util.function.Consumer;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.core.init.Crops;
import com.croparia.mod.core.init.CropsInit;
import com.croparia.mod.core.init.ItemInit;

import net.minecraft.block.Blocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

	  public ModRecipeProvider(DataGenerator generatorIn) {
	    super(generatorIn);
	  }

	  @Override
	  protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		  CropsInit.crops.forEach(crop -> {
			  System.out.println(crop.getName());
			  if(crop.getIngredient() != null) {
				  System.out.println("ok");
				  ShapedRecipeBuilder.shapedRecipe(crop.getSeeds().get())
			      .key('M', crop.getIngredient())
			      .key('S', ItemInit.getCropariaItemByTier(crop.getTier()))
			      .key('P', Tags.Items.SEEDS)
			      .patternLine("MPM")
			      .patternLine("PSP")
			      .patternLine("MPM")
			      .addCriterion("has_" + crop.getName() + "_ingredient", hasItem(crop.getIngredient()))
			      .build(consumer, location("seed_crop_" + crop.getName()));
			  }
		  }); 
	  }

	  private static ResourceLocation location(String id) {
	    return new ResourceLocation(CropariaMod.mod_id, id);
	  }
	}