package com.croparia.mod.data;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.croparia.mod.core.init.BlockInit;
import com.croparia.mod.core.init.CropsInit;
import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

import net.minecraft.advancements.criterion.StatePropertiesPredicate;
import net.minecraft.block.Block;
import net.minecraft.block.CropsBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTable.Builder;
import net.minecraft.loot.LootTableManager;
import net.minecraft.loot.ValidationTracker;
import net.minecraft.loot.conditions.BlockStateProperty;
import net.minecraft.loot.conditions.ILootCondition;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;

public class ModLootTableProvider extends LootTableProvider{

	public ModLootTableProvider(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}
	
	@Override
	public String getName() {
		return "Croparia - LootTable";
	}
	
	@Override
	protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, Builder>>>, LootParameterSet>> getTables() {
		return ImmutableList.of(
				Pair.of(ModBlockLootTables::new, LootParameterSets.BLOCK)
		);
	}
	
	@Override
	protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
		map.forEach((p_218436_2_, p_218436_3_) -> LootTableManager.validateLootTable(validationtracker, p_218436_2_, p_218436_3_));
	}


	
	public class ModBlockLootTables extends BlockLootTables {
		@Override
		protected void addTables() {
			BlockInit.BLOCKS.getEntries().forEach(block -> {
				if(block.get() instanceof CropsBlock) {}
				else {
					registerDropSelfLootTable(block.get());
				}
			});
			
			CropsInit.crops.forEach(crop -> {
				System.out.println(crop.getName());
				ILootCondition.IBuilder lootCondition = BlockStateProperty.builder(crop.getCrop().get()).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(CropsBlock.AGE, 7));
				registerLootTable(crop.getCrop().get(), droppingAndBonusWhen(crop.getCrop().get(), crop.getFruit().get(), crop.getSeeds().get(), lootCondition));
			});
			
			CropsInit.fruits.forEach(crop -> {
				System.out.println(crop.getName());
				ILootCondition.IBuilder lootCondition = BlockStateProperty.builder(crop.getCrop().get()).fromProperties(StatePropertiesPredicate.Builder.newBuilder().withIntProp(CropsBlock.AGE, 7));
				registerLootTable(crop.getCrop().get(), droppingAndBonusWhen(crop.getCrop().get(), crop.getSeeds().get(), crop.getSeeds().get(), lootCondition));
			});
		}
		
		@Override
		protected Iterable<Block> getKnownBlocks() {
			return BlockInit.BLOCKS.getEntries().stream()
                    .map(RegistryObject::get)
                    .collect(Collectors.toList());
		}
	}

}
