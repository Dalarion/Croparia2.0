package com.croparia.mod.common.items;

import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class ItemElementalTime extends Item{

	private boolean activated = false;
	
	public ItemElementalTime(Properties properties) {
		super(properties);
	}
	
	@Override
	public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		if(worldIn instanceof ServerWorld && activated) {
			((ServerWorld) worldIn).setDayTime(worldIn.getDayTime() + 100);
		}
	}
	
	@Override
	public ActionResultType onItemUse(ItemUseContext context) 
	{
		if(!context.getWorld().isRemote) {
			activated = !activated;
		}
		return ActionResultType.SUCCESS;
	}
}
