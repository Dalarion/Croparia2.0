package com.croparia.mod.common.blocks;

import java.util.ArrayList;
import java.util.List;

import com.croparia.mod.common.blocks.tileEntity.GreenHouseTE;
import com.croparia.mod.core.init.TileEntityInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class BlockGreenhouse extends Block implements ITileEntityProvider{

	//For render purpose only
	public static List<BlockGreenhouse> blockGreenhouse = new ArrayList<BlockGreenhouse>();
	
	protected static final VoxelShape SHAPE = Block.makeCuboidShape(1.0D, 1.0D, 0.0D, 15.0D, 3.0D, 15.0D);
	protected static final VoxelShape NULL = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
	
	public BlockGreenhouse() {
		super(AbstractBlock.Properties.create(Material.GLASS).tickRandomly());
		blockGreenhouse.add(this);
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPE;
	}
	
	@Override
	public VoxelShape getCollisionShape(BlockState state, IBlockReader reader, BlockPos pos) {
		return NULL;
	}
	
	
	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) {
		if (worldIn.isRemote) {
	        return ActionResultType.SUCCESS;
	     } else {
	        TileEntity tileentity = worldIn.getTileEntity(pos);
	        if (tileentity instanceof GreenHouseTE) {
	           player.openContainer((GreenHouseTE)tileentity);
	        }
	        return ActionResultType.CONSUME;
	     }
	}

	@Override
	public TileEntity createNewTileEntity(IBlockReader worldIn) {
		return TileEntityInit.GREENHOUSE_TE.get().create();
	}
}
