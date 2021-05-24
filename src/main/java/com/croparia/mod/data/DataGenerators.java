package com.croparia.mod.data;

import com.croparia.mod.CropariaMod;
import com.croparia.mod.data.client.ModItemModelProvider;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = CropariaMod.mod_id, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
	
	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator gen = event.getGenerator();
		ExistingFileHelper helper = event.getExistingFileHelper(); 
		
		gen.addProvider(new ModItemModelProvider(gen, helper));
	}
}