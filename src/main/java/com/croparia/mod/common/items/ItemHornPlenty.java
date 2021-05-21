package com.croparia.mod.common.items;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.core.init.CropsInit;
import com.croparia.mod.core.init.ItemInit;

import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResultType;

public class ItemHornPlenty extends Item 
{
	public ItemHornPlenty()
	{
		super(new Item.Properties().group(CropariaMod.MAIN).maxStackSize(1));
	}
	
	@Override
	public ActionResultType onItemUse(ItemUseContext context) 
	{
		ItemStack[] food = {new ItemStack(Items.CAKE),
							new ItemStack(Items.RABBIT_STEW),
							new ItemStack(Items.COOKED_PORKCHOP),
							new ItemStack(Items.COOKED_BEEF),
							new ItemStack(Items.PUMPKIN_PIE),
							new ItemStack(Items.GOLDEN_CARROT),
							new ItemStack(Items.COOKED_MUTTON),
							new ItemStack(Items.COOKED_COD),
							new ItemStack(Items.MUSHROOM_STEW),
							new ItemStack(Items.COOKED_CHICKEN),
							new ItemStack(Items.BAKED_POTATO),
							new ItemStack(Items.COOKED_RABBIT),
							new ItemStack(Items.BREAD),
							new ItemStack(Items.COOKED_SALMON),
							new ItemStack(Items.CARROT),
							new ItemStack(Items.APPLE),
							new ItemStack(Items.CHORUS_FRUIT),
							new ItemStack(Items.ROTTEN_FLESH),
							new ItemStack(Items.PORKCHOP),
							new ItemStack(Items.BEEF),
							new ItemStack(Items.SPIDER_EYE),
							new ItemStack(Items.RABBIT),
							new ItemStack(Items.MUTTON),
							new ItemStack(Items.COD),
							new ItemStack(Items.MELON),
							new ItemStack(Items.CHICKEN),
							new ItemStack(Items.POISONOUS_POTATO),
							new ItemStack(Items.SALMON),
							new ItemStack(Items.COOKIE),
							new ItemStack(Items.BEETROOT),
							new ItemStack(Items.BEETROOT_SOUP),
							new ItemStack(Items.POTATO),
							new ItemStack(Items.PUFFERFISH),
							new ItemStack(Items.TROPICAL_FISH),
							new ItemStack(CropsInit.APRICOT.getSeeds().get()),
							new ItemStack(CropsInit.CHERRY.getSeeds().get()),
							new ItemStack(CropsInit.LEMON.getSeeds().get()),
							new ItemStack(CropsInit.ORANGE.getSeeds().get()),
							new ItemStack(CropsInit.KIWI.getSeeds().get()),
							new ItemStack(CropsInit.PEAR.getSeeds().get()),
							new ItemStack(CropsInit.BANANA.getSeeds().get()),
							new ItemStack(ItemInit.APRICOT_PIE.get()),
							new ItemStack(ItemInit.CHERRY_PIE.get()),
							new ItemStack(ItemInit.LEMON_PIE.get()),
							new ItemStack(ItemInit.ORANGE_PIE.get()),
							new ItemStack(ItemInit.KIWI_PIE.get()),
							new ItemStack(ItemInit.PEAR_PIE.get()),
							new ItemStack(ItemInit.BANANA_PIE.get())};
		
		int random = context.getWorld().rand.nextInt(food.length - 1);
		
		context.getWorld().addEntity(new ItemEntity(context.getWorld(), context.getPos().getX() + 0.5, context.getPos().getY() + 1, context.getPos().getZ() + 0.5, food[random]));
		return ActionResultType.SUCCESS;
	}
}