package com.croparia.mod.common.items;

import java.util.Set;

import com.croparia.mod.CropariaMod;
import com.google.common.collect.ImmutableSet;

import net.minecraft.block.BeetrootBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropsBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUseContext;
import net.minecraft.item.ToolItem;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class KnifeItem extends ToolItem {
	
	public static final Set<Block> EFFECTIVE_ON = ImmutableSet.of(Blocks.AIR);
	
	public KnifeItem(IItemTier tier) {
		super(1.5F, -1.5F, tier, EFFECTIVE_ON, new Item.Properties().group(CropariaMod.MAIN));
	}

	@Override
	public ActionResultType onItemUse(ItemUseContext context) {
		if(!context.getWorld().isRemote) {
			World world = context.getWorld();
			BlockPos pos = context.getPos();
			BlockState state = world.getBlockState(pos);
			CropsBlock block = (CropsBlock)state.getBlock();
			PlayerEntity playerentity = context.getPlayer();
			if(world.getBlockState(pos).getBlock() instanceof CropsBlock) {
				if(block.isMaxAge(state))
				{
					int age = this.getTier().getHarvestLevel() * 2;
					if(age >= 7) {
						age = 6;
					}
					Block.spawnDrops(state, world, pos);
					if(world.getBlockState(pos).getBlock() instanceof BeetrootBlock) {
						world.setBlockState(pos, block.getDefaultState().with(BeetrootBlock.BEETROOT_AGE, 1));
					}
					else {
						world.setBlockState(pos, block.getDefaultState().with(CropsBlock.AGE, age));
					}
					context.getItem().damageItem(1, playerentity, (player) -> {
                        player.sendBreakAnimation(context.getHand());
                     });
					return ActionResultType.SUCCESS;
				}
			}
		}
		return ActionResultType.FAIL;
	}

}
