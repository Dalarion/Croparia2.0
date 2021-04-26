package com.croparia.mod.core.rituals;

import com.croparia.mod.core.init.BlockInit;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.state.properties.Half;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SecondRitual extends RitualUtils
{
	public static boolean checkRitual(BlockState blockNeed, World worldIn, BlockPos pos, boolean bypass)
	{
		if(FirstRitual.checkRitual(blockNeed, worldIn, pos, bypass))
		{
			if(getBlockState(Blocks.POLISHED_DIORITE_STAIRS.getDefaultState().with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.FACING, Direction.SOUTH), pos.up(2).east(4).north(), worldIn)
			&& getBlockState(Blocks.POLISHED_DIORITE_STAIRS.getDefaultState().with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.FACING, Direction.NORTH), pos.up(2).east(4).south(), worldIn)
			&& getBlockState(Blocks.POLISHED_DIORITE_STAIRS.getDefaultState().with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.FACING, Direction.SOUTH), pos.up(2).west(4).north(), worldIn)
			&& getBlockState(Blocks.POLISHED_DIORITE_STAIRS.getDefaultState().with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.FACING, Direction.NORTH), pos.up(2).west(4).south(), worldIn)
			&& getBlockState(Blocks.POLISHED_DIORITE_STAIRS.getDefaultState().with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.FACING, Direction.WEST), pos.up(2).north(4).east(), worldIn)
			&& getBlockState(Blocks.POLISHED_DIORITE_STAIRS.getDefaultState().with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.FACING, Direction.EAST), pos.up(2).north(4).west(), worldIn)
			&& getBlockState(Blocks.POLISHED_DIORITE_STAIRS.getDefaultState().with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.FACING, Direction.WEST), pos.up(2).south(4).east(), worldIn)
			&& getBlockState(Blocks.POLISHED_DIORITE_STAIRS.getDefaultState().with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.FACING, Direction.EAST), pos.up(2).south(4).west(), worldIn))
			{
				if(getBlock(Blocks.DIORITE, pos.up().north(4).east(), worldIn)
				&& getBlock(Blocks.DIORITE, pos.up().north(4).west(), worldIn)
				&& getBlock(Blocks.DIORITE, pos.up().south(4).east(), worldIn)
				&& getBlock(Blocks.DIORITE, pos.up().south(4).west(), worldIn)
				&& getBlock(Blocks.DIORITE, pos.up().east(4).north(), worldIn)
				&& getBlock(Blocks.DIORITE, pos.up().east(4).south(), worldIn)
				&& getBlock(Blocks.DIORITE, pos.up().west(4).north(), worldIn)
				&& getBlock(Blocks.DIORITE, pos.up().west(4).south(), worldIn))
				{
					if(getBlock(Blocks.ANDESITE, pos.up(2).north(3).east(3), worldIn)
					&& getBlock(Blocks.ANDESITE, pos.up(2).north(3).west(3), worldIn)
					&& getBlock(Blocks.ANDESITE, pos.up(2).south(3).east(3), worldIn)
					&& getBlock(Blocks.ANDESITE, pos.up(2).south(3).west(3), worldIn))
					{
						if(getBlock(Blocks.SHROOMLIGHT, pos.up(3).north(3).east(3), worldIn)
						&& getBlock(Blocks.SHROOMLIGHT, pos.up(3).north(3).west(3), worldIn)
						&& getBlock(Blocks.SHROOMLIGHT, pos.up(3).south(3).east(3), worldIn)
						&& getBlock(Blocks.SHROOMLIGHT, pos.up(3).south(3).west(3), worldIn)
						&& getBlock(Blocks.SHROOMLIGHT, pos.up(2).east(4), worldIn)
						&& getBlock(Blocks.SHROOMLIGHT, pos.up(2).west(4), worldIn)
						&& getBlock(Blocks.SHROOMLIGHT, pos.up(2).north(4), worldIn)
						&& getBlock(Blocks.SHROOMLIGHT, pos.up(2).south(4), worldIn))
						{
							if(getBlockState(BlockInit.ELEMENTAL_CROP.get().getDefaultState().with(CropsBlock.AGE, 7), pos.north(3).west(2), worldIn)
							&& getBlockState(BlockInit.ELEMENTAL_CROP.get().getDefaultState().with(CropsBlock.AGE, 7), pos.north(3).east(2), worldIn)
							&& getBlockState(BlockInit.ELEMENTAL_CROP.get().getDefaultState().with(CropsBlock.AGE, 7), pos.south(3).west(2), worldIn)
							&& getBlockState(BlockInit.ELEMENTAL_CROP.get().getDefaultState().with(CropsBlock.AGE, 7), pos.south(3).east(2), worldIn)
							&& getBlockState(BlockInit.ELEMENTAL_CROP.get().getDefaultState().with(CropsBlock.AGE, 7), pos.north(2).west(3), worldIn)
							&& getBlockState(BlockInit.ELEMENTAL_CROP.get().getDefaultState().with(CropsBlock.AGE, 7), pos.north(2).east(3), worldIn)
							&& getBlockState(BlockInit.ELEMENTAL_CROP.get().getDefaultState().with(CropsBlock.AGE, 7), pos.south(2).west(3), worldIn)
							&& getBlockState(BlockInit.ELEMENTAL_CROP.get().getDefaultState().with(CropsBlock.AGE, 7), pos.south(2).east(3), worldIn))
							{
								return true;
							}
							else 
								bad("ELEMENTAL CROP", worldIn, pos);					
						}
						else 
							bad("SHROOMLIGHT", worldIn, pos);	
					}
					else 
						bad("ANDESITE", worldIn, pos);
				}
				else 
					bad("DIORITE", worldIn, pos);
			}
			else 
				bad("POLISHED DIORITE STAIRS", worldIn, pos);	
		}
		return false;
	}					
			
	public static void placeRitual(World worldIn, BlockPos pos)
	{
		setBlockState(Blocks.POLISHED_DIORITE_STAIRS.getDefaultState().with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.FACING, Direction.SOUTH), pos.up(2).east(4).north(), worldIn);
		setBlockState(Blocks.POLISHED_DIORITE_STAIRS.getDefaultState().with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.FACING, Direction.NORTH), pos.up(2).east(4).south(), worldIn);
		setBlockState(Blocks.POLISHED_DIORITE_STAIRS.getDefaultState().with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.FACING, Direction.SOUTH), pos.up(2).west(4).north(), worldIn);
		setBlockState(Blocks.POLISHED_DIORITE_STAIRS.getDefaultState().with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.FACING, Direction.NORTH), pos.up(2).west(4).south(), worldIn);
		setBlockState(Blocks.POLISHED_DIORITE_STAIRS.getDefaultState().with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.FACING, Direction.WEST), pos.up(2).north(4).east(), worldIn);
		setBlockState(Blocks.POLISHED_DIORITE_STAIRS.getDefaultState().with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.FACING, Direction.EAST), pos.up(2).north(4).west(), worldIn);
		setBlockState(Blocks.POLISHED_DIORITE_STAIRS.getDefaultState().with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.FACING, Direction.WEST), pos.up(2).south(4).east(), worldIn);
		setBlockState(Blocks.POLISHED_DIORITE_STAIRS.getDefaultState().with(StairsBlock.HALF, Half.BOTTOM).with(StairsBlock.FACING, Direction.EAST), pos.up(2).south(4).west(), worldIn);
		setBlock(Blocks.DIORITE, pos.up().north(4).east(), worldIn);
		setBlock(Blocks.DIORITE, pos.up().north(4).west(), worldIn);
		setBlock(Blocks.DIORITE, pos.up().south(4).east(), worldIn);
		setBlock(Blocks.DIORITE, pos.up().south(4).west(), worldIn);
		setBlock(Blocks.DIORITE, pos.up().east(4).north(), worldIn);
		setBlock(Blocks.DIORITE, pos.up().east(4).south(), worldIn);
		setBlock(Blocks.DIORITE, pos.up().west(4).north(), worldIn);
		setBlock(Blocks.DIORITE, pos.up().west(4).south(), worldIn);
		setBlock(Blocks.ANDESITE, pos.up(2).north(3).east(3), worldIn);
		setBlock(Blocks.ANDESITE, pos.up(2).north(3).west(3), worldIn);
		setBlock(Blocks.ANDESITE, pos.up(2).south(3).east(3), worldIn);
		setBlock(Blocks.ANDESITE, pos.up(2).south(3).west(3), worldIn);
		setBlock(Blocks.SHROOMLIGHT, pos.up(3).north(3).east(3), worldIn);
		setBlock(Blocks.SHROOMLIGHT, pos.up(3).north(3).west(3), worldIn);
		setBlock(Blocks.SHROOMLIGHT, pos.up(3).south(3).east(3), worldIn);
		setBlock(Blocks.SHROOMLIGHT, pos.up(3).south(3).west(3), worldIn);
		setBlock(Blocks.SHROOMLIGHT, pos.up(2).east(4), worldIn);
		setBlock(Blocks.SHROOMLIGHT, pos.up(2).west(4), worldIn);
		setBlock(Blocks.SHROOMLIGHT, pos.up(2).north(4), worldIn);
		setBlock(Blocks.SHROOMLIGHT, pos.up(2).south(4), worldIn);
		setBlockState(Blocks.FARMLAND.getDefaultState().with(FarmlandBlock.MOISTURE, 7), pos.down().north(3).west(2), worldIn);
		setBlockState(Blocks.FARMLAND.getDefaultState().with(FarmlandBlock.MOISTURE, 7), pos.down().north(3).east(2), worldIn);
		setBlockState(Blocks.FARMLAND.getDefaultState().with(FarmlandBlock.MOISTURE, 7), pos.down().south(3).west(2), worldIn);
		setBlockState(Blocks.FARMLAND.getDefaultState().with(FarmlandBlock.MOISTURE, 7), pos.down().south(3).east(2), worldIn);
		setBlockState(Blocks.FARMLAND.getDefaultState().with(FarmlandBlock.MOISTURE, 7), pos.down().north(2).west(3), worldIn);
		setBlockState(Blocks.FARMLAND.getDefaultState().with(FarmlandBlock.MOISTURE, 7), pos.down().north(2).east(3), worldIn);
		setBlockState(Blocks.FARMLAND.getDefaultState().with(FarmlandBlock.MOISTURE, 7), pos.down().south(2).west(3), worldIn);
		setBlockState(Blocks.FARMLAND.getDefaultState().with(FarmlandBlock.MOISTURE, 7), pos.down().south(2).east(3), worldIn);
		setBlockState(BlockInit.ELEMENTAL_CROP.get().getDefaultState().with(CropsBlock.AGE, 7), pos.north(3).west(2), worldIn);
		setBlockState(BlockInit.ELEMENTAL_CROP.get().getDefaultState().with(CropsBlock.AGE, 7), pos.north(3).east(2), worldIn);
		setBlockState(BlockInit.ELEMENTAL_CROP.get().getDefaultState().with(CropsBlock.AGE, 7), pos.south(3).west(2), worldIn);
		setBlockState(BlockInit.ELEMENTAL_CROP.get().getDefaultState().with(CropsBlock.AGE, 7), pos.south(3).east(2), worldIn);
		setBlockState(BlockInit.ELEMENTAL_CROP.get().getDefaultState().with(CropsBlock.AGE, 7), pos.north(2).west(3), worldIn);
		setBlockState(BlockInit.ELEMENTAL_CROP.get().getDefaultState().with(CropsBlock.AGE, 7), pos.north(2).east(3), worldIn);
		setBlockState(BlockInit.ELEMENTAL_CROP.get().getDefaultState().with(CropsBlock.AGE, 7), pos.south(2).west(3), worldIn);
		setBlockState(BlockInit.ELEMENTAL_CROP.get().getDefaultState().with(CropsBlock.AGE, 7), pos.south(2).east(3), worldIn);
	}
}