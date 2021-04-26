package com.croparia.mod.common.blocks;

import com.croparia.mod.core.init.ItemInit;
import com.croparia.mod.core.util.ElementsEnum;
import com.croparia.mod.core.util.recipes.InfusorRecipe;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer.Builder;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

public class BlockInfusor extends Block{
	
	protected static final VoxelShape SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D);
	public static final EnumProperty<ElementsEnum> TYPE = EnumProperty.create("infusor_type", ElementsEnum.class);
	
	public BlockInfusor() {
		super(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool());
		this.setDefaultState(this.stateContainer.getBaseState().with(TYPE, ElementsEnum.EMPTY));
	}
	
	@Override
	public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player,
			Hand handIn, BlockRayTraceResult hit) 
	{
		if(!worldIn.isRemote){
			if(state.get(TYPE) == ElementsEnum.EMPTY && ItemInit.getElementFromPotion(player.getHeldItemMainhand().getItem()) != ElementsEnum.EMPTY)
			{
				worldIn.setBlockState(pos, this.getDefaultState().with(TYPE, ItemInit.getElementFromPotion(player.getHeldItemMainhand().getItem())));
				player.getHeldItemMainhand().shrink(1);
				worldIn.addEntity(new ItemEntity(worldIn, pos.getX()+0.5, pos.getY()+0.5, pos.getZ()+0.5, new ItemStack(Items.GLASS_BOTTLE)));
			}
			else if(state.get(TYPE) != ElementsEnum.EMPTY && player.getHeldItemMainhand().getItem() == Items.GLASS_BOTTLE) 
			{
				worldIn.setBlockState(pos, this.getDefaultState().with(TYPE, ElementsEnum.EMPTY));
				player.getHeldItemMainhand().shrink(1);
				worldIn.addEntity(new ItemEntity(worldIn, pos.getX()+0.5, pos.getY()+0.5, pos.getZ()+0.5, new ItemStack(ItemInit.getPotionFromElement(state.get(TYPE)))));
			}
			return ActionResultType.SUCCESS;
		}
		return ActionResultType.FAIL;
	}
	
	@Override
	public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
		if(entityIn instanceof ItemEntity && !worldIn.isRemote) {
			ItemEntity entity = (ItemEntity) entityIn;
			InfusorRecipe.craft(entity.getItem(), worldIn, pos);
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
	
	@Override
	protected void fillStateContainer(Builder<Block, BlockState> builder) {
		builder.add(TYPE);
	}
}
