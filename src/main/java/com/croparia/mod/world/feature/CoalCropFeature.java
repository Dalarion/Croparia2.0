package com.croparia.mod.world.feature;

import java.util.Random;
import java.util.Set;

import javax.annotation.Nonnull;

import com.croparia.mod.core.init.CropsInit;
import com.croparia.mod.world.config.PlantsConfig;
import com.google.common.collect.ImmutableSet;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropsBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.Feature;

public class CoalCropFeature extends Feature<PlantsConfig> {
	public CoalCropFeature() {
		super(PlantsConfig.CODEC);
	}

	public static final Set<BlockState> BLOCKSTATE_WHITELIST = ImmutableSet.of(
			Blocks.GRASS_BLOCK.getDefaultState(),
			Blocks.DIRT.getDefaultState(),
			Blocks.COARSE_DIRT.getDefaultState()
	);
	
	@Override
	public boolean generate(@Nonnull ISeedReader world, @Nonnull ChunkGenerator generator, @Nonnull Random rand, @Nonnull BlockPos pos, @Nonnull PlantsConfig config) {
		boolean any = false;
		int dist = Math.min(8, Math.max(1, config.getPatchRadius()));
		for (int i = 0; i < config.getPatchCount(); i++) {
			if (rand.nextInt(config.getPatchChance()) == 0) {
				int x = pos.getX() + rand.nextInt(16);
				int z = pos.getZ() + rand.nextInt(16);
				int y = world.getHeight(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, x, z);

				BlockState state = CropsInit.COAL.getCrop().get().getDefaultState().with(CropsBlock.AGE, 5);

				for (int j = 0; j < config.getPatchDensity() * config.getPatchChance(); j++) {
					int x1 = x + rand.nextInt(dist * 2) - dist;
					int y1 = y + rand.nextInt(4) - rand.nextInt(4);
					int z1 = z + rand.nextInt(dist * 2) - dist;
					BlockPos pos2 = new BlockPos(x1, y1, z1);
					if (world.isAirBlock(pos2) && (!world.getDimensionType().getHasCeiling() || y1 < 127) && BLOCKSTATE_WHITELIST.contains(world.getBlockState(pos2.down()))) {
						world.setBlockState(pos2, state, 2);
						any = true;
					}
				}
			}
		}

		return any;
	}
}
