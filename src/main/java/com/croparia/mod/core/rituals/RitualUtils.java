package com.croparia.mod.core.rituals;

import com.croparia.mod.CropariaMod;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class RitualUtils extends CropariaMod{

	public static boolean getBlock(Block block, BlockPos pos, World worldIn)
	{
		if(worldIn.getBlockState(pos) == block.getDefaultState()) return true;
		return false;
	}
	
	public static void setBlock(Block block, BlockPos pos, World worldIn)
	{
		worldIn.setBlockState(pos, block.getDefaultState());
	}	

	public static boolean getBlockState(BlockState block, BlockPos pos, World worldIn)
	{
		if(worldIn.getBlockState(pos) == block) return true;
		return false;
	}
	
	public static void setBlockState(BlockState state, BlockPos pos, World worldIn)
	{
		worldIn.setBlockState(pos, state);
	}
	
	public static void endFirst(ItemStack out, ItemStack in, BlockPos pos, World worldIn)
	{		
			in.shrink(1);
			ItemEntity entityOut = new ItemEntity(worldIn, pos.getX()+0.5, pos.getY()+1, pos.getZ()+0.5, out);
			worldIn.addEntity(entityOut);
			worldIn.setBlockState(pos.down().north(), Blocks.AIR.getDefaultState());
			worldIn.setBlockState(pos.down().east(), Blocks.AIR.getDefaultState());
			worldIn.setBlockState(pos.down().south(), Blocks.AIR.getDefaultState());
			worldIn.setBlockState(pos.down().west(), Blocks.AIR.getDefaultState());		
			entityOut.addVelocity(0, 0.3, 0);
	}

	public static void endSecond(Entity entityIn, BlockPos pos, World worldIn)
	{
		entityIn.remove();
		worldIn.setBlockState(pos.north(2).west(2), Blocks.AIR.getDefaultState());
		worldIn.setBlockState(pos.north(2).east(2), Blocks.AIR.getDefaultState());
		worldIn.setBlockState(pos.south(2).east(2), Blocks.AIR.getDefaultState());
		worldIn.setBlockState(pos.south(2).west(2), Blocks.AIR.getDefaultState());
	}
	/*
	
	public static void endStone(Entity entityIn, BlockPos pos, World worldIn)
	{
		entityIn.remove();
		worldIn.setBlockState(pos.west(7), BlockInit.INFUSOR.getDefaultState());
		worldIn.setBlockState(pos.north(7),  BlockInit.INFUSOR.getDefaultState());
		worldIn.setBlockState(pos.south(7),  BlockInit.INFUSOR.getDefaultState());
		worldIn.setBlockState(pos.east(7),  BlockInit.INFUSOR.getDefaultState());
		worldIn.setBlockState(pos.south(5).east(5),  BlockInit.INFUSOR.getDefaultState());
		worldIn.setBlockState(pos.north(5).west(5),  BlockInit.INFUSOR.getDefaultState());
		worldIn.setBlockState(pos.north(5).east(5),  BlockInit.INFUSOR.getDefaultState());
		worldIn.setBlockState(pos.south(5).west(5),  BlockInit.INFUSOR.getDefaultState());
	} */
	
	public static boolean bad(String error, World worldIn, BlockPos pos)
	{
		if(!worldIn.isRemote)
		{
			say("It seems there is an error with the " + error, worldIn, pos);
		}
		return false;
	}
	
	public static boolean bad(BlockState error, World worldIn, BlockPos pos)
	{
		if(!worldIn.isRemote)
		{
			say("It seems there is an error with the " + error, worldIn, pos);
		}
		return false;
	}
	
	public static void fail(World world, ItemEntity entityIn) {
		int j = world.rand.nextInt(1);
		if(j > 0) {
			j = -1;
		} else { j=1; }
		int k = world.rand.nextInt(1);
		if(k> 0) {
			k = -1;
		} else { k=1; }
		entityIn.addVelocity((world.rand.nextFloat() + 0.5) * j/100, world.rand.nextFloat() + 0.1, (world.rand.nextFloat() + 0.5) * k/100);
	}
}