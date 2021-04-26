package com.croparia.mod.world.generation;

import java.util.Set;

import com.croparia.mod.world.config.PlantsConfig;
import com.croparia.mod.world.feature.CoalCropFeature;
import com.croparia.mod.world.feature.FruitsFeature;
import com.google.common.collect.ImmutableSet;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.IPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class PlantsGenerations 
{
	public static final Feature<PlantsConfig> COAL_CROP = new CoalCropFeature();
	public static final Feature<PlantsConfig> FRUITS = new FruitsFeature();
	
	public static final ConfiguredFeature<?, ?> COAL_CROP_CONF = COAL_CROP.withConfiguration(new PlantsConfig(6, 2, 2, 6)).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG));
	public static final ConfiguredFeature<?, ?> FRUITS_CONF = FRUITS.withConfiguration(new PlantsConfig(10, 3, 2, 14)).withPlacement(Placement.NOPE.configure(IPlacementConfig.NO_PLACEMENT_CONFIG));
	
	public static final Set<Biome.Category> TYPE_BLACKLIST = ImmutableSet.of(
			Biome.Category.NETHER,
			Biome.Category.THEEND,
			Biome.Category.ICY,
			Biome.Category.MUSHROOM,
			Biome.Category.RIVER,
			Biome.Category.BEACH,
			Biome.Category.DESERT,
			Biome.Category.OCEAN
	);
	
	public static void registerFeatures(RegistryEvent.Register<Feature<?>> event) { 
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "coal_crop_conf", COAL_CROP_CONF);
		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, "fruits_conf", FRUITS_CONF);
	}
	
	public static void generatePlants(final BiomeLoadingEvent event) 
	{
		Biome.Category category = event.getCategory();
		if (!TYPE_BLACKLIST.contains(category)) {
			generatePlant(event.getGeneration(), COAL_CROP_CONF);
			generatePlant(event.getGeneration(), FRUITS_CONF);
		}
	}
	
	private static void generatePlant(BiomeGenerationSettingsBuilder settings, ConfiguredFeature<?, ?> config)
	{                                                               
		settings.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, config);
	}
}
