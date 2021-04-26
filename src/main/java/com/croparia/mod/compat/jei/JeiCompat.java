package com.croparia.mod.compat.jei;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.core.init.BlockInit;
import com.croparia.mod.core.util.recipes.InfusorRecipe;
import com.croparia.mod.core.util.recipes.RitualRecipe;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

@JeiPlugin
public class JeiCompat implements IModPlugin{

	public static final ResourceLocation UID = new ResourceLocation(CropariaMod.mod_id, "jei_plugin");
	
	@Override
	public ResourceLocation getPluginUid() 
	{
		return UID;
	}
	
	@Override
	public void registerCategories(IRecipeCategoryRegistration registration) 
	{
		 IGuiHelper guiHelper = registration.getJeiHelpers().getGuiHelper();
		 registration.addRecipeCategories(
	                new RitualCategory(guiHelper),
	                new InfusorCategory(guiHelper)
	        );
	}
	
	@Override
	public void registerRecipeCatalysts(IRecipeCatalystRegistration registration)
	{
		registration.addRecipeCatalyst(new ItemStack(BlockInit.RITUAL_STAND.get()), RitualCategory.UID);
	}
	
	 @Override
	public void registerRecipes(IRecipeRegistration registration) 
	{
		 ClientWorld world = Minecraft.getInstance().world;
	        if (world != null) {
	            registration.addRecipes(RitualRecipe.recipes, RitualCategory.UID);
	            registration.addRecipes(InfusorRecipe.recipes, InfusorCategory.UID);
	        }
	}

}
