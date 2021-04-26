package com.croparia.mod.common.items;

import net.minecraft.block.Block;
import net.minecraft.block.CropsBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class GreenHouseBlockItem extends BlockItem
{
    public GreenHouseBlockItem(Block blockIn, Properties builder) {
		super(blockIn, builder);
	}
    
    @Override
    public ActionResultType onItemUse(ItemUseContext context) {
    	final World worldIn = context.getWorld();
        final PlayerEntity player = context.getPlayer();
        final BlockPos pos = context.getPos();
        if(worldIn.isRemote) {
            return ActionResultType.FAIL;
        }
        final ItemStack itemstack = player.getActiveItemStack();
        if (worldIn.getBlockState(pos).getBlock() instanceof CropsBlock && worldIn.isAirBlock(pos.up())) {
            worldIn.setBlockState(pos.up(), this.getBlock().getDefaultState());
            itemstack.shrink(1);
            return ActionResultType.SUCCESS;
        }
        if (worldIn.isAirBlock(pos.up(2)) && worldIn.isAirBlock(pos.up())) {
        	worldIn.setBlockState(pos.up(2), this.getBlock().getDefaultState());
            itemstack.shrink(1);
            return ActionResultType.SUCCESS;
        }
        return ActionResultType.FAIL;
    }
}