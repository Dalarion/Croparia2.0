package com.croparia.mod.core.util.dispenser;

import com.croparia.mod.common.blocks.BlockInfusor;
import com.croparia.mod.core.init.BlockInit;
import com.croparia.mod.core.init.ItemInit;
import com.croparia.mod.core.util.ElementsEnum;

import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class InfusorDispenserBehavior extends DefaultDispenseItemBehavior
{
	@Override
	protected ItemStack dispenseStack(IBlockSource source, ItemStack stack) {
		Direction direction = source.getBlockState().get(DispenserBlock.FACING);
	    World world = source.getWorld();
	    BlockPos blockpos = source.getBlockPos().offset(direction);
	    if(world.getBlockState(blockpos).getBlock() instanceof BlockInfusor) {
	    	double d0 = source.getX() + (double)((float)direction.getXOffset() * 1.125F);
	        double d1 = source.getY() + (double)((float)direction.getYOffset() * 1.125F);
	        double d2 = source.getZ() + (double)((float)direction.getZOffset() * 1.125F);
	        if(world.getBlockState(blockpos).getBlock() instanceof BlockInfusor) {
		    	if(world.getBlockState(blockpos).get(BlockInfusor.TYPE) != ElementsEnum.EMPTY) {
		    		world.addEntity(new ItemEntity(world, d0, d1, d2, ItemInit.getPotionFromElement(world.getBlockState(blockpos).get(BlockInfusor.TYPE)).getDefaultInstance()));
		    		world.setBlockState(new BlockPos(d0, d1, d2), BlockInit.INFUSOR.get().getDefaultState().with(BlockInfusor.TYPE, ElementsEnum.EMPTY));
		    		stack.shrink(1);
		    	}
		    	else if(ItemInit.getElementFromPotion(stack.getItem()) != ElementsEnum.EMPTY) {
		    		world.setBlockState(new BlockPos(d0, d1, d2), BlockInit.INFUSOR.get().getDefaultState().with(BlockInfusor.TYPE, ItemInit.getElementFromPotion(stack.getItem())));
		    		world.addEntity(new ItemEntity(world, d0, d1, d2, Items.GLASS_BOTTLE.getDefaultInstance()));
		    		stack.shrink(1);
		    	}
	    	}
	    	else {
	    		doDispense(world, stack, 6, direction, source);
	    	}
	    }
		return stack;
	}
}
