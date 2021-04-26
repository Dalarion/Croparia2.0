package com.croparia.mod.common.items;

import com.croparia.mod.CropariaMod;

import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemMidasHand extends Item 
{
	public ItemMidasHand()
	{
		super(new Item.Properties().group(CropariaMod.MAIN).maxStackSize(1));
	}
	
	@Override
	public ActionResultType onItemUse(ItemUseContext context) 
	{
		World worldIn = context.getWorld();
		BlockPos pos = context.getPos();
		if(worldIn.getBlockState(pos).getBlock() != Blocks.BEDROCK && !worldIn.isRemote)
		{
			worldIn.setBlockState(pos, Blocks.AIR.getDefaultState());
			worldIn.addEntity(new ItemEntity(worldIn, pos.getX() + 0.5, pos.getY(), pos.getZ() + 0.5, new ItemStack(Items.GOLD_INGOT)));	
			return ActionResultType.SUCCESS;
		}
		else
			return ActionResultType.FAIL;
	}

	@Override
	public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) 
	{
		if(!entity.world.isRemote)
		{
			entity.world.setBlockState(entity.getPosition(), Blocks.GOLD_BLOCK.getDefaultState());
			entity.remove();
			return true;
		}
		else
			return false;
	}
}
