package com.croparia.mod.common.blocks;

import com.croparia.mod.core.rituals.FirstRitual;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockGhost extends Block{
	
	public BlockGhost() {
		super(AbstractBlock.Properties.create(Material.ROCK));
	}
	
	@Override
	public void onBlockHarvested(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) 
	{
		if(!worldIn.isRemote) {
			System.out.print("Harvested");
			FirstRitual.placeRitual(worldIn, pos);
		}
	}	
}
