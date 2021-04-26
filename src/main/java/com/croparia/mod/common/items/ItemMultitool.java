package com.croparia.mod.common.items;

import java.util.Map;
import java.util.Set;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.core.init.ItemInit;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.Items;
import net.minecraft.item.ToolItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.ForgeEventFactory;

public class ItemMultitool extends ToolItem {

	protected static final Map<Block, BlockState> HOE_LOOKUP = Maps.newHashMap(ImmutableMap.of(Blocks.GRASS_BLOCK, Blocks.FARMLAND.getDefaultState(), Blocks.GRASS_PATH, Blocks.FARMLAND.getDefaultState(), Blocks.DIRT, Blocks.FARMLAND.getDefaultState(), Blocks.COARSE_DIRT, Blocks.DIRT.getDefaultState()));
	private static final Set<Block> EFFECTIVE_ON = ImmutableSet.of(Blocks.OAK_PLANKS);
	   
	public ItemMultitool(float attackDamageIn, float attackSpeedIn, IItemTier tier) {
		super(attackDamageIn, attackSpeedIn, tier, EFFECTIVE_ON, new Item.Properties().group(CropariaMod.MAIN));
	}
	
	@Override
	public boolean canHarvestBlock(BlockState blockIn) 
	{
		if(blockIn != Blocks.AIR.getDefaultState() || blockIn != Blocks.BARRIER.getDefaultState())
			return true;
		return false;
	}
	
	@Override
	public float getDestroySpeed(ItemStack stack, BlockState state) 
	{
		if (canHarvestBlock(state)) 
			return efficiency;
		else
			return 1.0F;
	}
	
	@Override
   public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) 
   {
		if(toRepair.getItem() == ItemInit.WOOD_MULTITOOL.get() && repair.getItem() == Items.OAK_PLANKS)
	        return true;
		else if(toRepair.getItem() == ItemInit.STONE_MULTITOOL.get() && repair.getItem() == Items.COBBLESTONE)
	        return true;
		else if(toRepair.getItem() == ItemInit.IRON_MULTITOOL.get() && repair.getItem() == Items.IRON_INGOT)
	        return true;
		else if(toRepair.getItem() == ItemInit.GOLD_MULTITOOL.get() && repair.getItem() == Items.GOLD_INGOT)
	        return true;
		else if(toRepair.getItem() == ItemInit.DIAMOND_MULTITOOL.get() && repair.getItem() == Items.DIAMOND)
	        return true;
		else if(toRepair.getItem() == ItemInit.OBSIDIAN_MULTITOOL.get() && repair.getItem() == Items.OBSIDIAN)
	        return true;
	   	else if(toRepair.getItem() == ItemInit.RENFORCED_MULTITOOL.get() && repair.getItem() == Items.DIAMOND)
	        return true;
	   	else
	   		return false;
   }
	
	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		 final World world = context.getWorld();
	        final BlockPos blockpos = context.getPos();
	        final int hook = ForgeEventFactory.onHoeUse(context);
	        if (hook != 0) {
	            return (hook > 0) ? ActionResultType.SUCCESS : ActionResultType.FAIL;
	        }
	        if (context.getFace() != Direction.DOWN && world.isAirBlock(blockpos.up())) {
	            final BlockState blockstate = ItemMultitool.HOE_LOOKUP.get(world.getBlockState(blockpos).getBlock());
	            if (blockstate != null) {
	                final PlayerEntity playerentity = context.getPlayer();
	                world.playSound(playerentity, blockpos, SoundEvents.ITEM_HOE_TILL, SoundCategory.BLOCKS, 1.0f, 1.0f);
	                if (!world.isRemote) {
	                    world.setBlockState(blockpos, blockstate, 11);
	                    if (playerentity != null) {
	                    	context.getItem().damageItem(1, playerentity, (player) -> {
	                            player.sendBreakAnimation(context.getHand());
	                         });
	                    }
	                }
	                return ActionResultType.SUCCESS;
	            }
	        }
	        return ActionResultType.PASS;
	}
	
	@Override
	public boolean hitEntity(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		stack.damageItem(1, attacker, (player) -> {
            player.sendBreakAnimation(attacker.getActiveHand());
         });
		return true;
	}	
}
