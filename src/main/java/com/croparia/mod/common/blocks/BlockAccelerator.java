package com.croparia.mod.common.blocks;

import java.util.Random;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class BlockAccelerator extends Block {
    private final int range;

    public BlockAccelerator(int range) {
        super(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(10F));
        this.range = range;
    }

    @Override
    public void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean isMoving) {
        world.getPendingBlockTicks().scheduleTick(pos, this, getTickRate());
    }

    @Override
    public void tick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        BlockPos.getAllInBox(pos.up(2), pos.add(0, this.range + 2, 0))
                .filter(pos2 -> world.getBlockState(pos2).getBlock() instanceof IGrowable)
                .findFirst()
                .ifPresent(pos2 -> world.getBlockState(pos2).randomTick(world, pos2, random));

        world.getPendingBlockTicks().scheduleTick(pos, this, getTickRate());
    }

    private static int getTickRate() {
        double rand = Math.random() * (1.1 - 0.9) + 0.9;
        return (int) ((3 * rand) * 20);
    }
}
