package com.croparia.mod.data.client;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.core.init.CropsInit;

import net.minecraft.block.CropsBlock;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider{

	public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper helper) {
		super(gen, CropariaMod.mod_id, helper);
	}

	@Override
	protected void registerStatesAndModels() {
		System.out.println("Block State & Model :");
		CropsInit.crops.forEach(crop -> {
			System.out.println(crop.getName());
			getVariantBuilder(crop.getCrop().get()).forAllStates(state -> {
				int i = state.get(CropsBlock.AGE);
				if(i <= 4) {
					return ConfiguredModel.builder()
							.modelFile(models().crop("crop_stage" + i, modLoc("blocks/crop/crop_stage_" + i)))
							.build();
				}
				else {
					if(crop.getType() == "natural" && i != 7) {
						return ConfiguredModel.builder()
								.modelFile(models().crop(crop.getName() + "_stage" + i, modLoc("blocks/crop/natural_stage_" + i)))
								.build();
					}
					else {
						return ConfiguredModel.builder()
								.modelFile(models().crop(crop.getName() + "_stage" + i, modLoc("blocks/crop/" + crop.getName() +  "_stage_" + i)))
								.build();
					}
					
				}
				
			});
		});
	}

}
