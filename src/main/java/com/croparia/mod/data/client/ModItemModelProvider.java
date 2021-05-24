package com.croparia.mod.data.client;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.core.init.CropsInit;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider{
	
	public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, CropariaMod.mod_id, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
		
		CropsInit.crops.forEach(crop -> {
			
			getBuilder("seed_crop_" + crop.getName()).parent(itemGenerated).texture("layer0", "item/seed/seed_crop_" + crop.getName());
		});
	}

}
