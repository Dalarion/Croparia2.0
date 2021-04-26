package com.croparia.mod.common.blocks;

import com.croparia.mod.common.blocks.tileEntity.CollectorTE;
import com.croparia.mod.core.init.TileEntityInit;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.BooleanProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkHooks;

public class BlockPedestal extends Block implements ITileEntityProvider{
	
	public static final DirectionProperty FACING = HorizontalBlock.HORIZONTAL_FACING;
	public static final BooleanProperty POWERED = BlockStateProperties.POWERED;

	public BlockPedestal() {
		super(AbstractBlock.Properties.create(Material.ROCK).tickRandomly());
	}
	
	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
		if (worldIn.isRemote) {
	        return ActionResultType.SUCCESS;
	     } else {
	        TileEntity tileentity = worldIn.getTileEntity(pos);
	        if (tileentity instanceof CollectorTE) {
	        	NetworkHooks.openGui((ServerPlayerEntity) player, (CollectorTE)tileentity, pos);
	        }
	        return ActionResultType.CONSUME;
	     }
	}
	
	private boolean connectedToPower(World worldIn, BlockPos pos, Direction facing) {
	      for(Direction direction : Direction.values()) {
	         if (direction != facing && worldIn.isSidePowered(pos.offset(direction), direction)) {
	            return true;
	         }
	      }
		return false;
	}
	
	@Override
	public void neighborChanged(BlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
		boolean powered = state.get(POWERED);
		boolean powerConnected = this.connectedToPower(worldIn, pos, state.get(FACING));
		if(!powered && powerConnected) {
			worldIn.setBlockState(pos, this.getDefaultState().with(FACING, state.get(FACING)).with(POWERED, true));
		} else if(powered && !powerConnected) {
			worldIn.setBlockState(pos, this.getDefaultState().with(FACING, state.get(FACING)).with(POWERED, false));
		}
	}
	
	
	@Override
	public boolean canConnectRedstone(BlockState state, IBlockReader world, BlockPos pos, Direction side) {
		return side != Direction.NORTH ? true : false;
	}
	
	
	@Override
	public TileEntity createNewTileEntity(IBlockReader worldIn) {
		return TileEntityInit.COLLECTOR_TE.get().create();
	}
	
	@Override
	public BlockState getStateForPlacement(BlockItemUseContext context) {
		return this.getDefaultState().with(FACING, context.getPlacementHorizontalFacing()).with(POWERED, false);
	}
	
	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		builder.add(FACING, POWERED);
	}
	
}
