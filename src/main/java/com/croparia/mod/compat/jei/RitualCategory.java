package com.croparia.mod.compat.jei;

import java.util.List;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.core.init.BlockInit;
import com.croparia.mod.core.init.ItemInit;
import com.croparia.mod.core.util.recipes.RitualRecipe;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class RitualCategory implements IRecipeCategory<RitualRecipe>{

	public static final ResourceLocation UID = new ResourceLocation(CropariaMod.mod_id, "ritual");
    private static final ResourceLocation TEXTURE = new ResourceLocation(CropariaMod.mod_id, "textures/gui/jei/ritual.png");
    private final IDrawable background;
    private final IDrawable icon;
	
    public RitualCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 144, 81);
		this.icon = helper.createDrawableIngredient(new ItemStack(BlockInit.RITUAL_STAND.get()));
    }
    
	@Override
	public ResourceLocation getUid() {
		return UID;
	}

	@Override
	public Class<? extends RitualRecipe> getRecipeClass() {
		return RitualRecipe.class;
	}

	@Override
	public String getTitle() {
		return "Ritual Tier 1";
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}

	@Override
	public IDrawable getIcon() {
		return icon;
	}

	@Override
	public void setIngredients(RitualRecipe recipe, IIngredients ingredients) 
	{
		ingredients.setOutput(VanillaTypes.ITEM, recipe.getRecipeOutput());
        ingredients.setInputIngredients(recipe.getIngredients());
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, RitualRecipe recipe, IIngredients ingredients) 
	{
	 	IGuiItemStackGroup stacks = recipeLayout.getItemStacks();
        List<List<ItemStack>> inputs = ingredients.getInputs(VanillaTypes.ITEM);
        List<List<ItemStack>> outputs = ingredients.getOutputs(VanillaTypes.ITEM);

        stacks.init(0, true, 32, 6);
        stacks.init(1, true, 32, 32);
        stacks.init(2, true, 6, 58);
        stacks.init(3, true, 58, 58);
        stacks.init(4, true, 103, 6);

        stacks.init(5, false, 114, 32);
        
        stacks.set(0, inputs.get(0));
        stacks.set(1, new ItemStack(BlockInit.RITUAL_STAND.get()));
        stacks.set(2, recipe.getBlockNeed());
        stacks.set(3, recipe.getBlockNeed());
        
        stacks.set(4, new ItemStack(ItemInit.getTierIconFromRitualTier(recipe.getRitualTier())));
        stacks.set(5, outputs.get(0));
	}

}
