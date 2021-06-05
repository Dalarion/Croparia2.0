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
	private Food food;
	
	public Crops(String name, Food food, String type) {
		this.name = name;
		this.food = food;
		this.type = type;
	}
	
	public Crops(String name, Food food) {
		this.name = name;
		this.food = food;
		this.type = null;
	}
	
	public Crops(String name) {
		this.name = name;
		this.food = null;
		this.type = null;
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
}
