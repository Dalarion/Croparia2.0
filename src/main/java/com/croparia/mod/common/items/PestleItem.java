package com.croparia.mod.common.items;

import com.croparia.mod.CropariaMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class PestleItem extends Item {
	
	public PestleItem() {
		super(new Item.Properties().group(CropariaMod.MAIN).maxStackSize(1));
	}
	
	@Override
	public boolean hasContainerItem() {
		return true;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {
		return this.getDefaultInstance();
	}
}
