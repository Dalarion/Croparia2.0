package com.croparia.mod.core.util.recipes;

import java.util.ArrayList;
import java.util.List;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.core.rituals.FirstRitual;
import com.croparia.mod.core.rituals.RitualUtils;
import com.croparia.mod.core.rituals.SecondRitual;

import net.minecraft.block.BlockState;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.item.crafting.IRecipeType;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RitualRecipe implements IRitualRecipe{

	public static List<RitualRecipe> recipes = new ArrayList<RitualRecipe>();
	
	private final Item base;
	private final BlockState blockNeed;
	private final ItemStack result;
	private final int ritualTier;
	private final ResourceLocation id;
	
	public RitualRecipe(ResourceLocation id, Item base, BlockState blockNeed, ItemStack result, int ritualTier) {
	      this.base = base;
	      this.blockNeed = blockNeed;
	      this.result = result;
	      this.ritualTier = ritualTier;
	      this.id = id;
	}
	
	public static void craft(ItemStack input, World world, BlockPos pos) {
		boolean ret = false;
		int index = 0;
		while(ret == false && index < recipes.size()) {
			if(recipes.get(index).base == input.getItem()) {
				switch(recipes.get(index).ritualTier) {
					case 1 : {
						if(FirstRitual.checkRitual(recipes.get(index).blockNeed, world, pos, false)) {
							ret = true;
						}
						break;
					}
					case 2 : {
						if(SecondRitual.checkRitual(recipes.get(index).blockNeed, world, pos, false)) {
						ret = true;
						}
						break;
					}
				}
			}
			if(!ret) {
				index++;
			}
		}
		
		if(ret){
			RitualUtils.endFirst(recipes.get(index).result, input, pos, world);
		}
	}
	
	public static void addRecipe(String id, Item input, BlockState blockNeed, Item output, int ritualTier) {
		recipes.add(new RitualRecipe(new ResourceLocation(CropariaMod.mod_id + id), input, blockNeed, new ItemStack(output), ritualTier));
	}
	
	public static void addRecipe(String id, Item input, BlockState blockNeed, ItemStack output, int ritualTier) {
		recipes.add(new RitualRecipe(new ResourceLocation(CropariaMod.mod_id + id), input, blockNeed, output, ritualTier));
	}

	@Override
	public ItemStack getRecipeOutput() {
		return this.result;
	}
	
	public ItemStack getBlockNeed() {
		return new ItemStack(this.blockNeed.getBlock());
	}
	
	public int getRitualTier() {
		return this.ritualTier;
	}
	
	@Override
	public NonNullList<Ingredient> getIngredients() 
	{
		NonNullList<Ingredient> list = NonNullList.create();
		list.add(Ingredient.fromItems(this.base));
		return list;
	}

	@Override
	public boolean matches(IInventory inv, World worldIn) 
	{
		return true;
	}

	@Override
	public ItemStack getCraftingResult(IInventory inv) 
	{
		return this.result.copy();
	}

	@Override
	public boolean canFit(int width, int height) 
	{
		return true;
	}

	@Override
	public ResourceLocation getId() 
	{
		return id;
	}

	@Override
	public IRecipeSerializer<?> getSerializer() 
	{
		return null;
	}

	@Override
	public IRecipeType<?> getType() 
	{
		return RecipeTypes.RITUAL;
	}

}
