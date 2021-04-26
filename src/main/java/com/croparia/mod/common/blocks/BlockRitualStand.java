package com.croparia.mod.common.blocks;

import com.croparia.mod.core.rituals.FirstRitual;
import com.croparia.mod.core.rituals.SecondRitual;
import com.croparia.mod.core.util.recipes.RitualRecipe;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class BlockRitualStand extends Block {
	
	protected static final VoxelShape SHAPE = Block.makeCuboidShape(0.0D, 0.3D, 0.0D, 16.0D, 6.0D, 16.0D);
	
	public BlockRitualStand() {
		super(AbstractBlock.Properties.create(Material.IRON).setRequiresTool());
	}
	
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		if(entityIn instanceof ItemEntity && !worldIn.isRemote) {
			if(((ItemEntity) entityIn).getItem().getItem() == Items.DRAGON_HEAD) {
				if(FirstRitual.checkRitual(null, worldIn, pos, true)) {
					SecondRitual.placeRitual(worldIn, pos);
				}
				else {
					FirstRitual.placeRitual(worldIn, pos);
				}
				((ItemEntity) entityIn).getItem().shrink(1);
			}
			ItemStack stack = ((ItemEntity) entityIn).getItem();
			RitualRecipe.craft(stack, worldIn, pos);
		}
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}
	
	@Override
	public VoxelShape getCollisionShape(BlockState state, IBlockReader reader, BlockPos pos) {
		return SHAPE;
	}

}
