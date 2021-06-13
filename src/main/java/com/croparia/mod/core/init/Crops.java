package com.croparia.mod.core.init;

import com.croparia.mod.common.blocks.CropariaCrops;

import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class Crops {

	private String name;
	private String type;
	private RegistryObject<CropariaCrops> crop;
	private RegistryObject<BlockNamedItem> seeds;
	private RegistryObject<Item> fruit;
	private Item ingredient;
	private Food food;
	private int tier;
	
	public Crops(String name, int tier, Food food, Item ingredient, String type) {
		this.name = name;
		this.tier = tier;
		this.food = food;
		this.ingredient = ingredient;
		this.type = type;
	}
	
	public Crops(String name, int tier, Food food, String type) {
		this.name = name;
		this.tier = tier;
		this.food = food;
		this.ingredient = null;
		this.type = type;
	}
	
	public Crops(String name, int tier, Food food, Item ingredient) {
		this.name = name;
		this.tier = tier;
		this.food = food;
		this.ingredient = ingredient;
		this.type = null;
	}
	
	public Crops(String name, int tier, Food food) {
		this.name = name;
		this.tier = tier;
		this.food = food;
		this.ingredient = null;
		this.type = null;
	}
	
	public Crops(String name, int tier) {
		this.name = name;
		this.tier = tier;
		this.food = null;
		this.ingredient = null;
		this.type = null;
	}
	
	public Crops(String name) {
		this.name = name;
		this.tier = 0;
		this.food = null;
		this.ingredient = null;
		this.type = null;
	}
	
	public Item getIngredient() {
		return this.ingredient == null ? null : this.ingredient;
	}
	
	public Food getFood() {
		return this.food == null ? null : this.food;
	}
	
	public RegistryObject<CropariaCrops> getCrop() {
		return this.crop == null ? null : this.crop;
	}
	
	public void setCrop(RegistryObject<CropariaCrops> crop) {
		this.crop = crop;
	}
	
	public RegistryObject<BlockNamedItem> getSeeds() {
		return this.seeds == null ? null : this.seeds;
	}
	
	public void setSeeds(RegistryObject<BlockNamedItem> seeds) {
		this.seeds = seeds;
	}
	
	public RegistryObject<Item> getFruit() {
		return this.fruit == null ? null : this.fruit;
	}
	
	public void setFruit(RegistryObject<Item> fruit) {
		this.fruit = fruit;
	}

	public String getName(){
		return this.name == null ? null : this.name;
	}
	
	public String getType(){
		return this.type == null ? null : this.type;
	}
	
	public int getTier() {
		return tier;
	}
}
