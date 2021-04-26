package com.croparia.mod.core.util.recipes;

import java.util.ArrayList;
import java.util.List;

import com.croparia.mod.common.blocks.BlockInfusor;
import com.croparia.mod.core.init.BlockInit;
import com.croparia.mod.core.util.ElementsEnum;

import net.minecraft.entity.item.ItemEntity;
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

public class InfusorRecipe implements IRitualRecipe{

	public static List<InfusorRecipe> recipes = new ArrayList<InfusorRecipe>();
	
	private final Item base;
	private final ElementsEnum type;
	private final ItemStack result;
	private final ResourceLocation id;
	
	public InfusorRecipe(ResourceLocation id, Item base, ElementsEnum type, ItemStack result) {
	      this.base = base;
	      this.type = type;
	      this.result = result;
	      this.id = id;
	}
	
	public static void craft(ItemStack input, World world, BlockPos pos) {
		boolean ret = false;
		int index = 0;
		while(ret == false && index < recipes.size()) {
			if(recipes.get(index).base == input.getItem() && world.getBlockState(pos).get(BlockInfusor.TYPE) == recipes.get(index).type) {
				ret = true;
			}
			else{
				index++;
			}
		}
		if(ret){
			world.addEntity(new ItemEntity(world, pos.getX() + 0.5, pos.getY() + 0.5, pos.getZ() + 0.5, recipes.get(index).result));
			world.setBlockState(pos, BlockInit.INFUSOR.get().getDefaultState().with(BlockInfusor.TYPE, ElementsEnum.EMPTY));
			input.shrink(1);
		}
	}
	
	public static void addRecipe(String id, Item input, ElementsEnum type, Item output) {
		recipes.add(new InfusorRecipe(new ResourceLocation(id), input, type, new ItemStack(output)));
	}
	
	public static void addRecipe(String id, Item input, ElementsEnum type, ItemStack output) {
		recipes.add(new InfusorRecipe(new ResourceLocation(id), input, type, output));
	}

	@Override
	public ItemStack getRecipeOutput() {
		return this.result;
	}
	
	public ElementsEnum getElement() {
		return this.type;
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
	public IRecipeType<?> getType() {
		return RecipeTypes.INFUSOR;
	}
}
