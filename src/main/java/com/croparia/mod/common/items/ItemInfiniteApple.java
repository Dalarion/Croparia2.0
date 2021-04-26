package com.croparia.mod.common.items;

import com.croparia.mod.CropariaMod;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class ItemInfiniteApple extends Item {
	
	public ItemInfiniteApple()
	{
		super(new Item.Properties().group(CropariaMod.MAIN).food(Foods.GOLDEN_CARROT).maxStackSize(1));
	}
	
	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving)
	{
       if (entityLiving instanceof PlayerEntity)
       {
    	   PlayerEntity entityplayer = (PlayerEntity)entityLiving;
           worldIn.playSound((PlayerEntity)null, entityplayer.getPosX(), entityplayer.getPosY(), entityplayer.getPosZ(), SoundEvents.ENTITY_PLAYER_BURP, SoundCategory.PLAYERS, 0.5F, worldIn.rand.nextFloat() * 0.1F + 0.9F);
       }
       return stack;
	}
}