package com.croparia.mod.compat.jei;

import java.util.List;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.core.init.BlockInit;
import com.croparia.mod.core.init.ItemInit;
import com.croparia.mod.core.util.recipes.InfusorRecipe;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.gui.ingredient.IGuiItemStackGroup;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class InfusorCategory implements IRecipeCategory<InfusorRecipe>{

	public static final ResourceLocation UID = new ResourceLocation(CropariaMod.mod_id, "infusor");
    private static final ResourceLocation TEXTURE = new ResourceLocation(CropariaMod.mod_id, "textures/gui/jei/infusor.png");
    private final IDrawable background;
    private final IDrawable icon;
	
    public InfusorCategory(IGuiHelper helper) {
		this.background = helper.createDrawable(TEXTURE, 0, 0, 101, 44);
		this.icon = helper.createDrawableIngredient(new ItemStack(BlockInit.INFUSOR.get()));
    }
    
	@Override
	public ResourceLocation getUid() {
		return UID;
	}

	@Override
	public Class<? extends InfusorRecipe> getRecipeClass() {
		return InfusorRecipe.class;
	}

	@Override
	public String getTitle() {
		return "Infusor";
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
	public void setIngredients(InfusorRecipe recipe, IIngredients ingredients) 
	{
		ingredients.setOutput(VanillaTypes.ITEM, recipe.getRecipeOutput());
        ingredients.setInputIngredients(recipe.getIngredients());
	}

	@Override
	public void setRecipe(IRecipeLayout recipeLayout, InfusorRecipe recipe, IIngredients ingredients) 
	{
	 	IGuiItemStackGroup stacks = recipeLayout.getItemStacks();
        List<List<ItemStack>> inputs = ingredients.getInputs(VanillaTypes.ITEM);
        List<List<ItemStack>> outputs = ingredients.getOutputs(VanillaTypes.ITEM);

        stacks.init(0, true, 26, 0);
        stacks.init(1, true, 0, 26);
        stacks.init(2, true, 26, 26);

        stacks.init(3, false, 84, 26);
        
        stacks.set(0, inputs.get(0));
        stacks.set(1, new ItemStack(ItemInit.getPotionFromElement(recipe.getElement())));
        stacks.set(2, new ItemStack(BlockInit.INFUSOR.get()));
        
        stacks.set(3, outputs.get(0));
	}

}
