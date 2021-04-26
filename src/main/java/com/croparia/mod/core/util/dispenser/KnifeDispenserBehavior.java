package com.croparia.mod.core.util.dispenser;

import com.croparia.mod.common.items.KnifeItem;

import net.minecraft.block.BeetrootBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class KnifeDispenserBehavior extends DefaultDispenseItemBehavior
{
	@Override
	protected ItemStack dispenseStack(IBlockSource source, ItemStack stack) {
		Direction direction = source.getBlockState().get(DispenserBlock.FACING);
	    World world = source.getWorld();
	    BlockPos blockpos = source.getBlockPos().offset(direction);
	    if(world.getBlockState(blockpos).getBlock() instanceof CropsBlock && stack.getItem() instanceof KnifeItem) {
	        KnifeItem knife = (KnifeItem) stack.getItem();
	        BlockState state = world.getBlockState(blockpos);
	        CropsBlock block = (CropsBlock) state.getBlock();
	        if(block.isMaxAge(world.getBlockState(blockpos)))
			{
				int age = knife.getTier().getHarvestLevel() * 2;
				if(age >= 7) {
					age = 6;
				}
				Block.spawnDrops(state, world, blockpos);
				if(world.getBlockState(blockpos).getBlock() instanceof BeetrootBlock) {
					world.setBlockState(blockpos, block.getDefaultState().with(BeetrootBlock.BEETROOT_AGE, 1));
				}
				else {
					world.setBlockState(blockpos, block.getDefaultState().with(CropsBlock.AGE, age));
				}
				if(knife.getMaxDamage() - (knife.getDamage(stack) + 1) <= 0) {
					return ItemStack.EMPTY;
				}
				else {
					knife.setDamage(stack, knife.getDamage(stack) + 1);
				}
			}
	    }
	    else {
	    	doDispense(world, stack, 6, direction, source);
	    }
	    return stack;
	}
}
